package homework5.task1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MatchResult extends JFrame {
    private int milanScore = 0;
    private int madridScore = 0;
    private String lastScorer = "N/A";
    private String winner = "DRAW";

    public MatchResult() {
        setTitle("Match Result Table");
        setSize(400, 200);
        setLayout(new FlowLayout());

        JButton milanButton = new JButton("AC Milan");
        JButton madridButton = new JButton("Real Madrid");

        JLabel resultLabel = new JLabel("Result: 0 X 0");
        JLabel lastScorerLabel = new JLabel("Last Scorer: N/A");
        JLabel winnerLabel = new JLabel("Winner: DRAW");

        milanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                lastScorer = "AC Milan";
                updateLabels(resultLabel, lastScorerLabel, winnerLabel);
            }
        });

        madridButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridScore++;
                lastScorer = "Real Madrid";
                updateLabels(resultLabel, lastScorerLabel, winnerLabel);
            }
        });

        add(milanButton);
        add(madridButton);
        add(resultLabel);
        add(lastScorerLabel);
        add(winnerLabel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void updateLabels(JLabel resultLabel, JLabel lastScorerLabel, JLabel winnerLabel) {
        resultLabel.setText("Result: " + milanScore + " X " + madridScore);
        lastScorerLabel.setText("Last Scorer: " + lastScorer);
        winner = milanScore > madridScore ? "AC Milan" : madridScore > milanScore ? "Real Madrid" : "DRAW";
        winnerLabel.setText("Winner: " + winner);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MatchResult().setVisible(true);
            }
        });
    }
}

