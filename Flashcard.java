import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

public  class Flashcard extends StudyTool {

    private String front;
    private String back;

    JFrame frame = new JFrame();
    JLabel label = new JLabel("You can start with your flashcards");

    public Flashcard(String front, String back) {
        super("Flashcard");
        this.front = front;
        this.back = back;

        label.setBounds(0,0,100,50);
        label.setFont(new Font("MV Boli",Font.BOLD,25));

        frame.add(label);
        frame.setTitle("Flashcards");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    public String getFront(){
        return front;
    }
    public String getBack(){
        return back;
    }
    public void setFront(String front){
        this.front = front;
    }
    public void setBack(String back){
        this.back = back;
    }
    public String getback(){
        return back;
    }
    public void setback(String back){
        this.back = back;
    }

    @Override
    public void starttool(){
        IO.println("Flashcard Tool");
    }

    @Override
    public void displayinfo() {

    }

    @Override
    public void dispalyinfo(){
        IO.println("Flashcard Tool Started");
    }

}
