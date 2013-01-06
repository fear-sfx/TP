package com.fearsfx.elsys.interclass2;

public class SumEvaluator extends Evaluator {

	public SumEvaluator(int kind) {
		super(kind);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double evaluate() {
		// TODO Auto-generated method stub
		double res = 0.0;
		
		for(Double d : list){
			res += d;
		}
		return res;
	}

}
