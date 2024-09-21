package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PhonePe extends JFrame implements ActionListener {

    PhonePe() {

        setBounds(500, 200, 800, 600);
        //setLayout(null);
        //getContentPane().setBackground(Color.WHITE);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("payments//WhatsApp Image 2023-11-06 at 22.20.26_21862e8b.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800, 450, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3); 
        icon.setBounds(20, 0, 800,600);
        add(icon);

        
        JEditorPane pane = new JEditorPane();   // making  text area && also use these place JTextarea 
        pane.setEditable(false);              // but difficiult to add a scroll bar ..... 

        try {
            pane.setPage("https://paytm.com/rent-payment");        // for load a page......
        } catch (Exception e) {
            pane.setContentType("text/html");
            pane.setText("<html> Could not load,Error 404 </html>");
        }

        JScrollPane sp = new JScrollPane(pane);         //  FOR SCROLLING .......
        getContentPane().add(sp);                       //  editor must be pass otherwise not show

        JButton back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        //back.setFont(new Font("Tahoma",Font.BOLD,15));
        back.setBounds(610, 20, 80, 40);
        back.addActionListener(this);
        icon.add(back);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Payment();
    }

    public static void main(String[] args) {
        new PhonePe();
    }
}
