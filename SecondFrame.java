import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class SecondFrame extends JFrame{
    
    JLabel power;
    double sales;
    JButton reseta;
    
    public SecondFrame(double j){
        
        sales = j;
        setLayout(null);
        power = new JLabel("Total sales = " + sales);
        reseta = new JButton("Reset stock");
        add(power);
        add(reseta);
        power.setBounds(20, 30, 100, 25);
        reseta.setBounds(20, 50, 100, 25);
    }
}
