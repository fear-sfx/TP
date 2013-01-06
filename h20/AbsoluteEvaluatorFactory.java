package com.fearsfx.elsys.interclass2;

public class AbsoluteEvaluatorFactory implements IEvaluatorFactory {

	@Override
	public IEvaluator createSumEvaluator() {
		IEvaluator eval = new SumEvaluator(1);
		return eval;
	}

	@Override
	public IEvaluator createPowerOnEvaluator() {
		IEvaluator eval = new PowerOnEvaluator(1);
		return eval;
	}

	@Override
	public IEvaluator createPowerOnEvaluator(double power) {
		IEvaluator eval = new PowerOnEvaluator(1, power);
		return eval;
	}

	@Override
	public IEvaluator createFibonaciEvaluator() {
		IEvaluator eval = new FibonaciEvaluator(1);
		return eval;
	}

}
