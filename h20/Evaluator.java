package com.fearsfx.elsys.interclass2;

import java.util.*;

public class Evaluator implements IEvaluator {

	private List<Double> list = new ArrayList<Double>();
	
	@Override
	public void add(double d) {
		list.add(d);		
	}
	
	
	
	@Override
	public Double evaluate() {
		double res=0;
		for(Double d : list){
			res += d;
		}
		return res;
	}


	@Override
	public Double action() {
		
		return null;
	}




}
