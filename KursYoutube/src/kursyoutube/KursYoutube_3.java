
package kursyoutube;

import java.util.Scanner;

public class KursYoutube_3 
{
    public static void main (String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Napisz coś: ");
        String str = s.nextLine();
        System.out.println("W konsoli napisano: " + str);
        
        System.out.println("Napisz ile masz lat: ");
        
        try   // sprawdza czy wykona się warunek, tutaj czy podano liczbę całkowitą !!!
        {    
            int wiek = s.nextInt();
            System.out.println("Masz " + wiek + " lat!");
        }
        catch(Exception e)   // jeśli nie będzie podana liczba całkowita wyświetli się tekst
        {
            System.out.println("Podano złą wartość! Wymagana liczba całkowita");
        }       
                
    }
}  
