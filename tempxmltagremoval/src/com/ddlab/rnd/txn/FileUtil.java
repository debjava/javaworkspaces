package com.ddlab.rnd.txn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * The Class FileUtil is used as a utility class to perform file operation like
 * reading the file contents.
 * 
 * @author <a href="mailto:debadatta.mishra@gmail.com">Debadatta Mishra</a>
 * @since 2013
 */
public class FileUtil {

	/**
	 * Gets the file contents.
	 * 
	 * @param filePath
	 *            the file path
	 * @return the file contents
	 */
	public static String getFileContents(String filePath) {

		File file = new File(filePath);
		byte[] buff = new byte[(int) file.length()];
		FileInputStream fin = null;
		try {
			fin = new FileInputStream(file);
			fin.read(buff);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fin != null)
				try {
					fin.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		return new String(buff);
	}

}
