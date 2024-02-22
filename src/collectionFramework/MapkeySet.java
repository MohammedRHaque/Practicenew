package collectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapkeySet {
 
	public static void main(String[] args) {
		
		Map <String, Integer> statetemp = new HashMap<>();
		statetemp.put("NY", 67);
		statetemp.put("NJ", 60);
		statetemp.put("TX", 85);
		statetemp.put("MI", 47);
		
		System.out.println(statetemp);
		//System.out.println(statetemp.get("MI"));
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give the State Name");
		String inputstates =scanner.next();
		System.out.println(statetemp.get(inputstates));
		
		
		scanner.close();
		System.out.println("<<<<<<<<<>>>>>>>>>>");
		 
		
		Set<String > temp=statetemp.keySet();
		int lowesttemp = 80;
		
		for(String t:temp) {
			if(statetemp.get(t)<lowesttemp) {
				lowesttemp=statetemp.get(t);
			}
			
			
		}
		System.out.println(lowesttemp);
	}
	}

	
