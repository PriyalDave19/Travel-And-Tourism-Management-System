package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ViewPackage extends JFrame implements ActionListener{
    JButton back;
    
    ViewPackage(String username){
        setBounds(450, 200, 900, 450);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel text = new JLabel( "VIEW PACKAGE DETAILS");
        text.setBounds(60, 0, 300, 30);
        text.setFont(new Font("Tahoma",Font.BOLD,20));
        add(text);
         
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(30,50,150,25);
        lblusername.setFont(new Font("TAHOMA",Font.BOLD,15));
        add(lblusername);
        
        JLabel labelusername = new JLabel();
        labelusername.setBounds(220,50,150,25);
        labelusername.setFont(new Font("TAHOMA",Font.PLAIN,13));
        add(labelusername);
        
        JLabel lblpackage = new JLabel("Package");
        lblpackage.setBounds(30,90,150,25);
        lblpackage.setFont(new Font("TAHOMA",Font.BOLD,15));
        add(lblpackage);
        
        JLabel labelpackage = new JLabel();
        labelpackage.setBounds(220,90,150,25);
        labelpackage.setFont(new Font("TAHOMA",Font.PLAIN,13));
        add(labelpackage);
        
        JLabel lblpersons = new JLabel("Total Persons");
        lblpersons.setBounds(30,130,150,25);
        lblpersons.setFont(new Font("TAHOMA",Font.BOLD,15));
        add(lblpersons);
        
        JLabel labelpersons = new JLabel();
        labelpersons.setBounds(220,130,150,25);
        labelpersons.setFont(new Font("TAHOMA",Font.PLAIN,13));
        add(labelpersons);        
        
        JLabel lblid = new JLabel("Id");
        lblid.setBounds(30,170,150,25);
        lblid.setFont(new Font("TAHOMA",Font.BOLD,15));
        add(lblid);
        
        JLabel labelid = new JLabel();
        labelid.setBounds(220,170,150,25);
        labelid.setFont(new Font("TAHOMA",Font.PLAIN,13));
        add(labelid);        
        
        JLabel lblnumber = new JLabel("Number");
        lblnumber.setBounds(30,210,150,25);
        lblnumber.setFont(new Font("TAHOMA",Font.BOLD,15));
        add(lblnumber);
        
        JLabel labelnumber = new JLabel();
        labelnumber.setBounds(220,210,150,25);
        labelnumber.setFont(new Font("TAHOMA",Font.PLAIN,13));
        add(labelnumber);        
        
        JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(30,250,150,25);
        lblphone.setFont(new Font("TAHOMA",Font.BOLD,15));
        add(lblphone);
        
        JLabel labelphone= new JLabel();
        labelphone.setBounds(220,250,150,25);
        labelphone.setFont(new Font("TAHOMA",Font.PLAIN,13));
        add(labelphone);        
        
        JLabel lblprice = new JLabel("Price");
        lblprice.setBounds(30,290,150,25);
        lblprice.setFont(new Font("TAHOMA",Font.BOLD,15));
        add(lblprice);
        
        JLabel labelprice = new JLabel();
        labelprice.setBounds(220,290,150,25);
        labelprice.setFont(new Font("TAHOMA",Font.PLAIN,13));
        add(labelprice);

        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(130, 360, 110, 30);
        back.setFont(new Font("Tahoma",Font.BOLD,15));
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bookedDetails.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3); 
        icon.setBounds(380, 10, 500, 400);
        add(icon);

       try{
            Conn conn = new Conn();
            String query = "select * from bookpackage where username = '"+username+"'";
            ResultSet rs = conn.s.executeQuery(query);
             while (rs.next()) {
                    labelusername.setText(rs.getString("username"));
                    labelid.setText(rs.getString("id"));
                    labelnumber.setText(rs.getString("number"));
                    labelprice.setText(rs.getString("price"));
                    labelpersons.setText(rs.getString("persons"));
                    labelphone.setText(rs.getString("phone"));
                    labelpackage.setText(rs.getString("package"));
		}

        }catch(Exception e){
            e.printStackTrace();
        }
       
        setVisible(true);

    }
     public void actionPerformed(ActionEvent ae){
        setVisible(false);
            }

    
    public static void main(String []args){
        new  ViewPackage("pari");
     }
}

