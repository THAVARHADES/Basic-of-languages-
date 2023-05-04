class Demo {
    int a;
    int b;

    public Demo() {
        a = 10;
        b = 20;
    }

    public void display() {
        System.out.println(a);
        System.out.println(b);
    }
}

class Demo1 extends Demo {
    int c;

    public Demo1() {
        System.out.println(a);
        System.out.println(b);
        c = 30;
    }

    public void display2() {
        System.out.println(c);
    }
}

class Day6Class2 {
    public static void main(String[] args) {
        Demo1 d1 = new Demo1();
        d1.display2();
    }
}