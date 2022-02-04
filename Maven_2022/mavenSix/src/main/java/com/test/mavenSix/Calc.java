/**
 * 
 */
package com.test.mavenSix;

/*
 * :::root_Kali@Rjain$:::
 */
public class Calc implements iCalc{
	
	
	public int evaluate(String s) {
		int sum=0;
		for(String e : s.split("\\+")) {
			sum+=Integer.parseInt(e);
			
		}
		return sum;
	}

	@Override
	public int sum(int a,int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int mul(int a , int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public int div(int a, int b) {
		// TODO Auto-generated method stub
		if(b==0) {System.out.println("divide by zero sry!!");return -1;}
		else if(a==0) {return 0;}
		else {
		return a/b;
		}
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double divDouble(double a, double b) {
		if(b==0) {System.out.println("divide by zero sry!!");return -1;}
		else if(a==0) {return 0;}
		
		return (double)a/b;
	}

}
