import java.util.*;
import java.io.*;

public class RPN {
    private static String operators = "/+-*";
    private static Stack stack;

    public RPN() {
	stack = new Stack();
    }

    //my whole calc method is kinda messy and i couldn't figure out how to use the string of operators
    public static double calculate(String s) {
	/*the error was that stack.pop() is an Object, but I don't
	  see why that's true at all*/
	double a = 0.0;
	double b = 0.0;
	if (s.equals("+")){
	    a = Double.parseDouble((stack.pop()).toString());
	    b = Double.parseDouble((stack.pop()).toString());
	    stack.push(b + a);
	    System.out.println( b + a);
	}
	else if (s.equals("-")) {
	    a = Double.parseDouble((stack.pop()).toString());
	    b = Double.parseDouble((stack.pop()).toString());
	    stack.push( b - a);
	    System.out.println( b - a);
	}
	else if (s.equals("*")) {
	    a = Double.parseDouble((stack.pop()).toString());
	    b = Double.parseDouble((stack.pop()).toString());
	    stack.push( b * a);
	    System.out.println( b * a);
	}
	else if (s.equals("/")) {
	    a =  Double.parseDouble((stack.pop()).toString());
	    b = Double.parseDouble((stack.pop()).toString());
	    stack.push( b / a);	
	    System.out.println( b / a);
	}
	else if (s.equals("clear")) {
	    stack = new Stack();
	}
	else if (s.equals("print")){
	    System.out.println(stack);
	}
	else {
	    stack.push(Double.parseDouble(s));
	}
	return 0.0;
    }


    public static void main (String[] args) {
	/*I more or less stole my main method from Malcolm. I really couldn;t get mine to work.
	  I understand what it says, but I would not think to write this so major props 
	It still doesn't work 100% for some reason. I really 
can't figure out what the problem is though */
	RPN r = new RPN(); 
	Scanner scanner = new Scanner(System.in);
	while (scanner.hasNext()) {
     	    String s = scanner.next();
	    r.calculate(s);

	}
    }
}
	    
	    
