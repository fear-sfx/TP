package com.fearsfx.elsys.interclass2;

public class Main {
	public static void main(String[] args) {
		DirectEvaluatorFactory def = new DirectEvaluatorFactory();
		IEvaluator sEval = def.createSumEvaluator();
		sEval.add(5);
		sEval.add(5);
		System.out.println(sEval.evaluate());
	}
}
