

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopier {

	public static void main(String[] args) throws IOException {
		String sourceFile = "source" + File.separator + "table.java";
		String destinationFile = "destination" + File.separator + "copytable.java";

		copyFile(sourceFile, destinationFile);
	}

	private static void copyFile(String sourceFile, String destinationFile) throws IOException {
		File inputFile = new File(sourceFile);
		FileInputStream fileInputStream = new FileInputStream(inputFile);
		FileOutputStream fileOutputStream = new FileOutputStream(destinationFile);
		int c;
		while ((c = fileInputStream.read()) != -1) {
			fileOutputStream.write(c);
		}
		fileOutputStream.close();
		fileInputStream.close();
	}

}
