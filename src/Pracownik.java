import java.lang.Math;

public class Pracownik implements PracownikI {
    @Override
    public void zwolnij(){
        System.out.println("ale za co? ;(");
    }
    @Override
    public void dajPodwyżkę(){
        System.out.println("tak mało!? inflacja juz ponad 10%!!");
    }
    
    @Override
    public void losujOchrzan(){
        String[] ochrzany ={"ty głąbie", "ty kretynie", "ty pajacu"};

        double randomNum = Math.random();
        int idx;
        if(randomNum < 0.33){
            idx =0;
        }else if (randomNum < 0.66){

            idx =1;
        }else{
            idx =2;
        }
        System.out.println(ochrzany[idx]);
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
        return "nadpisany string dla pracownika";
    }
}
