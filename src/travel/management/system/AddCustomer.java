package travel.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class AddCustomer extends JFrame implements ActionListener{
 
    JLabel labelusername,labelname;
    JComboBox comboid;
    JTextField tfnumber,tfaddress,tfcountry,tfemail,tfphone;
    JRadioButton rmale,rfemale;
    JButton add,back;
    
    AddCustomer(String username){
        setBounds(450, 200, 850, 550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(30,50,150,25);
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
        
        comboid = new JComboBox(new String[]{"Passport" , "Aadhar Card" , "Pan Card" , "Ration Card"});
        comboid.setBounds(220,90,150,25);
        comboid.setFont(new Font("Tahoma",Font.PLAIN,13));
        comboid.setBackground(Color.WHITE);
        add(comboid);
        
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
        
        rmale = new JRadioButton("Male");
        rmale.setBounds(220,210,70,25);
        rmale.setFont(new Font("SAN_SERIF",Font.BOLD,13));
        rmale.setBackground(Color.WHITE);
        add(rmale);
        
        rfemale = new JRadioButton("Female");
        rfemale.setBounds(300,210,70,25);
        rfemale.setFont(new Font("SAN_SERIF",Font.BOLD,13));
        rfemale.setBackground(Color.WHITE);
        add(rfemale);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(rmale);
        bg.add(rfemale);

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
        
        add = new JButton("Add");
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
        //back.setFont(new Font("SAN_SERIF",Font.BOLD,15));
        back.setFont(new Font("Tahoma",Font.BOLD,15));
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/newcustomer.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3); 
        icon.setBounds(400, 40, 450, 420);
        add(icon);
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from account where username = '"+username+"'");

             while (rs.next()) {
                    labelusername.setText(rs.getString("username"));
                    labelname.setText(rs.getString("name"));
		}

        }catch(Exception e){
            e.printStackTrace();
        }
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
         if(ae.getSource() == add){
            String username = labelusername.getText();
            String id = (String) comboid.getSelectedItem();
            String number = tfnumber.getText();
            String name = labelname.getText();
            String gender = null;
            if(rmale.isSelected()){
                gender = "Male";
            }else{
                gender = "Female";
            }
            String country = tfcountry.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            try{
                Conn c = new Conn();
                String query = "insert into customer values ('"+username+"' , '"+id+"' , '"+ number+"' , '"+name+"' ,"
                                            + " '"+gender+"' , '"+country+"' , '"+address+"' , '"+phone+"' , '"+email+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Customer Details Added Successfully");
                setVisible(false);
            }catch(Exception e){
                e.printStackTrace();
            }
            }else{
              setVisible(false);
         }
     }
    
    public static void main(String []args){
        new AddCustomer("pari");
    }   
}
