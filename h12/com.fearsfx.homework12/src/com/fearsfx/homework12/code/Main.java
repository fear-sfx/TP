// Технологично училище Електронни системи - http://www.elsys-bg.org/
// клас : 11б
// номер : 27
// име : Тодор Руменов Маноилов
// задача : Да се разработи програма симулираща местата в самолет (27 реда, 2 колони и по 3 места в колона).
// На случаен принцип се генерират числа (между 1 и 3), определящи броя на пътниците, които ще се качат на самолета,
// като те задължително трябва седят един до друг. Да могат да се добавят и премахват пътници, както и да
// се проверява колко от тях са мъже или жени.

package com.fearsfx.homework12.code;

import java.util.*;

public class Main {
	public static void main(String[] args) {
	
		// create plane
		Plane plane = new Plane();
		
		// get starting capacity
		System.out.println(plane.getCapacity());
		
		// load the plane
		while(plane.getCapacity() != 0){
			int rval = new Random().nextInt(3) + 1;
			Human[] ppl = new Human[rval];
			for(int i =0; i < rval; i++){
				ppl[i] = new Human();
			}
			plane.addHuman(rval, ppl);
		}
		
		// check if all seats are taken
		System.out.println(plane.getCapacity());
		
		// expel some people (row, column)
		plane.removeHuman(2, 3);
		plane.removeHuman(2, 4);
		plane.removeHuman(2, 5);
		
		// check how many seats are free
		System.out.println(plane.getCapacity());
		
		// load the plane again
		while(plane.getCapacity() != 0){
			int rval = new Random().nextInt(3) + 1;
			Human[] ppl = new Human[rval];
			for(int i =0; i < rval; i++){
				ppl[i] = new Human();
			}
			plane.addHuman(rval, ppl);
		}
		
		// check if the plane is full
		System.out.println(plane.getCapacity());
		
		// get female passengers
		System.out.println(plane.getFemale());
		
		// get male passengers
		System.out.println(plane.getMale());
		
		// empty the plane
		plane.clear();
		
		// check if it really is empty
		System.out.println(plane.getCapacity());
				
	}
}
