package com.fearsfx.elsys.interclass2;

public class PowerOnEvaluator extends Evaluator {
	
	private Double power;

	public PowerOnEvaluator(int kind) {
		super(kind);
		this.power = 2.0;
		// TODO Auto-generated constructor stub
	}
	
	public PowerOnEvaluator(int kind, double power){
		super(kind);
		this.power = power;
	}

	@Override
	public Double evaluate() {
		// TODO Auto-generated method stub
		double res = 0.0;

		for(Double d : list){
			res += Math.pow(d, power);
		}
		return res;

	}

}
