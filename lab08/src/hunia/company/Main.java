package hunia.company;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");

        try
        {
            int n = scanner.nextInt();
            if(n<=0)
            {

                throw new IllegalArgumentException("Podaj liczbe rozna od 0");
            }
            else
            {
                System.out.println("Wynik to: "+Math.sqrt(n));
            }
        }
         catch (InputMismatchException exception)
        {
            System.out.println("Podaj liczbe!!!"+exception);
        }

    }

    void silnia()
    {

    }

}