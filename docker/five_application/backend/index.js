
const express = require('express');
const fs = require('fs');
const path = require('path');
const morgan = require('morgan');
const bodyParser = require('body-parser');
const mongoose = require("mongoose");

const Task = require('./models/tasks')



const app = express();

const accessLogStream = fs.createWriteStream(path.join(__dirname , 'logs' , 'access.log'),
		{flag:"a"}
	);

app.use(morgan("combined" , {stream : accessLogStream}));

app.use((req,res,next)=>{
			res.setHeader("Access-Control-Allow-Origin","*");
			res.setHeader("Access-Control-Allow-Methods","GETS,POST ,DELETE ,OPTIONS");
			res.setHeader("Access-Control-Allow-Headers","Content-Type");
			next();

		}

	);


app.use(bodyParser.json());


//defining  port
const port = 3000 ;


app.get('/tasks',async (req,res)=>{

	try{
		const tasks = await Task.find();
		res.status(200).json({
			tasks : tasks.map((task)=>({id:task.id,text:task.text}))
		});

	}
	catch(error){
		res.status(500).json({message:"failed to load msg"});
	}

});


 mongoose.connect(
 		//1)   `mongodb://<IPv4 address of mongoDB via docker inspect id >:27017`
 		//2)   `mongodb://mongodb:27017`
 		//3)   `mongodb://admin:password@mongodb:27017`
		`mongodb://host.docker.internal:27017`,
		{useNewUrlParser :true , useUnifiedTopology : true } , 
		(err) =>{
			if(err){console.log('failed to connect to mongio db ')}
			else{ 
					console.log('connect to mongo DB...');
					app.listen(port,()=>{
						console.log(`server running on ${port} !!`);
					});
			}
		}
	);

