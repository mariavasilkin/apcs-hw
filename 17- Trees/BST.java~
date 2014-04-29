public class BST {
    private Node root;

    public BST() {
	root = null;
    }

    public void insert (int index) {
	insert2(
    public void insert2 (Node p, int index) {
	if (root == null) {
	    root = p;
	    return;
	}
	Node prev = root;
	while (prev.hasChildren()){
	    if (p.getData() < prev.getData()) {
		prev = prev.getRight();
	    }
	    else prev = prev.getLeft();
	}
	if (p.getData() < prev.getData())
	    prev.setLeft(p);
	else prev.setRight(p);
	
    }	
    public Node search (int x) {
	Node p = root;
	while(p!= null && p.getData()!= x) {
	    if (p.getData() > x) 
		p = p.getRight();
	    else p = p.getLeft();
	}
	return p;
    }


    public Node search2 (Node p, int x) {
	if (p != null && root.getData() == x) {	
	    return root;
	}
	else if (root.hasChildren()) {
	    if (x < root.getData()) {
		return search2(root.getLeft(), x);
	    }
	    else return search2(root.getLeft(), x);
	}
	else return null;
    }

}
