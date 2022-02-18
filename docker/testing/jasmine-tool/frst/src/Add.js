function add(){

	let sum=0;
	for(let i=0;i<arguments.length;i++){
		if(typeof arguments[i] === "function"){
			sum+= parseInt(arguments[i]());
		}
		sum+= isNaN(parseInt(arguments[i])) ? 0 : parseInt(arguments[i]);
		//sum+=arguments[i];
	}
	return sum;
}

