package com.datastructures.src;

public class BinarySearchTree {
	public static void main(String[] args) {
/*
		Lets create a following BST
		50
		/ \
	30		70
	/ \		/ \
20    40	60 80 	
*/		
		
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);
		
		tree.inOrder();
		
		
	}
	// Class containing left & right child of current node & key value.
	class Node {
		int key;
		Node left, right;
		public Node(int item){
			key = item;
			left = right = null;
		}
	}
	// Root of BST
	Node root;
	// Constructor
	public BinarySearchTree() {
		root = null;
	}
	void insert(int key){
		root = insertRec(root,key);
	}
	// Recursive function to insert into BST
	private Node insertRec(Node root, int key) {
		// If tree is empty return new node
		if(root == null){
			root = new Node(key);
			return root;
		}
		// otherwise, recur dow the tree
		if(key<root.key){
			root.left=insertRec(root.left, key);
		}
		else if(key>root.key){
			root.right=insertRec(root.right, key);
		}
		
		return root;
	}
	
	void inOrder(){
		inOrderRec(root);
	}
	// Function to do traversal
	void inOrderRec(Node root) {
		if(root!=null){
			inOrderRec(root.left);
			System.out.println(root.key);
			inOrderRec(root.right);
		}
	}
}
