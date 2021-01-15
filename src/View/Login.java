/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author sugi
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener{
    private JTextField user;
    private JPasswordField pass;
    private JButton login,batal;
    
    public Login() {
        setUndecorated(true);
        setSize(600, 400);
        setLocationRelativeTo(null);
        userInterface();
        setVisible(true);
    }
    
    private void userInterface(){
        JPanel main_pan = new JPanel(new GridLayout(1, 2));
        
        JPanel left_pan = new JPanel(new BorderLayout());
        left_pan.setBackground(new Color(0, 80, 239));
        
        JLabel logo = new JLabel(new ImageIcon(getClass().getResource("login.png")));
        logo.setText("Authentication User");
        logo.setHorizontalTextPosition(JLabel.CENTER);
        logo.setVerticalTextPosition(JLabel.BOTTOM);
        logo.setForeground(Color.black);
        logo.setFont(new Font("Segoe UI", 0, 15));
        left_pan.add(logo);
        main_pan.add(left_pan);
        
        JPanel right_pan = new JPanel(new BorderLayout());
        right_pan.setBackground(Color.white);
        
        JPanel pan_exit = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JLabel exit = new JLabel("x");

        exit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });

        exit.setPreferredSize(new Dimension(30, 30));
        exit.setHorizontalAlignment(JLabel.CENTER);
        exit.setVerticalAlignment(JLabel.CENTER);
        exit.setFont(new Font("Segoe UI", Font.BOLD, 25));
        exit.setBackground(new Color(0, 80, 239));
        exit.setForeground(Color.white);
        exit.setOpaque(true);
        pan_exit.add(exit);
        right_pan.add(pan_exit, "North");
        
        JPanel right_comp = new JPanel(new BorderLayout());
        JLabel title = new JLabel("Sign Up");
        title.setPreferredSize(new Dimension(this.getWidth(), 70));
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setFont(new Font("Segoe UI", 0, 30));
        right_comp.add(title, "North");
        
        JPanel pan = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        JLabel f_User = new JLabel("Username");
        f_User.setFont(new Font("Segoe UI", 0, 14));
        f_User.setPreferredSize(new Dimension(200, 20));
        pan.add(f_User);
        user = new JTextField();
        user.setPreferredSize(new Dimension(200, 30));
        pan.add(user);
        
        JLabel f_Pass = new JLabel("Password");
        f_Pass.setFont(new Font("Segoe UI", 0, 14));
        f_Pass.setPreferredSize(new Dimension(200, 20));
        pan.add(f_Pass);
        pass = new JPasswordField();
        pass.setPreferredSize(new Dimension(200, 30));
        pan.add(pass);
        right_comp.add(pan);        
        right_pan.add(right_comp);
        
        
        JPanel pan_btn = new JPanel();
        pan_btn.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        pan_btn.setPreferredSize(new Dimension(this.getWidth(), 70));

        login = new JButton("Login");
        login.setPreferredSize(new Dimension(120, 30));
        login.setFont(new Font("Segoe UI", 0, 17));
        login.setContentAreaFilled(false);
        login.setForeground(new Color(0, 80, 239));
        login.addActionListener(this);
        pan_btn.add(login);
        right_pan.add(pan_btn, "South");     
        main_pan.add(right_pan);
        getContentPane().add(main_pan);
        
    }
    public void actionPerformed(ActionEvent e) {

      if(e.getSource()==login){
        String username = user.getText();
        String password = String.valueOf(pass.getPassword());
        if(username.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Username masih kosong!");
        }else if(password.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Password masih kosong!");
        }else{
            PenyewaGUI penyewagui = new PenyewaGUI();
        }
      }
}
    public static void main(String[] args) {
        Login obj = new Login();
        
    }
}