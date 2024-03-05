package ls.ls16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI extends JFrame implements ActionListener{

    private JButton b = new JButton("1");
    private int count = 50;

    UI(){
        setSize(500,700);
        setLayout(null);
        b.setBounds(50,50,100,50);
        add(b);
        b.addActionListener(this);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        count+=10;
        b.setBounds(count,50,100,50);
    }
}