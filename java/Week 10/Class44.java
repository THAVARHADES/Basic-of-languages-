/*class Teacher{
    public void takeAttendance(){
        System.out.println("teacher is taking attendecne");
    }
    public void teach(){
        System.out.println("Teacher is teaching");
    }
}
class PhysicsTeacher extends Teacher{
    public void teach(){
        System.out.println("Physica teacher is teaching");
    }
    public void doExpo(){
        System.out.println("Physics teacher is doing laws experiment");
    }
}
class ChemistryTeacher extends Teacher{
    public void teach(){
        System.out.println("Chemistry teacher is teaching Chemistry");
    }
    public void doExpo(){
        System.out.println("Chemsitry teacher is teaching Chemistry Experiment");
    }
}
class  Class44 {
    public static void main(String []args){
        Teacher t=new Teacher();
        t.takeAttendance();
        t.teach();
        PhysicsTeacher pt=new PhysicsTeacher();
        pt.takeAttendance();
        pt.teach();
        pt.doExpo();
        ChemistryTeacher ct=new ChemistryTeacher();
        ct.takeAttendance();
        ct.teach();
        ct.doExpo();
    }
}*/
class Plane{
    public void takeoff(){
        System.out.println("Plane is taking off");
    }
    public void fly(){
        System.out.println("Plane is flying");
    }
    public void land(){
        System.out.println("Plane is landing");
    }
}
class CarryPlane extends Plane{
    public void fly(){
        System.out.println("cp is flying slowly");
    }
    public void land(){
        System.out.println("cp is laniding as huge runway");
    }
    public void carrycargo(){
        System.out.println("CP is carrryingcargo");
    }
}
class PassangerPlane extends Plane{
    public void fly(){
        System.out.println("PP us kanding is medi;um leanring ");
    }
    public void passanger(){
        System.out.println("pp is carrying passanges");
    }
}
class FighterPlane extends Plane{
    public void fly(){
        System.out.println("fp is flying very fast");
    }
    public void land(){
        System.out.println("pp is landing small runway");
    }
    public void carryweapons(){
        System.out.println("fp is carrying weapons");
    }
}
class Class44{
    public static void main(String []args){
        Plane p=new Plane();
        p.takeoff();
        p.fly();
        p.land();
        CarryPlane cp=new CarryPlane();
        cp.takeoff();
        cp.fly();
        cp.land();
        cp.carrycargo();
        PassangerPlane pp=new PassangerPlane();
        pp.takeoff();
        pp.fly();
        pp.land();
        pp.passanger();
        FighterPlane fp=new FighterPlane();
        fp.takeoff();
        fp.fly();
        fp.land();
        fp.carryweapons();
    }
}