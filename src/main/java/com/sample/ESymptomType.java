package com.sample;

public enum ESymptomType {
	Hallucination(1),
	Delusions(2),
	ClutterOfThought(3),
	MotorDisorganization(4),
	EmotionalExpression(5),
	Memory(6),
	Attention(7),
	LateMarch(8),
	LateSpeech(9);
	
	
	private int value;
	
	ESymptomType(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public static ESymptomType getESymptomType(int value){
		ESymptomType eSymptomType = null;

	    for(ESymptomType e : ESymptomType.values()){
	        if(e.getValue() == value){
	        	eSymptomType = e;
	            break;
	        }
	    }

	    return eSymptomType;
	}
	
}
