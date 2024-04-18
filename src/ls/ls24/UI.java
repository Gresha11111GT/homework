package ls.ls24;

import javax.swing.*;
import java.awt.*;

public class UI extends JFrame {
    Controller c ;
    UI(Controller c){
        this.c=c;
        setTitle("");
        setSize(700, 700);
        setLayout(new FlowLayout());
        Button b1 = new Button("aboba");
        Button b2 = new Button("aboba");
        b1.setBounds(10, 10, 50, 50);
        b2.setBounds(70, 10, 50, 50);
        add(b1);
        add(b2);
        setVisible(true);
    }
}