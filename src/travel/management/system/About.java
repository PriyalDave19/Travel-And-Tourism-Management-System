package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener{
    About(){
         setBounds(600, 200, 800, 600);
         setLayout(null);
         getContentPane().setBackground(Color.WHITE);
         
        JLabel l1 = new JLabel( "About this Project :-");
        l1.setBounds(50, 10, 300, 40);
        //l1.setBackground(Color.RED);
        l1.setForeground(Color.RED);
        l1.setFont(new Font("Tahoma",Font.BOLD,25));
        add(l1);
        
        String s = "The  Objective  of  the  Travel  and  Tourism  Management  System \n"
                   +"Project  is  to  develop  a  system  that  automates  the  processes  and \n"
                   +"activities  of  a  travel  and  the  purpose  is  to  design  a  system  using\n"
                   +"which  one  can  perform  all  operations  related  to  traveling. \n\n"
                   +"This  application  will  help  in  accessing  the  information  related  to \n"
                   +"the  travel  to  the  particular  destination  with  great  ease. The  users \n"
                   +"can  track  the  information  related  to  thier  tours  by  this  application.\n"
                   +"The  travel  agency  information  can  also  be  obtained  through  this  application.\n\n"
                   +"Advantages  of  Project :-\n"
                   +"♦  Gives  accurate  information.\n"
                   +"♦  Simplifies  the  manual  work.\n"
                   +"♦  It minimizes  the  documentation  related  work.\n"
                   +"♦  Provides  up  to  date  information  warning.\n"
                   +"♦  Friendly  Environment  by  providing  warning  messages.\n"
                   +"♦  Travelers  details  can  be  provided.\n"
                   +"♦  Booking  confirmation  notification.\n";
        
        
        TextArea area = new TextArea(s,10,40,Scrollbar.VERTICAL);
        area.setEditable(false);
        area.setBounds(40, 75, 700, 390);
        area.setFont(new Font("Tahoma",Font.BOLD,20));
        add(area);
        
        JButton back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Tahoma",Font.BOLD,15));
        back.setBounds(300, 500, 150, 35);
        back.addActionListener(this);
        add(back);
         
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
    }
    
     public static void main(String []args){
        new  About();
    }
}
