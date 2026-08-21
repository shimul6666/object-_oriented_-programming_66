import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QuizBattleGUI extends JFrame implements ActionListener {
    private JLabel lblQuestion, lblResult;
    private JButton btnOpt1, btnOpt2;
    private Questions currentQuestion;

    public QuizBattleGUI() {
        // Instantiate a question object matching the expected output image
        currentQuestion = new Questions("Which keyword creates an object?", "new", "class", "new");

        // Window configuration
        setTitle("Programming Quiz Battle");
        setSize(400, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));

        // Create UI components
        lblQuestion = new JLabel(currentQuestion.getQuestion());
        btnOpt1 = new JButton(currentQuestion.getOption1());
        btnOpt2 = new JButton(currentQuestion.getOption2());
        lblResult = new JLabel("Answer the question!");

        // Attach action listeners to buttons
        btnOpt1.addActionListener(this);
        btnOpt2.addActionListener(this);

        // Add components to the frame
        add(lblQuestion);
        add(btnOpt1);
        add(btnOpt2);
        add(lblResult);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String selectedChoice = "";
        
        if (e.getSource() == btnOpt1) {
            selectedChoice = btnOpt1.getText();
        } else if (e.getSource() == btnOpt2) {
            selectedChoice = btnOpt2.getText();
        }

        // Validate the user's choice and update the result text label
        if (currentQuestion.isCorrect(selectedChoice)) {
            lblResult.setText("Correct! You defeated the Code Boss!");
        } else {
            lblResult.setText("Wrong! Try Again!");
        }
    }

    // Main entry point to run the application
    public static void main(String[] args) {
        new QuizBattleGUI();
    }
}