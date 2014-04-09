public class MyStack {

    private String[] stack;
    private int top;

    public MyStack(){
	top = 0;//points to the next spot to fill
        stack = new String[10];
    }

    public  void push(String s){
	if (stack.length > top) {
	    stack[top] = s;
	    top++;
	}
	else {
	    String[] tmp = new String[stack.length + 10];
	    for (int i = 0; i <stack.length; i++) {
		tmp[i] = stack[i];
	    }
	    stack = tmp;
	}
    }

    public String pop() {
	String s = stack[top-1];
	//	stack[top-1] = ""; Not necessary 
	top--;
	return s;
    }

    public String peek() {
	return stack[top];
    }

    public boolean isEmpty() {
	return top == 0;
    }

    //Do you even need this anymore?
    public int getSize() {
	return stack.length;
    }
    
    public String toString(){
	String tmp = "";
	for (String s: stack) {
	    if (s != null) 
	    tmp += s + " ";
	}
	return tmp;
    }
}
