

	
	public class A {
	   	static int a=5; //static variable
	   	int b=10; //non static variable
	   	int c=2;
	   	static int d=3; //static 
	   	

	   	
	   	//Let’s try to use static/non-static variable in non-static method:
	   	public void add(){
	         	System.out.println(a+b);//static or non-static
	         	System.out.println(a+d);//static or static
	         	System.out.println(b+c);//non-static or non-static
	         	System.out.println("<<<<<<<<<<>>>>>>>>>>>.");
	}
	   	

	  //Let’s try to use static and non-static variable in static method:
	   	public static void multiply() {
			//System.out.println(a*b); //non-static  -->not possible
			//System.out.println(b*c); //non-static  -->not possible
			System.out.println(a*d); //static  -->possible
	         	//we need obj to use non-static:
	         	A obj=new A();
	         	System.out.println(a*obj.b); //non-static possible
	         	System.out.println(obj.b*obj.c); //non-static possible        	
	   		}  	
	
	
	 
	  
	   	
	   	
	
	
	}


