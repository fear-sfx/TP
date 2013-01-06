package com.fearsfx.elsys.interclass2;

public class FibonaciEvaluator extends Evaluator{

	public FibonaciEvaluator(int kind) {
		super(kind);
		// TODO Auto-generated constructor stub
	}

	public static int fib(double n){
		int fib1 = 0, fib2 = 1;
		
		while(n > fib2){
			fib2 += fib1;
			fib1 = fib2 - fib1;			
		}
		
		if(Math.abs(fib1 - n) < Math.abs(fib2 - n)){
			return fib1;
		}else{
			return fib2;
		}
	}
	
	@Override
	public Double evaluate() {
		// TODO Auto-generated method stub
		double res = 0.0, sum = 0.0;
		
		for(Double d : list){
			sum += d;
		}
		res = fib(sum);
		return res;
	}

}
