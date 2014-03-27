import java.io.*;
import java.util.*;

public class myLLIterator <E> implements Iterator<E> {
    private Node<E> currentNode;
    private Node<E> previous;
    public myLLIterator(Node<E> n) {
	currentNode = n;
    }
    public boolean hasNext() {
	return currentNode != null;
    }
    //I rewrote these from memory/did them at home, so they might not match what I did in class with Aida
    public E next() {
        previous = currentNode;
	currentNode = currentNode.getNext();
	return previous.getData(); 
    }

    public void remove() {
	previous.setNext(currentNode.getNext());
    }

}
