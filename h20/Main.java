package com.fearsfx.elsys.interclass2;

public class Main {
	public static void main(String[] args) {
		DirectEvaluatorFactory def = new DirectEvaluatorFactory();
		AbsoluteEvaluatorFactory aef = new AbsoluteEvaluatorFactory();
		
		IEvaluator eval;
		
		// DIRECT --------------------------------------
		
		// Sum
		
		eval = def.createSumEvaluator();
		eval.add(3.0);
		eval.add(-4.0);
		System.out.println(eval.evaluate());

		// PowerOn
		
		eval = def.createPowerOnEvaluator();
		eval.add(3.0);
		eval.add(2.0);
		System.out.println(eval.evaluate());

		// PowerOn w/ args
		
		eval = def.createPowerOnEvaluator(3);
		eval.add(3.0);
		eval.add(2.0);
		System.out.println(eval.evaluate());
		
		// Fib
		
		eval = def.createFibonaciEvaluator();
		eval.add(4.0);
		eval.add(-2.0);
		System.out.println(eval.evaluate());
		
		// ABSOLUTE -----------------------------------
		
		// Sum
		
		eval = aef.createSumEvaluator();
		eval.add(3.0);
		eval.add(-4.0);
		System.out.println(eval.evaluate());

		// PowerOn
		
		eval = aef.createPowerOnEvaluator();
		eval.add(3.0);
		eval.add(2.0);
		System.out.println(eval.evaluate());

		// PowerOn w/ args
		
		eval = aef.createPowerOnEvaluator(3);
		eval.add(3.0);
		eval.add(2.0);
		System.out.println(eval.evaluate());
		
		// Fib
		
		eval = aef.createFibonaciEvaluator();
		eval.add(4.0);
		eval.add(-2.0);
		System.out.println(eval.evaluate());
				
	}
}
