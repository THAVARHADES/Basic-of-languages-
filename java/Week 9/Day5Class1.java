class Outer {
    class Inner {
        int a = 10;
        int b = 20;
    }

    int c;

    void display() {
        Inner i = new Inner();
        System.out.println(i.a);
        System.out.println(i.b);
    }
}

class Day5Class1 {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        System.out.println(i);
    }
}
