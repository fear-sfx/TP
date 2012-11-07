package com.fearsfx.homework11.code;

public class Ball {

	String name;
	
	public Ball(){
		name = "0x0x0";	
	}
	
	public Ball(String val){
		name = val;	
	}
	
	String GetName(){
		return name; 
	}
	
	void SetName(String val){
		name = val;
	}
	
}
