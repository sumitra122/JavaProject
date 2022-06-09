package gym_manager;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import static java.awt.Color.decode;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.sql.*;
import java.util.*;

public class UpdateTrainer extends JFrame implements ActionListener {
     String x[]={"Trainer Id", "Name"};
     String y[][]=new String[20][2];
    int i=0,j=0;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18;
    JTextField tf0,tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8, tf9, tf10, tf11, tf12, tf13, tf14, tf15, tf16;
    Choice ch0, ch1, ch2, ch3;
    JButton b1, b2,b3;
    JPanel p1, p2, p3;
    Font f, f1;
    JTable t;

    UpdateTrainer() {
        super("tainer add");
        setSize(850, 700);
        setLocation(600, 200);
        setResizable(false);

        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("gym_management_icons/home1.jpg"));
        Image im = img.getImage().getScaledInstance(370, 650, Image.SCALE_DEFAULT);
        l15 = new JLabel(new ImageIcon(im));

        f1 = new Font("Lucida Fax", Font.BOLD, 27);
        f = new Font("MS UI Gothic", Font.BOLD, 18);

         try{
              MyConnection obj=new MyConnection();
              String q="Select * from add_trainer";
              ResultSet rest=obj.stm.executeQuery(q);
              while(rest.next()){
                  y[i][j++]=rest.getString("tid");
                  y[i][j++]=rest.getString("name");
                   i++;
                   j=0;
                 
                }
              t=new JTable(y,x);
              t.setFont(f);
              t.setBackground(decode("#013243"));
              t.setForeground(decode("#d2d7d3"));
          }
         catch (Exception e) {
              e.printStackTrace();
          }
          JScrollPane sp=new JScrollPane(t);
          Font f1=new Font("Lucida Fax",Font.BOLD,25);
        
        l1 = new JLabel("Name");
        l2 = new JLabel("Father Name");
        l3 = new JLabel("E-mail");
        l4 = new JLabel("Address");
        l5 = new JLabel("Contact no");
        l6 = new JLabel("Emergency no");
        l7 = new JLabel("Tainer Category");
        //l8 = new JLabel("Trainer ID");
        l9 = new JLabel("Min Aggrement");
        l10 = new JLabel("Gender");
        l11 = new JLabel("Hieght(inc)");
        l12 = new JLabel("Weight(kg)");
        l13 = new JLabel("Remarks");
        l16 = new JLabel("Trainer Fees");
        l17 = new JLabel("Date Of Paymemet");
        l18 = new JLabel("Due Date");
        l14 = new JLabel("Update Trainer Detail");

        l14.setFont(f1);
        l14.setForeground(decode("#f39c12"));
        l14.setHorizontalAlignment(JLabel.CENTER);

        tf0 = new JTextField();
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        tf4 = new JTextField();
        tf5 = new JTextField();
        tf6 = new JTextField();
        tf8 = new JTextField();
        tf9 = new JTextField();
        tf10 = new JTextField();
        tf11 = new JTextField();
        tf12 = new JTextField();
        tf13 = new JTextField();
        tf14 = new JTextField();
        tf15 = new JTextField();
        tf16 = new JTextField();

        tf0.setCaretColor(decode("#d2d7d3"));
        tf1.setCaretColor(decode("#d2d7d3"));
        tf2.setCaretColor(decode("#d2d7d3"));
        tf3.setCaretColor(decode("#d2d7d3"));
        tf4.setCaretColor(decode("#d2d7d3"));
        tf5.setCaretColor(decode("#d2d7d3"));
        tf6.setCaretColor(decode("#d2d7d3"));
//tf7.setCaretColor(decode("#d2d7d3"));
        tf8.setCaretColor(decode("#d2d7d3"));
        tf9.setCaretColor(decode("#d2d7d3"));
        tf10.setCaretColor(decode("#d2d7d3"));
        tf11.setCaretColor(decode("#d2d7d3"));
        tf12.setCaretColor(decode("#d2d7d3"));
        tf13.setCaretColor(decode("#d2d7d3"));
        tf14.setCaretColor(decode("#d2d7d3"));
        tf15.setCaretColor(decode("#d2d7d3"));
        tf16.setCaretColor(decode("#d2d7d3"));

         tf0.setOpaque(false);
        tf1.setOpaque(false);
        tf2.setOpaque(false);
        tf3.setOpaque(false);
        tf4.setOpaque(false);
        tf5.setOpaque(false);
        tf6.setOpaque(false);

