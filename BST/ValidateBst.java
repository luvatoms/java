package BST;

public class ValidateBst {

  static class Node {

    int data;
    Node right, left;

    public Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }
  public static boolean isValidBST(Node root,Node min,Node max){
    if(root==null){
      return true;
    }
    if(min!=null&&root.data<=min.data){
      return false;
    }
    else if(max!=null&&root.data>=max.data){
      return false;
    }
    return isValidBST(root.left, min, root)
    &&isValidBST(root.right, root, max);

  }

  public static void main(String args[]) {
    //binary search tree with hand implementation
    Node root = new Node(5);
    root.left = new Node(3);
    root.right = new Node(8);
    root.left.left = new Node(2);
    root.left.right = new Node(4);
    root.right.left = new Node(6);
    root.right.right = new Node(9);
    root.left.left.left = new Node(1);
    root.right.right.right = new Node(10);
    System.out.println(isValidBST(root, null, null));
  }
}
