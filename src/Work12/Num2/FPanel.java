package Work12.Num2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class FPanel extends JPanel {
    FPanel(){
        this.setPreferredSize(new Dimension(900, 500));
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D gr = (Graphics2D) g;
        Random rand = new Random();
        for (int i = 0; i < 20; i++){
            int rsh = rand.nextInt(2);
            int r = rand.nextInt(255);
            int gre = rand.nextInt(255);
            int b = rand.nextInt(255);
            int x = rand.nextInt(850);
            int y = rand.nextInt(450);
            Color color = new Color(r, gre, b);
            switch (rsh){
                case 0:
                    Square square = new Square(x, y, rand.nextInt(50), color);
                    square.draw(gr);
                    //gr.setColor(color);
                    //gr.fillRect(x, y, 10, 10);
                case 1:
                    Circle circle = new Circle(x, y, rand.nextInt(50), color);
                    circle.draw(gr);
                    //gr.setColor(color);
                    //gr.fillOval(x, y, 10, 10);
            }
        }
    }
}
