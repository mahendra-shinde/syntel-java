package com.mahendra;

public abstract class InterestCalculator {
	protected float principle, rate,duration;

	public InterestCalculator(float principle, float rate, float duration) {
		super();
		this.principle = principle;
		this.rate = rate;
		this.duration = duration;
	}
	
	public abstract float calc();
	
}
