package javacoding;


import java.io.FileNotFoundException;
import java.io.FileReader;

public class Z13_File_Reader {
	
	public static void main(String[] args) throws FileNotFoundException {
		String path = "C:\\Users\\moham\\OneDrive\\Desktop\\RafezPersonal\\rafez.txt";
		FileReader fReader = new FileReader(path);
		System.out.println("you can read the file from this Location :" + path);
			
	}

}
