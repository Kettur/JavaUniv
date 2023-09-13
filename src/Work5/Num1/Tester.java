package Work5.Num1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tester {
    static int maScore = 0;
    static int miScore = 0;
    static String last = "N/A";
    static String winn = "DRAW";
    static JLabel labelScore = new JLabel("Score " + maScore + "X" + miScore);
    static JLabel labelLast = new JLabel("Last Score: " + last);
    static Label label = new Label("Winner: " + winn);
    public static void main(String[] args) {


        JFrame frame = new JFrame("Football");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 500);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(Color.GREEN);
        panel.setPreferredSize(new Dimension(900, 500));


        JButton buttonMilan = new JButton("AC Milan");
        buttonMilan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                miScore++;
                last = "AC Milan";
                upd();
            }
        });
        JButton buttonMadrid = new JButton("Real Madrid");
        buttonMadrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                maScore++;
                last = "Real Madrid";
                upd();
            }
        });


        buttonMadrid.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonMilan.setAlignmentX(Component.CENTER_ALIGNMENT);
        labelLast.setAlignmentX(Component.CENTER_ALIGNMENT);
        labelScore.setAlignmentX(Component.CENTER_ALIGNMENT);
        label.setAlignment(Label.CENTER);


        panel.add(buttonMadrid);
        panel.add(buttonMilan);
        panel.add(labelScore);
        panel.add(labelLast);
        panel.add(label);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
    public static void upd(){
        labelScore.setText("Score " + maScore + "X" + miScore);
        if (miScore > maScore){
            winn = "AC Milan";
        }
        else if (maScore > miScore){
            winn = "Real Madrid";
        }
        else {
            winn = "DRAW";
        }
        label.setText("Winner: " + winn);
        labelLast.setText("Last Score: " + last);
    }
}
