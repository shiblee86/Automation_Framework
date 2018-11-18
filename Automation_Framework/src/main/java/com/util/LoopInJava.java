package com.util;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class LoopInJava {
	
	
	public static void main(String[] args) {
		
		List<String> items = new ArrayList<>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");
		
		
		
		
		items.forEach(a ->System.out.println(a));
		
		
		items.stream()
		.filter(s->s.contains("B"))
		.forEach(System.out::println);
		
	//simple loop with data type integer
		
	/*	int number =100;
		
		for(int i=0;i<number;i++) {
			System.out.println(i);
			
		}		
		*/
		/*
		List<String> items = new ArrayList<>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");
		
		//simple loop
		for(int i=0;i<items.size();i++) {
			System.out.println(items.get(i));
			
		}
		
		//Enhance/advance loop
		
		for(String each:items) {
			System.out.println(each);
		}

		//lambda & for each
		//Output : A,B,C,D,E
		items.forEach(item ->System.out.println(item));
			
		//method reference
				//Output : A,B,C,D,E
				items.forEach(System.out::println);
		
		
		//Output : C
		items.forEach(item->{
			if("C".equals(item)){
				System.out.println(item);
			}
		});
			
		
		
		//Stream and filter
		//Output : B
		items.stream()
			.filter(s->s.contains("B"))
			.forEach(System.out::println);
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		

		//String a= "sarower";
		//String a = new String("sarower");
		//String [] a= {"sarower","ahmmed"};
		//String [] a= new String[] {"sarower","ahmmed"};
		
		/*for(String each:a) {
			System.out.println(each);
			
		}*/
		
		
		
		
		
		
		
		
		
	/*	//while loop with condition
		
		 int i = 20;
		   
	      while (i >= 10) {
	         System.out.println("Line " + i);
	         ++i;
	         if(i == 25) {
	        	 
	             break; 
	         }
	    
	      }
		*/
	     
		
		
		
		
	      
	}     
		
	}


