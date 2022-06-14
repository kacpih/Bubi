package hunia.company;

import java.util.Objects;

public class Uczestnicy
{
    int ID,wiek;
    String imie;

    public Uczestnicy(int ID, int wiek, String imie)
    {
        this.ID = ID;
        this.wiek = wiek;
        this.imie = imie;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Uczestnicy that = (Uczestnicy) o;
        return ID == that.ID && wiek == that.wiek && imie.equals(that.imie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, wiek, imie);
    }
}
