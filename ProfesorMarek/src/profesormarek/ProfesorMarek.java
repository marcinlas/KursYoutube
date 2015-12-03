
package profesormarek;

import java.util.ArrayList;
import java.util.Comparator;

public class ProfesorMarek {

    public static void main(String[] args) 
    {
        //Tablice nie mają metod
        String[] tablicaStringow = {"Ula", "Aleksandra", "Iza", "Natalia"};
        System.out.println(tablicaStringow[0]);
        
        ArrayList<String> kontenerStringow = new ArrayList<>();
        //kontener -> służy do modyfikowania 
        kontenerStringow.add("Marek");
        kontenerStringow.add("Kasia");
        kontenerStringow.add("Tomek");
        kontenerStringow.add("Piotr");
        kontenerStringow.add("Alina");
        kontenerStringow.add("Aaron");
        
        ArrayList<String> kolekcja = new ArrayList<>();
        kolekcja.add("Michał");
        kolekcja.add("Paweł");
        
        //Sprawdza, na którym miejscu jest dany element
        System.out.println(kontenerStringow.indexOf("Marek")); 
        
        //Sprawdza, czy dany element istnieje na liście
        System.out.println(kontenerStringow.contains("Henryk")); 
        
        //Usuwa obiekt (jeśli nie znamy jego indeksu). 
        //Brak obiektu zaznacza jako -1
        kontenerStringow.remove("Marek");
        System.out.println(kontenerStringow.indexOf("Marek")); 
        
        //Usuwa obiekt z danego indeksu
        kontenerStringow.remove(0);
        
        //Metoda get(int) pozyskuje obiekt z danej pozycji
        System.out.println(kontenerStringow.get(0)); 
        
        //Metoda sort(Comparator) porównuje elementy w kolekcji
        kontenerStringow.sort(Comparator.naturalOrder());       
        System.out.println(kontenerStringow.get(0)); 
        
        kontenerStringow.addAll(kolekcja);
        
        System.out.println();
        for(int i = 0; i < kontenerStringow.size(); i++){
            System.out.print(kontenerStringow.get(i) + ", ");
        }
        
        
        
    }
    
}
