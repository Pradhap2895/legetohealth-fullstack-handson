
let app = require('express')();

let http = require('http').Server(app);

let io = require("socket.io")(http);

app.get('/', (request, response)=>{
    response.sendFile(__dirname+"/client.html");
})

http.listen(9090,console.log('server is running in 9090'));

io.on('connection', (socket)=>{
    console.log('Client is connneted to the server '+socket.connect);

    socket.on("clientMessage", msg=>{
        socket.emit("messageKey",msg);
    });
});