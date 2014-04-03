import java.io.*;
import java.util.*;
public class MyLinkedList<E> implements Iterable<E> {
    private Node<E> head;
    private Node<E> tail;
    private int length;
    public Iterator<E> iterator() {
	return new myLLIterator<E>(head);
    }
    public MyLinkedList() {
	Node<E> head = null;
	Node<E> tail = null;
	length = 0;
    }
    public void add(E d) {
	//	Node temp = head;
	Node<E> n = new Node<E>(d);
	tail.setNext(head);
	head = temp;
	//tail = n;
        length ++;
    }
    public boolean hasNext() {
	return currentNode != null;

    public E next() {
	E data = currentNode.getData();
	currentNode = currentNode.getNext();
	return data;

    }
    public String toString() {
	String s;
	s = ""+head;
	Node temp = head;
	while (temp.getNext() != null) {
	    temp = temp.getNext();
	    s += " " + temp;
	}
	return s;
    }
   
    public void add (int i, String s) {
	Node n = new Node(s);
	Node<E> temp = head;
	for (int a = 0; a < i-1; a++) {
	    temp = temp.getNext();
	}
        n.setNext(temp.getNext());
	temp.setNext(n);
	length ++;
    }

    public E get(int i) {
	Node<E> temp = head;
	for (int a = 0; a < i; a++) {
	    if (temp.getNext() != null) 
		temp = temp.getNext();
	    else
		return "Out of bounds";
	}
	return temp.getData();
    }

    public E set(int i, E d) {
	Node<E> temp = head;
	for (int a = 0; a < i; a++) {
	    if (temp.getNext() != null)
		temp = temp.getNext();
	    else
		return "Out of bounds";
	}
        E ans = temp.getData();
	temp.setData(d);
	return ans;
    }

    public String remove(int i) {
	Node<E> temp = head;
	for (int a = 0; a < i-1; a++) {
	    if (temp.getNext() != null)
		temp = temp.getNext();
	    else
		return "Out of bounds";
	}
	String ans= temp.getNext().getData();
	temp.setNext(temp.getNext().getNext());
	length --;
	return ans;
    }
    
    public int find(String s) {
	Node<E> temp = head;
	int i = 0;
	//a try catch probably wasn't the best way to do this one
       	try {
	    while (temp.getData() != null) {
		if (s.equals(temp.getData())) 
		    return i;	    
		else 
		    temp = temp.getNext();
		i++;
	    }
	}
	catch (NullPointerException e) {
	    return -1;
	}
	return -1;
    }

    public int length() {
	Node<E> temp = head;
	int i = 1;
	while (temp.getNext() != null) {
	    i++; 
	    temp = temp.getNext();	    
	}
	return i;
    }
    
    
}
