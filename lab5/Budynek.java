import java.time.LocalDateTime;

public class Budynek
{
    String nazwa;
    int rok;
    int pietra;



    public void informacje()
    {

        System.out.println("Nazwa budynku: "+nazwa);
        System.out.println("Rok budowy: "+rok);
        System.out.println("Liczba pieter: "+pietra);
    }
    public void wiek()
    {
        System.out.println("Wiek budynku wynosi: "+(LocalDateTime.now().getYear()-rok));
    }
}
