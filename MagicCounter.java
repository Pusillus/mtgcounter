package magic.counter;

import javax.swing.*;

public class MagicCounter {

    public static void main(String[] args) {
        JFrame Vindue = new JFrame("MTG counter");
        Vindue.add( new GUI());
        Vindue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Vindue.setSize(625,300);
        Vindue.setVisible(true);
    }
}
