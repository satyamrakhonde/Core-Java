package com.zensar;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collections {

	public static void main(String[] args) {
		
		List nameList = new ArrayList();
		
		nameList.add("ABC");
		nameList.add("XYZ");
		nameList.add(1,"Sundar Pichai");//insert the data in any available index ofd  any collections
		nameList.add("SatyaNadella");
		nameList.add("Elon");
		
		//iterating over a collection using forEach
		nameList.forEach(System.out::println);
		
		//displaying the content of collection
		System.out.println(nameList);
		
		System.out.println("Size of nameList :"+nameList.size());
		
		//iterating over a collection using iterator
		Iterator itr = nameList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//iterating over a collection using iterator
		for (Object obj : nameList) {
			System.out.println(obj);
		}
	}
}
