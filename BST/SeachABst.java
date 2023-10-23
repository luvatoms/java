package BST;

public class SeachABst {

  static class Node {

    int data;
    Node left, right;

    public Node(int data) {
      this.data = data;
      this.right = null;
      this.left = null;
    }
  }

  public static Boolean Search(Node root, int key) {//O(H)
    if (root == null) {
      return false;
    }
    if (root.data == key) {
      return true;
    }
    if (root.data < key) {
      return Search(root.right, key);
    } else {
      return Search(root.left, key);
    }
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
    System.out.println(Search(root, 11));
  }
}
//well done my boy u wrote this code without any help
