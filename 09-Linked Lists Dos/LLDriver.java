public class LLDriver {
    public static void main(String[] args) {
	MyLinkedList L = new MyLinkedList();
	//Add:
	System.out.println("Add: ");
	L.add("A");
	System.out.println(L);
	L.add("B");
	System.out.println(L);
	L.add("C");
	System.out.println(L);
	L.add("D");

	//Add at index
	System.out.println("\nAdd at index: ");
	System.out.println(L);
	L.add(0, "E");
	System.out.println(L);
	L.add(3, "F");
	System.out.println(L);

	//Get:
	System.out.println("\nGet: ");
	System.out.println(L.get(3));
	System.out.println(L.get(10));//Should fail and return error message

	//Set:
	System.out.println("\nSet: ");
	System.out.println(L.set(2,"G"));
	System.out.println(L.set(10,"G"));//Should fail and return error message

	//Remove:
	System.out.println("\nRemove: ");
	System.out.println(L.remove(3));
	System.out.println(L.remove(10));//Should fail and return error message

	//Find:
	System.out.println("\nFind: ");
	System.out.println(L);
	System.out.println(L.find("G"));
	System.out.println(L.find("X"));//Should fail and return -1

	//Length:
	System.out.println("\nLength: ");
	System.out.println(L.length());
	

    }
}
