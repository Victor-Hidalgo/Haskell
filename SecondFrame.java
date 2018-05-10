import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class SecondFrame extends JFrame{
    
    JLabel power;
    
    public SecondFrame(){
        
        setLayout(null);
        power = new JLabel("Total sales");
        add(power);
        power.setBounds(100, 50, 230, 25);
    }
}