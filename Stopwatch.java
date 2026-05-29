import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Stopwatch implements ActionListener {

    JFrame frame = new JFrame();
    JButton start = new JButton("START");
    JButton reset = new JButton("RESET");
    JLabel time = new JLabel();

    int milliseconds = 0;
    int seconds =0;
    int minutes =0;
    int hours =0;
    boolean hasStarted = false;

    String seconds_string = String.format("%02d", seconds);
    String minutes_string = String.format("%02d", minutes);
    String hours_string = String.format("%02d", hours);

    Timer timer = new Timer(1000, new ActionListener() {

        public void actionPerformed(ActionEvent e) {

            milliseconds =milliseconds +1000;
            hours = (milliseconds /3600000);
            minutes = (milliseconds /60000) % 60;
            seconds = (milliseconds /1000) % 60;
            seconds_string = String.format("%02d", seconds);
            minutes_string = String.format("%02d", minutes);
            hours_string = String.format("%02d", hours);
            time.setText(hours_string+":"+minutes_string+":"+seconds_string);

        }

    });


    Stopwatch(){

        time.setText(hours_string+":"+minutes_string+":"+seconds_string);
        time.setBounds(100,100,200,100);

        time.setFont(new Font("MV Boli",Font.PLAIN,35));
        time.setBorder(BorderFactory.createBevelBorder(1));
        time.setOpaque(true);
        time.setHorizontalAlignment(JTextField.CENTER);

        start.setBounds(100,200,100,50);
        start.setFont(new Font("MV Boli",Font.PLAIN,20));
        start.setFocusable(false);
        start.addActionListener(this);

        reset.setBounds(200,200,100,50);
        reset.setFont(new Font("MV Boli",Font.PLAIN,20));
        reset.setFocusable(false);
        reset.addActionListener(this);

        frame.add(start);
        frame.add(reset);
        frame.add(time);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(450,450);
        frame.getContentPane().setBackground(new Color(115, 195, 249));
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==start) {
            if(hasStarted == false) {
                hasStarted=true;
                start.setText("STOP");
                start();
            }
            else {
                hasStarted = false;
                start.setText("START");
                stop();
            }

        }
        if(e.getSource()==reset) {
            hasStarted=false;
            start.setText("START");
            reset();
        }

    }

    void start() {
        timer.start();
    }

    void stop() {
        timer.stop();
    }

    void reset() {
        timer.stop();
        milliseconds =0;
        seconds =0;
        minutes=0;
        hours=0;
        seconds_string = String.format("%02d", seconds);
        minutes_string = String.format("%02d", minutes);
        hours_string = String.format("%02d", hours);
        time.setText(hours_string+":"+minutes_string+":"+seconds_string);
    }

}

