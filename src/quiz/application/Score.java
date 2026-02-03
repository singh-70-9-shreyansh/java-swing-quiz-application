package quiz.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Score extends JFrame implements ActionListener {

    Score(String name, int score) {
        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 200, 300, 250);
        add(image);

        JLabel heading = new JLabel("Thank you " + name + " for playing Simple Minds");
        heading.setBounds(45, 30, 700, 30);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(heading);

        JLabel lblscore = new JLabel("Your score is " + score);
        lblscore.setBounds(350, 200, 300, 30);
        lblscore.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(lblscore);

        JButton submit = new JButton("Play Again");
        submit.setBounds(380, 270, 120, 30);
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);

        recordAttendance(name, score); // Record attendance when score is displayed

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }

    private void recordAttendance(String name, int score) {

    String url = "jdbc:mysql://localhost:3306/quiz_db?useSSL=false&serverTimezone=UTC";
    String user = "root";
    String password = "MyySqll";

    String query = "INSERT INTO quiz_attendance (name, score) VALUES (?, ?)";

    try {
        // 1. Load MySQL Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2. Create Connection
        Connection conn = DriverManager.getConnection(url, user, password);

        // 3. Prepare SQL statement
        PreparedStatement pst = conn.prepareStatement(query);
        pst.setString(1, name);
        pst.setInt(2, score);

        // 4. Execute INSERT
        pst.executeUpdate();

        // 5. Close connection
        conn.close();

        System.out.println("Score saved to database!");

    } catch (Exception e) {
        e.printStackTrace();
    }
    }
}