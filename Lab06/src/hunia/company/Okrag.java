package hunia.company;


public class Okrag extends Punkt
{
    double promien;
    Punkt srodek;

    public Okrag()
    {
        this.srodek = new Punkt(0,0);
        this.promien = getPromien();
    }


    public double getPromien() {
        return promien;
    }

    public void setPromien(double promien) {
        this.promien = promien;
    }

    public double getPowierzchnia()
    {
        return Math.PI*Math.pow(promien,2);
    }
    public double getSrednica()
    {
        return promien*2;
    }
    public boolean wSrodku(Punkt pk1)
    {
        return Math.pow((pk1.getX()-srodek.x),2)+Math.pow((pk1.getY()-srodek.y),2)>=Math.pow(promien,2);
    }

}
