
package kursyoutube;

public class KursYoutube_9 
{
    public static void main(String[] args)
    {
        for (int i=1; i<100;i++)
        {
            System.out.println(silnia(i));
        }
    }
    public static long silnia(long liczba)
    {
        long wynik = 1;
        while (liczba > 1) 
        {
            wynik *= liczba;
            liczba--;
        }
        return wynik;
    }
    
}
