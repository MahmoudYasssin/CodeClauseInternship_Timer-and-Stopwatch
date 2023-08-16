import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Stopwatch stopwatch=new Stopwatch();
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                TimerTime timerApp = new TimerTime();
                timerApp.setVisible(true);
            }
        });

        }

}