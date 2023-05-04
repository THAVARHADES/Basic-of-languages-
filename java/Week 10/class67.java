/*class Bathroom implements Runnable{
    public void run(){
        try{
            System.out.println(Thread.currentThread().getName()+" "+"is entering bathroom");
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName()+" "+"is using bathroom");
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName()+" "+"is exiting bathroom");
            Thread.sleep(5000);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
class class67{
    public static void main(String []args){
        try{
            Bathroom b=new Bathroom();
            Thread t1=new Thread(b);
            Thread t2=new Thread(b);
            Thread t3=new Thread(b);
            t1.setName("BOYS");
            t2.setName("Girls");
            t3.setName("Others");
            t1.start();
            t1.join();
            t2.start();
            t2.join();
            t3.start();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
*/
/*class Bathroom implements Runnable{
    synchronized public void run(){
        try {
            System.out.println(Thread.currentThread().getName()+"is entering Bathroom");
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName()+"is using Bathroom");
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName()+"is exiting Bathroom");
            Thread.sleep(5000);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
class class67{
    public static void main(String args[]){
        try{
            Bathroom b= new Bathroom();
            Thread t1=new Thread();
            Thread t2=new Thread();
            Thread t3=new Thread();
            t1.setName("Boys");
            t2.setName("Girls");
            t3.setName("Others");
            t1.start();
            t2.start();
            t3.start();
        }
        catch(Exception e){ 
            e.printStackTrace();
        }
    }
}*/
class worrior extends Thread{
    String res1="Satpastra";
    String res2="Garudastra";
    String res3="Pasupastra";
    public void run(){
        if(getName().equals("Karna")){
            karnacqResources();
        }
        else{
            arjunacqResources();
        }
    }
    public void karnacqResources(){
        try{
            Thread.sleep(2000);
            synchronized(res1){
                System.out.print("Karna acquired"+res1);
                Thread.sleep(2000);
                synchronized(res2){
                    System.out.println("karna aquired"+res2);
                    Thread.sleep(2000);
                    synchronized(res3){
                        System.out.println("karna aquired"+res3);
                        Thread.sleep(2000);
                    }
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public void arjunacqResources(){
        try{
            Thread.sleep(2000);
            synchronized(res1){
                System.out.print("arjun acquired"+res1);
                Thread.sleep(2000);
                synchronized(res2){
                    System.out.println("arjun aquired"+res2);
                    Thread.sleep(2000);
                    synchronized(res3){
                        System.out.println("arjun aquired"+res3);
                        Thread.sleep(2000);
                    }
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
class class67{
    public static void main(String []args){
        worrior w1=new worrior();
        worrior w2=new worrior();
        w1.setName("karna");
        w2.setName("arjuna");
        w1.start();
        w2.start();
    }
}