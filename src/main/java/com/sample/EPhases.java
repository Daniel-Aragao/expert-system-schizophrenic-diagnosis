package com.sample;

public enum EPhases {
	PremorbidSigns(1),
	Prodromal(2),
	Acute(3),
	Chronic(4);
	
	
	private int value;
	
	EPhases(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
}
