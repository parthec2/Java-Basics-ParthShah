package com.techstack.parthshah.generics;

import java.util.List;

public class Box<T> {

	private List<T> lstVal;

	public Box() {
		
	}
	
	public Box(List<T> lstVal2) {
		this.lstVal=lstVal2;
	}
	
	public List<T> getLstVal() {
		return lstVal;
	}

	public void setLstVal(List<T> lstVal) {
		this.lstVal = lstVal;
	}
	
}
