//worked with Brian Lee
public class DoubleLL<E> {
    private class Node<E> {
	E data;
	Node<E> next, prev;
	public Node (E d) {
	    this.data = d;
	}
	public String toString() {
	    return "" + data;
	}

	public void setData(E d) { data = d;}
	public E getData() {return data;}

	public void setNext(Node<E> n) {next = n;}
	public Node<E> getNext() { return next;}

	public void setPrev(Node<E> p) { prev = p;}
	public Node<E> getPrev() {return prev;}

    }

    private Node<E> current, head, tail;

    //Make it loop:
    public static void loop() {
	head = current;
	tail = current;
	while (head.getPrev() != null) {
	    head = head.getPrev();
	}
	while (tail.getNext() != null) {
	    tail = tail.getNext();
	}
	head.setPrev(tail);
	tail.setNext(head);
    }



    public void insert(E d) {
	Node<E> n = new Node<E>(d);
	loop();
	if (current == null) {
	    current = n;
	    loop();
	}
	else {
	    if (current.getPrev() != null) {
		n.prev = current.prev;
		(current.prev).setNext(n);
	    }
	    n.next = current;
	    current.prev = n;
	    current = n;
	}
    }

    public E getCurrent() {
	return current.getData();
    }

    /* public void circular() {
       head = current;
       tail = current;
       while (head.getPrev() != null) {
       head = head.getPrev();
       }
       while (tail.getNext() != null) {
       tail = tail.getNext();
       }
       head.setPrev(tail);
       tail.setNext(head);
       }*/

    public void forward() {
	loop();
	current = current.getNext();
    }
	

    public void back() {
	loop();
	//	if (current.getPrev() != null) 
	current = current.getPrev();
    }
    
    public String toString() {
	if (current == null) 
	    return "";
	current = head;

	Node<E> tmp = current;
	String s = "";
	while (tmp != tail) {
	    s = s + tmp.getData()+" ";
	    tmp = tmp.getNext();
	}
	return s;
    }

    public static void main (String[] args) {
	DoubleLL<String> L = new DoubleLL<String>();
	System.out.println(L);
	L.insert("hello");
	System.out.println(L);
	L.insert("world");
	System.out.println(L);
	L.insert("three");
	System.out.println(L);
	//First test up to here
	System.out.println(L.getCurrent());
	L.forward();
	System.out.println(L.getCurrent());
	L.insert("inserted");
	System.out.println(L);
	//then test again to here
    }
}
