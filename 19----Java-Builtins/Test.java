/*RESULTS:
Hash time: 2949692
Tree time: 30152302
Hash time: 1777514
Tree time: 2378520
Hash time: 2013297
Tree time: 9063687*/

import java.util.*;
public class Test {
    public static void main(String[] args) {
	HashMap hash = new HashMap();
	TreeMap tree = new TreeMap();
	ArrayList<Integer> test =  new ArrayList<Integer>();
	for (int i = 0; i < 1000; i++) {
	    test.add((int)(Math.random()*10000));
	}

	//put(key,value)
	long hashStart = System.nanoTime();
	for (int i = 0; i < test.size(); i ++) {
	    hash.put(i,test.get(i));
	}
	long hashEnd = System.nanoTime();
	long hashTime = hashEnd - hashStart;  
	System.out.println("Hash time: " + hashTime);

	long treeStart = System.nanoTime();
	for (int i = 0; i < test.size(); i ++) {
	    tree.put(i,test.get(i));
	}
	long treeEnd = System.nanoTime();
        long treeTime = treeEnd - treeStart;
	System.out.println("Tree time: " + treeTime);

	//get(key)
        hashStart = System.nanoTime();
	for (int i = 0; i < test.size(); i ++) {
	    hash.get(i);
	}
        hashEnd = System.nanoTime();
        hashTime = hashEnd - hashStart;  
	System.out.println("Hash time: " + hashTime);

        treeStart = System.nanoTime();
	for (int i = 0; i < test.size(); i ++) {
	    tree.get(i);
	}
        treeEnd = System.nanoTime();
        treeTime = treeEnd - treeStart;
	System.out.println("Tree time: " + treeTime);

	//remove(key)
        hashStart = System.nanoTime();
	for (int i = 0; i < test.size(); i ++) {
	    hash.remove(i);
	}
        hashEnd = System.nanoTime();
        hashTime = hashEnd - hashStart;  
	System.out.println("Hash time: " + hashTime);

        treeStart = System.nanoTime();
	for (int i = 0; i < test.size(); i ++) {
	    tree.remove(i);
	}
        treeEnd = System.nanoTime();
        treeTime = treeEnd - treeStart;
	System.out.println("Tree time: " + treeTime);
    }
}




	

	
