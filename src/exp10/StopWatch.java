package exp10;

import javax.swing.*;
import java.awt.event.*;

class Stopwatch {
    static int seconds = 0;
    static Timer timer;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Stopwatch");
        JLabel timeLabel = new JLabel("0", JLabel.CENTER);
        JButton startButton = new JButton("Start");
        JButton stopButton = new JButton("Stop");
        JButton resetButton = new JButton("Reset");

        timeLabel.setBounds(100, 30, 200, 50);
        startButton.setBounds(50, 100, 80, 30);
        stopButton.setBounds(150, 100, 80, 30);
        resetButton.setBounds(250, 100, 80, 30);

        frame.add(timeLabel);
        frame.add(startButton);
        frame.add(stopButton);
        frame.add(resetButton);

        timer = new Timer(1000, e -> {
            seconds++;
            timeLabel.setText(Integer.toString(seconds));
        });

        startButton.addActionListener(e -> timer.start());
        stopButton.addActionListener(e -> timer.stop());
        resetButton.addActionListener(e -> {
            timer.stop();
            seconds = 0;
            timeLabel.setText("0");
        });

        frame.setSize(400, 200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}