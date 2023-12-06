package javacoding;

import java.util.Arrays;

public class Z06_FibonaciSeries {

	public static int Fibonaci(int n){
		 int [] indexa = new int[10];
		 int [] indexb = new int[15];
		 
		for (int i=0; i < 10; i ++)
			if(i <2) {
				indexa[i]= i;
			} else {
				indexa[i] = indexa[i-1] + indexa[i - 2];
			}
				
			for (int j=0; j < 15; j ++)
				if(j <2) 
				{indexb[j]= j;
		} else {
			indexb[j] = indexb[j-1] + indexb[j - 2];
			
		}
		System.out.println(Arrays.toString(indexa));
		System.out.println(Arrays.toString(indexb));
		
		return n;
	}

 public static void main(String[] args) {
	Fibonaci(10);
	Fibonaci(15);
}
}