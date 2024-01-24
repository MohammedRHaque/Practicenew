package collectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.imageio.event.IIOReadWarningListener;

import use_Of_Acess_Modifier.A;


public class HashmapSet {

	public static void main(String[] args) {
	Map<String, Integer> map=new HashMap<>();
	
		map.put("Abid", 100);
		map.put("Raju" , 200);
		map.put("Rahman", 250);
		map.put("Mir", 175);
		
		System.out.println("value of  Key Raju " + map.get("Raju"));

		Set< String> keys=map.keySet();
 	for(String k:keys) {
 		System.out.println(k + " = " + map.get(k));
 	}
 	System.out.println("<<<<<<>>>>>>>>>>");
 	Set<Map.Entry<String , Integer>> entries =map.entrySet();
 	 
 	for(Map.Entry<String, Integer> e:entries) {
 		System.out.println(e);
 	}

// 	Set<Map.Entry<String, Integer >> entries = map.entrySet();
// 	 for (Map.Entry<String, Integer > e:entries ) {
// 		 System.out.println(e);
// 		 
 	 //}
 
	}

	
}
