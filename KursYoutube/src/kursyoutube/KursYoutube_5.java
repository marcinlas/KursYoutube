
package kursyoutube;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class KursYoutube_5 
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Kalkulator");  // tworzenie okienka
        frame.setSize(250, 350);    // szerokość i wysokość okienka w pixelach
        frame.setLocation(300,300);  // pojawienie się 300pix od góry i dołu
        frame.setResizable(false); // nie rozszerzanie się okna
        frame.setLayout(null);  // sami ustawimy w którym miejscu co ma być
        
        JTextField tf = new JTextField("");  // tworzenie miejsca działań
        tf.setBounds(10, 10, 230, 50); // ustawienie w odpowiednim miejscu
        frame.add(tf); // dodanie do frame i nazwa textfield'u
        
        frame.setVisible(true); // wyświetlanie okienka programu
        
    }
    
}
