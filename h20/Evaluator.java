package com.fearsfx.elsys.interclass2;

import java.util.*;

public abstract class Evaluator implements IEvaluator {

	protected List<Double> list = new ArrayList<Double>();
	protected Integer kind;
	
	public Evaluator(int kind){
		this.kind = kind;
	}
	
	@Override
	public void add(double d) {
		switch(this.kind){
			case 1: list.add(Math.abs(d));
					break;
			case 2: list.add(d);
					break;
		}
	}
	
	@Override
	abstract public Double evaluate();

}
