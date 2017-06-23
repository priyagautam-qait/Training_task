package org.qait;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class  Main{
	static int n;
	
	public static void main (String[] args)
	{
		

		ArrayList<Student> al=new ArrayList<Student>();
	
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of students");
         n = sc.nextInt();
         
         System.out.println("Enter the details of student ( id name cgpa");
         for(int i=0;i<n;i++)
         {
        	int  id=sc.nextInt();
        	String name=sc.next();
        	double cgpa=sc.nextDouble();
        	al.add(new Student(id,name,cgpa));
        	
        	 
         }
         System.out.println("Here is the unsorted array");
            for (int i=0; i<al.size(); i++)
            System.out.println(al.get(i));
            
            Collections.sort(al,new Sorting());
            
           
            System.out.println(" ");
          
            System.out.println("Here is the unsorted array");
            
            
            for (int i=0; i<al.size(); i++)
                System.out.println(al.get(i));
	}
}
