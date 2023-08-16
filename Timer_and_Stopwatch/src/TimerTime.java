import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimerTime extends JFrame {
    private JLabel timeLabel;
    private JButton startButton;
    private JButton stopButton;
    private Timer timer;
    private int seconds = 0;

    public TimerTime() {
        setTitle("Timer");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        timeLabel = new JLabel("Time: 0 seconds", SwingConstants.CENTER);
        timeLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
        add(timeLabel, BorderLayout.CENTER);

        startButton = new JButton("Start");
        stopButton = new JButton("Stop");

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(startButton);
        buttonPanel.add(stopButton);



        add(buttonPanel, BorderLayout.SOUTH);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startTimer();
            }
        });

        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stopTimer();
            }
        });
    }

    private void startTimer() {
        if (timer == null) {
            timer = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    seconds++;
                    timeLabel.setText("Time: " + seconds + " seconds");
                }
            });
            timer.start();
        }
    }

    private void stopTimer() {
        if (timer != null) {
            timer.stop();
            timer = null;
        }
    }


}
