class Solution {
    Map<Integer,TreeNode> parent = new HashMap<Integer,TreeNode>();
    Set <Integer> exist = new HashSet<Integer>();

    public void dfs(TreeNode root){
        if(root.left != null){
            parent.put(root.left.val, root);
            dfs(root.left);
        }
        if(root.right != null){
            parent.put(root.right.val, root);
            dfs(root.right);
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root);
        while(p != null){
            exist.add(p.val);
            p = parent.get(p.val);
        }
        while(q != null){
            if(exist.contains(q.val)){
                return q;
            }
            q = parent.get(q.val);
        }
        return null;
    }
}