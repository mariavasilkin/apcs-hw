import java.util.ArrayList;
public class QuickSort {
    public static Integer[]  quicksort (Integer[]  L) {
	if (L.length <= 1) {
	    return L;
	}
	int pivot = (int)(Math.random() * (L.length - 1));
	ArrayList <Integer> lo = new ArrayList <Integer> ();
	ArrayList <Integer>  hi = new ArrayList <Integer> ();
	int numPivots = 0; //if there are multiple values == to pivot
	for (int i : L) {
	    if (L[i] < L[pivot]) {
		lo.add( L[i]);
	    }
	    else if (L[i] > L[pivot]) {
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
	for (int i : ans) {
	    if ( i < R1.length) {
		ans[i] = R1[i];
	    }
	    else if (i >= R1.length && i <= (R1.length + numPivots)) {
		ans[i] = pivot;
	    }
	    else {
		ans[i] = R2[i];
	    }
	}
	return ans;
	
	
    }

    public static void main (String[] args) {
	Integer[] a = new Integer[20];
	for (int i=0;i<20;i++)
	    a[i] = (int)(Math.random() * 100);
	    //a[i]=new Integer(rnd.nextInt(100));
	//System.out.println(Arrays.toString(a));
	System.out.println(quicksort(a));
    }
}
	
	     

		
		
