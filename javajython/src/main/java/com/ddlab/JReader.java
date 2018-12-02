package com.ddlab;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class JReader {
	
	public static String getContents(String filePath) {
		String contents = "defaultValue";
		InputStream inStream = null;
		try {
			File file = new File(filePath);
			byte[] buffer = new byte[(int)file.length()];
			inStream = new FileInputStream(file);
			inStream.read(buffer);
			contents = new String(buffer);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(inStream != null )
					inStream.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return contents;
	}
	
	public static void main(String[] args) {
		String ss = JReader.getContents("E:/pink-2014/javajython/temp.txt");
		System.out.println(ss);
	}

}
