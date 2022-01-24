
let app = require('express')();
let mongoClient = require('mongodb').MongoClient;
let dbUrl="mongodb://localhost:27017";
let port =9090;

app.listen(port, ()=> console.log(`Node server is running in ${port}`));


//retrieve all records
app.get('/employeeAll',(request,response)=>{
    mongoClient.connect(dbUrl,{useNewUrlParser:true},(err,client)=>{
        if(!err){
            let x=0;
            let myDB = client.db('mydb');
            let doc=myDB.collection('employee').find();
            let arrarOfRecords =[];
            doc.forEach((record)=>{
                arrarOfRecords.push(record);
                x++;

            },()=>{
                if(x==0){
                    response.json({error: "No records found!"});
                }else{
                    response.json(arrarOfRecords);
                }
            });
        }
    });
});

//retrieving a particular record using employee:id
app.get('/employee/:id', (request, response) => {
    let id=parseInt(request.params.id);

    mongoClient.connect(dbUrl, {useNewUrlParser:true},(err,client)=>{
        if(!err){
            let myDB = client.db('mydb');
            let doc=myDB.collection("employee").find({_id:id});
            let x=0;

            doc.forEach((record)=>{
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