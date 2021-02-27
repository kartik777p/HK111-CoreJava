package com.nit.arraylist;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;
import java.util.Vector;

public class InterviewQuestionBasedOn_instanceof{

	public static void main(String[] args) {
		//create ArrayList and linkedList obj with iniatial capasity
		ArrayList<Object> al=new ArrayList<>();
	    Vector<Object> v=new Vector<>();
		LinkedList<Object> ll= new LinkedList<Object>();
		//test cases
		System.out.println(al instanceof Serializable);  // all collection impl Serializable interface 
        System.out.println( al instanceof Cloneable);    //all collection impl Clonable intrface
	    System.out.println(al instanceof RandomAccess);  //only ArrayList and Vector class imp this interface
	    System.out.println(v instanceof RandomAccess);
	   
	   System.out.println();
	   System.out.println(ll instanceof Serializable);  // all collection impl Serializable interface 
       System.out.println(ll instanceof Cloneable);    //all collection impl Clonable intrface
	   System.out.println(ll instanceof RandomAccess); //false bcz other than Arraylist and vector any class don'st impl RandomAcess Interface
	}

}
