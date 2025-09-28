
package bank.mangement.system2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Login extends JFrame implements ActionListener{
   JButton login,clear,signup;
   JTextField cardText;
   JPasswordField pinText;
    Login(){
        setTitle("ATM");
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("img/logo.jpg"));
        Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon (i2);
        JLabel label =new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);
        
        JLabel text = new JLabel("Welcome To SBI ATM ");
        text.setFont(new Font("Osward",Font.BOLD,40));
        text.setBounds(200, 40, 450, 40);
        add(text);
        
        JLabel cardNo=new JLabel("Card NO");
        cardNo.setFont(new Font("Ralway",Font.BOLD,35));
        cardNo.setBounds(120, 140, 150, 40);
        add(cardNo);
        
        JLabel pin=new JLabel(" PIN");
        pin.setFont(new Font("Ralway",Font.BOLD,35));
        pin.setBounds(110, 200, 150, 40);
        add(pin);
        
// card TexField
         cardText =new JTextField();
        cardText.setBounds(300, 140, 310, 30);
        add (cardText);
//        Pin textField
         pinText =new JPasswordField();
        pinText.setBounds(300, 200, 310, 30);
        pinText.setFont(new Font("Arial",Font.BOLD,14));
        add (pinText);
        
//Buttons
 login = new JButton("SIGN IN");
login.setBounds (300,300,150,30);
login.setBackground(Color.BLACK);
login.setForeground(Color.WHITE);
login.addActionListener(this);
add (login);

 clear = new JButton("CLEAR");
clear.setBounds (460,300,150,30);
clear.setBackground(Color.BLACK);
clear.setForeground(Color.WHITE);
clear.addActionListener(this);

add (clear);

 signup = new JButton("SIGN UP");
signup.setBounds (300,350,310,30);
signup.setBackground(Color.BLACK);
signup.setForeground(Color.WHITE);
signup.addActionListener(this);

add (signup);


        getContentPane().setBackground(Color.WHITE);
        setSize(800,480);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
       if(ae.getSource()==clear)
       {
           cardText.setText("");
           pinText.setText("");
       }
       else if(ae.getSource()==login)
       {

           
       }
       else if(ae.getSource()==signup)
       {
           
       }
        
    }
    public static void main(String args[]){
        new Login();
        
    }
    
}

