class PrimeMinster{
    static PrimeMinster pm=null;
    private PrimeMinster(){

    }
    static public PrimeMinster getObject(){
        if(pm==null){
            pm=new PrimeMinster();
            return pm;
        }
        else{
            return pm;
        }
    }
}
class Day5Class5{
    public static void main(String []args){
        PrimeMinster pm1=PrimeMinster.getObject();
        System.out.println(pm1);
        PrimeMinster pm2=PrimeMinster.getObject();
        System.out.println(pm2);
    }
}