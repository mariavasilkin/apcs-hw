public class Driver {

    public static void main(String[] args){
	MyStack stack = new MyStack();
	stack.push("one");
	stack.push("two");
	stack.push("three");
	stack.push("four");
	stack.push("5");
	stack.push("seis");
	stack.push("7");
	stack.push("snowman");
	stack.push("9");
	stack.push("double digits!");
	stack.push("eleven");
	stack.push("12");
	stack.push("one three");
	stack.push("fourteen");
	while (!stack.isEmpty()){
	    System.out.println(stack.pop());
	}
	System.out.println(stack);

    }

}
