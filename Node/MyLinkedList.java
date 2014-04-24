public class MyLinkedList {
    private Node head;
    
    public MyLinkedList() {
	head = null; //sorta redundant
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
	/*while loop that sets a temp =  to temp.getNext() 
	 */
	return s;
    }

    
    public void add (int i, String s) {
	Node temp = head;
	for (int a = 0; a < i; a++) {
	    temp = temp.getNext();
	}
	temp.setData(s);
    }

    public String get(int i) {
	Node temp = head;
	for (int a = 0; a < i; a++) {
	    temp = temp.getNext();
	}
	return temp.getData();
    }

    public String set(int i, String s) {
	Node temp = head;
	for (int a = 0; a < i; a++) {
	    temp = temp.getNext();
	}
	String ans = temp.getData();
	temp.setData(s);
	return ans;
    }

    public String remove(int i) {
	Node temp = head;
	for (int a = 0; a < i-1; a++) {
	    temp = temp.getNext();
	}
	String ans= temp.getData();
	temp.setNext(temp.getNext().getNext());
	return ans;
    }
    
    public int find(String s) {
	Node temp = head;
	return -1;
    }

    public int length() {
	Node temp = head;
	return -1;
    }
    
    
}