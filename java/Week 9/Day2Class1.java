import java.util.*;
//Stack will act as a book is Stack 
//The book with the first place will be taken at the last 
//The boook at the last will be taken at the first place

class Stack {
    // intitionig the array
    private int s[];
    private int size;
    private int top = -1;
    private Scanner scan = new Scanner(System.in);

    // getting array size
    public Stack(int n) {
        s = new int[n];
        size = s.length;
    }

    // pushing element for the arrays
    public void push() {
        int elem;
        if (top == size - 1) {
            System.out.print("Push not Possible");
        } else {
            System.out.println("Enter the Element");
            elem = scan.nextInt();
            ++top;
            s[top] = elem;
        }
    }

    // poping out an elements
    public void pop() {
        if (top == -1) {
            System.out.println("The element can not be pop");
        } else {
            System.out.println("Element Deleted is" + " " + s[top]);
            --top;
        }
    }

    // Displaiing the element
    public void display() {
        if (top == -1) {
            System.out.println("Display Not Possible");
        } else {
            for (int i = top; i >= 0; i++) {
                System.out.println(s[i]);
            }
        }
    }
}

class Day2Class1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Stack Size");
        int n = scan.nextInt();
        // initalizing the elements
        Stack stack = new Stack(n);
        // looping the arrys
        while (true) {
            System.out.println("Press 1 for Push");
            System.out.println("Press 2 for Pop");
            System.out.println("Press 3 for Display");
            System.out.println("Press other for exit");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    stack.push();
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.display();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}