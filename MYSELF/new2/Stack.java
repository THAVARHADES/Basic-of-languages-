// import java.util.*;

// class New {
// private int s[];
// private int top = -1;
// private int size;
// private Scanner scan = new Scanner(System.in);

// public New(int n) {
// s = new int[n];
// size = s.length;
// }

// public void push() {
// int elem;
// if (top == size - 1) {
// System.out.println("The Stack is full");
// } else {
// System.out.println("Enter the Element");
// elem = scan.nextInt();
// ++top;
// s[top] = elem;
// }
// }

// public void pop() {
// if (top == -1) {
// System.out.println("The Stack is emoty as your Brain");
// } else {
// System.out.println("The element Deleted is" + s[top]);
// --top;
// }
// }

// public void display() {
// if (top == -1) {
// System.out.println("The Stack is empty");
// } else {
// for (int i = 0; i <= s.length - 1; i++) {
// System.out.println(s[i] + " ");
// }
// }
// }
// }

// class Stack {
// public static void main(String[] args) {
// Scanner scan = new Scanner(System.in);
// System.out.println("Enter the length of array");
// int n = scan.nextInt();
// New s = new New(n);
// while (true) {
// System.out.println("Enter 1 for push");
// System.out.println("Enter 2 for pop");
// System.out.println("Enter 3 for display");
// System.out.println("Enter any for exit");
// int jod = scan.nextInt();
// switch (jod) {
// case 1:
// s.push();
// break;
// case 2:
// s.pop();
// break;
// case 3:
// s.display();
// break;
// default:
// System.exit(0);
// }
// }
// }
// }
// import java.util.*;

// class LinkedList {
// class Node {
// int data;
// Node link;
// }

// private Scanner scan = new Scanner(System.in);
// private Node first;

// public void insertRear() {
// Node temp;
// System.out.println("Enter the Data to be Enetered");
// int elem = scan.nextInt();
// Node newnode = new Node();
// newnode.data = elem;
// newnode.link = null;
// if (first == null) {
// first = newnode;
// } else {
// temp = first;
// while (temp.link != first) {
// temp = temp.link;
// }
// temp.link = newnode;
// }
// }

// public void deleteRear() {
// Node temp;
// if (first == null) {
// System.out.println("The LinkedList is empty");
// } else if (first.link == null) {
// System.out.println("Element deleted is" + first.data);
// first = null;
// } else {
// temp = first;
// while (temp.link.link != null) {
// temp.link = temp;
// }
// System.out.println("Element deleted is" + temp.link.data);
// temp.link = null;
// }
// }

// public void insertFront() {
// System.out.println("Enter the Element");
// int elem = scan.nextInt();
// Node newnode = new Node();
// newnode.data = elem;
// newnode.link = null;
// if (first.link == null) {
// first = newnode;
// } else {
// newnode.link = first;
// first = newnode;
// }
// }

// public void deleteFront() {
// Node temp;
// if (first == null) {
// System.out.println("The LinkedList is already empty");
// } else if (first.link == null) {
// System.out.print("ELement deleted is" + first.data);
// } else {
// temp = first;
// while (temp.link.link != null) {
// temp.link = null;
// }
// System.out.println("ELement Deleted is" + temp.link.data);
// temp.link = null;
// }
// }

// public void display() {
// Node temp;
// if (first == null) {
// System.out.println("The LinkedList is empty");
// } else if (first.link == null) {
// System.out.println("The only data is" + first.data);
// } else {
// temp = first;
// while (temp != null) {
// System.out.print(temp.data + " ");
// temp = temp.link;
// }
// System.out.println();
// }
// }
// }

// class Stack {
// public static void main(String[] args) {
// LinkedList ll = new LinkedList();
// Scanner scan = new Scanner(System.in);
// while (true) {
// System.out.println("Enter 1 for insertRear");
// System.out.println("Enter 2 for deleteRear");
// System.out.println("Enter 3 for insertFront");
// System.out.println("Enter 4 for DeleteFront");
// System.out.println("Enter 5 for Display");
// int choice = scan.nextInt();
// switch (choice) {
// case 1:
// ll.insertRear();
// break;
// case 2:
// ll.deleteRear();
// break;
// case 3:
// ll.insertFront();
// break;
// case 4:
// ll.deleteFront();
// break;
// case 5:
// ll.display();
// break;
// default:
// System.exit(0);
// }
// }
// }
// }
import java.util.*;

class DLL {
    class Node {
        Node prelink;
        int data;
        Node nextlink;
    }

    private Node first;
    private Scanner scan = new Scanner(System.in);

    public void insertfront() {
        System.out.println("Enter the Element");
        int elem = scan.nextInt();
        Node newnode = new Node();
        newnode.data = elem;
        newnode.prelink = null;
        newnode.nextlink = null;
        if (first == null) {
            first = newnode;
        } else {
            newnode.nextlink = first;
            first.nextlink = newnode;
            first = newnode;
        }
    }

    public void insertRear() {
        Node temp;
        System.out.println("Enter the element to be inserted");
        int elem = scan.nextInt();
        Node newnode = new Node();
        newnode.data = elem;
        newnode.prelink = null;
        newnode.nextlink = null;
        if (first == null) {
            first = newnode;
        } else {
            temp = first;
            while (first.nextlink != null) {
                temp = temp.nextlink;
                temp.nextlink = newnode;
                newnode.prelink = temp;
            }
        }
    }

    public void deletefront() {
        if (first == null) {
            System.out.println("The linkedList is already empty");
        } else if (first.nextlink == null) {
            System.out.println("The element deleted is" + first.data);
        } else {
            first = first.nextlink;
            first.prelink = null;
        }
    }

    public void deleterear() {
        if (first == null) {
            System.out.println("The linkedlist is alreay empty");
        } else if (first.nextlink == null) {
            System.out.println("Elemnet deleted is" + first.data);
        } else {
            Node temp;
            temp = first;
            while (temp.nextlink.nextlink == null) {
                temp = temp.nextlink;
            }
            System.out.println("Element deleted is" + temp.nextlink.data);
            temp.nextlink = null;
        }
    }

    public void displayforward() {
        if (first == null) {
            System.out.println("The linkedList is Empty");
        } else if (first.nextlink == null) {
            System.out.println(first.data);
        } else {
            Node temp;
            temp = first;
            while (temp != null) {
                System.out.println(temp.data + " ");
                temp = temp.nextlink;
            }
            System.out.println();
        }
    }

    public void displayback() {
        if (first == null) {
            System.out.println("The linkedList is empty");
        } else if (first.nextlink == null) {
            System.out.println(first.data);
        } else {
            Node temp;
            temp = first;
            while (temp.nextlink != null) {
                temp = temp.nextlink;
            }
            while (temp.nextlink != null) {
                System.out.println(temp.data + " ");
                temp = temp.prelink;
            }
        }
    }
}

class Stack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DLL o = new DLL();
        System.out.print("Enter 1 for insertfront");
        System.out.println("Enter 2 for insertrear");
        System.out.println("Enter 3 for deletefront");
        System.out.println("Enter 4 for delete rear");
        System.out.println("Enter 5 for displayforward");
        System.out.println("Enter 6 for displayback");
        int choice = scan.nextInt();
        while (true) {
            switch (choice) {
                case 1:
                    o.insertfront();
                    break;
                case 2:
                    o.insertRear();
                    break;
                case 3:
                    o.deletefront();
                    break;
                case 4:
                    o.deleterear();
                    break;
                case 5:
                    o.displayback();
                    break;
                case 6:
                    o.displayforward();
                default:
                    System.exit(0);
            }
        }
    }
}