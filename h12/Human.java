package com.fearsfx.homework12.code;

import java.util.*;

public class Human {
	
	String[] names = {"Asen", "Yosif", "Kaloyan", "Kristian", "Mirela", "Yana", "Desislava", "Simona"};
	String[] genders = {"Man", "Woman"};
	
	private int rName = new Random().nextInt(8);
	private int gen;
	
	{	
		if(rName < 4){ gen = 0;	}
			else{ gen = 1; }
	}
	
	private String gender = genders[gen];
	private String name = names[ rName ];
	
	public String getName(){
		return name;
	}
	public String getGender(){
		return gender;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setGender(String gen) {
		this.gender = gen;
	}
}
