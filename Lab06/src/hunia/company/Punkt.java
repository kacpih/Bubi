package hunia.company;

public class Punkt
{
     int x;
     int y;

    public Punkt()
    {
    }

    public Punkt(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    void zeruj()
    {
        x=0;
        y=0;
    }
        void opis()
    {
        System.out.println(x);
        System.out.println(y);
    }

    void przesun()
    {
        x=x+3;
        y=y+3;
    }
}
