let app = require('express')();
let mySql = require('mysql');
let cors = require('cors');
let dbUrl="mysql://localhost:3306/legato_db";
let port =9090;

app.listen(port, ()=> console.log(`Node server is running in ${port}`));

app.use(cors({origin: 'http://localhost:3000'}));
var connection = mySql.createConnection({
    host: '127.0.0.1',
    port: '3306',
    user: 'root',
    password: 'root',
    database: 'legato_db'
  });

  connection.connect(function(err){
      if(err){
          console.log(`connection err`+err.stack);
          return;
      }
      console.log(`Data base connected `+connection.threadId);
  });


  //retrieve all records
app.get('/employeeAll',(request,response)=>{
   connection.query("select * from employee", (err,result,fields)=>{
    if(!err){
        response.json(result);
        }else{
            response.json({error:'No records found'});
        }
    });
});



//retrieving a particular record using employee:id
app.get('/employee/:id', (request, response) => {
    let id=parseInt(request.params.id);

    connection.query('SELECT * from employee WHERE id=?', id, (err,result,fields)=>{
        let x=0;
       if(!err){
            result.forEach((record)=>{
                x++;
                response.json(record);
            },()=>{
                if(x==0){
                    response.json({error: `Sorry id= ${id} is not found`});
                }
            });
       }
    });
});

//Delete a particular record using employee:id
app.delete('/employeeDelete/:id', (request, response) => {
    let id=parseInt(request.params.id);

    connection.query('DELETE from employee WHERE id=?', id, (err,result,fields)=>{
       if(!err){
        response.json({success:'record has been deleted'});
       }
    });
});


//insert into values
app.post('/employee/:name/:salary', (request, response) => {
    let name=request.params.name;
    let salary=parseFloat(request.params.salary);

    connection.query('INSERT INTO employee (name, salary) VALUES (?, ?)', [name,salary], (err,result,fields)=>{
       if(!err){
        response.json({success:'One record inserted !'});
       }
    });
});

//update a particluar record
app.put('/employeeUpdate/:id/:salary', (request, response) => {
    let id=parseInt(request.params.id);
    let salary=parseFloat(request.params.salary);

    connection.query('UPDATE employee SET salary=? WHERE id=?', [salary,id], (err,result,fields)=>{
       if(!err){
        response.json({success:'One record updated !'});
       }
    });
});