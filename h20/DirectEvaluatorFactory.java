package com.fearsfx.elsys.interclass2;

public class DirectEvaluatorFactory implements IEvaluatorFactory {

	@Override
	public IEvaluator createSumEvaluator() {
		IEvaluator eval = new SumEvaluator(2);
		return eval;
	}

	@Override
	public IEvaluator createPowerOnEvaluator() {
		IEvaluator eval = new PowerOnEvaluator(2);
		return eval;
	}

	@Override
	public IEvaluator createPowerOnEvaluator(double power) {
		IEvaluator eval = new PowerOnEvaluator(2, power);
		return eval;
	}

	@Override
	public IEvaluator createFibonaciEvaluator() {
		IEvaluator eval = new FibonaciEvaluator(2);
		return eval;
	}
	
}
