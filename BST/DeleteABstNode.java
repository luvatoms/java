package BST;

public class DeleteABstNode {

  static class Node {

    int data;
    Node left, right;

    public Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  public static Node insert(Node root, int val) {
    if (root == null) {
      root = new Node(val);
      return root;
    }
    if (root.data > val) {
      //left subtree
      root.left = insert(root.left, val);
    } else {
      //right subtree
      root.right = insert(root.right, val);
    }
    return root;
  }

  //inorder traversal to check if a tree a BST or not
  public static void inOrder(Node root) {
    if (root == null) {
      return;
    }
    inOrder(root.left);
    System.out.print(root.data + " ");
    inOrder(root.right);
  }

  //delete a node in a BST
  public static Node delete(Node root, int val) {
    if (root.data < val) {
      root.right = delete(root.right, val);
    } else if (root.data > val) {
      root.left = delete(root.left, val);
    } else {
      //voila
      //case1: leaf node
      if (root.left == null && root.right == null) {
        return null;
      } //case2 : single child
      if (root.left == null) {
        return root.right;
      } else if (root.right == null) {
        return root.left;
      }
      //case3:both children
      Node IS = findInorderSuccessor(root.right);
      root.data = IS.data;
      root.right = delete(root.right, IS.data);
    }
    return root;
  }

  public static Node findInorderSuccessor(Node root) {
    while (root.left != null) {
      root = root.left;
    }
    return root;
  }

  public static void main(String args[]) {
    int values[] = { 5, 1, 3, 4, 2, 7,10 };
    Node root = null;
    for (int i = 0; i < values.length; i++) {
      root = insert(root, values[i]);
    }
    inOrder(root);
    System.out.println();
    root=delete(root, 10);
    System.out.println();
    inOrder(root);
  }
}
