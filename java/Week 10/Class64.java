class Class64 {
    public static void main(String []args){
        Thread t=Thread.currentThread();
        System.out.println(t);
        t.setName("KODNEST");
        t.setPriority(7);
        System.out.println(t);
    }    
}