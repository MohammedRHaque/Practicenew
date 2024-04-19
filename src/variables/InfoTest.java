package variables;

public class InfoTest {

	public static void main(String[] args) {
		
		Info info = new Info();
		
	info.setname("Mahid Alam");
	info.setSalary(1000);
	info.setSex('M');
	info.setUsCitizen(false);
		
		
	   System.out.println("This is info about a employee : " + info.getname( ) );
		
	}
}
