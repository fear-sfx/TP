package com.fearsfx.elsys.green_belt;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		List<Widget> widgetList = new ArrayList<Widget>();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter button's  x,y,text : ");
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		String text = scan.next();
		
		widgetList.add(new Button(x,y,text));
		
		System.out.println("Enter label's  x,y,text : ");
		x = scan.nextDouble();
		y = scan.nextDouble();
		text = scan.next();
		
		widgetList.add(new Label(x,y,text));
		
		System.out.println("Enter button text : ");
		String text2 = scan.next();
		String[] splitText = text2.split(",");
		
		if(splitText[0].equals("c")){
			for(int i = 0; i<widgetList.size(); i++){
				if(widgetList.get(i) instanceof Button){
					Button but = (Button) widgetList.get(i);
					System.out.println(but.click());
				}
			}
		}
		
		
		widgetList.get(0).print();
		
	}
}
