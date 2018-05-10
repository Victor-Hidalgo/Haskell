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
    double j = 0;
    static double sum = 0;
    
    public Click(JButton[] items, JLabel[] stock, int[] amounts, JButton vendor, double[] costs){
        
        will = stock;
        stop = items;
        values = amounts;
        info = vendor;
        money = costs;
    }
    
    public Click() {
        
      sum = 0;  
    }
    
    public void actionPerformed(ActionEvent e){
        
        int i = 0;
        
        while(i < stop.length){
            
            if (e.getSource() == stop[i]){
                
                if(values[i]==0){
                    
                    JOptionPane.showMessageDialog(null, "There are none left");
                }
                
                else{
                
                    values[i] = values[i] - 1;
                    j = money[i];
                    System.out.println("firing j: " + j);
                }
                
                will[i].setText(values[i] + " left");
            }
            
            i++;
        }
        
        i = 0;
        
        sum = sum + j;
        System.out.println("sum: " + sum);
        
        if(e.getSource() == info){
            
            SecondFrame fr = new SecondFrame(sum);
            fr.setTitle("Information");
            fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            fr.setBounds(200, 170, 350 , 150);
            fr.setVisible(true);
        }
    }
}
