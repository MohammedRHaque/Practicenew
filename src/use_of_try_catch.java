import java.util.Arrays;

public class use_of_try_catch {
	
	public static void main(String[] args) {
		String [] student = new String [4]; 
		student [0] = "Jahanara";
		student [1] = "Mamun";
		student [2] = "Mehdi";
		student [3] = "Raihan";
		// student [4] = "Rashed";
		 
		 System.out.println(student[3]);
		 //System.out.println(student[4]);
		 System.out.println(student.length);
		 System.out.println("<<<<<<>>>>");
		 System.out.println(student[student.length-1]);
		 System.out.println(student[student.length-2]);
		 
		 System.out.println(student); // get something else to check, if it is run --> Array ID
			System.out.println("To find the list of an Array: " + Arrays.toString(student));
	
			
			System.out.println("\nPrinting hashCode of the Array, represented by data: " + Arrays.hashCode(student));
			
			// hashCode of the Array used for representation of array by data	
			// java.util.Arrays Class --> This class contains various methods for manipulating Array (such as sorting and searching).
			// NOT IMPORTANT
			System.out.println("\nPrinting the index position of the value form the ref: " + Arrays.binarySearch(student, 3)); // which index is 15?
			// here a is the name of the array, 15 is the value checking the index number
			// binary search to get the index position of the value from the ref
			//System.out.println("\nPrinting the index position of the value form the ref: " + Arrays.binarySearch(student, 5));
			
			//System.out.println("\nPrinting the index position of the value form the ref: " + Arrays.binarySearch(student, 67));
			//System.out.println("\nPrinting the index position of the value form the ref: " + Arrays.binarySearch(student, 0)); //TODO WHY -1?
			//System.out.println("\nPrinting the index position of the value form the ref: " + Arrays.binarySearch(student, 3)); //TODO WHY -1?
					


}
}
