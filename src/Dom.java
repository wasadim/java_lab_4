/* zad.2
a) napisać klasę Dom implementującą interfejs Budynek,
b) zaimplementować wszystkie metody,
c) stworzyć brakujące pola(prywatne), gettery i settery, napisać metodę toString
(gettery i settery najlepiej wygenerować: Code/Prawy myszy --> Generate --> getters/setters/toString)
d) stworzyć jedną dowolną metodę przez siebie
*/
public class Dom implements Budynek {
    double powierzchnia;
    String adres;
    int ile_okien;
    int ile_mieszkancow;
    KolorEnum color;

    @Override
    public double powierzchnia(double pow){
        this.powierzchnia = pow;
        return pow;
    }

    @Override
    public String adresBudynku(String adres){
        this.adres = adres;
        return adres;
    }
    
    @Override
    public int liczbaOkien(int value){
        this.ile_okien = value;
        return value;
    }

    @Override
    public void liczbaMieszkancow(int value){
        this.ile_mieszkancow = value;
    }

    @Override
    public void kolorDomu(KolorEnum kolor){
        this.color = kolor;
    }
    
    @Override
    public void przemaluj(KolorEnum color, double powierzchnia){
        this.color = color;
        this.powierzchnia = powierzchnia;
    }

    public void setPowierzchnia(double powierzchnia){
        this.powierzchnia = powierzchnia;
    }
    
    public void setAdres(String adres){
        this.adres = adres;
    }
    
    public void setIleOkien(int ile_okien){
        this. ile_okien = ile_okien;
    }
    
    public void setIleMieszkancow(int ile_mieszkancow){
        this.ile_mieszkancow = ile_mieszkancow;
    }
    
    public void setColor(KolorEnum color){
        this.color = color;
    }


    public double getPowierzchnia(double powierzchnia){
        return this.powierzchnia;
    }
    
    public String getAdres(String adres){
        return this.adres;
    }
    
    public int getIleOkien(int ile_okien){
        return this.ile_okien;
    }
    
    public int getIleMieszkancow(int ile_mieszkancow){
        return this.ile_mieszkancow;
    }
    
    public KolorEnum getColor(KolorEnum color){
        return this.color;
    }
    
    @Override
    public String toString() {
        return "to jest " + this.color.toString() + " budynek.";
    }

}
