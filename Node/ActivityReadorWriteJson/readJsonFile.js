let fs = require(`fs`);
let content;

fs.readFile(`User.json`,(err,data)=>{
    if(err){
        console.log(err);
    }else{
        content = data.toString();
        let jsonArr = JSON.parse(data);
       // console.log(`json data: ${jsonArr}`);
      
      // console.log(content);
        for(var u of jsonArr){
            console.log(`User = ${u.name} , Age= ${u.age}`);
        }
       //let user = jsonArr[0];
       //console.log(`user= ${user.name}`);
       
    }
});


console.log(`Reading Done`);