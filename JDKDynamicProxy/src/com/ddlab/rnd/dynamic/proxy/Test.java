/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ddlab.rnd.dynamic.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import sun.applet.Main;

/**
 *
 * @author <a href="mailto:debadatta.mishra@gmail.com">Debadatta Mishra</a>
 * @since 2013
 */
public class Test {

    public static Object getProxy(Class interfaceClazz, Object implObj, InvocationHandler handler) {
        return Proxy.newProxyInstance(interfaceClazz.getClassLoader(), 
                implObj.getClass().getInterfaces(), handler);
    }

    public static void main(String[] args) {
        CalculatorImpl calcImpl = new CalculatorImpl();
        Calculator proxied = (Calculator) getProxy (Calculator.class, calcImpl, 
                new BeforeHandler(calcImpl));
        int result = proxied.calculate(20, 10);
        System.out.println("FInal Result :::" + result);
    }
}
