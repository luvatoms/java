package BST;//O(n)

public class MirrorABst {

  static class Node {

    int data;
    Node right, left;

    public Node(int data) {
      this.data = data;
      this.right = null;
      this.left = null;
    }
  }
  public static Node createMirror(Node root){
    if(root==null){
       return null;
    }
    Node lefts = createMirror(root.left);
    Node rights = createMirror(root.right);
root.left = rights;
root.right=lefts;
return root;

  }
  public static void preOrder(Node root){
    if(root==null){
        return;
    }
    System.out.print(root.data+" ");
    preOrder(root.left);
    preOrder(root.right);
  }

  public static void main(String args[]) {
    Node root = new Node(5);
    root.left = new Node(3);
    root.right = new Node(8);
    root.left.left = new Node(2);
    root.left.right = new Node(4);
    root.right.left = new Node(6);
    root.right.right = new Node(9);
    root.left.left.left = new Node(1);
    root.right.right.right = new Node(10);
    root = createMirror(root);
    preOrder(root);

  }
}
