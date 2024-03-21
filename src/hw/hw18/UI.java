package hw.hw18;

import java.util.Locale;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI extends JFrame implements ActionListener {
    private Task task;
    private Task1 task1;
    private JButton b = new JButton("▷");
    private JButton b1 = new JButton("□");
    private JLabel label = new JLabel("0");



    private JButton b2 = new JButton("▷");
    private JButton b3 = new JButton("□");
    private JTextField label1 = new JTextField("");

    UI() {
        setLayout(null);
        setSize(500, 500);

        //0

        label.setBounds(50, 50, 100, 100);
        label.setFont(new Font("Arial", Font.PLAIN, 20));

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (task == null || !task.isAlive()) {//згенерував чатгпт, я зрозумів як воно працюе
                    task = new Task();
                    task.start();
                }
            }
        });
        add(b);
        b.setBounds(200, 50, 100, 100);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (task != null && task.isAlive()) {
                    task.interrupt();
                }
            }
        });
        add(b1);
        b1.setBounds(300, 50, 100, 100);
        add(label);

        //1

        label1.setBounds(25, 235, 150, 30);
        label1.setFont(new Font("Arial", Font.PLAIN, 20));

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {//згенерував чатгпт, я зрозумів як воно працюе
                if (task1 == null || !task1.isAlive()) {
                    task1 = new Task1();
                    task1.start();
                }
            }
        });
        add(b2);
        b2.setBounds(200, 200, 100, 100);

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (task1 != null && task1.isAlive()) {
                    task1.interrupt();
                }
            }
        });
        add(b3);
        b3.setBounds(300, 200, 100, 100);

        add(label1);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    class Task extends Thread {
        @Override
        public void run() {
            for (double i = 0; i < 15; i+=0.1) {
                if (Thread.interrupted()) {
                    return;
                }
                String formattedValue = String.format(Locale.US, "%.1f", i);//згенерував чатгпт, я зрозумів як воно працюе
                label.setText(formattedValue);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    return;
                }
            }
        }
    }
    class Task1 extends Thread {
        @Override
        public void run() {
            for (double i = Integer.parseInt(label1.getText()); i > 0; i-=0.1) {
                if (Thread.interrupted()) {
                    return;
                }
                String formattedValue = String.format(Locale.US, "%.1f", i);//згенерував чатгпт, я зрозумів як воно працюе
                label1.setText(formattedValue);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    return;
                }
            }
        }
    }
}