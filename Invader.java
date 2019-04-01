import java.io.*;
import javax.swing.*;
import java.awt.*;
import javax.imageio.ImageIO;

public class Invader extends JComponent{
    private String name;
    private Image image;

    Invader(String name){
        this.name = name;
        try {
            image = ImageIO.read(new File("./images/invader_small.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void paint(Graphics g){
        g.drawImage(image, 15,15, this);
        g.drawString(name, 15,90);

    }
}
