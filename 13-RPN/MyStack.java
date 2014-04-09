import java.io.*;
import java.util.*;

public class MyStack {

    private String[] stack;
    private int top;

    public MyStack(){
	top = 0;
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

    //So before, pop was printing null,14,13....3,2,null, and that stopped 
    //when I changed the stack index to top-1, but I think I kinda worked 
    //around whatever the real problem was instead of fixing it??

    //UPDATE: I think it's just because I'm using top to indicate the 
    //next free space
    public String pop() {
	String s = peek();
	top--;
	return s;
    }

    public String peek() {
	return stack[top];
    }

    public boolean isEmpty() {
	return top == 0;
    }

    public int getSize() {
	return stack.length;
    }
    
    public String toString(){
	String tmp = "";
	for (String s: stack) {
	    if (s != null) 
	    tmp += s + ", ";
	}
	return tmp;
    }
}
