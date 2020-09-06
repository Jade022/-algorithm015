class Solution {
    public List<Integer> preorder(Node root) {
        LinkedList<Node> stack = new LinkedList<Node>();
        LinkedList<Integer> outMap = new LinkedList<Integer>();
        if(root == null){
            return outMap;
        }
        stack.add(root);
        while(!stack.isEmpty()){
            Node node = stack.pollLast();
            outMap.add(node.val);
            Collections.reverse(node.children);
            for(Node item: node.children){
                stack.add(item);
            }
        }
        return outMap;
    }
}