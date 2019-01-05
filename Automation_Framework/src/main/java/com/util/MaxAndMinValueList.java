package com.util;

import java.util.ArrayList;
import java.util.List;

public class MaxAndMinValueList {

	
	
	public static void main(String[] args) {
		
	List<Double> list = new ArrayList<>();
	list.add(20.30);
	list.add(10.34);
	list.add(2.0);
	
	System.out.println(list.stream().max(Double::compare).get());
	System.out.println(list.stream().min(Double::compare).get());
}
}