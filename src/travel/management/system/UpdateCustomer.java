package travel.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class UpdateCustomer extends JFrame implements ActionListener{
 
    JLabel labelusername,labelname;
    JComboBox comboid;
    JTextField tfnumber,tfaddress,tfcountry,tfemail,tfphone,tfid,tfgender;
    JRadioButton rmale,rfemale;
    JButton add,back;
    
    UpdateCustomer(String username){
        setBounds(500, 200, 850, 550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel text = new JLabel( "Update Customer Details");
        text.setBounds(52, 7, 300, 25);
        text.setFont(new Font("Tahoma",Font.BOLD,22));
        add(text);

        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(30,55,150,25);
        lblusername.setFont(new Font("Tahoma",Font.BOLD,15));
        add(lblusername);
        
        labelusername = new JLabel();
        labelusername.setBounds(220,50,150,25);
        labelusername.setFont(new Font("Tahoma",Font.PLAIN,13));
        add(labelusername);
        
        JLabel lblid = new JLabel("Id");
        lblid.setBounds(30,90,150,25);
        lblid.setFont(new Font("Tahoma",Font.BOLD,15));
        add(lblid); 
        
        tfid = new JTextField();
        tfid.setBounds(220,90,150,25);
        tfid.setFont(new Font("Tahoma",Font.PLAIN,13));
        add(tfid);
        
        JLabel lblnumber = new JLabel("Number");
        lblnumber.setBounds(30,130,150,25);
        lblnumber.setFont(new Font("Tahoma",Font.BOLD,15));
        add(lblnumber); 
        
        tfnumber = new JTextField();
        tfnumber.setBounds(220,130,150,25);
        tfnumber.setFont(new Font("Tahoma",Font.PLAIN,13));
        add(tfnumber);
        
        JLabel lblname= new JLabel("Name");
        lblname.setBounds(30,170,150,25);
        lblname.setFont(new Font("Tahoma",Font.BOLD,15));
        add(lblname); 
        
        labelname = new JLabel();
        labelname.setBounds(220,170,150,25);
        labelname.setFont(new Font("Tahoma",Font.PLAIN,13));
        add(labelname);
        
        JLabel lblgender= new JLabel("Gender");
        lblgender.setBounds(30,210,150,25);
        lblgender.setFont(new Font("Tahoma",Font.BOLD,15));
        add(lblgender);
        
        tfgender = new JTextField();
        tfgender.setBounds(220,210,150,25);
        labelusername.setFont(new Font("Tahoma",Font.PLAIN,13));
        add(tfgender);
       
        JLabel lblcountry = new JLabel("Country");
        lblcountry.setBounds(30,250,150,25);
        lblcountry.setFont(new Font("Tahoma",Font.BOLD,15));
        add(lblcountry); 
        
        tfcountry = new JTextField();
        tfcountry.setBounds(220,250,150,25);
        tfcountry.setFont(new Font("Tahoma",Font.PLAIN,13));
        add(tfcountry);
        
        JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(30,290,150,25);
        lbladdress.setFont(new Font("Tahoma",Font.BOLD,15));
        add(lbladdress); 
        
        tfaddress = new JTextField();
        tfaddress.setBounds(220,290,150,25);
        tfaddress.setFont(new Font("Tahoma",Font.PLAIN,13));
        add(tfaddress);
        
        JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(30,330,150,25);
        lblphone.setFont(new Font("Tahoma",Font.BOLD,15));
        add(lblphone); 
        
        tfphone = new JTextField();
        tfphone.setBounds(220,330,150,25);
        tfphone.setFont(new Font("Tahoma",Font.PLAIN,13));
        add(tfphone);
        
        JLabel lblemail = new JLabel("E-mail");
        lblemail.setBounds(30,370,150,25);
        lblemail.setFont(new Font("Tahoma",Font.BOLD,15));
        add(lblemail); 
        
        tfemail = new JTextField();
        tfemail.setBounds(220,370,150,25);
        tfemail.setFont(new Font("Tahoma",Font.PLAIN,13));
        add(tfemail);
        
        add = new JButton("Update");
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.setBounds(70, 430, 110, 30);
        add.setFont(new Font("Tahoma",Font.BOLD,15));
        add.addActionListener(this);
        add(add);
        
        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(220, 430, 110, 30);
        back.setFont(new Font("Tahoma",Font.BOLD,15));
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/update.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 480, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3); 
        icon.setBounds(450, 10, 300, 480);
        add(icon);
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from customer where username = '"+username+"' ");

             while (rs.next()) {
                    labelusername.setText(rs.getString("username"));
                    labelname.setText(rs.getString("name"));
                    tfid.setText(rs.getString("id"));
                    tfnumber.setText(rs.getString("number"));
                    tfgender.setText(rs.getString("gender"));
                    tfcountry.setText(rs.getString("country"));
                    tfaddress.setText(rs.getString("address"));
                    tfphone.setText(rs.getString("phone"));
                    tfemail.setText(rs.getString("email"));
		}

        }catch(Exception e){
            e.printStackTrace();
        }
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
         if(ae.getSource() == add){
            String username = labelusername.getText();
            String id = tfid.getText();
            String number = tfnumber.getText();
            String name = labelname.getText();
            String gender = tfgender.getText();
            String country = tfcountry.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            try{
                Conn c = new Conn();
                String query = "update customer set username = '"+username+"' , id = '"+id+"' , number = '"+ number+"' ,"
                                                                 + " name= '"+name+"' , " + " gender = '"+gender+"' , "
                                                                 + " country =  '"+country+"' ,"+ " address = '"+address+"' "
                                                                 + ", phone ='"+phone+"' , email = '"+email+"'";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Customer Details Updated Successfully");
                setVisible(false);
            }catch(Exception e){
                e.printStackTrace();
            }
            }else{
            setVisible(false);
         }
     }
    
    public static void main(String []args){
        new UpdateCustomer("pari");
    }   
}


