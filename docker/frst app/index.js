// console.log('helo tehre !!');


const express = require('express');
const app = express();


app.get("/",(req,res)=>{
	res.send("hello from docker temp !!");
})

const port = 3000 ;
app.listen(port,()=>{
	console.log(`server running on ${port}`);
})