package linkedlistt;

import java.util.*;

public class DoublyLL {

  static class Node {

    int data;
    Node prev, next;

    public Node(int data) {
      this.data = data;
      this.prev = null;
      this.next = null;
    }
  }

  public static Node head;
  public static Node tail;
  public static int size;

  //add from first

  public static void addFirst(int data) {
    //creation of new node
    Node newnode = new Node(data);
    //if there is no node
    size++;
    if (head == null) {
      tail = head = newnode;
      return;
    }
    //if there is a node and linking node to existing node from first
    newnode.next = head;
    head.prev = newnode;
    head = newnode;
  }

  //print
  public static void print() {
    if (head == null) {
      System.out.println("null");
    }
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + "<-->");
      temp = temp.next; //updation
    }
    System.out.print("null");
    return;
  }

  //removefromfirst
  public static int removeFirst() {
    if (head == null) {
      System.out.println("empty");
      return Integer.MIN_VALUE;
    }
    if (size == 1) {
      int val = head.data;
      head = tail = null;
      size--;
      return val;
    }
    int val = head.data;
    head = head.next;
    head.prev = null;
    head.prev.next = null;
    size--;
    return val;
  }

  public static void main(String args[]) {
    DoublyLL dll = new DoublyLL();
    addFirst(1);
    print();
    removeFirst();
    print();
  }
}
//make removefrom last and add from last and add from middle by youself