        tf8.setOpaque(false);
        tf9.setOpaque(false);
        tf10.setOpaque(false);
        tf11.setOpaque(false);
        tf12.setOpaque(false);
        tf13.setOpaque(false);
        tf14.setOpaque(false);
        tf15.setOpaque(false);
        tf16.setOpaque(false);
        

        tf0.setForeground(decode("#d2d7d3"));
        tf1.setForeground(decode("#d2d7d3"));
        tf2.setForeground(decode("#d2d7d3"));
        tf3.setForeground(decode("#d2d7d3"));
        tf4.setForeground(decode("#d2d7d3"));
        tf5.setForeground(decode("#d2d7d3"));
        tf6.setForeground(decode("#d2d7d3"));

        tf8.setForeground(decode("#d2d7d3"));
        tf9.setForeground(decode("#d2d7d3"));
        tf10.setForeground(decode("#d2d7d3"));
        tf11.setForeground(decode("#d2d7d3"));
        tf12.setForeground(decode("#d2d7d3"));
        tf13.setForeground(decode("#d2d7d3"));
        tf14.setForeground(decode("#d2d7d3"));
        tf15.setForeground(decode("#d2d7d3"));
        tf16.setForeground(decode("#d2d7d3"));

        /*ch0 = new Choice();
        ch0.setFont(f);
        try {
            MyConnection obj0 = new MyConnection();
            String q0 = "Select tid from add_trainer";
            ResultSet rest = obj0.stm.executeQuery(q0);
            while (rest.next()) {
                ch0.add(rest.getString("tid"));
            }
        } catch (Exception evx) {
            evx.printStackTrace();
        }*/
        /*ch1=new Choice();
ch2=new Choice();
ch3=new Choice();

ch1.add("Public");
ch2.add("Personal");

ch1.add("3 Months");
ch2.add("6 Months");
ch2.add("1 Years");
ch2.add("2 Years");
ch2.add("3 Years");

ch3.add("Male");
ch3.add("Female");*/

        b3 = new JButton("Search ID or Name");
        b1 = new JButton("Upadate");
        b2 = new JButton("Cancel");

        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.CYAN);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.RED);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.YELLOW);

        b1.addActionListener(this);
        b2.addActionListener(this);

        l1.setFont(f);
        l2.setFont(f);
        l3.setFont(f);
        l4.setFont(f);
        l5.setFont(f);
        l6.setFont(f);
        l7.setFont(f);
       // l8.setFont(f);
        l9.setFont(f);
        l10.setFont(f);
        l11.setFont(f);
        l12.setFont(f);
        l13.setFont(f);
        l16.setFont(f);
        l17.setFont(f);
        l18.setFont(f);
        
        tf0.setFont(f);
        tf1.setFont(f);
        tf2.setFont(f);
        tf3.setFont(f);
        tf4.setFont(f);
        tf5.setFont(f);
        tf6.setFont(f);

        tf8.setFont(f);
        tf9.setFont(f);
        tf10.setFont(f);
        tf11.setFont(f);
        tf12.setFont(f);
        tf13.setFont(f);
        tf14.setFont(f);
        tf15.setFont(f);
        tf16.setFont(f);

