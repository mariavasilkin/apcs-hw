import java.util.*;
public class QuickSort2 {

    public static void  partition(int[]a) {
        partition( a, 0, a.length-1);
	//For actual Quicksort:remove return statement
    }
    public static void partition (int[] a, int L, int R) {
	int wall = 0;

	//base cases:
	if (a.length < 1) 

	    return;
	//return -1;
	if (a.length == 1) 
	    return;
	//return 0;

	//choose a random pivot:
	int pivot = (int)(Math.random() * ((R-L) - 1));

	//If both the left and right are at the pivot, return the pivot
	if (L == pivot && R == pivot) 
	//For actual Quicksort:
	    return;
	    //  return pivot;

	//Swap the pivot with the rightmost value:
	int c = a[R];
	a[R] = a[pivot];
	a[pivot] = c;
	pivot = R;


	//Loop through the array, moving the wall and stuff
	for (int i = L; i < R; i++) {
	    if (a[i] > a[pivot]) {
		int b = a[i];
		a[i] = a[wall];
		a[wall] = b;
	    }
	    else
		wall++;
	    
	}

	//Swap pivot with  wall:
	int d = wall;
	wall = pivot;
	pivot = d;

	//Swapping the values:
	int f = a[wall];
	a[wall] = a[pivot];
	a[pivot] = f;


	//System.out.println("Value: " + a[pivot]);

	//System.out.print("Index: ");
	//return pivot;


	//For actual Quicksort:
	if (wall >= 2){ 
	    R = wall;
	    partition(a, L, R );
	}
	if (wall != (R-L)-1) {
	    L = wall;
	    partition(a,L, R);
	}
	return;
	
    }
    
    public static void main( String[] args) {
	int[] a = new int[]{5,1,76,10,4,100,2,50,36};

	//For actual Quicksort: 
	partition(a);
	/*	for (int i = 0; i < 10; i++) {   
	    System.out.println(partition(a,0,a.length-1));
	    System.out.println("\n");
	    }*/
	//For actual Quicksort:
	System.out.println(Arrays.toString(a));
    }
}
