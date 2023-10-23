package BinaryTreesB2;

//given the roots of two binary trees, Root and Subroot,return true if there is a sub tree of root with same structure and node value of the subroot and false otherwise.

public class Question1 {

  static class Node {

    int data;
    Node left, right;

    public Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }

    public static boolean isIndentical(Node node, Node subRoot) {
      if (node == null && subRoot == null) {
        return true;
      } else if (node == null || subRoot == null || node.data != subRoot.data) {
        return false;
      }
      if (!isIndentical(node.left, subRoot.left)) {
        return false;
      }
      if (!isIndentical(node.right, subRoot.right)) {
        return false;
      }
      return true;
    }

    public static boolean isSubtree(Node root, Node subRoot) {
        if(root==null){
            return false;
        }
      if (root.data == subRoot.data) {
        if (isIndentical(root, subRoot)) {
          return true;
        }

      }

      return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public static void main(String args[]) {
      Node root = new Node(1);
      root.left = new Node(2);
      root.right = new Node(3);
      root.left.left = new Node(4);
      root.left.right = new Node(5);
      root.right.left = new Node(6);
      root.right.right = new Node(7);

      //subtree
      Node subRoot = new Node(2);
      subRoot.left = new Node(4);
      subRoot.right = new Node(5);
      System.out.println(isSubtree(root, subRoot));
    }
  }
}
