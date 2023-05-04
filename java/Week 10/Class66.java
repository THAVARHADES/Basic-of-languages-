/*class MsExcel extends Thread{
    public void typing(){
        try{
            for(int i=0;i<=4;i++){
                System.out.println("Typing...");
                Thread.sleep(5000);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public void spellcheck(){
        try{
            for(int i=0;i<=4;i++){
                System.out.println("Spelling Check...");
                Thread.sleep(5000);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public void run(){
        if(getName().equals("Type")){
            typing();
        }
        else if(getName().equals("Spell")){
            spellcheck();
        }
        else{
            autosave();
        }
    }
    
    public void autosave(){
        try{
            for(int i=0;i<=4;i++){
                System.out.println("autosaving...");
                Thread.sleep(5000);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
class Class66 {
    public static void main(String []args){
        try{
            MsExcel t1=new MsExcel();
            MsExcel t2=new MsExcel();
            MsExcel t3=new MsExcel();
            t1.setName("Type");
            t2.setName("Spell");
            t3.setName("Save");
            t1.start();
            t2.start();
            t3.start();
        }
        catch(Exception e){  
            e.printStackTrace();
        }
    }
}*/
