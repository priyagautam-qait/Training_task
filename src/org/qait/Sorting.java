package org.qait;
import java.util.Comparator;

public class Sorting implements Comparator
{
	/**
	 * this method sort the objects in the arraylist in decreasing order to their cgpa
	 * if cgpa is same then alphabetically and if firstname is als same
	 * then accordng to their id 
	 */
	public int compare(Object o1,Object o2)
	{
		Student obj1= (Student)o1;
		Student obj2= (Student)o2;

	if(obj1.cgpa==obj2.cgpa)  
	{
		if(obj1.name.equals(obj2.name))
		{
			if(obj1.id>obj2.id)
			{
				return 1;	
			}
			else return 0;
		}
		return obj1.name.compareTo(obj2.name);
	}
	
			else
		if(obj1.cgpa<obj2.cgpa)  
	return 1;  
	else  
	return -1; 
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
