package com.techstack.parthshah.generics;

import java.util.List;

class DemoMultiType {

	public static void main(String args[]) 
	{
		MultiTypeParams<Integer,String> objMultiTYpe = new MultiTypeParams<>();
		objMultiTYpe.setDryTrash(2);
		objMultiTYpe.setWetTrash("This is wet trash");
		Integer dryTrash = objMultiTYpe.getDryTrash();
		//String dryTrash2 = objMultiTYpe.getDryTrash();
		
		String wetTrash = objMultiTYpe.getWetTrash();
		
		System.out.println("Dry Trash-:"+ dryTrash + ",Wet trash value:-"+ wetTrash);
	}
}
public class MultiTypeParams<D,W> {

	private D dryTrash;
	private W wetTrash;


	public D getDryTrash() {
		return dryTrash;
	}


	public void setDryTrash(D dryTrash) {
		this.dryTrash = dryTrash;
	}


	public W getWetTrash() {
		return wetTrash;
	}


	public void setWetTrash(W wetTrash) {
		this.wetTrash = wetTrash;
	}

	public MultiTypeParams() {
		
	}
	
}
