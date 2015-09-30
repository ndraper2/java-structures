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

public class LinkedList {
    private int size;
    private Node head;
    
    public LinkedList() {
        size = 0;
        head = null;
    }
    
    public void add(Object value) {
        head = new Node(value, head);
        size++;
    }
    
    public Object pop() {
        if (head == null)
            return null;
        Object data = head.value;
        head = head.next;
        size--;
        return data;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }
}
