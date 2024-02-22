package javacoding;

public class CompareAge {


		public static void main(String[] args) {
			 int ageOfAlex = 21;
			 int ageOfJenifer = 23;
			 
			 
			 if(ageOfAlex%2==0 && (ageOfAlex<ageOfJenifer)) {
				 System.out.println("Alex is " +ageOfAlex+", which is an even number and he is younger than Jenifer. " + ageOfJenifer+ ", the age of Jenifer.");
			 } else if(ageOfAlex%2==1 && (ageOfAlex<ageOfJenifer)) {
				 System.out.println("Alex is " +ageOfAlex+", which is an odd number and he is older than Jenifer. " + ageOfJenifer+ ", the age of Jenifer.");
			 } else {
				System.out.println("The condition is wrong");
			}

		
}
		
}