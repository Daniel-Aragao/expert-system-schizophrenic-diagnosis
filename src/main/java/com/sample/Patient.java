package com.sample;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Patient {
	private List<Symptom> Symptons;
	private List<EEtiology> EtiologyFactors;
	
	public Patient() {
		Symptons = new ArrayList<Symptom>();
		EtiologyFactors = new ArrayList<EEtiology>();
	}
	
	public boolean hasSymptom(ESymptomType symptom) {
		for(Symptom s : Symptons) {			
			if(s.getSymptonType() == symptom) {
				return true;
			}
		}
		
		return false;
	}
	
	public Symptom getSymptom(ESymptomType symptom) {
	
		for(Symptom s : Symptons) {			
			if(s.getSymptonType() == symptom) {
				return s;
			}
		}
		
		return null;
	}
	
	public void setSymptom(Symptom symptom) {
		this.Symptons.add(symptom);
	}
	
	public int getMonthsOfSymptom(ESymptomType symptom) {
		Symptom symptons = getSymptom(symptom);
		
		if(symptons != null) {
			return symptons.getEndDate().get(Calendar.YEAR) - symptons.getStartDate().get(Calendar.YEAR);
		}
		return 0;
	}
}
