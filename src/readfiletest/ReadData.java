package readfiletest;

import java.io.File;

public class ReadData {

	public static void main(String[] args) {
		File folder1 = new File("C:\\Users\\Vineet Kumar\\git\\dealroom\\src\\com\\navatar\\scripts");
//		File folder2 = new File("C:\\Users\\Vineet Kumar\\git\\dealroom\\src\\com\\navatar\\");
//		File folder3 = new File("C:\\Users\\Vineet Kumar\\git\\dealroom\\src\\com\\navatar\\pageObjects");
//		File folder4 = new File("C:\\Users\\Vineet Kumar\\git\\dealroom\\src\\com\\navatar\\pageObjects");
		 
        File[] files1 = folder1.listFiles();
//        File[] files2 = folder1.listFiles();
//        File[] files3 = folder1.listFiles();
//        File[] files4 = folder1.listFiles();
 
        for (File file : files1)
        {
            System.out.println(file.getName());
        }
//        for (File file : files2)
//        {
//            System.out.println(file.getName());
//        }
//        for (File file : files3)
//        {
//            System.out.println(file.getName());
//        }
//        for (File file : files4)
//        {
//            System.out.println(file.getName());
//        }
    }

	}

