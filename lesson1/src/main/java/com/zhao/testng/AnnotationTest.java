package com.zhao.testng;

import org.testng.annotations.*;

public class AnnotationTest {
    @Test
    public  void testCase1(){
        System.out.println("testng basic");
    }

    @Test(enabled = false)
    public void testCase2(){
        System.out.println("testng basic 2 ");
    }

    @BeforeMethod(firstTimeOnly = true)
    public void  before(){
        System.out.println(" before test");
    }
    @AfterMethod
    public  void after(){
        System.out.println("after test");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("before class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("after class ");
    }

    @BeforeSuite
    public void  beforeSuite(){
        System.out.println("before suite ");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("after suite");
    }

}
