package com.ddlab.rnd.txn;

/**
 * The Class TestTextTxnProcessor is used as a test class for data gathering
 * using text processing.
 * 
 * @author <a href="mailto:debadatta.mishra@gmail.com">Debadatta Mishra</a>
 * @since 2013
 */
public class TestTextTxnProcessor {

	// Positive Test Case
	/**
	 * Testcase1.
	 * 
	 * @param contents
	 *            the contents
	 */
	public static void testcase1(String contents) {
		// Do some Transaction with a device
		TextTxnProcessor.processTxn(contents);
	}

	// Negative Test Case
	/**
	 * Testcase2.
	 * 
	 * @param contents
	 *            the contents
	 */
	public static void testcase2(String contents) {
		// Do some Transaction with a device
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
		// Let us take 10 observations
		int observations = 10;
		long[] diffTime = new long[observations];
		String failedContents = FileUtil.getFileContents("xml/FailedTxn.xml");
		String successContents = FileUtil
				.getFileContents("xml/SuccessfulTxn.xml");

		for (int i = 0; i < observations; i++) {
			long startTime = System.nanoTime();
			testcase1(successContents);
			System.out.println("\n\n");
			testcase2(failedContents);
			long difference = System.nanoTime() - startTime;
			diffTime[i] = difference;
		}

		System.out.format("%-15s %-15s %-15s %n", "NANOSECONDS",
				"MILLISECONDS", "SECONDS");
		for (long time : diffTime) {
			double millis = (double) time / (1000 * 1000);
			double seconds = (double) time / 1000000000.0;
			System.out.format("%-15d %-15f %-15f %n", time, millis, seconds);
		}
	}

}
