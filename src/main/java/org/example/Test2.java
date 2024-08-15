package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {

    @Test
    public void m1(){
        System.out.println("T2 m1");
    }

    @Test
    public void m2(){
        System.out.println("T2 m2");
    }

    @Test
    public void m3(){
        System.out.println("T2 m3");
    }

    @Test
    public void m4(){
        System.out.println("T2 m4");
    }

    @Test
    public void m5(){
        System.out.println("T2 m5");
        Assert.assertTrue(false);
    }
}
