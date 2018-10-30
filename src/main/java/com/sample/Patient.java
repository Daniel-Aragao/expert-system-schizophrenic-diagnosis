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
}
