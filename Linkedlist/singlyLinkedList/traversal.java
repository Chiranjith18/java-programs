import java.util.*;
class Node{
    int data;
    Node next;
    Node (int d){
        this.data=d;
        this.next=null;
    }
}
public class Main {
  public static void main(String[] args) {
      Node head = new Node (1);
      head.next=new Node(2);
      head.next.next = new Node(3);
      printlist(head);
    }
  static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
    }
}
