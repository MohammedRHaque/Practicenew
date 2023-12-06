package javacoding;

import java.io.File;


public class Z12_Creating_FileFolder {

	public static void main(String[] args) {

		File folder = new File("C:\\Users\\moham\\OneDrive\\Desktop\\RafezPersonal");
		folder.mkdir();
		if (folder.exists()) {
			System.out.println("Folder is Newly Created : " + folder);
		}

		File file = new File("C:\\Users\\moham\\OneDrive\\Desktop\\RafezPersonal\\rafez.txt");

		try {
			file.createNewFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (file.exists()) {
			System.out.println("New File created :" + file);
		}
		
	}
	
}
