public class Student implements StudentI{

    @Override
    public void oblej(){
        System.out.println("NIGDY!");
    }

    @Override
    public void przepusc(){
        System.out.println("ZAWSZE!");
    }

    @Override
    public void losujCzyPrzepuscic(){
        this.przepusc();
    }

    @Override
    public void zabij(){
        System.out.println("martwy!");
    }

    @Override
    public void okalecz(){
        System.out.println("ała!!");
    }


    @Override
    public String toString(){
        return "nadpisany string dla studenta";
    }
    
}
