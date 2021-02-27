package com.nit.vector;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		//creat vector obj
		Vector<Object> v=new Vector<>();
		System.out.println("is it is isEmpty ::- "+v.isEmpty());
   // add obj / element to collection
		v.add("a");
		v.add("b");
		v.add(5);
		v.add(6);
		System.out.println("Current size is ::- "+v.size());
		System.out.println("Elements are ::- "+v);
		System.out.println();
		//add duplicates 
		v.add("a");
		// add Nulls
		v.add(null);
		v.add(null);
		v.add(null);
		System.out.println("Current size is ::- "+v.size());
		System.out.println("Elements are ::- "+v);
		
		//checks for duplicate one more obj is created or not 
		System.out.println("Both a obj is Pointing to Same obj ::- "+ (v.get(0)== v.get(4)));
		System.out.println();
	
		//retrieve values from the arrayList 
		System.out.println("3rd index Object is::- "+v.get(3));
	}
}
