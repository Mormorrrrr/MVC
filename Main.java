import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
      public static void main(String[] args) {
            JFrame frame = new JFrame("Color Code Registration");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 150);
            frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

            JButton whiteButton = new JButton("Register White Color Code");
            JButton brownButton = new JButton("Register Brown Color Code");
            JButton pinkButton = new JButton("Register Pink Color Code");

            whiteButton.addActionListener(new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                        new WhiteColorCodeView();
                  }
            });

            brownButton.addActionListener(new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                        new BrownColorCodeView();
                  }
            });

            pinkButton.addActionListener(new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                        new PinkColorCodeView();
                  }
            });

            frame.add(whiteButton);
            frame.add(brownButton);
            frame.add(pinkButton);

            frame.setVisible(true);
      }
}
