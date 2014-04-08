public class MyStack {
 
    private Node top;
    private int numElements;

   //constructor 1
    public MyStack() {
	top = null;
	numElements = 0;
    }

    //push 2
    public void push(String s) {
	Node n = new Node(s);
	n.setNext(top);
	top = n;
	numElements++;
    }

    //pop
    public String pop() {
	String s;
	s = top.getData();
	top = top.getNext();
	numElements--;
	return s;
    }

    //peek
    public String peek() {
	return top.getData();
    }

    //isEmpty 4
    public boolean isEmpty() {
	return top == null;
    }

    public int getSize() {
	return numElements;
    }

    //toString 3
    public String toString() {
	String tmp = "";
	Node currentNode = top;
	while (currentNode != null  ) {
	    tmp += currentNode.getData() + ", ";
	    currentNode = currentNode.getNext();
	}
	return tmp;
    }
	
 
    }