package BST;

import java.util.*;

public class RootToLeafPath {

  static class Node {

    int data;
    Node left, right;

    public Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }
public static void printPath(ArrayList<Integer> path){
    for(int i =0;i<path.size();i++){
        System.out.print(path.get(i)+"->");
    }
    System.out.println("Null");
}
  public static void printRoot2Leaf(Node root, ArrayList<Integer> path) {
    if(root==null){
        return;
    }
    path.add(root.data);
    if(root.left==null&&root.right==null){
    printPath(path);
    }
    printRoot2Leaf(root.left, path);
    printRoot2Leaf(root.right, path);
    path.remove(path.size()-1);
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
    printRoot2Leaf(root,new ArrayList<>());
  }
}
