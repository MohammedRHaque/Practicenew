package javacoding;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class Z14_File_Buffer_Reader {
	public static void main(String[] args) throws IOException {

		String path = "C:\\\\Users\\\\moham\\\\OneDrive\\\\Desktop\\\\RafezPersonal\\\\rafez.txt";
		FileReader fReader = new FileReader(path);
		System.out.println("Please Read the file where is the location :" + path);
        
		BufferedReader bReader = new BufferedReader(fReader);
		String data;
		while((data=bReader.readLine())!=null) {
			System.out.println("Read from the File" + data);
		}
			
	}
}
