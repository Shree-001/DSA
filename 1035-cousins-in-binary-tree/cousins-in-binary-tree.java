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
    TreeNode xp=null,yp=null;
        int xd=-1,yd=-1;


    public boolean isCousins(TreeNode root, int x, int y){
            find(root,null,0,x,y);
            return (xd==yd)&&(xp!=yp);
        }
        public void find(TreeNode n, TreeNode p,int d, int x,int y)
        {
            if(n==null)
            {
                return;
            }
            if(n.val==x)
            {
                xp=p;
                xd=d;
            }

            if(n.val==y)
            {
                yp=p;
                yd=d;
            }
            find(n.left,n,d+1,x,y);
            find(n.right,n,d+1,x,y);
        }
}