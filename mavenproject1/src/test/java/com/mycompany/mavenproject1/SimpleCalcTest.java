/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author lavry
 */


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SimpleCalcTest {

    private static SimpleCalc sc = null;

    @BeforeClass
    public static void setUpClass() {
        double p1 = 4; 
        double p2 = 2; 
        sc = new SimpleCalc(p1, p2);
        System.out.println("BeforeClass");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("AfterClass");
    }

    @Test
    public void testGetSum() {
        System.out.println("getSum tested");
        assertEquals(6, sc.getSum(), 0.0);
    }

    @Test
    public void testGetDiff() {
        System.out.println("getDiff tested");
        assertEquals(2, sc.getDiff(), 0.0);
    }

    @Test
    public void testGetMult() {
        System.out.println("getMult tested");
        assertEquals(8, sc.getMult(), 0.0);
    }

    @Test
    public void testGetDiv() {
        System.out.println("getDiv tested run " + sc.getDiv());
        assertEquals(0.8123, sc.getDiv(), 0.0);
    }
}
