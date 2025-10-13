import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::createUI);
    }

    public static void createUI() {
        JLabel label = new JLabel("No agent generated");
        label.setFont(new Font("Courier New", Font.BOLD, 18));
        label.setPreferredSize(new Dimension(150, 50));
        label.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 10));

        ActionListener buttonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(AgentGenerator.generateAgent());
            }
        };

        JButton button = new JButton("Generate a random agent");
        label.setFont(new Font("Courier New", Font.PLAIN, 18));
        button.setPreferredSize(new Dimension(150, 50));
        button.addActionListener(buttonListener);


        JFrame frame = new JFrame("Agent Generator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(280, 180);
        frame.setLayout(new BorderLayout(10, 10));
        frame.setLocationRelativeTo(null);

        frame.add(button, BorderLayout.SOUTH);
        frame.add(label, BorderLayout.CENTER);

        frame.setVisible(true);
    }

}
