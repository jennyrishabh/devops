describe("add spec", function() {
 	it("should add with 0 args",function(){
 		let result = add();
 		expect(result).toBe(0);
 	});

 	it("should add with 1 args",function(){
 		let result = add(10);
 		expect(result).toBe(10);
 	});

 	it("should add with 2 args",function(){
 		let result = add(1,2);
 		expect(result).toBe(3);
 	});

 	it("should add with n args",function(){
 		let result = add(1,2,3,4,5);
 		expect(result).toBe(15);
 	});

 	it("should add with 5 String and no. mix",function(){
 		let result = add(1,"2",3,"4","5");
 		expect(15).toBe(result);
 	});

 	it("should add with 5 String number also  and no. mix",function(){
 		let result = add(1,"two","3","four","5");
 		expect(9).toBe(result);
 	});

 	it("should add with 5 String number also  and no. mix && function's ",function(){
 		let result = add(1,"two",three,four,"5");
 		expect(13).toBe(result);
 	});



});


function three(){
	return "3";
}

function four(){
	return 4;
}
