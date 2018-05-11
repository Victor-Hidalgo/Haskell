import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.SwingConstants.*;

public class SecondFrame extends JFrame{
    
    JLabel power;
    double sales;
    JButton reseta;
    JLabel[] low;
    int[] stars;
    
    public SecondFrame(double j , JLabel[] will, int[] values){
        
        sales = j;
        setLayout(null);
        power = new JLabel("Total sales = " + sales);
        reseta = new JButton("Reset stock");
        low = will;
        stars = values;
        add(power);
        add(reseta);
        power.setBounds(20, 30, 150, 25);
        reseta.setBounds(20, 50, 150, 25);
        reseta.addActionListener(new SecondClick(reseta, sales, power, low, stars));
    }
}
