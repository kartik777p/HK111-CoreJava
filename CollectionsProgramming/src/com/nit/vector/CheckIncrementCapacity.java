package com.nit.vector;

import java.util.Vector;

public class CheckIncrementCapacity {

	public static void main(String[] args) {
		//create obj of vector
		Vector<Object> v=new Vector<>();
		System.out.println(" it is isEmpty ::- "+v.isEmpty());
		System.out.println("Current Capacity is ::- "+v.capacity());
		for(int i=1;i<=10;i++) {
			v.add(i);
			if(i==10) {
				System.out.println("All elemets are added");
				System.out.println();
			}
		}
		System.out.println("Current capacity ::- "+v.capacity());
		System.out.println("Elements are ::- "+v);
		//new add 11nth element 
		v.addElement("A");
		System.out.println("Incremented capacity is ::- "+v.capacity());
	}
}
