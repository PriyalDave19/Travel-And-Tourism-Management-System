package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.border.*;

public class Contact extends JFrame{
    
    JPanel p1;
    JTextField t1,t2,t3,t4,t5;
    
    Contact(){
    setBounds(350, 130, 850, 550);
    setLayout(null);
    p1 = new JPanel();
    p1.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(p1);
    p1.setBackground(Color.WHITE);
    p1.setLayout(null);
    getContentPane().setBackground(Color.WHITE);
    
    JLabel text = new JLabel( "Contact Us");
    text.setBounds(320, 0, 450, 55);
    text.setForeground(Color.BLACK);
    text.setFont(new Font("Tahoma",Font.BOLD,35));
    p1.add(text);
    
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("dest//contact.png"));
    Image i2 = i1.getImage().getScaledInstance(495, 430, Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel icon = new JLabel(i3); 
    icon.setBounds(0, 0, 550, 550);
    p1.add(icon);
    
    t1 = new JTextField( "         Mail Us On:");
    t1.setEditable(false);
    t1.setFont(new Font("Tahoma",Font.BOLD,20));
    t1.setForeground(Color.DARK_GRAY);
    t1.setBackground(Color.WHITE);
    t1.setColumns(10);
    t1.setBounds(550, 65, 230, 40);
    p1.add(t1);
    
    t2 = new JTextField("   paridave90@gmail.com");
    t2.setEditable(false);
    t2.setFont(new Font("Tahoma", Font.BOLD, 15));
    t2.setBackground(Color.WHITE);
    t2.setForeground(Color.BLUE);
    t2.setColumns(10);
    t2.setBounds(550, 105, 230, 40);
    p1.add(t2);
    
    t3 = new JTextField( "         Need Help Call:");
    t3.setEditable(false);
    t3.setFont(new Font("Tahoma",Font.BOLD,20));
    t3.setForeground(Color.DARK_GRAY);
    t3.setBackground(Color.WHITE);
    t3.setColumns(10);
    t3.setBounds(550, 170, 230, 40);
    p1.add(t3);
    
    t4 = new JTextField("+918770775040,+919575223994");
    t4.setEditable(false);
    t4.setFont(new Font("Tahoma", Font.BOLD, 13));
    t4.setBackground(Color.WHITE);
    t4.setForeground(Color.BLUE);
    t4.setColumns(10);
    t4.setBounds(550, 210, 230, 40);
    p1.add(t4);
    
    t3 = new JTextField( "         Post:");
    t3.setEditable(false);
    t3.setFont(new Font("Tahoma",Font.BOLD,20));
    t3.setForeground(Color.DARK_GRAY);
    t3.setBackground(Color.WHITE);
    t3.setColumns(10);
    t3.setBounds(550, 275, 230, 40);
    p1.add(t3);
    
    t4 = new JTextField("    Dewas , Pincode: 455001 ");
    t4.setEditable(false);
    t4.setFont(new Font("Tahoma", Font.BOLD, 13));
    t4.setBackground(Color.WHITE);
    t4.setForeground(Color.BLUE);
    t4.setColumns(10);
    t4.setBounds(550, 315, 230, 40);
    p1.add(t4);
    
    t3 = new JTextField( "        Address:");
    t3.setEditable(false);
    t3.setFont(new Font("Tahoma",Font.BOLD,20));
    t3.setForeground(Color.DARK_GRAY);
    t3.setBackground(Color.WHITE);
    t3.setColumns(10);
    t3.setBounds(550, 380, 230, 40);
    p1.add(t3);
    
    t4 = new JTextField("29Laxmi Vihar,Malhar Road Dewas");
    t4.setEditable(false);
    t4.setFont(new Font("Tahoma", Font.BOLD, 12));
    t4.setBackground(Color.WHITE);
    t4.setForeground(Color.BLUE);
    t4.setColumns(10);
    t4.setBounds(550, 420, 230, 40);
    p1.add(t4);
   
    
    setVisible(true);
    }
    
    public static void main(String [] args){
        new Contact();
    }
}
