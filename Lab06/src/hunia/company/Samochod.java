package hunia.company;

import java.util.Scanner;

public class Samochod
{
    Scanner scanner = new Scanner(System.in);

    String marka;
    String model;
    String nadwozie;
    String kolor;
    int rok;
    int przebieg;


    public Samochod()
    {
        this.marka = scanner.next() ;
        this.model = scanner.next() ;
        this.nadwozie = scanner.next() ;
        this.kolor = scanner.next() ;
        this.rok = scanner.nextInt();
        this.przebieg = scanner.nextInt();
    }

    public Samochod(String marka, String model, String nadwozie, String kolor, int rok, int przebieg) {
        this.marka = "marka";
        this.model = "model";
        this.nadwozie = "nadwozie";
        this.kolor = "kolor";
        this.rok = 1;
        this.przebieg = 1;
    }

    public void wyswietl()
    {
        System.out.println(marka);
        System.out.println(model);
        System.out.println(nadwozie);
        System.out.println(kolor);
        System.out.println(rok);
        System.out.println(przebieg);

    }
}
