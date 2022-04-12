import java.util.Scanner;

public class Main
{


    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Prostokat p1 = new Prostokat();
        p1.x=3;
        p1.y=4;

        p1.obwod();
        p1.pole();
        p1.przekatna();



        Budynek b1 = new Budynek();
        b1.nazwa=scanner.next();
        b1.pietra= scanner.nextInt();
        b1.rok= scanner.nextInt();

        Budynek b2 = new Budynek();
        b2.nazwa=scanner.next();
        b2.pietra= scanner.nextInt();
        b2.rok= scanner.nextInt();

        Budynek b3 = new Budynek();
        b3.nazwa=scanner.next();
        b3.pietra= scanner.nextInt();
        b3.rok= scanner.nextInt();

        b1.informacje();
        b1.wiek();

        b2.informacje();
        b2.wiek();

        b3.informacje();
        b3.wiek();

    }
}
