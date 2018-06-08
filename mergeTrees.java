/* Given two binary trees and imagine that when you put one of them to cover the other, 
some nodes of the two trees are overlapped while the others are not.

You need to merge them into a new binary tree. 
The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node. 
Otherwise, the NOT null node will be used as the node of new tree. */


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class mergeTrees {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) { return null;}
        TreeNode newNode = new TreeNode(-1); 
        if (t1 == null ){
            newNode.val = t2.val ;
            newNode.left = mergeTrees( null, t2.left);
            newNode.right = mergeTrees( null, t2.right);
        }
        else if ( t2 == null ) {
            newNode.val = t1.val ;
            newNode.left = mergeTrees( t1.left, null);
            newNode.right = mergeTrees( t1.right , null);
        }
        else {
            newNode.val = t1.val + t2.val;
            newNode.left = mergeTrees(t1.left, t2.left);
            newNode.right = mergeTrees( t1.right, t2.right);
        }
        return newNode;
    }
}