package ankit.dsa;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree2 {
	
	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		
		public TreeNode(int data) {
			this.val = data;
		}
	}
	
	static void preOrder(TreeNode root) {
		//Base case
		if(root == null)return;
		
		System.out.println("PreOrderTrav:- " + root.val);
		preOrder(root.left);
		preOrder(root.right);
	}
	
	static void inOrder(TreeNode root) {
		if(root == null) return;
		
		inOrder(root.left);
		System.out.println("InOrderTrav:- " + root.val);
		inOrder(root.right);
	}
	
	static void postOrder(TreeNode root) {
		if (root == null) return ;
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.val);
	}
	
	static int height(TreeNode root) {
		if (root == null) return 0;
		int heightleft = height(root.left);
		int heightRight = height(root.right);
		
		return Math.max(heightleft, heightRight)+1;
		
	}
	
	static void levelOrderTraversal(TreeNode root) {
		if(root == null) return;
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		
		while(!q.isEmpty()) {
			
			TreeNode top = q.poll();
			System.out.println(top.val);
			if(top.left!=null)
			q.add(top.left);
			if(top.right!=null)
			q.add(top.right);
			
			
		}
		
		
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		
		preOrder(root);
		inOrder(root);
		//postOrder(root);
		levelOrderTraversal(root);
		System.out.println("Tree height = " + height(root));
	}

}
