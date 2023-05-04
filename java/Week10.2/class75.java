import java.util.*;

/*
 * class Student {
 * int id;
 * String name;
 * int age;
 * 
 * public Student(int id, String name, int age) {
 * this.id = id;
 * this.name = name;
 * this.age = age;
 * }
 * 
 * public String toString() {
 * return id + " " + name + " " + age;
 * }
 * }
 * 
 * class class75 {
 * public static void main(String[] args) {
 * Student s1 = new Student(51, "Ramesh", 23);
 * Student s2 = new Student(53, "Rakesh", 22);
 * Student s3 = new Student(54, "Raju", 21);
 * ArrayList al = new ArrayList();
 * al.add(s1);
 * al.add(s2);
 * al.add(s3);
 * Collection.sort(al);
 * System.out.println(al);
 * }
 * }
 */
/*class Student implements Comparable {
    int id;
    String name;
    int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return id + " " + name + " " + age;
    }

    public int CompareTo(Object y) {
        if (this.id > ((Student) (y)).id) {
            return 1;
        }
        return -1;
    }
}

class class75 {
    public static void main(String[] args) {
        Student s1 = new Student(51, "Ramesh", 23);
        Student s2 = new Student(53, "Rakesh", 22);
        Student s3 = new Student(54, "Raju", 21);
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        Collection.Sort(al);
        System.out.println(al);
    }
}*/
class Helper implements Comparator {
    public int compare(Object x, Object y) {
        if (((student) x).id > ((student) y).id) {
            return 1;
        }
        return -1;
    }
}

class student {
    int age;
    String name;
    int id;

    public student(int age, String name, int id) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return id + " " + name + " " + age;
    }
}

class class75 {
    public static void main(String[] args) {
        student s1 = new student(51, "Ramesh", 23);
        student s2 = new student(53, "Rakesh", 22);
        student s3 = new student(54, "Raju", 21);
        ArrayList<student> al = new ArrayList<student>();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        System.out.println(al);
        Helper h = new Helper();
        Collection.sort(al, h);
        System.out.println(al);
    }
}
