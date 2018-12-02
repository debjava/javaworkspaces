/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ddlab.rnd.dynamic.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 *
 * @author <a href="mailto:debadatta.mishra@gmail.com">Debadatta Mishra</a>
 * @since 2013
 */
public class BeforeHandler implements InvocationHandler {

    private Object targetObject;
    
    public BeforeHandler(Object targetObject) {
        this.targetObject = targetObject;
    }
    
    @Override
    public Object invoke(Object proxy, Method method, Object[] params) throws Throwable {
        int param1 = (Integer)params[0];
        int param2 = (Integer)params[1];
        if( param2 == 0 ) {
            //Set the default to 1
            param2 = 1;
            params[1] = param2;
        }
        Object result = method.invoke(targetObject ,params);
        return result;
    }

}
