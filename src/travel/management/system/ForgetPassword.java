package travel.management.system;


import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;
import java.awt.event.*;

public class ForgetPassword extends JFrame implements ActionListener{

    private JPanel p1;
    private JTextField tfusername,tfname,tfquestion,tfanswer,tfpassword;
    private JButton search,retrieve,back;

    
    public ForgetPassword() {

        setBounds(500, 200, 850, 400);
	p1 = new JPanel();
	p1.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(p1);
        p1.setBackground(Color.WHITE);
	p1.setLayout(null);

	JLabel lblusername = new JLabel("Username");
	lblusername.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblusername.setBounds(40, 20, 100, 25);
	p1.add(lblusername);
        
        tfusername = new JTextField();
	tfusername.setFont(new Font("Tahoma", Font.BOLD, 14));
	tfusername.setForeground(new Color(105, 105, 105));
	tfusername.setBounds(220, 20, 170, 25);
	p1.add(tfusername);
	tfusername.setColumns(10);
        
        search = new JButton("Search");
	search.addActionListener(this);
	search.setFont(new Font("Tahoma", Font.BOLD, 14));
	search.setBounds(400, 20,  100,25);
	search.setBackground(Color.BLACK);
        search.setForeground(Color.WHITE);
        p1.add(search);

        JLabel lblname = new JLabel("Name");
	lblname.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblname.setBounds(40, 60, 100, 25);
	p1.add(lblname);

        tfname = new JTextField();
	tfname.setEditable(false);
	tfname.setFont(new Font("Tahoma", Font.BOLD, 14));
	tfname.setForeground(new Color(165, 42, 42));
	tfname.setColumns(10);
	tfname.setBounds(220, 60, 170, 25);
	p1.add(tfname);
        
	JLabel lblquestion = new JLabel("Security Question");
	lblquestion.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblquestion.setBounds(40, 100, 150, 25);
	p1.add(lblquestion);

        tfquestion = new JTextField();
	tfquestion.setEditable(false);
	tfquestion.setFont(new Font("Tahoma", Font.BOLD, 12));
	tfquestion.setForeground(new Color(72, 61, 149));
	tfquestion.setColumns(10);
	tfquestion.setBounds(220, 100, 170, 25);
	p1.add(tfquestion);

	JLabel lblanswer = new JLabel("Answer");
	lblanswer.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblanswer.setBounds(40, 140, 150, 25);
	p1.add(lblanswer);
        
        tfanswer = new JTextField();
	tfanswer.setFont(new Font("Tahoma", Font.BOLD, 14));
	tfanswer.setForeground(new Color(205, 92, 92));
	tfanswer.setColumns(10);
	tfanswer.setBounds(220, 140, 170, 25);
	p1.add(tfanswer);
        
        retrieve = new JButton("Retrieve");
	retrieve.addActionListener(this);
	retrieve.setFont(new Font("Tahoma", Font.BOLD, 14));
	retrieve.setBounds(400, 140, 100, 25);
	retrieve.setBackground(Color.BLACK);
        retrieve.setForeground(Color.WHITE);
	p1.add(retrieve);

        JLabel lblpassword = new JLabel("Password");
	lblpassword.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblpassword.setBounds(40, 180, 150, 25);
	p1.add(lblpassword);

	tfpassword = new JTextField();
	tfpassword.setEditable(false);
	tfpassword.setFont(new Font("Tahoma", Font.BOLD, 14));
	tfpassword.setForeground(new Color(50, 205, 50));
	tfpassword.setColumns(10);
	tfpassword.setBounds(220, 180, 170, 25);
	p1.add(tfpassword);
        
        back = new JButton("Back");
	back.addActionListener(this);
	back.setFont(new Font("Tahoma", Font.BOLD, 14));
	back.setBounds(150, 230, 100, 25);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
	p1.add(back);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/forgotpassword.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel l6 = new JLabel(i3);
        l6.setBounds(560, 70, 200, 200);
        add(l6);

	JPanel panel = new JPanel();
	panel.setBounds(47, 45, 508, 281);
        panel.setBackground(Color.WHITE);
	p1.add(panel);
    }
    
    public void actionPerformed(ActionEvent ae){
            if(ae.getSource() == search){
                try{
                    String query = "select * from account where username= '"+tfusername.getText()+"'"; 
                    Conn c = new Conn();
                    ResultSet rs = c.s.executeQuery(query);
                    if(rs.next()) {
                        tfname.setText(rs.getString("name"));
                        tfquestion.setText(rs.getString("security"));
                    }else{
                        JOptionPane.showMessageDialog(null,"Incorrect username");
                    }
                }catch(Exception e){
                    e.printStackTrace();
                }
            }else if(ae.getSource() == retrieve){
                try{
                    String sql = "select * from account where answer = '"+tfanswer.getText()+"'";
                    Conn conn = new Conn();
                    ResultSet rs = conn.s.executeQuery(sql);
                    if(rs.next()){
                       tfpassword.setText(rs.getString("password")); 
                    }else{
                        JOptionPane.showMessageDialog(null,"Incorrect answer");
                    }
                }catch(Exception e){
                e.printStackTrace();
                }
            }else{
               setVisible(true);
               new Login();
            }
    }
    public static void main(String[] args) {
        new ForgetPassword().setVisible(true);
    }
}