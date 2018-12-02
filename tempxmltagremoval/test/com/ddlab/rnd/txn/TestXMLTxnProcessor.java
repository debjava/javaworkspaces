package com.ddlab.rnd.txn;

/**
 * The Class TestXMLTxnProcessor is used as a test class for data gathering
 * using XMl parsing.
 * 
 * @author <a href="mailto:debadatta.mishra@gmail.com">Debadatta Mishra</a>
 * @since 2013
 */
public class TestXMLTxnProcessor {

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		// Let us take 10 observations
		int observations = 10;
		long[] diffTime = new long[observations];
		String failedContents = FileUtil.getFileContents("xml/FailedTxn.xml");
		String successContents = FileUtil
				.getFileContents("xml/SuccessfulTxn.xml");

		for (int i = 0; i < observations; i++) {
			long startTime = System.nanoTime();
			XMLTxnProcessor.processTxn(successContents);
			System.out.println("\n\n");
			XMLTxnProcessor.processTxn(failedContents);
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
