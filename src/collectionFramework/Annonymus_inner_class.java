package collectionFramework;

interface Printtable {
	
	void printSSN();
	
}

public class Annonymus_inner_class {

	public static void main(String[] args) {
 
	Printtable p=new Printtable () {

		@Override
		public void printSSN() {
			System.out.println("This is from Interface");
			
		}
		
	};
   p.printSSN();
 }
 }
	
	
	/*
	 * public static void main(String[] args) {
	 * 
	 * Printtable p= new Printtable () {
	 * 
	 * @Override public void printSSN() {
	 * System.out.println("This is a method from interface");
	 * 
	 * }};
	 * 
	 * p.printSSN(); }
	 */


