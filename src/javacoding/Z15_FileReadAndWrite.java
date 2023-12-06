package javacoding;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;
import java.util.concurrent.BrokenBarrierException;

public class Z15_FileReadAndWrite {
	public static void main(String[] args) {
		
		 File folder = new File("C:\\Users\\moham\\OneDrive\\Desktop\\RafezPersonal");
		 folder.mkdir();
		 if (folder.exists()) {
			System.out.println(folder.getName() +"Folder is Created : ");
		}
		 
		 File file = new File("C:\\Users\\moham\\OneDrive\\Desktop\\RafezPersonal\\rafez.txt");
		 		 	 
			 try {
				file.createNewFile();
			} catch (Exception e) {
				e.printStackTrace();
			}
		if (file.exists()) {
			 System.out.println("New File created :" + file.getName());
			 System.out.println("Please Input your Data");
			 Scanner scanner = new Scanner(System.in);
			String userinput = scanner.nextLine();
				
		try {
			Formatter formatter = new Formatter("C:\\Users\\moham\\OneDrive\\Desktop\\RafezPersonal\\rafez.txt");
			formatter.format( "%s", userinput );
		    formatter.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		String path = "C:\\\\Users\\\\moham\\\\OneDrive\\\\Desktop\\\\RafezPersonal\\\\rafez.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path);
			System.out.println("This is the Path of the File" + path);
		} catch (Exception h) {
		    h.printStackTrace();
		}
		
	   String data ="";
	   try {
		br = new BufferedReader(fr);
		while((data=br.readLine())!=null) {
			
		System.out.println("Here is the Data of BufferReader read the file and got the" + data);
	} }catch (Exception j) {
		j.printStackTrace();
	}
		scanner.close();
		}
	   
}
}