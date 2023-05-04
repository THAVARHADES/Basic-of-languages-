import java.util.*;

//Link list is ARRay with the link of the address upadted to it 
class LinkedList {
    // Starting the nodes with the nodes
    class Node {
        int data;
        Node link;
    }

    private Scanner scan = new Scanner(System.in);
    private Node first;

    // Inserting Rear Elements
    public void insertRear() {
        Node temp;
        System.out.println("Enter the Data to be Entered");
        int elem = scan.nextInt();
        Node newnode = new Node();
        newnode.data = elem;
        newnode.link = null;
        if (first == null) {
            first = newnode;
        } else {
            temp = first;
            while (temp.link != null) {
                temp = temp.link;
            }
            temp.link = newnode;
        }
    }

    // Deleting the Rear Elements
    public void deleteRare() {
        Node temp;
        if (first == null) {
            System.out.println("ENter the cann't be deleted");
        } else if (first.link == null) {
            System.out.println("Element deleted is" + " " + first.data);
            first = null;
        } else {
            temp = first;
            while (temp.link.link != null) {
                temp.link = temp;
            }
            System.out.println("Element deleted is" + " " + temp.link.data);
            temp.link = null;
        }
    }

    // Inserting the front elements
    public void insertFront() {
        System.out.println("Enter the Element");
        int elem = scan.nextInt();
        Node newnode = new Node();
        newnode.data = elem;
        newnode.link = null;
        if (first == null) {
            first = newnode;
        } else {
            newnode.link = first;
            first = newnode;
        }
    }

    // Deleting the Front elements
    public void deleteFront() {
        if (first == null) {
            System.out.println("Deletion not Possible");
        } else if (first.link == null) {
            System.out.println("Element deleted is" + " " + first.data);
            first = null;
        } else {
            System.out.println("element deleted is" + " " + first.data);
            first = first.link;
        }
    }

    // Display the elements
    public void display() {
        Node temp;
        if (first == null) {
            System.out.println("Display not possible");
        } else if (first.link == null) {
            System.out.print(first.data + " ");
        } else {
            temp = first;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.link;
            }
            System.out.println();
        }

    }
}

class Day5Class2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        // Statring the Elements
        while (true) {
            System.out.println("Press 1 for InsertRear");
            System.out.println("Press 2 for DeleteRear");
            System.out.println("Press 3 for InsertFirst");
            System.out.println("Press 4 for DeleteFirst");
            System.out.println("Press 5 for Display");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            // Switching the Elements
            switch (choice) {
                case 1:
                    ll.insertFront();
                    break;
                case 2:
                    ll.deleteFront();
                    break;
                case 3:
                    ll.insertRear();
                    break;
                case 4:
                    ll.deleteRare();
                    break;
                case 5:
                    ll.display();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}