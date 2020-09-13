/**
* �ݹ飺O(n)
*/
class Solution {
    Map<Integer,Integer> inMap;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int len = preorder.length;
        inMap = new HashMap<>();
        for (int i = 0; i < len; i++) {
            inMap.put(inorder[i], i);
        }
        return myTreeBuild(preorder, inorder, 0, len - 1, 0, len - 1);
    }
    public TreeNode myTreeBuild(int[] preorder, int[] inorder, int preorderLeft, int preorderRight, int inorderLeft, int inorderRight) {
        if (preorderLeft > preorderRight) {return null;}
        int preOrderRoot = preorderLeft;
        int inorderRoot = inMap.get(preorder[preOrderRoot]);
        TreeNode root = new TreeNode(preorder[preOrderRoot]);
        int sizeInorderSubLeft = inorderRoot - inorderLeft;
        root.left = myTreeBuild(preorder, inorder, preorderLeft + 1 , preorderLeft + sizeInorderSubLeft, inorderLeft, inorderRoot - 1);
        root.right = myTreeBuild(preorder, inorder, preorderLeft + sizeInorderSubLeft + 1 , preorderRight, inorderRoot + 1, inorderRight);
        return root;

    }
}