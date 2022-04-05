package com.spring.springcore;

public class StudentRef {
	
	private ScoreRef scores;

	public ScoreRef getScores() {
		return scores;
	}

	public void setScores(ScoreRef scores) {
		this.scores = scores;
	}

	@Override
	public String toString() {
		return "StudentRef [scores=" + scores + "]";
	}
	

}
