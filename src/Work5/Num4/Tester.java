package Work5.Num4;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Timer;

public class Tester {
    public static void main(String[] args) {
        new Tester();
    }
    public Tester(){
        EventQueue.invokeLater(new Runnable(){
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (IllegalAccessException | InstantiationException | ClassNotFoundException | UnsupportedLookAndFeelException ex) {
                    ex.printStackTrace();
                }
                JFrame frame = new JFrame("Anime");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(new FLabel());
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
    public class FLabel extends JLabel{
        ImageIcon icon1 = new ImageIcon("C:/Study/JavaCodes/JavaUniv/src/Work5/Work7.Num4/fire1.png");
        int c = 2;


        //private List<JLabel> fire = new ArrayList<>(15);

        public FLabel(){
            setIcon(icon1);
            setOpaque(true);
            Timer timer = new Timer(300, new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    setIcon(new ImageIcon("C:/Study/JavaCodes/JavaUniv/src/Work5/Work7.Num4/fire" + (c%15) + ".png"));
                    c++;
                }
            });
            timer.start();
        }
    }
}
