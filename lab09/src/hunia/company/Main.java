package hunia.company;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        ArrayList<Uczestnicy> lista = new ArrayList<>();
        Uczestnicy czl1 = new Uczestnicy(1,10,"Kacper");
        Uczestnicy czl2 = new Uczestnicy(2,17,"Mikolaj");
        Uczestnicy czl3 = new Uczestnicy(3,17,"Piotrek");
        int i=0;
        lista.add(czl1);
        lista.add(czl2);
        lista.add(czl3);

        for(Uczestnicy k : lista)
        {

            if(k.wiek<18)
            {
                lista.remove(k.imie);
            }
            i++;
        }
        for(Uczestnicy e : lista)
        {
            System.out.println(e.imie);
        }
    }

}
