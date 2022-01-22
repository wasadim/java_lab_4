/* zad.3
a) w klasie Main stworzyć 2 objekty typu Dom deklarując pierwszy objekt Typem Dom,
drugi objekt typem Budynek,
b) wykorzystać wszystkie metody do implementacji pól
c) wyświetlić w konsoli metodę toString (na obu objektach) opisującą zachowanie klasy Dom
*/
public class Main {

    public static void main(String[] args) {

        Dom dom1 = new Dom();
        Budynek dom2 = new Dom();

        dom1.powierzchnia(5.0);
        dom1.adresBudynku("ul. Śliska nr: zjechał");
        dom1.liczbaOkien(6);
        dom1.liczbaMieszkancow(6);
        dom1.kolorDomu(KolorEnum.czarny);

        
        dom2.powierzchnia(10.0);
        dom2.adresBudynku("ul. groźna nr: uciekł");
        dom2.liczbaOkien(2137);
        dom2.liczbaMieszkancow(420);
        dom2.kolorDomu(KolorEnum.czerwony);
        
        System.out.println(dom1.toString());
        System.out.println(dom2.toString());
    }
}