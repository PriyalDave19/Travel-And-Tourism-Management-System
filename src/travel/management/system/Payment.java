package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class Payment extends JFrame implements ActionListener{
    
    JButton paytm,phonepe,gpay,back;
    Payment(){
        setBounds(300, 100, 900, 550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel text = new JLabel("Payment Options");
        text.setBounds(150, 10,600,50);
        text.setForeground(Color.BLUE);
        text.setFont(new Font("Ralway",Font.BOLD,35));
        add(text);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("payments//WhatsApp Image 2023-11-06 at 22.18.24_cb5ec816.jpg"));
        Image i2 = i1.getImage().getScaledInstance(350, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3); 
        icon.setBounds(280, 50, 900, 550);
        add(icon);
        
        paytm = new JButton("Paytm");
        paytm.setBackground(Color.CYAN);
        paytm.setForeground(Color.BLACK);
        paytm.setFont(new Font("Tahoma",Font.BOLD,15));
        paytm.setBounds(80, 100, 120, 40);
        paytm.addActionListener(this);
        add(paytm);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("payments//WhatsApp Image 2023-11-06 at 21.56.46_bddfe07f.jpg"));
        Image i5 = i4.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6); 
        image.setBounds(280, 20, 200, 200);
        add(image);
        
        phonepe = new JButton("PhonePe");
        phonepe.setBackground(Color.CYAN);
        phonepe.setForeground(Color.BLACK);
        phonepe.setFont(new Font("Tahoma",Font.BOLD,15));
        phonepe.setBounds(80, 220, 120, 40);
        phonepe.addActionListener(this);
        add(phonepe);
        
        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("payments//WhatsApp Image 2023-11-06 at 21.57.59_256ca3a0.jpg"));
        Image i8 = i7.getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel icon1 = new JLabel(i9); 
        icon1.setBounds(280, 140, 200, 200);
        add(icon1);
        
        gpay = new JButton("Google Pay");
        gpay.setBackground(Color.CYAN);
        gpay.setForeground(Color.BLACK);
        gpay.setFont(new Font("Tahoma",Font.BOLD,15));
        gpay.setBounds(80, 340, 120, 40);
        gpay.addActionListener(this);
        add(gpay);
        
        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("payments//WhatsApp Image 2023-11-06 at 22.23.27_f687aff2.jpg"));
        Image i11 = i10.getImage().getScaledInstance(150,150, Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        JLabel icon2 = new JLabel(i12); 
        icon2.setBounds(300, 200, 200, 330);
        add(icon2);
        
        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Tahoma",Font.BOLD,15));
        back.setBounds(250, 450, 100, 40);
        back.addActionListener(this);
        add(back);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
          if(ae.getSource() == paytm){
              setVisible(false);
              new Paytm();
          }else{
              setVisible(false);
          }if(ae.getSource() == phonepe){
              setVisible(false);
              new PhonePe();
          }else{
              setVisible(false);
          }if(ae.getSource() == gpay){
              setVisible(false);
              new GPay();
          }else{
              setVisible(false);
          }
    }
    
    public static void main(String []args){
        new  Payment();
    }
}
