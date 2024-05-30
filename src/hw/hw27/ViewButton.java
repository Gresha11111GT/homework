package hw.hw27;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ViewButton extends JButton {
    Image myImage;
    int drawX;
    int drawY;
    ViewButton(int x, int y) throws IOException {
        setBounds(0,0,1841/4,2400/4);
        this.myImage = ImageIO.read(new File("src/hw/hw27/SpriteSheet.png"));
    }
    public void setNewCoorditanes(int x, int y){
        this.drawX=x;
        this.drawY=y;
        repaint();
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(myImage, drawX, drawY, this);

    }
}
