/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void operation(TreeNode root, List<Integer> list)
    {
        if(root==null)
        {
            return;
        }
        list.add(root.val);
        operation(root.left,list);
        operation(root.right,list);
        return;

    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        operation(root,list);
        return list;
    }
}