package code.sorting;

public class TreeSort {

	Node root;
	
	public static void main(String[] args) {
		
		TreeSort tree = new TreeSort();
		
		int arr[] = {5,2,4,1,6,8,9,10};
		for (int i : arr) {
			tree.insert(i);
		}
		
		tree.print(tree.root);
	}
	
	void insert(int key){
        root = insert_recc(root, key);
    }
	
	public Node insert_recc(Node root,int key) {
		
		if(root==null) {
			root= new Node(key);
			return root;
		}
		
		if(key < root.key) {
			root.left = insert_recc(root.left,key);
		}else if(key > root.key) {
			root.right = insert_recc(root.right,key);
		}
		
		return root;
	}
	
	public void print(Node _root) {
		if(_root!=null) {
			print(_root.left);
			System.out.print(_root.key+" ");
			print(_root.right);
		}
	}
	
	class Node {
		int key;
		Node left,right;
		
		Node(int _key){
			key=_key;
			left = right =null;
		}
	}
}
