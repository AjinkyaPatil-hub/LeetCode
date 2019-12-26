package com.aajay.BSTImpl;


public class BSTImpl {

	public Node insertNode(Node node,int val){
		//this is just demo to test the pull request int the git works proper or not
		if(node == null){
			return createNewNode(val);
		}else if(val < node.data){
			node.left = insertNode(node.left, val);
		}else if(val > node.data){
			node.right = insertNode(node.right, val);
		}
		return node;
		
	}
	public Node deleteNode(Node node,int val){
		if(node == null)
			return null;
		//reach to the given val....
		if(val < node.data){
			node.left = deleteNode(node.left, val);
		}else if(val > node.data)
		{
			node.right = deleteNode(node.right, val);
		}else{
			//condition for leaf or 1 child node...
			if(node.left  == null || node.right == null){
				Node temp = null;
				temp = node.left == null ? node.right : node.left;
				if(temp == null){
					return null;
				}else{
					return temp;
				}
			}else{
				
			}
			
		}
		return node;
	
		
	}

	private Node createNewNode(int val) {
		Node newNode = new Node();
		newNode.data=val;
		newNode.left=null;
		newNode.right=null;
		return newNode;
	}
	
}
