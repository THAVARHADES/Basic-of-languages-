class Teacher{
    public void teach(){
        System.out.println("Teacher is Teaching");
    }
}
class PhysicsTeacher extends Teacher{
    public void teach(){
        System.out.println("Physics teacher is teaching physics");
    }
}
class ChemistryTeacher extends Teacher{
    public void teach(){
        System.out.println("Chemistry Teacher is teaching chemistry");
    }
}
class BiologyTeacher extends Teacher{
    public void teach(){
        System.out.println("Biology teacher is teaching biology");
    }
}
class Class45 {
    public static void main(String []args){
        Teacher ref;
        PhysicsTeacher pt=new PhysicsTeacher();
        ref=pt;
        ref.teach();
        ChemistryTeacher ct=new ChemistryTeacher();
        ref=ct;
        ref.teach();
        BiologyTeacher bt=new BiologyTeacher();
        ref=bt;
        ref.teach();
    }
}
