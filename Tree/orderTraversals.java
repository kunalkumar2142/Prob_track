import java.util.*;

class TreeNode {
  int val;
  TreeNode left, right;
  TreeNode(int val) { this.val = val; }
}

class orderTraversals {
  
  private static void solve(TreeNode root, List<Integer> pre, List<Integer> in, List<Integer> post){
    if(root == null) return;
    
    pre.add(root.val);
    solve(root.left,pre,in,post);
    in.add(root.val);
    solve(root.right,pre,in,post);
    post.add(root.val);
  }

  public List<List<Integer>> dfsTraversal(TreeNode root) {
    List<Integer> pre = new ArrayList<>();
    List<Integer> in = new ArrayList<>();
    List<Integer> post = new ArrayList<>();
    
    solve(root,pre,in,post);
    List<List<Integer>> ans = new ArrayList<>();
    ans.add(pre);
    ans.add(in);
    ans.add(post);
    
    return ans; 
  }
  
  public static void main(String[] args) {
      return;
  }
}