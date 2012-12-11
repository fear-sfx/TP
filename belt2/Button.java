package com.fearsfx.elsys.green_belt;

public class Button extends Widget implements IClickable{
	Button(double x, double y, String text){
		this.x = x;
		this.y = y;
		this.text = text;
	}

	public String click() {
		return this.text.toUpperCase();		
	}
}
