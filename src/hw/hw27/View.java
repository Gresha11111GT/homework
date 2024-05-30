package hw.hw27;

import javax.swing.*;
import java.io.IOException;

class View extends JFrame {
    private JButton button;

    public View(Controller controller) throws IOException {
        setTitle("Move WASD");
        setSize(1000, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button = new ViewButton(0, 0);
       // button.setBounds(controller.getModel().getWidth(), controller.getModel().getHeight(), 100, 50);
        button.addKeyListener(controller);

        setLayout(null);
        add(button);

        setVisible(true);
    }

    public void updatePosition(int x, int y) {
        button.setBounds(x, y, 1841/4,2400/4);
    }
}