let http = require(`http`);
let url = require(`url`);
let port = 9090;
let server =http.createServer((request, response)=>{

    if(request.utl != `/favicon.ico`){
    let urlObject = url.parse(request.url, true);
    console.log(urlObject.query.username);
    response.writeHead(200, {'content-type':'text/html'});
    response.write(`<h1>Welcome to Node <b>Web</b> </h1>`);
    response.end();
    }
});

server.listen(9090, ()=>console.log(`Server started in ${port}`))