package magic.counter;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends JPanel {
    Image op1 = Toolkit.getDefaultToolkit().getImage("op.png");
    Image ned = Toolkit.getDefaultToolkit().getImage("ned.png");
    
    ImageIcon op = new ImageIcon(op1);
    ImageIcon ned1 = new ImageIcon(ned);
    
    JButton up = new JButton();
    JButton down = new JButton();
    
    int tæller = 20;
    
public void init(){
    
    add(up);
    add (down);
    up.setLocation(75,10);
    up.setBorder(BorderFactory.createEmptyBorder());
    up.setContentAreaFilled(false);
    up.setIcon(op);
    
    
    
    up.addActionListener(new ActionListener() {
         
         public void actionPerformed(ActionEvent e)
         {
             //Execute when button is pressed
             tæller++;
             repaint();            
         }
    });
    
    
    down.setLocation(75, 150);
    down.setBorder(BorderFactory.createEmptyBorder());
    down.setContentAreaFilled(false);
    down.setIcon(ned1);
    

    up.addActionListener(new ActionListener() {
         
         public void actionPerformed(ActionEvent e)
         {
             //Execute when button is pressed
             tæller--;
             repaint();            
         }
    });     
    
    }
    
public void paintComponent(Graphics g){
    g.drawString(""+tæller+"", 125, 125);          
}
    
}
