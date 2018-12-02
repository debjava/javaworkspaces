package com.ddlab.rnd.txn;

/**
 * The Class TestComparison is used as a test class to provide the comparative
 * study between the data gathering process using XML parsing and text
 * processing.
 * 
 * @author <a href="mailto:debadatta.mishra@gmail.com">Debadatta Mishra</a>
 * @since 2013
 */
public class TestComparison {

	// Using XML Parsing
	/**
	 * Performs 10 operations to gather data from the XML file using XML DOM
	 * parsing
	 * 
	 * @param contents
	 *            the contents
	 */
	public static void checkXMLProcessing(String contents) {
		// Do some Transaction with a device
		// Let us do the transaction 10 times
		for (int i = 0; i < 10; i++)
			XMLTxnProcessor.processTxn(contents);
	}

	// Using Tag removal
	/**
	 * Performs 10 operations to gather data from the XML file using text
	 * processing.
	 * 
	 * @param contents
	 *            the contents
	 */
	public static void checkTextProcessing(String contents) {
		// Do some Transaction with a device
		// Let us do the transaction 10 times
		for (int i = 0; i < 10; i++)
			TextTxnProcessor.processTxn(contents);
	}

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 * @throws Exception
	 *             the exception
	 */
	public static void main(String[] args) throws Exception {

		String successContents = FileUtil
				.getFileContents("xml/SuccessfulTxn.xml");

		// Execute test case2 and see the result
		long startTime = System.nanoTime();
		checkTextProcessing(successContents);
		System.out
				.println("********** Time Taken in TEXT Processing *************");
		long difference = System.nanoTime() - startTime;
		System.out.format("%-15s %-15s %-15s %n", "NANOSECONDS",
				"MILLISECONDS", "SECONDS");
		double millis = (double) difference / (1000 * 1000);
		double seconds = (double) difference / 1000000000.0;
		System.out.format("%-15d %-15f %-15f %n", difference, millis, seconds);

		// Execute test case1 and see the result
		startTime = System.nanoTime();
		checkXMLProcessing(successContents);
		difference = System.nanoTime() - startTime;
		System.out
				.println("********** Time Taken in XML Processing *************");
		System.out.format("%-15s %-15s %-15s %n", "NANOSECONDS",
				"MILLISECONDS", "SECONDS");
		millis = (double) difference / (1000 * 1000);
		seconds = (double) difference / 1000000000.0;
		System.out.format("%-15d %-15f %-15f %n", difference, millis, seconds);
	}

}
