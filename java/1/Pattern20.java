class Pattern20{
    public static void main(String []args){
        for(int i=0;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<=2*i;k++){
                System.out.print("7");
            }
            System.out.println("");
        }
    }
}