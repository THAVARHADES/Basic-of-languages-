import java.util.*; 
class login{
        Scanner sc;
        //Scanner sc=new Scanner(System.in);
        String ur,pass;
        public void Login(Scanner sc){
            this.sc=sc;
            insertData();
        }
        public void insertData(){
            System.out.println("Enter USername");
                ur=sc.nextLine();
            
            System.out.println("Enter the password");
                pass=sc.nextLine();
                validation();
        }
        public void validation(){
            if(ur.equals("admin")){
                if(pass.equals("passqord")){
                    System.out.println("Succesfully login website");
                }
                else{
                    System.out.println("Wrong password please try again");
                }
            }
            else{
                System.out.println("Wrong password please try again");
            }
        }
}
class login_test{
    public static void main(String []args){
        Scannner sc=new Scanner(System.in);
        Login l =new Login();
    }
}