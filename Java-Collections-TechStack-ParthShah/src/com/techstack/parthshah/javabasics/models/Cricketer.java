package com.techstack.parthshah.javabasics.models;

import java.util.List;

public class Cricketer 
{
	private String name;
	private int runs;
	private double avg;
	
	private List<String> formatsPlayed; //ODI,TEST,IPL
	
	//Constructor-1
	public Cricketer(String name,int runs,double avg) {
		this.name = name;
		this.runs = runs;
		this.avg=avg;
		this.formatsPlayed=null;
	}
	
	//Constructor-2
	public Cricketer(String name, int runs, double avg, List<String> formatsPlayed) {
		this.name = name;
		this.runs = runs;
		this.avg=avg;
		this.formatsPlayed = formatsPlayed;
	}
	
	@Override
	public String toString() {
		return "Cricketer [name=" + name + ", runs=" + runs + ", avg=" + avg + "]";
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getRuns() {
		return runs;
	}
	
	public void setRuns(int runs) {
		this.runs = runs;
	}
	
	public double getAvg() {
		return avg;
	}
	
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public List<String> getFormatsPlayed() {
		return formatsPlayed;
	}

	public void setFormatsPlayed(List<String> formatsPlayed) {
		this.formatsPlayed = formatsPlayed;
	}
	
}
