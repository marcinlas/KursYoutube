
package kursyoutube;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
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
        Font f = new Font("New Times Roman",Font.BOLD,24); //tworzenie czcionki, typ, pogrubienie, rozmiar
        tf.setFont(f);
        tf.setHorizontalAlignment(JTextField.RIGHT); //wpisywanie od prawej strony
        frame.add(tf); // dodanie do frame i nazwa textfield'u
        
        JButton button = new JButton("1"); // dodanie przycisku o nazwie JButton
        button.setBounds(10, 70, 40, 40);
        button.setBorder(null);  // na przycisku pojawia się liczba " 1 "
        frame.add(button);  // dodawanie przycisku
        
        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
                
            }
        });
        
        frame.setVisible(true); // wyświetlanie okienka programu
        
    }
    
}
