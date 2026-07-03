class Solution{
class Pair{
    TreeNode node;
    int height;
    Pair(TreeNode node,int height){
        this.node =node;
        this.height=height;
    }
}

Pair helper(TreeNode root){
    if(root==null) return new Pair(null,-1);
    Pair left=helper(root.left);
    Pair right=helper(root.right);
    if(left.height > right.height)
    return new Pair(left.node, left.height + 1);

else if(right.height > left.height)
    return new Pair(right.node, right.height + 1);

else
    return new Pair(root, left.height + 1);

}

    public TreeNode lcaDeepestLeaves(TreeNode root) {
        return helper(root).node;

        
    
}
}