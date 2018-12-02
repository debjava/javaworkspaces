package com.ddlab.rnd.txn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The Class TextTxnProcessor is used to process the XML contents as text
 * processing using regular expression.
 * 
 * @author <a href="mailto:debadatta.mishra@gmail.com">Debadatta Mishra</a>
 * @since 2013
 */
public class TextTxnProcessor {

	/**
	 * Removes the xml tags.
	 * 
	 * @param contents
	 *            the contents
	 * @return the string
	 */
	public static String removeXmlTags(String contents) {
		Pattern tag = Pattern.compile("<.*?>");
		Matcher mtag = tag.matcher(contents);
		while (mtag.find()) {
			contents = mtag.replaceAll("");
		}
		return contents;
	}

	/**
	 * Process txn.
	 * 
	 * @param contents
	 *            the contents
	 */
	public static void processTxn(String contents) {
		contents = removeXmlTags(contents);
		StringReader sr = new StringReader(contents);
		BufferedReader br = new BufferedReader(sr);
		System.out.println("---------------Message From Device-------------");
		String s1 = "";
		try {
			while ((s1 = br.readLine()) != null) {
				if (s1.trim().length() != 0)
					System.out.println(s1.trim());
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (sr != null)
					sr.close();
				if (br != null)
					br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
