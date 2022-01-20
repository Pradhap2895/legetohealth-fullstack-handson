let app = require("express")(); //IIFE
let bodyParser = require('body-parser');

let port=9090;
let employee={id:100,name:"kumar",salary:2090};

//app.use(bodyParser.text());
//app.use(bodyParser.json());

app.use([bodyParser.json, bodyParser.text]);

app.get('/employee/:id', (request, response)=>{
    console.log(request.params.id);
    response.json(employee);
   // response.send('Get request from /');
});
app.post('/employee', (request, response)=>{
    let content =request.body;
    response.json(content);
    //response.send('Post request from /');
});
app.put('/', (request, response)=>{
     response.json(employee);
    //response.send('Put request from /');
});
app.delete('/', (request, response)=>{
    response.json(employee);
   // response.send('Delete request from /');
});
app.patch('/', (request, response)=>{
    response.json(employee);
   // response.send('patch request from /');
});

app.listen(port, ()=> console.log(`listening to ${port}`))