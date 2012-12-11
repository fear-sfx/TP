package com.fearsfx.elsys.green_belt;

public class Widget {
	String text = "text";
	double x = 0.0, y = 0.0;
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public void print(){
		System.out.println("Widget text : " + this.text);
		System.out.println("(x, y) = (" + this.x + ", " + this.y + ")");
	}
}
