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
			 endDate.set(Calendar.YEAR, 2018); 
			 endDate.set(Calendar.MONTH, Calendar.NOVEMBER); 
			 endDate.set(Calendar.DAY_OF_MONTH, 01);
			 
			 Patient patient = new Patient();
			 patient.setIdade(4);
			 
			 Symptom symptom = new Symptom(startDate, endDate, ESymptomType.Hallucination);
			 patient.addSymptom(symptom);
			 
			 symptom = new Symptom(startDate, endDate, ESymptomType.Delusions);
			 patient.addSymptom(symptom);
			 
			 symptom = new Symptom(startDate, endDate, ESymptomType.ClutterOfThought);
			 patient.addSymptom(symptom);
			 
			 symptom = new Symptom(startDate, endDate, ESymptomType.MotorDisorganization);
			 patient.addSymptom(symptom);

			 
			 kSession.insert(patient);

//			 kSession.insert(ESymptomType.Hallucination);
//			 kSession.insert(ESymptomType.Delusions);
//			 kSession.insert(ESymptomType.ClutterOfThought);
//			 kSession.insert(ESymptomType.MotorDisorganization);
//			 kSession.insert(ESymptomType.EmotionalExpression);
//			 kSession.insert(ESymptomType.Memory);
//			 kSession.insert(ESymptomType.Attention);
//			 kSession.insert(ESymptomType.NegativeSymptoms);
//			 kSession.insert(ESymptomType.ComportamentoAnormal);
//			 kSession.insert(ESymptomType.LateMarch);
//			 kSession.insert(ESymptomType.LateSpeech);
//			 kSession.insert(ESymptomType.Learning);
//			 kSession.insert(ESymptomType.ProblemSolve);
			 kSession.fireAllRules();
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}
}
