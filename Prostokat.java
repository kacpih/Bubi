public class Prostokat
{
    int x;
    int y;
    

    public void obwod()
    {
        System.out.println((2*x)+(2*y));
    }
    public void pole()
    {
        double pole=(x*y)/2;
        System.out.println(pole);
    }

    public void przekatna()
    {
        double przekatna;
        przekatna=Math.sqrt((x*x)+(y*y));
        System.out.println(przekatna);
    }

}
