package com.sample;

import java.util.ArrayList;
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
	
	public List<Symptom> getSymptom(ESymptomType symptom) {
		List<Symptom> symptons = new ArrayList<Symptom>();
		
		for(Symptom s : Symptons) {			
			if(s.getSymptonType() == symptom) {
				symptons.add(s);
			}
		}
		
		return symptons;
	}
	
	public int getMonthsOfSymptom(ESymptomType symptom) {
		List<Symptom> symptons = getSymptom(symptom);
		int months = 0;
		
		for(Symptom s : symptons) {			
			if(s.getMonths() > months) {
				months = s.getMonths();
			}
		}
		
		return months;
	}
}
