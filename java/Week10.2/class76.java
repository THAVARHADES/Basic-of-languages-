import java.util.*;
import java.util.Collection;

/*
 * class class76 {
 * public static void main(String[] args) {
 * PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
 * pq.add(100);
 * pq.add(110);
 * pq.add(50);
 * pq.add(150);
 * pq.add(25);
 * pq.add(75);
 * pq.add(125);
 * System.out.println(pq);
 * ArrayList al = new ArrayList();
 * al.addAll(al);
 * Collection.sort(al);
 * System.out.println(al);
 * }
 * }
 */
/*
 * class class76 {
 * public static void main(String[] args) {
 * ArrayList al = new ArrayList();
 * al.add(100);
 * al.add(50);
 * al.add(150);
 * al.add(25);
 * al.add(75);
 * al.add(125);
 * al.add(175);
 * al.add(175);
 * System.out.println("ArrayList---->" + al);
 * System.out.println("-----------------");
 * System.out.println(Collection.binarySearch(al, 75));
 * System.out.println("-----------------");
 * System.out.println(Collection.binarySeach(al, 100));
 * System.out.println("-----------------");
 * System.out.println(Collection.min(al));
 * System.out.println("-----------------");
 * System.out.println(Collection.max(al));
 * System.out.println("-----------------");
 * System.out.println(Collection.frequency(al, 75));
 * System.out.println("-----------------");
 * System.out.println(Collection.frequency(al, 175));
 * System.out.println("-----------------");
 * System.out.println("Arraylist" + al);
 * Collection.replaceAll(al, 175, 999);
 * System.out.println(al);
 * Collection.rotate(al, 2);
 * System.out.println(al);
 * Collection.shuffle(al);
 * System.out.println(al);
 * }
 * }
 */
class Student {
    int id;
    String name;
    int age;
    String gender;
    int marks;
    int sem;
    int ph;
    String email;
    String collage;

    public Student(int id, String name, int age, String gender, int marks, int sem, int ph, String email,
            String collage) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.marks = marks;
        this.sem = sem;
        this.ph = ph;
        this.email = email;
        this.collage = collage;
    }

    public String toString() {
        return id + " " + name + " " + age + " " + gender + " " + marks + " " + sem + " " + ph + " " + email + " "
                + collage;
    }
}

class class76 {
    public static void main(String[] args) {
        Student s1 = new Student(123, "Raju", 21, "Male", 45, 3, 9981, "raju@gmail.com", "RVIT");
        Student s2 = new Student(125, "Ramesh", 23, "Male", 25, 1, 998143, "ramesh@gmail.com", "RVIT");
        Student s3 = new Student(345, "Rakesh", 24, "Male", 76, 5, 9981624, "rakesh@gmail.com", "RVIT");
        TreeMap hm = new TreeMap();
        hm.put(100, s1);
        hm.put(100, s2);
        hm.put(100, s3);
        System.out.println(hm);
    }
}