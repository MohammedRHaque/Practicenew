package countVowel;

public class FindSmallerLargestNo {

	public static void main(String[] args) {

		int[] Number = { 10, 37, 35, 99, 67, 45 };

		int Largest = Number[0];
		int Smallest = Number[0];

		for (int i = 0; i < Number.length; i++) {
			if (Number[i] > Largest) {
				Largest = Number[i];

			}
		}
		
		for(int j=0; j <Number.length; j ++) {
        if(Number[j] < Smallest) {
        	Smallest = Number[j];
        }
	}
		
		System.out.println(Smallest);
		System.out.println(Largest);
	}
	

}
