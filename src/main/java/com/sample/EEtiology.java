package com.sample;

public enum EEtiology {
	Genetic(1),
	Gestation(2),
	FamilyProblems(3),
	SexualAbuse(4),
	Drugs(5);
	
	private int value;
	
	EEtiology(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
}
