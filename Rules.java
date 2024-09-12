package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;
    
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome " + name + " to Simple Minds");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
           <html>
    "1. Answer concisely: Focus on providing direct and to-the-point answers. Avoid unnecessary elaboration." + "<br><br>" +
    "2. Stay focused: Don't get distracted by others. Their progress has no impact on your performance." + "<br><br>" +
    "3. All questions matter: Each question holds equal weight. Skipping is not an option." + "<br><br>" +
    "4. Stay calm: If you feel overwhelmed, take a deep breath and keep going. Silence helps everyone concentrate." + "<br><br>" +
    "5. Think before asking: Only ask questions if absolutely necessary. Make sure they add value to your understanding." + "<br><br>" +
    "6. Pace yourself: Everyone works at their own speed. Stick to your pace and focus on your own work." + "<br><br>" +
    "7. Stay confident: Exams can be challenging, but you’ve prepared for this. Be confident in your abilities." + "<br><br>" +
    "8. Good luck: Approach the exam with a positive mindset. You are capable of doing your best!" + "<br><br>" +
</html>

        );
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args) {
        new Rules("User");
    }
}
