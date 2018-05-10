import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Click implements ActionListener{
    
    JLabel[] will;
    JButton[] stop;
    int[] values;
    JButton info;
    
    public Click(JButton[] items, JLabel[] stock, int[] amounts, JButton vendor){
        
        will = stock;
        stop = items;
        values = amounts;
        info = vendor;
    }
    
    public void actionPerformed(ActionEvent e){
        
        int i = 0;
        
        while(i < stop.length){
            
            if (e.getSource() == stop[i]){
                
                if(values[i]==0){
                    
                    JOptionPane.showMessageDialog(null, "You don't know da wae");
                }
                
                else{
                
                    values[i] = values[i] - 1;
                    
                }
                
                will[i].setText(values[i] + " left");
            }
            
            i++;
        }
        
        i = 0;
        
        if(e.getSource() == info){
            
            SecondFrame fr = new SecondFrame();
            fr.setTitle("Miralo ahi");
            fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            fr.setBounds(200, 170, 500 , 250);
            fr.setVisible(true);
        }
    }
}
