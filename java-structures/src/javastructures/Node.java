/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastructures;

/**
 *
 * @author Nick
 */
public class Node {
    Object value;
    Node next;
    
    public Node(Object val) {
        value = val;
    }
    
    public Node(Object val, Node n) {
        value = val;
        next = n;
    }
}
