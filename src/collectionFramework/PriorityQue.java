package collectionFramework;

import java.util.PriorityQueue;


public class PriorityQue {
	
	public static void main(String[] args) {
		
		 PriorityQueue < Integer> pr =new PriorityQueue<>();
		
		 pr.add(105);
		 pr.add(110);
		 pr.add(120);
	
		 
		
		 //System.out.println("This is pool Method: " + pr.poll());
		 //System.out.println("this is remove: " + pr.remove());
		 System.out.println("This is a method: " + pr.size());
System.out.println("<<<<<<<<<<<>>>>>> ");
		 for(int i=0; i<pr.size(); i++) {
			if (!pr.isEmpty()) {
				System.out.println(" There is a Person who is in the que");
				System.out.println("Service is give " + pr.remove() );
				System.err.println("Now serving " +pr.());
			}
			else {
				System.out.println("There is no more clients");
			}
		 }
		 
	}

}
