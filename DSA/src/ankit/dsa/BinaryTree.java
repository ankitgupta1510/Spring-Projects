package ankit.dsa;

import java.util.Scanner;

public class BinaryTree {
	public BinaryTree() {
		
	}
	
	private  static class Node {
		int value;
		Node left;
		Node right;
		
		public Node(int value) {
			this.value = value;
		}
	}
	
	private Node root;
	public void populate(Scanner scanner) {
		System.out.println("Enter the value of root");
		int value = scanner.nextInt();
		 root = new Node(value);
		 populate(scanner,root);
		
	}

}
