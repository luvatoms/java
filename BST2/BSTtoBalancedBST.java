package BST2;

import java.util.*;

public class BSTtoBalancedBST {

  static class Node {

    int data;
    Node right, left;

    public Node(int data) {
      this.data = data;
      this.right = this.left = null;
    }
  }

  public static void preOrder(Node root) {
    if (root == null) {
      return;
    }
    System.out.print(root.data + " ");
    preOrder(root.left);
    preOrder(root.right);
  }

  public static void getInorder(Node root, ArrayList<Integer> inorder) {
    if (root == null) {
      return;
    }
    getInorder(root.left, inorder);
    inorder.add(root.data);
    getInorder(root.right, inorder);
  }

  public static Node createBST(ArrayList<Integer> inorder, int st, int end) {
    if (st > end) {
      return null;
    }
    int mid = (st + end) / 2;
    Node root = new Node(inorder.get(mid));
    root.left = createBST(inorder, st, mid - 1);
    root.right = createBST(inorder, mid + 1, end);
    return root;
  }

  public static Node balanceBST(Node root) {//O(n)
    //inorder seq.
    ArrayList<Integer> al = new ArrayList<>();
    getInorder(root, al);
    //sorted inorder--> balanced BST
root = createBST(al, 0, al.size()-1);
return root;
  }

  public static void main(String args[]) {
    Node root = new Node(8);
    root.left = new Node(6);
    root.left.left = new Node(5);
    root.left.left.left = new Node(3);
    root.right = new Node(10);
    root.right.right = new Node(11);
    root.right.right.right = new Node(12);
    root = balanceBST(root);
    preOrder(root);
}
}