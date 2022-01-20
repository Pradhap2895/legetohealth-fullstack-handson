let util={
    store : function(name, age){
        console.log(`stored ${name} and ${age}`);
    },
    find : function(name){
        console.log(`Finding: ${name}`)
    }
}
module.exports=util;