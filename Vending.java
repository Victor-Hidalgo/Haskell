import java.util.*;
import javax.swing.*;
import static javax.swing.SwingConstants.*;

public class Vending extends JFrame{
    
    public Vending() {
        
        setLayout(null);
        
        double costs[] = new double[9];
        costs[0] = 1.30;
        costs[1] = 1.00;
        costs[2] = 0.80;
        costs[3] = 1.30;
        costs[4] = 1.00;
        costs[5] = 0.80;
        costs[6] = 1.30;
        costs[7] = 1.00;
        costs[8] = 0.80;
        
        JLabel[] stock = new JLabel[9];
        
        JButton[] items = new JButton[9];
        items[0] = new JButton("Chocolate Jigglypuffs (£1.30)");
        items[1] = new JButton("Chocolate Bombs (£1.00)");
        items[2] = new JButton("Chocolate Twists (£.80)");
        items[3] = new JButton("Caramel Jigglypuffs (£1.30)");
        items[4] = new JButton("Caramel Bombs (£1.00)");
        items[5] = new JButton("Caramel Twists (£.80)");
        items[6] = new JButton("French Vanilla Jigglypuffs (£1.30)");
        items[7] = new JButton("French Vanilla Bombs (£1.00)");
        items[8] = new JButton("French Vanilla Twists (£.80)");
        
        int i = 0;
        
        while(i<9){
            
            add(items[i]);
            i++;
        }
        
        i = 0;
        int[] amounts = new int[9];
        
        while(i<9){
            
            stock[i] = new JLabel("4 left");
            add(stock[i]);
            amounts [i] = 4;
            
            i++;
        }
        
        items[0].setBounds(10, 20, 220, 25);
        items[1].setBounds(380, 20, 210, 25);
        items[2].setBounds(740, 20, 210, 25);
        stock[0].setBounds(100, 50, 230, 25);
        stock[1].setBounds(475, 50, 230, 25);
        stock[2].setBounds(850, 50, 230, 25);
        items[3].setBounds(10, 100, 220, 25);
        items[4].setBounds(380, 100, 210, 25);
        items[5].setBounds(740, 100, 220, 25);
        stock[3].setBounds(100, 130, 230, 25);
        stock[4].setBounds(475, 130, 230, 25);
        stock[5].setBounds(850, 130, 230, 25);
        items[6].setBounds(10, 180, 220, 25);
        items[7].setBounds(380, 180, 210, 25);
        items[8].setBounds(740, 180, 220, 25);
        stock[6].setBounds(100, 210, 230, 25);
        stock[7].setBounds(475, 210, 230, 25);
        stock[8].setBounds(850, 210, 230, 25);
        
        i = 0;
        
        while(i<9){
        
            items[i].addActionListener(new Click(items, stock, amounts));
            i++;
        
        }
    }
    
    public static void main(String[] args){
        
        Vending frame = new Vending();
        frame.setTitle("TwistyJigglyBomb surprises");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 170, 1000 , 500);
        frame.setVisible(true);
    }
}
