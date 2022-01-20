let x=20;
let y=30;
let z=x+y;
console.log(`z=, ${z}`);
setTimeout(()=>{
    console.log(`this is inside callback   `);
}, 1000);
setTimeout(()=>{
    console.log(`this is inside 2nd callback   `);
}, 100);
console.log('last line!');