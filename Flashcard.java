import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Flashcard extends StudyTool implements ActionListener {

    private String question;
    private String answer;

    JFrame frame;

    JButton addButton;
    JButton readButton;

    public Flashcard(String question, String answer) {

        super("Flashcard");

        this.question = question;
        this.answer = answer;

        frame = new JFrame();

        addButton = new JButton("ADD NEW CARD");
        readButton = new JButton("READ CARD");

        addButton.setBounds(100,200,200,50);
        addButton.setFont(new Font("MV Boli", Font.PLAIN, 20));
        addButton.setFocusable(false);
        addButton.addActionListener(this);

        readButton.setBounds(100,300,200,50);
        readButton.setFont(new Font("MV Boli", Font.PLAIN, 20));
        readButton.setFocusable(false);
        readButton.addActionListener(this);

        frame.add(addButton);
        frame.add(readButton);

        frame.setTitle("Flashcards");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600,600);
        frame.getContentPane().setBackground(new Color(115, 195, 249));
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public void starttool() {
        IO.println("Flashcard Tool");
    }

    @Override
    public void displayinfo() {

    }

    @Override
    public void dispalyinfo() {
        IO.println("Flashcard Tool Started");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == addButton) {

            JFrame addFrame = new JFrame("Add New Card");

            JLabel questionLabel = new JLabel("Enter Question:");
            JLabel answerLabel = new JLabel("Enter Answer:");

            JTextField questionField = new JTextField();
            JTextField answerField = new JTextField();

            JButton saveButton = new JButton("SAVE");

            questionLabel.setBounds(50,50,150,30);
            answerLabel.setBounds(50,150,150,30);

            questionField.setBounds(200,50,200,30);
            answerField.setBounds(200,150,200,30);

            saveButton.setBounds(150,250,120,40);

            addFrame.add(questionLabel);
            addFrame.add(answerLabel);
            addFrame.add(questionField);
            addFrame.add(answerField);
            addFrame.add(saveButton);

            addFrame.setSize(500,400);
            addFrame.setLayout(null);
            addFrame.setVisible(true);

            saveButton.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                    question = questionField.getText();
                    answer = answerField.getText();

                    JOptionPane.showMessageDialog(null,"Card Saved!");

                    addFrame.dispose();
                }
            });
        }

        if(e.getSource() == readButton) {

            JFrame readFrame = new JFrame("Read Card");

            JLabel questionText = new JLabel("Question: " + question);
            JLabel answerText = new JLabel("Answer: " + answer);

            questionText.setBounds(50,100,400,40);
            answerText.setBounds(50,200,400,40);

            questionText.setFont(new Font("MV Boli", Font.BOLD, 25));
            answerText.setFont(new Font("MV Boli", Font.BOLD, 25));

            readFrame.add(questionText);
            readFrame.add(answerText);

            readFrame.setSize(500,400);
            readFrame.setLayout(null);
            readFrame.setVisible(true);
        }
    }
}