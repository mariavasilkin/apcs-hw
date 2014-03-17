import java.util.*;
public class QuickSort {
    public static Integer[]  quicksort (Integer[]  L) {
	if (L.length <= 1) {
	    return L;
	}
	int pivot = (int)(Math.random() * (L.length - 1));
	ArrayList <Integer> lo = new ArrayList <Integer> ();
	ArrayList <Integer>  hi = new ArrayList <Integer> ();
	int numPivots = 0; //if there are multiple values == to pivot
	for (int i = 0; i < L.length - 1; i++) {
	    if (L[i].compareTo(L[pivot]) < 0) {
		lo.add(L[i]);
	    }
	    else if (L[i].compareTo(L[pivot]) > 0) {
		hi.add(L[i]);
	    }
	    else {
		numPivots ++; //to add back sereval values
	    }    
	}
	//What if there are multiple values equal to the pivot?
	Integer[] la = lo.toArray(new Integer[]{});
	Integer[] ua = hi.toArray(new Integer[]{});
	Integer[] R1 = new Integer[la.length];
	Integer[] R2 = new Integer[ua.length];
	Integer[] ans = new Integer[L.length];
	R1 = quicksort(la);
	R2 = quicksort(ua);
	for (int i = 0; i < (ans.length - 1); i++) {
	    if ( i < R1.length) {
		ans[i] = R1[i];
	    }
	    else if (i >= R1.length && i < (R1.length + numPivots)) {
		ans[i] = pivot;

	    }
	    else {
		ans[i] = R2[i];
	    }
	}
	return ans;


    }


    public static void main (String[] args) {
	int size = 10;
	Random rnd = new Random();
	Integer[] b = new Integer[size];
	for (int i=0;i<size;i++)
	    b[i]=new Integer(rnd.nextInt(100));
	System.out.println("Unsorted:");
	System.out.println(Arrays.toString(b));
	Integer[] sorted = quicksort(b);
	System.out.println("Sorted:");
	/*System.out.println(Arrays.toString(a));
	System.out.println(a);
	System.out.println(quicksort(a));*/
    }
}
