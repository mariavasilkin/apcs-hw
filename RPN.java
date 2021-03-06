import java.util.*;
import java.io.*;
public class RPN {
    private static String operators = "/+-*";
    private static Stack stack;

    public RPN() {
	stack = new Stack();
    }

    public static double calculate(String s) {//do the operators first and pushing as the else
	if (operators.indexOf(s) != -1) {
	    double a = Double.parseDouble(stack.pop());
	    double b = Double.parseDouble(stack.pop());
	    if (s.equals("+"))
		return b + a;
	    else if (s.equals("-"))
		return b - a;
	    else if (s.equals("*"))
		return b * a;
	    else if (s.equals("/"))
		return b / a;
	    else return a;
	}

	else {
	    stack.push(Double.parseDouble(s));
	}
	return -1.;
    }

    public static void main (String[] args) {

	for (int i = 0; i < 3; i++) {
	    System.out.println("Enter calculatory stuff: ");
	    Scanner scanner = new Scanner(System.in);
	    String s = scanner.nextLine();
	    calculate(s);
	}
    }
}
