/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ddlab.rnd.dynamic.proxy;

/**
 *
 * @author <a href="mailto:debadatta.mishra@gmail.com">Debadatta Mishra</a>
 * @since 2013
 */
public class CalculatorImpl implements Calculator {

    @Override
    public int calculate(int a, int b) {
        return a/b;
    }

}
