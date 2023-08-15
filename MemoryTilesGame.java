import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MemoryTilesGame {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Memory Tiles Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(3, 1)); // 3 rows, 1 column

        JButton newGameButton = new JButton("New Game");
        JButton highScoresButton = new JButton("High Scores");
        JButton exitButton = new JButton("Exit");

        newGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add code to start a new game
                createDifficultyWindow(frame);
                //JOptionPane.showMessageDialog(frame, "Starting New Game!");
            }
        });

        highScoresButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add code to show high scores
                JOptionPane.showMessageDialog(frame, "High Scores!");
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Exit the application
            }
        });

        frame.add(newGameButton);
        frame.add(highScoresButton);
        frame.add(exitButton);

        frame.setVisible(true);
    }

private static void createDifficultyWindow(JFrame mainFrame) {
        JFrame difficultyFrame = new JFrame("Select Difficulty");
        difficultyFrame.setSize(300, 200);
        difficultyFrame.setLayout(new GridLayout(4, 1)); // 4 rows, 1 column

        JButton easyButton = new JButton("Easy");
        JButton mediumButton = new JButton("Medium");
        JButton hardButton = new JButton("Hard");
        JButton goBackButton = new JButton("Go Back");

        easyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add code for starting an easy game
                JOptionPane.showMessageDialog(difficultyFrame, "Starting Easy Game!");
            }
        });

        mediumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add code for starting a medium game
                JOptionPane.showMessageDialog(difficultyFrame, "Starting Medium Game!");
            }
        });

        hardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add code for starting a hard game
                JOptionPane.showMessageDialog(difficultyFrame, "Starting Hard Game!");
            }
        });

        goBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                difficultyFrame.dispose(); // Close the difficulty window
            }
        });

        difficultyFrame.add(easyButton);
        difficultyFrame.add(mediumButton);
        difficultyFrame.add(hardButton);
        difficultyFrame.add(goBackButton);

        difficultyFrame.setVisible(true);
    }
}
