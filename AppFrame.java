import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
import javax.swing.*;
import java.awt.*;

public class AppFrame extends JFrame implements ActionListener {
    JFrame frame = new JFrame();
    JButton Button = new JButton();
    public AppFrame() {

        ImageIcon icon = new ImageIcon("images.png" );
        Border border = BorderFactory.createLineBorder(Color.DARK_GRAY);

        JLabel label = new JLabel("WELCOME TO THE STUDY APP");
        label.setIcon(icon);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setFont(new Font("MV Boli", Font.BOLD,20));
        label.setBorder(border);
        label.setForeground(Color.black);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(450,100,350,300);


        JButton flashbutton = new JButton("Flashcards");
        flashbutton.setBounds(450,450,350,40);
        flashbutton.setFont(new Font("MV Boli", Font.BOLD,20));
        flashbutton.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY) );
        flashbutton.setFocusPainted(false);


        JButton timerbutton = new JButton("Study Timer");
        timerbutton.setBounds(450,500,350,40);
        timerbutton.setFont(new Font("MV Boli", Font.BOLD,20));
        timerbutton.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY) );
        timerbutton.setFocusPainted(false);

        JFrame frame = new JFrame();
        this.setTitle("MINI STUDY APP");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setVisible(true);
        this.add(label);
        this.setLayout(null);
        this.add(flashbutton);
        this.add(timerbutton);

        ImageIcon image = new ImageIcon("book.jpg");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(115, 195, 249));

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Button){
            Button button = (Button) e.getSource();

        }
    }
}


