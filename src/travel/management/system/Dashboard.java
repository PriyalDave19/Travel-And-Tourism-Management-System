package travel.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Dashboard extends JFrame implements ActionListener {

    String username;
    JButton addPersonalDetails, updatePersonalDetails, viewPersonalDetails,
            deletePersonalDetails, checkpackages, bookpackage, viewpackage, viewhotels,
            viewbookedhotel, bookhotel, destinations, payments, calculator, help, about;

    Dashboard(String username) {
        this.username = username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0, 0, 102));
        p1.setBounds(0, 0, 1600, 65);
        add(p1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(5, 0, 70, 70);
        p1.add(icon);

        JLabel heading = new JLabel("Dashboard");
        heading.setBounds(80, 10, 300, 40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("tahoma", Font.BOLD, 30));
        p1.add(heading);

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0, 0, 102));
        p2.setBounds(0, 65, 300, 900);
        add(p2);

        addPersonalDetails = new JButton("Add Personal Details");
        addPersonalDetails.setBackground(new Color(0, 0, 102));
        addPersonalDetails.setForeground(Color.WHITE);
        addPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        addPersonalDetails.setBounds(0, 0, 300, 50);
        addPersonalDetails.addActionListener(this);
        addPersonalDetails.setMargin(new Insets(0, 0, 0, 60));
        p2.add(addPersonalDetails);

        updatePersonalDetails = new JButton("Update Personal Details");
        updatePersonalDetails.setBackground(new Color(0, 0, 102));
        updatePersonalDetails.setForeground(Color.WHITE);
        updatePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        updatePersonalDetails.setBounds(0, 50, 300, 50);
        updatePersonalDetails.addActionListener(this);
        updatePersonalDetails.setMargin(new Insets(0, 0, 0, 30));
        p2.add(updatePersonalDetails);

        viewPersonalDetails = new JButton("View Details");
        viewPersonalDetails.setBackground(new Color(0, 0, 102));
        viewPersonalDetails.setForeground(Color.WHITE);
        viewPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewPersonalDetails.setBounds(0, 100, 300, 50);
        viewPersonalDetails.addActionListener(this);
        viewPersonalDetails.setMargin(new Insets(0, 0, 0, 130));
        p2.add(viewPersonalDetails);

        deletePersonalDetails = new JButton("Delete Personal Details");
        deletePersonalDetails.setBackground(new Color(0, 0, 102));
        deletePersonalDetails.setForeground(Color.WHITE);
        deletePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        deletePersonalDetails.setBounds(0, 150, 300, 50);
        deletePersonalDetails.addActionListener(this);
        deletePersonalDetails.setMargin(new Insets(0, 0, 0, 40));
        p2.add(deletePersonalDetails);

        checkpackages = new JButton("Check Packages ");
        checkpackages.setBackground(new Color(0, 0, 102));
        checkpackages.setForeground(Color.WHITE);
        checkpackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
        checkpackages.setBounds(0, 200, 300, 50);
        checkpackages.addActionListener(this);
        checkpackages.setMargin(new Insets(0, 0, 0, 105));
        p2.add(checkpackages);

        bookpackage = new JButton("Book Package ");
        bookpackage.setBackground(new Color(0, 0, 102));
        bookpackage.setForeground(Color.WHITE);
        bookpackage.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookpackage.setBounds(0, 250, 300, 50);
        bookpackage.addActionListener(this);
        bookpackage.setMargin(new Insets(0, 0, 0, 117));
        p2.add(bookpackage);

        viewpackage = new JButton("View Package ");
        viewpackage.setBackground(new Color(0, 0, 102));
        viewpackage.setForeground(Color.WHITE);
        viewpackage.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewpackage.setBounds(0, 300, 300, 50);
        viewpackage.addActionListener(this);
        viewpackage.setMargin(new Insets(0, 0, 0, 117));
        p2.add(viewpackage);

        viewhotels = new JButton("View Hotels ");
        viewhotels.setBackground(new Color(0, 0, 102));
        viewhotels.setForeground(Color.WHITE);
        viewhotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewhotels.setBounds(0, 350, 300, 50);
        viewhotels.addActionListener(this);
        viewhotels.setMargin(new Insets(0, 0, 0, 125));
        p2.add(viewhotels);

        bookhotel = new JButton("Book Hotel ");
        bookhotel.setBackground(new Color(0, 0, 102));
        bookhotel.setForeground(Color.WHITE);
        bookhotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookhotel.setBounds(0, 400, 300, 50);
        bookhotel.addActionListener(this);
        bookhotel.setMargin(new Insets(0, 0, 0, 135));
        p2.add(bookhotel);

        viewbookedhotel = new JButton("View Booked Hotel ");
        viewbookedhotel.setBackground(new Color(0, 0, 102));
        viewbookedhotel.setForeground(Color.WHITE);
        viewbookedhotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewbookedhotel.setBounds(0, 450, 300, 50);
        viewbookedhotel.addActionListener(this);
        viewbookedhotel.setMargin(new Insets(0, 0, 0, 60));
        p2.add(viewbookedhotel);

        destinations = new JButton("Destinations");
        destinations.setBackground(new Color(0, 0, 102));
        destinations.setForeground(Color.WHITE);
        destinations.setFont(new Font("Tahoma", Font.PLAIN, 20));
        destinations.setBounds(0, 500, 300, 50);
        destinations.addActionListener(this);
        destinations.setMargin(new Insets(0, 0, 0, 125));
        p2.add(destinations);

        payments = new JButton("Payments");
        payments.setBackground(new Color(0, 0, 102));
        payments.setForeground(Color.WHITE);
        payments.setFont(new Font("Tahoma", Font.PLAIN, 20));
        payments.setBounds(0, 550, 300, 50);
        payments.addActionListener(this);
        payments.setMargin(new Insets(0, 0, 0, 155));
        p2.add(payments);

        calculator = new JButton("Calculator");
        calculator.setBackground(new Color(0, 0, 102));
        calculator.setForeground(Color.WHITE);
        calculator.setFont(new Font("Tahoma", Font.PLAIN, 20));
        calculator.setBounds(0, 600, 300, 50);
        calculator.addActionListener(this);
        calculator.setMargin(new Insets(0, 0, 0, 145));
        p2.add(calculator);

        help = new JButton("Help");
        help.setBackground(new Color(0, 0, 102));
        help.setForeground(Color.WHITE);
        help.setFont(new Font("Tahoma", Font.PLAIN, 20));
        help.setBounds(0, 650, 300, 50);
        help.addActionListener(this);
        help.setMargin(new Insets(0, 0, 0, 155));
        p2.add(help);

        about = new JButton("About");
        about.setBackground(new Color(0, 0, 102));
        about.setForeground(Color.WHITE);
        about.setFont(new Font("Tahoma", Font.PLAIN, 20));
        about.setBounds(0, 690, 300, 50);
        about.addActionListener(this);
        about.setMargin(new Insets(0, 0, 0, 175));
        p2.add(about);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(0, 0, 1650, 1000);
        add(image);

        JLabel text = new JLabel("Travel and Tourism Management System");
        text.setBounds(470, 70, 1200, 70);
        text.setFont(new Font("RAILWAY", Font.PLAIN, 55));
        text.setForeground(Color.WHITE);
        image.add(text);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == addPersonalDetails) {
            new AddCustomer(username);
        } else if (ae.getSource() == updatePersonalDetails) {
            new UpdateCustomer(username);
        } else if (ae.getSource() == viewPersonalDetails) {
            new ViewCustomer(username);
        } else if (ae.getSource() == checkpackages) {
            new CheckPackage();
        } else if (ae.getSource() == bookpackage) {
            new BookPackage(username);
        } else if (ae.getSource() == viewpackage) {
            new ViewPackage(username);
        }else if (ae.getSource() == viewhotels) {
            new CheckHotels();
        }else if (ae.getSource() == deletePersonalDetails) {
            new DeleteDetails(username);
        }else if (ae.getSource() == destinations) {
            new Destinations();
        }else if (ae.getSource() == bookhotel) {
             new  BookHotel(username);
        }else if (ae.getSource() == viewbookedhotel) {
             new  ViewBookedHotel(username);
        }else if (ae.getSource() == payments) {
             new  Payment();
        }else if (ae.getSource() == calculator) {
             try{
                Runtime.getRuntime().exec("calc.exe");
             }catch(Exception e){
                 e.printStackTrace();
             }
        }else if (ae.getSource() == help) {
             new Contact();
        }else if (ae.getSource() == about) {
             new About();
        }
    }
    public static void main(String[] args) {
        new Dashboard("");
    }
}
