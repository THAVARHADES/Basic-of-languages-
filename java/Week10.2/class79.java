package com.Serializable;

// import java.io.*;

//   class Student {
//   private int age;
//   private String name;

//   public Student(String name, int age) {
//   this.name = name;
//   this.age = age;
//   }

//   public void Display() {
//   System.out.println("Name+" + name);
//   System.out.println("Age+" + age);
//   }
//   }

//   class class79 {
//   public static void main(String args[]) {
//   Student s1 = new Student("thavar", 18);
//   s1.Display();
//   // System.out.println(s1);
//   }
//  }

/*class Student implements Serializable {
    int age;
    String name;

    public Student(int age, String name) {
        this.name = name;
        this.age = age;
    }

    public void Display() {
        System.out.print("Name:" + name);
        System.out.print("Age:" + age);
    }
}

class class79 {
    public static void main(String[] args) throws IOException {
        Student s = new Student(13, "jod");
        s.Display();
        String path = "D:/studnet.txt";
        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s);
    }
}*/
/*class Student implements Serializable {
    int age;
    String name;
    int otp;

    public void Studnet(int age, String name, int otp) {
        this.name = name;
        this.age = age;
        this.otp = otp;
    }

    public void Display() {
        System.out.println("Name" + name);
        System.out.println("age" + age);
        System.out.println("otp" + otp);
    }
}

class class79 {
    public static void main(String[] args) {
        // Outing the object
        String path = "D:/studnet.txt";
        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student st_obj = (Student) ois.readObject();
        st_obj.Display();
    }
}*/
class Student implements Serializable {
    int age;
    String name;
    int l
}