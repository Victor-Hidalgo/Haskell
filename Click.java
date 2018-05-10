import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Click implements ActionListener{
    
    JLabel[] will;
    JButton[] stop;
    int[] values;
    JButton info;
    double[] money;
    double j;
    double sucia;
    
    public Click(JButton[] items, JLabel[] stock, int[] amounts, JButton vendor, double[] costs){
        
        will = stock;
        stop = items;
        values = amounts;
        info = vendor;
        money = costs;
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
                    j = j + money[i];
                }
                
                will[i].setText(values[i] + " left");
            }
            
            i++;
        }
        
        i = 0;
        
        sucia = sucia + j;
        
        if(e.getSource() == info){
            
            SecondFrame fr = new SecondFrame(sucia);
            fr.setTitle("Miralo ahi");
            fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            fr.setBounds(200, 170, 350 , 150);
            fr.setVisible(true);
        }
    }
}
