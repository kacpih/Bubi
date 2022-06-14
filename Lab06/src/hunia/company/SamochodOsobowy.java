package hunia.company;

import java.util.Scanner;

public class SamochodOsobowy extends Samochod
{
    int waga,pojemnosc,osoby;

    public SamochodOsobowy(int waga, int pojemnosc, int osoby) {
        this.waga = waga;
        this.pojemnosc = pojemnosc;
        this.osoby = osoby;
    }

    public int getWaga()
    {
        return waga;
    }

    public void setWaga(int waga)
    {
        if (waga >= 2 && waga <=4)
        {
            this.waga = waga;
        }
    }

    @Override
    public void wyswietl() {
        super.wyswietl();
        System.out.println(waga);
        System.out.println(pojemnosc);
        System.out.println(osoby);
    }
}
