package BST;

public class PrintInRange {

  //print in range

  static class Node {

    int data;
    Node left, right;

    public Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  public static void printInRange(Node root, int k1, int k2) {
    if (root == null) {
      return;
    }
    if (root.data >= k1 && root.data <= k2) {
      printInRange(root.left, k1, k2);
      System.out.print(root.data + " ");
      printInRange(root.right, k1, k2);
    } else if (root.data < k1) {
      printInRange(root.left, k1, k2);
    } else {
      printInRange(root.right, k1, k2);
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
    printInRange(root, 5, 9);
  }
}
