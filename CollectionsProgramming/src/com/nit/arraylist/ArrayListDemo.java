package com.nit.arraylist;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		//create ArrayList obj with default size
		ArrayList<Object> al=new ArrayList<Object>();
		
		//1st check weather collection isEmpty or not
		System.out.println("Is This collection is Empty ::- "+al.isEmpty()); //gives true
		//add all 4 type of elements(same,diffrent,duplicate,unique)
		al.add("a");
		al.add("b");
		al.add(5);
		al.add(6);
		System.out.println(" Elements are ::-"+al);
		System.out.println("Size of the ArrayList ::- "+al.size());
		System.out.println();
		//add duplicates to collections
		al.add("a");   
		//add null values to collections (more than one)
		al.add(null);
		al.add(null);
		al.add(null);
		System.out.println("Elements are ::- "+al);
		System.out.println("Size of the ArrayList ::- "+al.size());
		System.out.println();
		//check whether duplicate obj is one more time created or not ? by using == operator 
		// if  we comapair 0 endex based "a" and 4 endex "a " obj using == operator 
		//then if we get true then we can say for every duplicated obj one more obj is not created moreover it is pointing to that old obj 
		/*if(al.get(0)== al.get(4)) 
			System.out.println("Both (a Obj )  Are Pointing to Same obj ");
		System.out.println();*/
		//System.out.println("Both a obj is Pointing to Same obj ::- "+ al.get(0)== al.get(4)); //gives false (why find)
		System.out.println("Both a obj is Pointing to Same obj ::- "+ (al.get(0)== al.get(4)));
		System.out.println();
	
		//retrieve values from the arrayList 
		System.out.println("3rd index Object is::- "+al.get(3));
		}
}
