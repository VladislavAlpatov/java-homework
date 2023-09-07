package homework4;

import javax.swing.*;
import java.awt.*;

public class SwingApp extends JFrame {
    private int milanScore = 0;
    private int madridScore = 0;

    private JLabel resultLabel;
    private JLabel lastScorerLabel;
    private JLabel winnerLabel;

    public SwingApp() {
        setTitle("Football Match Simulator");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1));

        JButton milanButton = new JButton("AC Milan");
        JButton madridButton = new JButton("Real Madrid");

        milanButton.setBackground(new Color(33, 33, 33));
        milanButton.setForeground(Color.WHITE);

        madridButton.setBackground(new Color(33, 33, 33));
        madridButton.setForeground(Color.WHITE);

        resultLabel = new JLabel("Result: 0 X 0");
        lastScorerLabel = new JLabel("Last Scorer: N/A");
        winnerLabel = new JLabel("Winner: DRAW");

        milanButton.addActionListener(e ->
        {
            milanScore++;
            updateScore();
            lastScorerLabel.setText("Last Scorer: AC Milan");
            checkWinner();
        });

        madridButton.addActionListener(e ->
        {
            madridScore++;
            updateScore();
            lastScorerLabel.setText("Last Scorer: Real Madrid");
            checkWinner();
        });

        add(milanButton);
        add(madridButton);
        add(resultLabel);
        add(lastScorerLabel);
        add(winnerLabel);
    }

    private void updateScore()
    {
        resultLabel.setText("Result: " + milanScore + " X " + madridScore);
    }

    private void checkWinner()
    {
        if (milanScore > madridScore)
        {
            winnerLabel.setText("Winner: AC Milan");
        } else if (madridScore > milanScore)
        {
            winnerLabel.setText("Winner: Real Madrid");
        } else {
            winnerLabel.setText("Winner: DRAW");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SwingApp().setVisible(true));
    }
}
