package LinkedList;

import java.util.HashSet;

public class DeleteCycleInLinkedList {
    public Node head = null;
    public Node tail = null;

    public void addNode(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }

    }
    public void display(){
        Node temp = head;
        if(temp == null){
            System.out.println("List is empty!!!");
        }
        else{
            while(temp != null){
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("NULL");
        }
    }
    void removeLoop(Node head)
    {
        HashSet<Node> s = new HashSet<Node>();
        Node prev = null;
        while (head != null) {
            if (s.contains(head)) {
                prev.next = null;
                return;
            }
            else {
                s.add(head);
                prev = head;
                head = head.next;
            }
        }
    }
    public static void main(String[] args) {
        DeleteCycleInLinkedList list = new DeleteCycleInLinkedList();
        list.addNode(5);
        list.addNode(6);
        list.addNode(7);
        list.addNode(8);

        list.tail = list.head;
        list.removeLoop(list.head);
        System.out.println(
                "Linked List after removing loop");
        list.display();
    }
}

