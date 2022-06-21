package Lab11;
import java.io.*;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        String path1 = "Zad1.txt";
        File plik1 = new File(path1);
        System.out.println("Sciezka: " + path1);
        PrintWriter zapis = new PrintWriter(path1);
        String tekst;
        System.out.println("Podaj tekst albo zakoncz wpisujac - ");
        do {
            tekst = input.nextLine();
            if (!tekst.equals("-")) {
                zapis.println(tekst);
            }
        } while (!tekst.equals("-"));
        zapis.close();
        String path2 = "Zad2.txt";
        File plik2 = new File(path2);
        Scanner in2 = new Scanner(plik2);
        int counter = 0;
        while(in2.hasNextLine()) {
            String zdanie = in2.nextLine();
            System.out.println(zdanie);
            counter++;
        }
        System.out.println("plik posiada " + counter + " linii.");
        String path3 = "Zad3.txt";
        int dzien, miesiac, rok;
        System.out.print("dzien: ");
        dzien = input.nextInt();
        System.out.print("miesiac: ");
        miesiac = input.nextInt();
        System.out.print("rok: ");
        rok = input.nextInt();
        DataOutputStream output = null;
        try {
            output = new DataOutputStream(new FileOutputStream(path3));
            output.writeInt(dzien);
            output.writeInt(miesiac);
            output.writeInt(rok);
        } catch (IOException e) {
            System.out.println("wyjatek");
        } finally {
            if (output != null) {
                output.close();
            }
        }

}
