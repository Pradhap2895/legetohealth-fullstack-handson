let fs = require(`fs`);

fs.readFile(`User.json`,(err,data)=>{
    if(err){
        console.log(err);
    }else{
        const users = require("./User.json");
        content = data.toString();
        let jsonArr = JSON.parse(content);

        let user = {
            name: "New User",
            age: 30
        };
           
        // STEP 2: Adding new data to users object
        users.push(user);
      
    fs.writeFile('User.json', JSON.stringify(users), (err) => {
    
    if (err) {
        console.log(err);
    }
   
});

    }
});

console.log("Done writing"); 