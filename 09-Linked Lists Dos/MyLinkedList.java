public class MyLinkedList {
    private Node dummy; 
    private Node head;
    public MyLinkedList() {
	Node head = new Node("");
	dummy.setNext(head);
    }
    public void add(String s) {
	Node temp = new Node(s);
	//head = temp;`
	temp.setNext(head);
	head = temp;
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
	Node b = new Node(s);
	Node temp = head;
	for (int a = 0; a < i-1; a++) {
	    temp = temp.getNext();
	}
        b.setNext(temp.getNext());
	temp.setNext(b);
    }

    public String get(int i) {
	Node temp = head;
	for (int a = 0; a < i; a++) {
	    if (temp.getNext() != null) 
		temp = temp.getNext();
	    else
		return "Out of bounds";
	}
	return temp.getData();
    }

    public String set(int i, String s) {
	Node temp = head;
	for (int a = 0; a < i; a++) {
	    if (temp.getNext() != null)
		temp = temp.getNext();
	    else
		return "Out of bounds";
	}
	String ans = temp.getData();
	temp.setData(s);
	return ans;
    }

    public String remove(int i) {
	Node temp = head;
	for (int a = 0; a < i-1; a++) {
	    if (temp.getNext() != null)
		temp = temp.getNext();
	    else
		return "Out of bounds";
	}
	String ans= temp.getNext().getData();
	temp.setNext(temp.getNext().getNext());
	return ans;
    }
    
    public int find(String s) {
	Node temp = head;
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
	Node temp = head;
	int i = 1;
	while (temp.getNext() != null) {
	    i++; 
	    temp = temp.getNext();	    
	}
	return i;
    }
    
    
}
