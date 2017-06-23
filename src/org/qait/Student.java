package org.qait;

public class Student 
	
	{
	    int id;
	    String name;
	    double cgpa;
	 
	   
	    Student(int id, String name,
	                               double cgpa)
	    {
	        this.id = id;
	        this.name = name;
            this.cgpa = cgpa;
	    }
	    /**
	     * toString() id used to print the values of the arraylist
	     */
	    public String toString()
	    {
	        return this.id + " " + this.name +
	                           " " + this.cgpa;
	    }
       
	  
}
