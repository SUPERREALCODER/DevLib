/**
 * Definition for a binary tree node.*/
 public class TreeNode {
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
 
class Solution {
    public List<Integer> largestValues(TreeNode root) {
        if(root == null)return Collections.emptyList();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<Integer> large = new ArrayList<>();

        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> level =new ArrayList<>();

            for(int i=0;i<size; i++){
                TreeNode node =queue.poll();
                level.add(node.val);
                if(node.left !=null) queue.add(node.left);
                if(node.right !=null) queue.add(node.right);
            }

            large.add(Collections.max(level));
        }

        return large;
    }
}