package com.ddlab.test;

import com.ddlab.design.pattern.AbstractFactory;
import com.ddlab.design.pattern.AbstractProductA;
import com.ddlab.design.pattern.FactoryMaker;

// Client
public class Client {
	public static void main(String args[]) {
		AbstractFactory pf = FactoryMaker.getFactory("a");
		AbstractProductA product = pf.createProductA();
		// more function calls on product
		product.operationA1();
	}
}