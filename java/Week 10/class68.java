/*class Producer extends Thread{
    Factory ref;
    public Producer(Factory ref){
        this.ref=ref;
    }
    public void run(){
        int j=0;
        while(true){
            ref.put(++j);
        }
    }
}
class Factory{
    int x;
    public void put(int i){
        x=i;    
        System.out.print("I have put"+i+"In Factory");
    }
    public void get(){
        System.out.println("I have taken"+x+"From Factory");
    }
}
class Consumer extends Thread{
    Factory ref;
    public Consumer(Factory ref){
        this.ref=ref;
    }
    public void run(){
        while(true){
            ref.get();
        }
    }
}
class class68{
    public static void main(String []args){
        Factory f=new Factory();
        new Producer(f).start();
        new Consumer(f).start();
    }
}
*/
class Producer extends Thread{
    Factory ref;
    public Producer(Factory ref){
        this.ref=ref;
    }
    public void run(){
        int j=0;
        while(true){
            ref.put(++j);
        }
    }
}
class Factory{
    int x;
    boolean producerornot=false;
    synchronized public void put(int i){
        try {
            if(producerornot ==true){
                System.out.println("I have put"+i+"In Factory");
                producerornot=true;
                notify();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    synchronized public void get(){
        try{
            if(producerornot==false){
                wait();
            }
            System.out.print("I have taken"+x+"from factory");
            producerornot=false;
            notify();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
class Consumer extends Thread{
    Factory ref;
    public Consumer(Factory ref){
        this.ref=ref;
    }
    public void run(){
        while(true){
            ref.get();
        }
    }
}
class class68{
    public static void main(String []args){
        Factory f=new Factory();
        new Producer(f).start();
        new Consumer(f).start();
    }
}