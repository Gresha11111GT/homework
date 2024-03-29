package hw.hw15;

import hw.hw12.hw12_2.Circle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI extends JFrame implements ActionListener {

    private JLabel text = new JLabel("0");
    UI(){
        text.setBounds(100, 0, 100, 100);
        text.setFont(new Font("Arial", Font.PLAIN, 32));

        setSize(600,700);
        setLayout(null);
        JPanel botElements = new JPanel();

        JButton b0 = new JButton("0");
        b0.setBounds(100,400 ,100 ,100);
        b0.setFont(new Font("Arial", Font.PLAIN, 32));
        add(b0);

        JButton b1 = new JButton("1");
        b1.setBounds(100,100 ,100 ,100);
        b1.setFont(new Font("Arial", Font.PLAIN, 32));
        add(b1);

        JButton b2 = new JButton("2");
        b2.setBounds(200,100 ,100 ,100);
        b2.setFont(new Font("Arial", Font.PLAIN, 32));
        add(b2);

        JButton b3 = new JButton("3");
        b3.setBounds(300,100 ,100 ,100);
        b3.setFont(new Font("Arial", Font.PLAIN, 32));
        add(b3);

        JButton b4 = new JButton("4");
        b4.setBounds(100,200 ,100 ,100);
        b4.setFont(new Font("Arial", Font.PLAIN, 32));
        add(b4);

        JButton b5 = new JButton("5");
        b5.setBounds(200,200 ,100 ,100);
        b5.setFont(new Font("Arial", Font.PLAIN, 32));
        add(b5);

        JButton b6 = new JButton("6");
        b6.setBounds(300,200 ,100 ,100);
        b6.setFont(new Font("Arial", Font.PLAIN, 32));
        add(b6);

        JButton b7 = new JButton("7");
        b7.setBounds(100,300 ,100 ,100);
        b7.setFont(new Font("Arial", Font.PLAIN, 32));
        add(b7);

        JButton b8 = new JButton("8");
        b8.setBounds(200,300 ,100 ,100);
        b8.setFont(new Font("Arial", Font.PLAIN, 32));
        add(b8);

        JButton b9 = new JButton("9");
        b9.setBounds(300,300 ,100 ,100);
        b9.setFont(new Font("Arial", Font.PLAIN, 32));
        add(b9);

        JButton b10 = new JButton("+");
        b10.setBounds(400,300 ,100 ,100);
        b10.setFont(new Font("Arial", Font.PLAIN, 32));
        add(b10);

        JButton b11 = new JButton("*");
        b11.setBounds(400,400 ,100 ,100);
        b11.setFont(new Font("Arial", Font.PLAIN, 32));
        add(b11);

        JButton b12 = new JButton("÷");
        b12.setBounds(300,400 ,100 ,100);
        b12.setFont(new Font("Arial", Font.PLAIN, 32));
        add(b12);

        JButton b13 = new JButton("=");
        b13.setBounds(400,100 ,100 ,100);
        b13.setFont(new Font("Arial", Font.PLAIN, 32));
        add(b13);

        JButton b14 = new JButton("⌫");
        b14.setBounds(400,200 ,100 ,100);
        b14.setFont(new Font("OLD ENGLISH", Font.PLAIN, 30));
        add(b14);

        JButton b15 = new JButton("-");
        b15.setBounds(200,400 ,100 ,100);
        b15.setFont(new Font("Arial", Font.PLAIN, 32));
        add(b15);

        JButton b16 = new JButton("^");
        b16.setBounds(400,500 ,100 ,100);
        b16.setFont(new Font("Arial", Font.PLAIN, 32));
        add(b16);

        JButton b17 = new JButton("√");
        b17.setBounds(300,500 ,100 ,100);
        b17.setFont(new Font("Arial", Font.PLAIN, 32));
        add(b17);

        b0.addActionListener(this);
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
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);

        setVisible(true);
        add(text);
    }

    String num1;
    String sign;
    String Num2;
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton) e.getSource();
        if(text.getText().equals("0"))
            text.setText("");
        double result = 0;
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
            case "0":
                text.setText(text.getText()+"0");
                break;
            case "⌫":
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
                text.setText("");
                break;
            case "^":
                num1 = text.getText();
                sign = "^";
                result = Integer.valueOf(num1)*Integer.valueOf(num1);
                text.setText(String.valueOf(result));
                break;
            case "√":
                num1 = text.getText();
                sign = "√";
                result = (int) Math.sqrt(Integer.valueOf(num1));
                text.setText(String.valueOf(result));
                break;
            case "=":
                String num2 = text.getText();
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
