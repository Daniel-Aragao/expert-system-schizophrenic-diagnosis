package com.sample;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Calendar;

public class Symptom {
	private Calendar startDate;
	private Calendar endDate;
	private ESymptomType symptonType;
	
	public Symptom(Calendar startDate, Calendar endDate, ESymptomType symptonType){
		this.startDate = startDate;
		this.endDate = endDate;
		this.symptonType = symptonType;
	}
	
	public long getDays() {
		LocalDate start = LocalDate.of(this.startDate.get(Calendar.YEAR), this.startDate.get(Calendar.MONTH), this.startDate.get(Calendar.DAY_OF_MONTH));
		LocalDate end = LocalDate.of(this.endDate.get(Calendar.YEAR), this.endDate.get(Calendar.MONTH), this.endDate.get(Calendar.DAY_OF_MONTH));
		return Duration.between(start, end).toDays();
	}
	
	public boolean isConcurrent() {
		return (this.endDate.get(Calendar.DAY_OF_MONTH) == Calendar.getInstance().get(Calendar.DAY_OF_MONTH) &&
			    this.endDate.get(Calendar.MONTH) == Calendar.getInstance().get(Calendar.MONTH) &&
			    this.endDate.get(Calendar.YEAR) == Calendar.getInstance().get(Calendar.YEAR));
	}
	
	public int getMonths() {
		return (int) this.getDays()/30;
	}

	public Calendar getStartDate() {
		return startDate;
	}

	public Calendar getEndDate() {
		return endDate;
	}

	public ESymptomType getSymptonType() {
		return symptonType;
	}
}