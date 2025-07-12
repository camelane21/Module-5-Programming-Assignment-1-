import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Display Four GIFs");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new GridLayout(2, 2, 10, 10));

            frame.add(makeLabel("flag1.gif"));
            frame.add(makeLabel("flag2.gif"));
            frame.add(makeLabel("flag6.gif"));
            frame.add(makeLabel("flag7.gif"));

            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }

    private static JLabel makeLabel(String fileName) {
        return new JLabel(new ImageIcon(fileName), SwingConstants.CENTER);
    }
}
