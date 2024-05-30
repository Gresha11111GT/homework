package hw.hw27;

import java.awt.event.KeyEvent;

class Model {
    Controller controller;
    ViewButton viewButton;

    public Model(ViewButton viewButton) {
        this.viewButton = viewButton;
    }
    public void setController(Controller controller) {
        this.controller = controller;
    }

    private int width = 0;
    private int height = 0;

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void moveUp() {
        height -= 10;
    }

    public void moveLeft() {
        width -= 10;
    }

    public void moveDown() {
        height += 10;
    }

    public void moveRight() {
        width += 10;
    }

    public void moveButton(int keyCode) {
        switch (keyCode) {
            case KeyEvent.VK_W:
                viewButton.setNewCoorditanes(0, (int) -(2400/0.75));
                moveUp();
                break;
            case KeyEvent.VK_A:
                viewButton.setNewCoorditanes(0, (int) -(2400/0.5));
                moveLeft();
                break;
            case KeyEvent.VK_S:
                viewButton.setNewCoorditanes(0, 0);
                moveDown();
                break;
            case KeyEvent.VK_D:
                viewButton.setNewCoorditanes(0, (int) -(2400/0.25));
                moveRight();
                break;
        }
    }
}
