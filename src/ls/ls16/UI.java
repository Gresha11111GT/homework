package ls.ls16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class UI extends JFrame implements ActionListener, MouseMotionListener {
    private JButton b = new JButton("Purple");
    private JButton b1 = new JButton("Orange");
    private JButton b2 = new JButton("Red");
    private JButton b3 = new JButton("Del");
    private JButton thickButton = new JButton("Thicker");
    private JButton thinButton = new JButton("Thinner");
    private int oldX;
    private int oldY;
    private int thickness = 1;
    private int count;
    private Color color = Color.BLACK;

    UI(){
        setSize(700,1400);
        setLayout(null);

        b.setBounds(0,0,100,100);
        add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                color = Color.MAGENTA;
            }
        });

        b1.setBounds(100,0,100,100);
        add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                color = Color.ORANGE;
            }
        });

        b2.setBounds(200,0,100,100);
        add(b2);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                color = Color.RED;
            }
        });

        b3.setBounds(300,0,100,100);
        add(b3);
        b3.addActionListener(this);

        thickButton.setBounds(400, 0, 100, 50);
        add(thickButton);
        thickButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                thickness += 2;
            }
        });

        thinButton.setBounds(400, 50, 100, 50);
        add(thinButton);
        thinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                thickness = Math.max(1, thickness - 2);
            }
        });

        addMouseMotionListener(this);

        setVisible(true);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Graphics g = getGraphics();
        g.setColor(color);
        ((Graphics2D) g).setStroke(new BasicStroke(thickness));
        if (oldX != 0 && oldY!=0){
            g.drawLine(oldX,oldY,e.getX(),e.getY());
        }
        oldX = e.getX();
        oldY = e.getY();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        oldX = 0;
        oldY = 0;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        setSize(700,1401);
        setSize(700,1400);
    }

}