//ch1.setFont(f);
//ch2.setFont(f);
//ch3.setFont(f);
        b1.setFont(f);
        b2.setFont(f);

        p1 = new JPanel();
        p1.setLayout(new GridLayout(17, 2, 10, 10));
        p1.add(b3);
        p1.add(tf0);
       
        p1.add(l1);
        p1.add(tf1);
        p1.add(l2);
        p1.add(tf2);
        p1.add(l3);
        p1.add(tf3);
        p1.add(l4);
        p1.add(tf4);
        p1.add(l5);
        p1.add(tf5);
        p1.add(l6);
        p1.add(tf6);
        p1.add(l7);
        p1.add(tf8);
        p1.add(l9);
        p1.add(tf9);
        p1.add(l10);
        p1.add(tf10);
        p1.add(l11);
        p1.add(tf11);
        p1.add(l12);
        p1.add(tf12);
        p1.add(l13);
        p1.add(tf13);
        p1.add(l16);
        p1.add(tf14);
        p1.add(l17);
        p1.add(tf15);
        p1.add(l18);
        p1.add(tf16);

        p1.add(b1);
        p1.add(b2);
       

        p1.setBackground(decode("#013243"));

        p2 = new JPanel();
        p2.setLayout(new GridLayout(1, 1, 10, 10));
        p2.setBackground(decode("#22313f"));
        p2.add(l14);

        p3 = new JPanel();
        p3.setLayout(new GridLayout(1, 1, 10, 10));
        p3.setBackground(decode("#22313f"));
        p3.add(l15);

        l1.setForeground(decode("#d2d7d3"));
        l2.setForeground(decode("#d2d7d3"));
        l3.setForeground(decode("#d2d7d3"));
        l4.setForeground(decode("#d2d7d3"));
        l5.setForeground(decode("#d2d7d3"));
        l6.setForeground(decode("#d2d7d3"));
        l7.setForeground(decode("#d2d7d3"));
       // l8.setForeground(decode("#d2d7d3"));
        l9.setForeground(decode("#d2d7d3"));
        l10.setForeground(decode("#d2d7d3"));
        l11.setForeground(decode("#d2d7d3"));
        l12.setForeground(decode("#d2d7d3"));
        l13.setForeground(decode("#d2d7d3"));
        l16.setForeground(decode("#d2d7d3"));
        l17.setForeground(decode("#d2d7d3"));
        l18.setForeground(decode("#d2d7d3"));

        tf6.setForeground(Color.RED);

        setLayout(new BorderLayout(0, 0));

        add(p2, "North");
        add(p3, "West");
        add(p1, "Center");

        b3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                try {
                    MyConnection obj2 = new MyConnection();
                    int trainer_id = Integer.parseInt(tf0.getText());
                    String query = "Select * from add_trainer where tid='" + trainer_id + "'";
                    ResultSet rest1 = obj2.stm.executeQuery(query);
                    if (rest1.next()==false) {
                        JOptionPane.showMessageDialog(null,"sorry record not found!! ");
                        tf1.setText("");
                        tf2.setText("");
                        tf3.setText("");
                        tf4.setText("");
                        tf5.setText("");
                        tf6.setText("");
                        tf8.setText("");
                        tf9.setText("");
                        tf10.setText("");
                        tf11.setText("");
                        tf12.setText("");
                        tf13.setText("");
                        tf14.setText("");
                        tf15.setText("");
                        tf16.setText("");
                    }
                    else{
                        tf1.setText(rest1.getString("name"));
                        tf2.setText(rest1.getString("fname"));
                        tf3.setText(rest1.getString("email"));
                        tf4.setText(rest1.getString("address"));
                        tf5.setText(rest1.getString("contactNo"));
                        tf6.setText(rest1.getString("emergencyNo"));
                        tf8.setText(rest1.getString("catogory"));
                        tf9.setText(rest1.getString("min_aggrement"));
                        tf10.setText(rest1.getString("gender"));
                        tf11.setText(rest1.getString("height"));
                        tf12.setText(rest1.getString("weight"));
                        tf13.setText(rest1.getString("remarks"));
                        tf14.setText(rest1.getString("trainer_fee"));
                        tf15.setText(rest1.getString("dateofpayment"));
                        tf16.setText(rest1.getString("duedate"));

                    }

                } catch (Exception exx) {
                    exx.printStackTrace();
                }
            }
        });
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {

        String name = tf1.getText();
        String fname = tf2.getText();
        String email = tf3.getText();
        String address = tf4.getText();
        String cont = tf5.getText();
        String eno = tf6.getText();
        String tcat = tf8.getText();
        Integer.parseInt(tf0.getText());
        String minag = tf9.getText();
        String gender = tf10.getText();
        float height = Float.parseFloat(tf11.getText());
        float weight = Float.parseFloat(tf12.getText());
        String remarks = tf13.getText();
        String trainer_fee = tf14.getText();
        String dateofpayment = tf15.getText();
        String duedate = tf16.getText();

        try {
            
            if (e.getSource() == b1) {
                MyConnection obj = new MyConnection();
                String q = "update add_trainer set name='" + name + "',fname='" + fname + "',email='" + email + "',address='" + address + "',contactNo='" + cont + "',emergencyNo='" + eno + "',catogory='" + tcat + "',min_aggrement='" + minag + "',gender='" + gender + "',height='" + height + "',weight='" + weight + "',remarks='" + remarks + "',trainer_fee='" + trainer_fee + "',dateofpayment='" + dateofpayment + "',duedate='" + duedate + "'";
                obj.stm.executeUpdate(q);
                JOptionPane.showMessageDialog(null, "Data Updates Successfully");
                setVisible(false);
                new UpdateTrainer().setVisible(true);

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        if (e.getSource() == b2) {
            JOptionPane.showMessageDialog(null, "Are You  sure");
            setVisible(false);
        }
    }

    public static void main(String args[]) {
        new UpdateTrainer().setVisible(true);
    }
}
