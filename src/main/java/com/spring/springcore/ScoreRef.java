package com.spring.springcore;

public class ScoreRef {

	private double maths;
	private double physics;
	private double chemistry;

	public double getMaths() {
		
		return maths;
	}

	public void setMaths(double maths) {
		this.maths = maths;
	}

	public double getPhysics() {
		return physics;
	}

	public void setPhysics(double physics) {
		this.physics = physics;
	}

	public double getChemistry() {
		return chemistry;
	}

	public void setChemistry(double chemistry) {
		this.chemistry = chemistry;
	}

	@Override
	public String toString() {
		return "ScoreRef [maths=" + maths + ", physics=" + physics + ", chemistry=" + chemistry + "]";
	}
	

}
