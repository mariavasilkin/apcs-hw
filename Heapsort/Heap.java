public class Heap {

    private int[] data;
    private int[] sorted;
    int lastIndex;

    public Heap (int[] heapData) {
	data = heapData;
	lastIndex = heapData.length - 1;
    }

    public int findMax() {
	return data[0];
    }	   

    public int removeMax(int[] data) {
	int ans = data[0];
	data[0] = data[lastIndex];
	data[lastIndex] = 0;
	lastIndex --;
        for (int n = 0; data[n] < data[2*n] || data[n] < data[2*n+1]; n++) {
	    int temp = data[n];
	    if (data[2*n] > data[2*n+1]) {
		data[n] = data[2*n];
		data[2*n] = temp;
	    }
	    else {
		data[n] = data[2*n+1];
		data[2*n+1] = temp;
	    }
	}
	return ans;
    }
    
    public void  HeapSort() {
	while (lastIndex > 0) {
	    sorted[lastIndex] = this.removeMax(data);
	}
    }
    public String toString() {
	String s = "";
	for (int a:data) {
	    s += a + " ";
	}
	return s;
    }
    public static void main(String[] args) {
	int[] a = {6,1,3,7,12,7,9};
	Heap h = new Heap(a);
	h.HeapSort();
	System.out.println(h);
    }
	
}
