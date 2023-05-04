/*class TextBook{
    int pageno;
}
class DayFiClassTh{
    public static void main(String []args){
        TextBook s=new TextBook();
        s.pageno=100;
        System.out.println(s.pageno);
    }
}*/
class TextBook{
    private
    int pageno;
    public void setPageno(int x){
        if(x>0){
            pageno=x;
        }
        else{
            System.out.println("Invalid page number");
        }
    }
    public int getPageno(){
        return pageno;
    }
}
class Day5Class3{
    public static void main(String []args){
        TextBook tb=new TextBook();
        tb.setPageno(100);
        System.out.println(tb.getPageno());
    }
}