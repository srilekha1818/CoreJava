package CoreJava.FileOperations;

/*Requirement:
Requirement: Write a program to display the names of all files and directories
present in D:\\Java Job Guarantee Batch
Requirement: Write a program to display only file names.
Requirement: Write a program to display only directory names.*/
import java.io.File;

public class TestDemo {

	public static void main(String[] args) throws Exception {
		int dirCount = 0;
		int jpgFileCount = 0;
		int txtFileCount = 0;
		int zipFileCount = 0;
		String location = "C:\\Users\\lenovo\\Desktop\\Java Job ";
		File f = new File(location);
		String[] names = f.list();
		for (String name : names) {
			// D:\\Java Job Guarantee Batch
			// all files we are iterating
			File f1 = new File(f, name);
			if (f1.isDirectory())
				dirCount++;
			if (f1.isFile()) {
				if (name.endsWith(".png"))
					jpgFileCount++;
				if (name.endsWith(".txt"))
					txtFileCount++;
				if (name.endsWith(".zip"))
					zipFileCount++;

			}
			System.out.println(name);
		}
		System.out.println("Total no of JPGfiles is :: " + jpgFileCount);
		System.out.println("Total no of txtfiles is :: " + txtFileCount);
		System.out.println("Total no of Zipfiles is :: " + zipFileCount);
		System.out.println("Total no of Directory is :: " + dirCount);
	}
	// JVM shutdown now
}
