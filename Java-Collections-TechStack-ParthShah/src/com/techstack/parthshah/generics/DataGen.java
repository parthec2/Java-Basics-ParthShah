package com.techstack.parthshah.generics;

//Generic Class
//ex-DataGen<String>
//   DataGen<Integer>
//generic class can implement generic interface provide both have same type
public class DataGen<T> implements IDataGen<T> {

	private T data;

	public DataGen() {
		
	}

	@Override
	public T getData() {
		return data;
	}

	@Override
	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "DataGen [data=" + data + "]";
	}	
	
		
}
