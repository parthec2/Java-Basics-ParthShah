package com.techstack.parthshah.javabasics.models;


public class Cricketer 
{
	private String name;
	private int runs;
	private double avg;
	
	public Cricketer(String name,int runs,double avg) {
		this.name = name;
		this.runs = runs;
		this.avg=avg;
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
	
}
