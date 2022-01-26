function optionalChain(){
    var users = [{name:"Sanket", age:25, address:{state:"KR",City:"BLR"}},
{name:"Nagga Subba Reddy",age:26},
{name:"Kumar", age:36, address:{state:"TN"}}];

for(var v=0;v<users.length;v++){
    let user = users[v];
    let address = users[v]?.address;
    document.write(`<p>Name: ${user.name}, Age: ${user.age}</p>`);
    document.write(`<p>Address state: ${address?.state}, City: ${address?.City}`)
}
}

optionalChain();







function objDestructure(){
    var employee = {name:"Alex", age: 32, salary:22000};
    var {name,age,salary} = employee;
   // var name="alex";
   // var age=23;
   // var salary=99000;
    //var employee ={name,age,salary};
   // document.write(`<p>Employee Object: ${employee.name}</p>`)
    document.write(`<p>Name: ${name} Age: ${age} Salary: ${salary} </p>`);
}

//objDestructure();










function padEndAndStart(){
    var str="998877";
    var str1 = str.padStart(10,'x');
    var str2 = str.padEnd(10,'x');

    document.write(`<p>${str1}</p>`);
    document.write(`<p>${str2}</p>`);

    var random = Math.random();
    document.write(`<p>Random: ${random}</p>`);
    var random6 = Math.trunc(random*1000000,0);
    document.write(`<p>Random Before Pad: ${random6}</p>`);
    var random6pad = random6+"";
    random6pad = random6pad.padEnd(6,'0');
    document.write(`<p>Random After Pad: ${random6pad}</p>`);
}

//padEndAndStart();







function ObjEntriesAndValues(){
    employee = {name:"Raj", age:28};
    fruits = ["Apple","Orange","Grape"];
    document.write(`<p>${Object.entries(employee)}</p>`);
    document.write(`<p>${Object.values(employee)}</p>`);
    document.write(`<p>${fruits.includes("mango")}</p>`);
    document.write(`<p>${fruits.includes("Apple")}</p>`);
}


//ObjEntriesAndValues();







function restAndSpreadParameters(){
    function test(x,y){
        document.write(`<p> X= ${x}, Y= ${y}</p>`);
    }
    function hello(x, ...y){// rest parameter
        document.write(`<p> X= ${x}, Y= ${y}</p>`);
    }
    function welcome(x,y,...z){
        document.write(`<p> X= ${x}, Y= ${y}, Z= ${z}</p>`);
    }
    items =[50,60,70,100,200];
    test(20,30,80,60,40);
    hello(20);
    hello(20,30,40,10,100);
    welcome(...items); // spread parameter
}

//estAndSpreadParameters();



function defaultParameters(){
    function add(x=1,y=1){
        document.write(`<p> X= ${x}, Y= ${y}</p>`);
        document.write(x**y);
    }
    add(2,3);
    add();
    add(15);
}
//defaultParameters();




function trailingCommas(){
    var items = [1,2,3,4,];
    document.write('<p>'+items+'</p>');
}

//trailingCommas();



function expoNentialOperator(){
    document.write('<h1>'+Math.pow(2,3)+'</h1>')
}

//expoNentialOperator();






function templateLiterals(){
    var name="kumar";
    var age =26;
    var salary = 30000;
    var url = 'http://dev.io.com/'+name+'/'+age+'/'+salary;
    document.write('<p> url: '+url+'</p>');
    var url2 = `http://dev.io.com/${name}/${age+5}/${salary}`;
    document.write('<p>url2: '+url2+'</p>');

}


//templateLiterals();












function arrowFunctions(){
    var items = [2,3,4,5];
    var anotherItems = items.map(function(item,index){
        return item*10;
    });
    document.write('<p> Items: '+items+'</p>');
    document.write('<p>Another Items: '+anotherItems+'</p>');
    var somemoreItems = items.map((item,index) => item * 100);
    document.write('<p>Some more Items: '+somemoreItems+'</p>');
}

//arrowFunctions();






class usageOfStatic{
    x = 20;
    static y= 30;
     hello(){
         console.log('Inside Non-static X='+this.x+" Y="+this.y);
     }
     static welcome(){
        console.log('Inside static X='+this.x+" Y="+this.y);
    }
}
//var s = new usageOfStatic();
//s.hello();
//usageOfStatic.welcome();






class EmployeeClass{
    constructor(name, age){
        this.name=name;
        this.age=age;
    }
    display(){
        document.write('<p>Name: '+this.name+' Age: '+this.age+'</p');
    }
}

class Manager extends EmployeeClass{
    constructor(name, age, employeesReporting){
        super(name,age);
        this.employeesReporting = employeesReporting;
    }

    display(){
        document.write('<p>Name: '+this.name+' Age: '+this.age+', ReportingTo: '+this.employeesReporting+'</p');
    }
}
//var m = new Manager("Vineeth",45,8);
//m.display();


//var e = new EmployeeClass("thendral",30);
//e.display();



function Employee(name, age){
    this.name = name;
    this.age = age;
}

Employee.prototype.display = function(){
    document.write('<p>Name: '+this.name+' Age: '+this.age+'</p');
}
//var e = new Employee("thendral",30);
//e.display();


function jsScopes(){
    for(var x=0;x<2;x++){
        var y=30;
        const pi =3.14;
        //pi = 4.343;

        let z = 45+x;
        console.log('X='+x+"pi="+pi+"Z="+z);
    }
    console.log('Y='+y);
    console.log('pi='+pi);
    console.log('Z='+z);
}
//jsScopes();