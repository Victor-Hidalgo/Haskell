import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Click implements ActionListener{
    
    JLabel[] will;
    JButton[] stop;
    int[] values;
    
    public Click(JButton[] items, JLabel[] stock, int[] amounts){
        
        will = stock;
        stop = items;
        values = amounts;
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
    }
}
