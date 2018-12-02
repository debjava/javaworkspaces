package com.ddlab.rnd.txn;

import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 * The Class XMLTxnProcessor is used to gather the information from an xml file
 * by using DOM parsing.
 * 
 * @author <a href="mailto:debadatta.mishra@gmail.com">Debadatta Mishra</a>
 * @since 2013
 */
public class XMLTxnProcessor {

	/**
	 * Recursive parsing for all elements in an XML document
	 * 
	 * @param element
	 *            the element
	 */
	private static void recursiveParsing(Element element) {
		NodeList nodesList = element.getChildNodes();
		for (int i = 0; i < nodesList.getLength(); i++) {
			Node node = nodesList.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				element = (Element) node;
				Node eleNode = element.getFirstChild();
				if (eleNode.getNodeValue().trim().length() != 0)
					System.out.println(eleNode.getNodeValue());
				recursiveParsing(element);
			}
		}
	}

	/**
	 * Process txn.
	 * 
	 * @param contents
	 *            the contents
	 */
	public static void processTxn(String contents) {

		DocumentBuilderFactory docBuilderFact = DocumentBuilderFactory
				.newInstance();
		DocumentBuilder docBuilder = null;
		Document doc = null;
		try {
			docBuilder = docBuilderFact.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
		StringReader srReader = new StringReader(contents);
		InputSource inSrc = new InputSource(srReader);
		try {
			doc = docBuilder.parse(inSrc);
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("---------------Message From Device-------------");
		recursiveParsing(doc.getDocumentElement());
	}

}
