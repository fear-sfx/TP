package com.fearsfx.elsys.interclass2;

public interface IEvaluatorFactory {
	
	public IEvaluator createSumEvaluator();
	
	public IEvaluator createPowerOnEvaluator();
	
	public IEvaluator createPowerOnEvaluator(double power);
	
	public IEvaluator createFibonaciEvaluator();
}
