let fs=require(`fs`);

let text = `this is a simple text`;

//flag enables appending

fs.writeFileSync(`msg.txt`,text,{flag:`a+`});