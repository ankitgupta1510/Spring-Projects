package ankit.dsa;

import java.util.Scanner;

public class BinaryTree {
	public BinaryTree() {
		
	}
	public static class Node{
		int value;
		Node left;
		Node right;
		
		public Node(int value) {
			this.value=value;
		}
		
	}
	
	private Node root;
	
	void populate(Scanner scanner) {
		System.out.println("Enter the value of root");
		int value = scanner.nextInt();
		
		root = new Node(value);
		treeBnao(scanner , root);
		
		
	}
	
	void treeBnao(Scanner scanner,Node node) {
		System.out.println("Do u want to enter value to left of " + node.value);
		boolean left = scanner.nextBoolean();
		if(left){
			System.out.println("Enter the value of node left to "+ node.value);
			int value = scanner.nextInt();
			node.left  = new Node(value);
			treeBnao(scanner, node.left);
		}
		
		System.out.println("Do u want to enter value to right of  " + node.value);
		boolean right = scanner.nextBoolean();
		if(right){
			System.out.println("Enter the value of node right to "+ node.value);
			int value = scanner.nextInt();
			node.right  = new Node(value);
			treeBnao(scanner, node.right);
		}
	}
	public void display() {
		display(root,"");
	}
	
	private void display(Node node,String indent) {
		if(node == null) {
			return ;
		}
		System.out.println(indent+node.value);
		display(node.left,indent+"\t");
		display(node.right,indent+"\t");
		
		
		
	}

}
