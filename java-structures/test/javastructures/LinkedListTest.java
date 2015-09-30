/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastructures;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nick
 */
public class LinkedListTest {
    
    public LinkedListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class LinkedList.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Integer value = new Integer(5);
        LinkedList instance = new LinkedList();
        assertEquals(0, instance.getSize());
        instance.add(value);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(1, instance.getSize());
    }
    
    @Test
    public void testPop() {
        System.out.println("testPop");
        LinkedList instance = new LinkedList();
        instance.add(new Integer(5));
        Object data = instance.pop();
        assertEquals(5, data);
        assertEquals(0, instance.getSize());
    }

    /**
     * Test of getSize method, of class LinkedList.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        LinkedList instance = new LinkedList();
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        instance.add(new Integer(10));
        assertEquals(1, instance.getSize());
    }
    
}
