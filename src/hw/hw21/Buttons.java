package hw.hw21;
import javax.swing.*;

public class Buttons extends JButton {
    private int stepX;
    private int stepY;

    public Buttons(int stepX, int stepY) {
        this.stepX = stepX;
        this.stepY = stepY;
    }

    public int getStepX() {
        return stepX;
    }

    public void setStepX(int stepX) {
        this.stepX = stepX;
    }

    public int getStepY() {
        return stepY;
    }

    public void setStepY(int stepY) {
        this.stepY = stepY;
    }
}