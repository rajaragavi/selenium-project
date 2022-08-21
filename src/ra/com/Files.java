package ra.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Files {
	public static void main(String[] args) throws IOException {
		File f= new File("C:\\Users\\ragav\\Downloads");
		File f1= new File("C:\\Users\\ragav\\OneDrive\\Desktop\\New folder\\sidd\\jah\\test.txt");
 FileUtils.copyDirectory(f,f1);
  
	}

}
