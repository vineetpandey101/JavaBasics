package getfilesname;

import java.io.File;

public class GetJavaFilesName {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\Vineet Kumar\\git\\pe3.5\\src\\com\\navatar\\scripts");
        String[] fileList = file.list();
        for(String name:fileList){
            System.out.println(name);

	}

}
}
