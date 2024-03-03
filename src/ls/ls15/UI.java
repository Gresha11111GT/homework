package ls.ls15;

import hw.hw12.hw12_2.Circle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI extends JFrame implements ActionListener {

    private JLabel text = new JLabel("0");
    UI(){
        setSize(700,500);
        setLayout(new FlowLayout());
        JPanel botElements = new JPanel();

        JButton b1 = new JButton("1");
        b1.setPreferredSize(new Dimension(50, 50));
        botElements.add(b1);

        JButton b2 = new JButton("2");
        botElements.add(b2);

        JButton b3 = new JButton("3");
        botElements.add(b3);

        JButton b4 = new JButton("4");
        add(b4);

        JButton b5 = new JButton("5");
        add(b5);

        JButton b6 = new JButton("6");
        add(b6);

        JButton b7 = new JButton("7");
        add(b7);

        JButton b8 = new JButton("8");
        add(b8);

        JButton b9 = new JButton("9");
        add(b9);

        JButton b10 = new JButton("+");
        add(b10);

        JButton b11 = new JButton("*");
        add(b11);

        JButton b12 = new JButton("÷");
        add(b12);

        JButton b13 = new JButton("=");
        add(b13);

        JButton b14 = new JButton("⌦");
        add(b14);
        add(botElements);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);

        setVisible(true);
        add(text);
    }

    String num1;
    String sign;
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton) e.getSource();
        if(text.getText().equals("0"))
            text.setText("");

        switch (b.getText()){
            case "1":
                text.setText(text.getText()+"1");
                break;
            case "2":
                text.setText(text.getText()+"2");
                break;
            case "3":
                text.setText(text.getText()+"3");
                break;
            case "4":
                text.setText(text.getText()+"4");
                break;
            case "5":
                text.setText(text.getText()+"5");
                break;
            case "6":
                text.setText(text.getText()+"6");
                break;
            case "7":
                text.setText(text.getText()+"7");
                break;
            case "8":
                text.setText(text.getText()+"8");
                break;
            case "9":
                text.setText(text.getText()+"9");
                break;
            case "⌦":
                text.setText("0");
                break;
            case "÷":
                num1= text.getText();
                sign = "÷";
                text.setText("");
                break;
            case "*":
                num1= text.getText();
                sign = "*";
                text.setText("");
                break;
            case "+":
                num1= text.getText();
                sign = "+";
                text.setText("");
                break;
            case "-":
                num1= text.getText();
                sign = "-";
                text.setText("⌦");
                break;
            case "=":
                String num2 = text.getText();
                int result = 0;
                switch (sign){
                    case "+":
                        result = Integer.valueOf(num1)+Integer.valueOf(num2);
                        break;
                    case "-":
                        result = Integer.valueOf(num1)-Integer.valueOf(num2);
                        break;
                    case "*":
                        result = Integer.valueOf(num1)*Integer.valueOf(num2);
                        break;
                    case "÷":
                        result = Integer.valueOf(num1)/Integer.valueOf(num2);
                        break;
                }
                text.setText(String.valueOf(result));
                break;
        }
    }
}
