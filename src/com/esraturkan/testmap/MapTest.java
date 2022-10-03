package com.esraturkan.testmap;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	
	public static void main(String[] args) {
		
		Map<String, OrnekObje> map=new HashMap();
		
		OrnekObje ornekObje=new  OrnekObje("Esra","Turkan");
		map.put("Eso", ornekObje);
		
		map.entrySet().forEach(entry -> {
		    System.out.println(entry.getKey() + " " + entry.getValue().getAd());
		});
		
	}
}
