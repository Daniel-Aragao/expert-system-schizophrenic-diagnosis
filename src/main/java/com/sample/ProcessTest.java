package com.sample;


import java.util.Calendar;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;



/**
 * This is a sample file to launch a process.
 */
public class ProcessTest {

	public static final void main(String[] args) {
		try {
			 KieServices ks = KieServices.Factory.get();
			 KieContainer kContainer = ks.getKieClasspathContainer();
			 KieSession kSession = kContainer.newKieSession("ksession-rules");
			 
			 Calendar startDate = Calendar.getInstance();
			 startDate.set(Calendar.YEAR, 2003); 
			 startDate.set(Calendar.MONTH, Calendar.MARCH); 
			 startDate.set(Calendar.DAY_OF_MONTH, 15);
			 
			 Calendar endDate = Calendar.getInstance();
			 endDate.set(Calendar.YEAR, 2010); 
			 endDate.set(Calendar.MONTH, Calendar.JANUARY); 
			 endDate.set(Calendar.DAY_OF_MONTH, 03);
			 
			 Patient patient = new Patient();
			 Symptom symptom = new Symptom(startDate, endDate, ESymptomType.Attention);
			 patient.setSymptom(symptom);
			 
			 kSession.insert(patient);
			 kSession.insert(symptom);
			 
			 kSession.fireAllRules();
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}
}
