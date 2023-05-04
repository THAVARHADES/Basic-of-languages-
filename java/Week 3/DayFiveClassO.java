class DayFiveClassO{
    public static void main(String []args){
        /*String s1="Sachin";
        String s2="Sachin";
        if(s1.compareTo(s2)>0){
            System.out.println("STring 1 is greater");
        }
        else if(s1.compareTo(s2)<0){
            System.out.println("String 2 is greater");
        }
        else{
            System.out.println("Both are Equl");
        }
    }*/
    /*String s1=new String("Omkar");
    String s2=s1.intern();
    String s3="Omkar";
    if(s2==s3){
        System.out.println("Reference are Equal");
    }
    else{
        System.out.println("Refence are Uequal");
    }*/
        String s="Kodnest Technologies";
        System.out.println(s);
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.contains("Tech"));
        System.out.println(s.contains("Non"));
        System.out.println(s.indexOf("d"));
        System.out.println(s.charAt(6));
        System.out.println(s.substring(7));
    }
}