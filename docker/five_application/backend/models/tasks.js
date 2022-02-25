const mongoose = require("mongoose");


const schema = mongoose.Schema;
const taskSchema = Schema({
	text : String,
});


const taskModel = mongoose.model("tasks",taskSchema);

module.exports = taskModel;