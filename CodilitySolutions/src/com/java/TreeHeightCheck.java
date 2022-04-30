package com.java;
public class TreeHeightCheck {
	public void inOrderTraversal(TreeNode root){
		   System.out.println(root.val);
			if(root.left!=null && root.right!=null) {
				inOrderTraversal(root.left);			
				inOrderTraversal(root.right);
			}
	}
}
 class TreeNode {
    int val;
     TreeNode left;
     TreeNode right;
    TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
         this.left = left;
         this.right = right;
     }
  }