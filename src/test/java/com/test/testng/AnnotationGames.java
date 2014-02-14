package com.test.testng;

import java.lang.reflect.Method;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class AnnotationGames {
	
	@Test
    public void f1(Method m) {
		System.out.println(m.getName());
    }

    @Test
    public void f2(Method m) {
    	System.out.println(m.getName());
    }

    @Test
    public void f3(Method m) {
    	System.out.println(m.getName());
    }

    @Test
    public void f4(Method m) {
    	System.out.println(m.getName());
    }

    @AfterMethod
    public void afterMethod(Method m) {
        if (m.getName().equals("f3")){
            System.out.println("Found our f3() method");
        }
    }

}
