import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import static javax.swing.SwingConstants.*;

public class SecondClick implements ActionListener{
        
    double man;
    JButton again;
    JLabel por;
    JLabel[] wea;
    int[] numbers;
    int k = 0;
    
    public SecondClick(JButton reseta, double sales, JLabel power, JLabel[] low, int[] stars){
        
        man = sales;
        again = reseta;
        por = power;
        wea = low;
        numbers = stars;
    }
    
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource() == again){

            man = 0;
            por.setText("Total sales = " + man);
            
            while(k<9){
                
                wea[k].setText("4 left");
                numbers[k] = 4;
                k++;
            }
            
            k = 0;
        }
    }
}