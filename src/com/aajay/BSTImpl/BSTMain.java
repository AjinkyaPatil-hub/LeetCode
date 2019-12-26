package com.aajay.BSTImpl;

public class BSTMain {

	public static void main(String[] args) {
		BSTImpl bt = new BSTImpl();
		Node root=null;
		root = bt.insertNode(root, 8);
		root = bt.insertNode(root, 3);
		root = bt.insertNode(root, 1);
		root = bt.insertNode(root, 30);
		root= bt.deleteNode(root, 3);
		/*		root = bt.insertNode(root, 10);
		root =bt.insertNode(root, 1);
		root =bt.insertNode(root, 6);
		root =bt.insertNode(root, 14);
		root =bt.insertNode(root, 4);
		root =bt.insertNode(root, 7);
		root =bt.insertNode(root, 13);
*/		
	}
}
