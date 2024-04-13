package hw.hw21;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

public class UI extends JFrame implements MouseListener {
    private Random random = new Random();
    private ArrayList<Buttons> buttons = new ArrayList<>();
    private Timer timer;

    UI() {
        setSize(800, 600);
        setLayout(null);
        setVisible(true);
        addMouseListener(this);
    }

    private void moveButton(Buttons button, int targetX, int targetY) {
        final int[] x = {button.getX()};
        final int[] y = {button.getY()};
        int width = button.getWidth();
        int height = button.getHeight();
        int stepX = (targetX - x[0]) / 10; // розрахунок кроку на основі відстані
        int stepY = (targetY - y[0]) / 10;

        timer = new Timer(100, new ActionListener() {
            int count = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                x[0] += stepX;
                y[0] += stepY;

                if (x[0] < 0 || x[0] > 800 - width || y[0] < 0 || y[0] > 600 - height || count >= 10) {
                    // Якщо кнопка доторкається до краю або виконується 10 ітерацій,
                    // зупинити таймер і змінити колір кнопки на червоний
                    timer.stop();
                    button.setBackground(Color.RED);
                }

                button.setBounds(x[0], y[0], width, height);
            }
        });

        timer.start();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getClickCount() == 2) {
            Buttons button = new Buttons(random.nextInt(10) - 5, random.nextInt(10) - 5);
            button.setBounds(e.getX(), e.getY(), 50, 50);
            add(button);
            buttons.add(button);

            int targetX = e.getX();
            int targetY = e.getY();
            moveButton(button, targetX, targetY);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        boolean emptySpaceClicked = true;
        for (Buttons button : buttons) {
            if (button.getBounds().contains(e.getPoint())) {
                emptySpaceClicked = false;
                break;
            }
        }
        if (emptySpaceClicked) {
            for (Buttons button : buttons) {
                int targetX = e.getX();
                int targetY = e.getY();
                moveButton(button, targetX, targetY);
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    public static void main(String[] args) {
        new UI();
    }
}