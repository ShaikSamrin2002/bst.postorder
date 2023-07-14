package BinarySearch;




class Node{
	Node left,right;
	int data;
	public Node(int data) {
		this.data=data;
		left=right=null;
	}
}
public class BinarySearchTree {
	Node root;
	public BinarySearchTree() {
		root=null;
	}
	void insert(int data) {
		root=insertRecursive(root,data);
		
	}
	Node insertRecursive(Node root,int data ) {
		if(root==null) {
			root=new Node(data);
			return root;
		}
		if(data<root.data) {
			root.left=insertRecursive(root.left,data);
		}
		else if(data>root.data) {
			root.right=insertRecursive(root.right,data);
		}
		return root;
	}
	

  void postorder(Node root) {
		
			postorder(root.left);
      if(root!=null) {
			System.out.print(root.data+" ");
			postorder(root.right);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bst=new BinarySearchTree();
		bst.insert(5);
		bst.insert(3);
		bst.insert(8);
		bst.insert(2);
		bst.insert(4);
		bst.insert(7);
		bst.insert(9);
    bst.postorder(bst.root);
		
		// postorder-2, 4, 3, 7, 9, 8, 5
		
		

	}

}
