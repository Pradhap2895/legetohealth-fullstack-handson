let fs = require(`fs`);

let data = fs.readFileSync(`simple.txt`);

// convert to Bytestream to characterstream
let content = data.toString();
console.log(content);