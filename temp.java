import java.util.*;

public class temp {
    public static class Node {
        int data;
        Node next;
        static Node head,tail;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.head=this.tail=null;
        }
    }

    private Object head;



    // Function for adding to the first
    public void addfirst(int data) {
        // step 1 - create a new node
        Node newNode = new Node(data);
        if (head == null) {  // linked list is empty
            head = tail = newNode; // Initialize both head and tail
            return;
        }
        // step 2 - newNode next = head
        newNode.next = head;
        // step 3 - head = newNode
        head = newNode;
    }

    // Function for adding to the last
    public void addlast(int data) {
        // step 1 - create a new node
        Node newNode = new Node(data);
        Object head;
        if (head == null) {  // linked list is empty
            head = tail = newNode; // Initialize both head and tail
            return;
        }
        // step 2 - tail.next = newNode
        tail.next = newNode;
        // step 3 - tail = newNode
        tail = newNode;
    }

    // Function to add in the middle
    public void addinmiddle(int idx, int data) {
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while (i <= idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Function to print the linked list
    public void print() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        temp ll = new temp(); // Create an instance of the temp class
        ll.addfirst(3);       // Initialize the linked list with the first element
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addlast(4);
        ll.addlast(5);
        ll.addinmiddle(2, 6);
        ll.print();
    }

}
