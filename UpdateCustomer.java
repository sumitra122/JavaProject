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
import java.lang.*;
public class UpdateCustomer  extends JFrame implements ActionListener {
     JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20;
 JTextField tf0, tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10,tf11,tf12,tf13,tf14,tf15;
 Choice ch0,ch1,ch2,ch3,ch4,ch5;
 JButton bt1,bt2,bt3,bt4,bt5;
 JPanel p1,p2,p3;
 Font f1,f;
 UpdateCustomer(){
     super("customer add");
 setSize(850,700);
 setLocation(600,200);
 setResizable(false);
 
 ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("gym_management_icons/update1.jpg"));
 Image im=img.getImage().getScaledInstance(300,600,Image.SCALE_DEFAULT);
 l15=new JLabel(new ImageIcon(im));

 f1=new Font("Lucida Fax",Font.BOLD,27);
f=new Font("MS UI Gothic",Font.BOLD,18);

l1=new JLabel("Name");
l2=new JLabel("Father Name");
l3=new JLabel("E-mail");
l4=new JLabel("Address");
l5=new JLabel("Contact no");
l7=new JLabel("Membership Category");
//l8=new JLabel("Recepit No");
l9=new JLabel("Payment Plan (month)");

l10=new JLabel("Gender");
l11=new JLabel("Hieght(inc)");
l12=new JLabel("Weight(kg)");
l13=new JLabel("Remarks");
l14=new JLabel("Update Customer Detail");
l17=new JLabel("Trainer Name");
l18=new JLabel("Update Amount");
l19=new JLabel("Date of Payment");
l20=new JLabel("Due Date");

l14.setFont(f1);
l14.setForeground(decode("#f39c12"));
l14.setHorizontalAlignment(JLabel.CENTER);

tf0=new JTextField();
tf1=new JTextField();
tf2=new JTextField();
tf3=new JTextField();
tf4=new JTextField();
tf5=new JTextField();
tf6=new JTextField();
tf7=new JTextField();
tf8=new JTextField();
tf9=new JTextField();
tf10=new JTextField();
tf11=new JTextField();
tf12=new JTextField();
tf13=new JTextField();
tf14=new JTextField();
tf15=new JTextField();

tf0.setOpaque(false);
tf1.setOpaque(false);
tf2.setOpaque(false);
tf3.setOpaque(false);
tf4.setOpaque(false);
tf5.setOpaque(false);
tf6.setOpaque(false);
tf7.setOpaque(false);
tf8.setOpaque(false);
tf9.setOpaque(false);
tf10.setOpaque(false);
tf11.setOpaque(false);
tf12.setOpaque(false);
tf13.setOpaque(false);
tf14.setOpaque(false);
tf15.setOpaque(false);

tf0.setCaretColor(decode("#d2d7d3"));
tf1.setCaretColor(decode("#d2d7d3"));
tf2.setCaretColor(decode("#d2d7d3"));
tf3.setCaretColor(decode("#d2d7d3"));
tf4.setCaretColor(decode("#d2d7d3"));
tf5.setCaretColor(decode("#d2d7d3"));
tf6.setCaretColor(decode("#d2d7d3"));
tf7.setCaretColor(decode("#d2d7d3"));
tf8.setCaretColor(decode("#d2d7d3"));
tf9.setCaretColor(decode("#d2d7d3"));
tf10.setCaretColor(decode("#d2d7d3"));
tf11.setCaretColor(decode("#d2d7d3"));
tf12.setCaretColor(decode("#d2d7d3"));
tf13.setCaretColor(decode("#d2d7d3"));
tf14.setCaretColor(decode("#d2d7d3"));
tf15.setCaretColor(decode("#d2d7d3"));




tf0.setForeground(decode("#d2d7d3"));
tf1.setForeground(decode("#d2d7d3"));
tf2.setForeground(decode("#d2d7d3"));
tf3.setForeground(decode("#d2d7d3"));
tf4.setForeground(decode("#d2d7d3"));
tf5.setForeground(decode("#d2d7d3"));
tf6.setForeground(decode("#d2d7d3"));
tf7.setForeground(decode("#d2d7d3"));
tf8.setForeground(decode("#d2d7d3"));
tf9.setForeground(decode("#d2d7d3"));
tf10.setForeground(decode("#d2d7d3"));
tf11.setForeground(decode("#d2d7d3"));
tf12.setForeground(decode("#d2d7d3"));
tf13.setForeground(decode("#d2d7d3"));
tf14.setForeground(decode("#d2d7d3"));
tf15.setForeground(decode("#d2d7d3"));

/*ch0=new Choice();
ch0.setFont(f);
try {
    MyConnection obj0=new MyConnection();
    String q0="Select recipt_no from add_customer";
    ResultSet rest=obj0.stm.executeQuery(q0);
    while(rest.next()){
        ch0.add(rest.getString("recipt_no"));
    }
} catch (Exception evx){
    evx.printStackTrace();
}*/


/*ch1=new Choice();
ch2=new Choice();
ch3=new Choice();
ch5=new Choice();

ch1.add("Public");
ch1.add("Personal");

ch2.add("1");
ch2.add("3");
ch2.add("6");
ch2.add("12");


ch3.add("Male");
ch3.add("Female");*/
 bt5 = new JButton("Search ID or Name");

bt1=new JButton("Update");
bt2=new JButton("Cancel");

bt1.setBackground(Color.BLACK);
bt1.setForeground(Color.CYAN);
bt2.setBackground(Color.BLACK);
bt2.setForeground(Color.RED);
bt5.setBackground(Color.BLACK);
bt5.setForeground(Color.YELLOW);

bt1.addActionListener(this);
bt2.addActionListener(this);
//bt5.addActionListener(this);

l1.setFont(f);
l2.setFont(f);
l3.setFont(f);
l4.setFont(f);
l5.setFont(f);

l7.setFont(f);
//l8.setFont(f);
l9.setFont(f);
l10.setFont(f);
l11.setFont(f);
l12.setFont(f);
l13.setFont(f);
l17.setFont(f);
l18.setFont(f);
l19.setFont(f);
l20.setFont(f);

tf0.setFont(f);
tf1.setFont(f);
tf2.setFont(f);
tf3.setFont(f);
tf4.setFont(f);
tf5.setFont(f);
tf6.setFont(f);
tf7.setFont(f);
tf8.setFont(f);
tf9.setFont(f);
tf10.setFont(f);
tf11.setFont(f);
tf12.setFont(f);
tf13.setFont(f);
tf14.setFont(f);
tf15.setFont(f);


/*ch1.setFont(f);
ch2.setFont(f);
ch3.setFont(f);
ch5.setFont(f);*/

bt1.setFont(f);
bt2.setFont(f);
bt5.setFont(f);

//bt3=new JButton("Public");
//bt4=new JButton("Personal");

//bt3.setBackground(Color.BLACK);
//bt3.setForeground(Color.WHITE);
//bt4.setForeground(Color.WHITE);
//bt4.setBackground(Color.BLACK);

//bt3.addActionListener(this);
//bt4.addActionListener(this);

p1=new JPanel();
p1.setLayout(new GridLayout(17,2,10,10));
p1.add(bt5);
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
p1.add(l7);
p1.add(tf6);

p1.add(l9);
p1.add(tf7);
p1.add(l10);
p1.add(tf8);
p1.add(l11);
p1.add(tf9);
p1.add(l12);
p1.add(tf10);
p1.add(l13);
p1.add(tf12);
p1.add(l17);
p1.add(tf11);
p1.add(l18);
p1.add(tf13);
p1.add(l19);
p1.add(tf14);
p1.add(l20);
p1.add(tf15);

p1.add(bt1);
p1.add(bt2);

p1.setBackground(decode("#013243"));

p2=new JPanel();
p2.setLayout(new GridLayout(1,1,10,10));
p2.setBackground(decode("#22313f"));
p2.add(l14);

p3=new JPanel();
p3.setLayout(new GridLayout(1,1,10,10));
p3.setBackground(decode("#22313f"));
p3.add(l15);

l1.setForeground(decode("#d2d7d3"));
l2.setForeground(decode("#d2d7d3"));
l3.setForeground(decode("#d2d7d3"));
l4.setForeground(decode("#d2d7d3"));
l5.setForeground(decode("#d2d7d3"));

l7.setForeground(decode("#d2d7d3"));
//l8.setForeground(decode("#d2d7d3"));
l9.setForeground(decode("#d2d7d3"));
l10.setForeground(decode("#d2d7d3"));
l11.setForeground(decode("#d2d7d3"));
l12.setForeground(decode("#d2d7d3"));
l13.setForeground(decode("#d2d7d3"));
l17.setForeground(decode("#d2d7d3"));
l18.setForeground(decode("#d2d7d3"));
l19.setForeground(decode("#d2d7d3"));
l20.setForeground(decode("#d2d7d3"));

setLayout(new BorderLayout(0,0));

add(p2,"North");
add(p3,"West");
add(p1,"Center");

bt5.addMouseListener(new MouseAdapter()
{
    @Override
    public void mouseClicked(MouseEvent arg0)
    {
        try {
            MyConnection obj2=new MyConnection();
            int recipt=Integer.parseInt(tf0.getText());
            String query="Select * from add_customer where recipt_no='"+recipt+"'";
            ResultSet rest1=obj2.stm.executeQuery(query);
            if (rest1.next()==false)
            {
                JOptionPane.showMessageDialog(null,"sorry record not found!! ");
                        tf1.setText("");
                        tf2.setText("");
                        tf3.setText("");
                        tf4.setText("");
                        tf5.setText("");
                        tf6.setText("");
                        tf7.setText("");
                        tf8.setText("");
                        tf9.setText("");
                        tf10.setText("");
                        tf11.setText("");
                        tf12.setText("");
                        tf13.setText("");
                        tf14.setText("");
                        tf15.setText("");
                        
                    }
            else{
                tf1.setText(rest1.getString("name"));
                tf2.setText(rest1.getString("fname"));
                tf3.setText(rest1.getString("email"));
                tf4.setText(rest1.getString("address"));
                tf5.setText(rest1.getString("contactNo"));
                tf6.setText(rest1.getString("category"));
                tf7.setText(rest1.getString("payments_plan"));
                tf8.setText(rest1.getString("gender"));
                tf9.setText(rest1.getString("height"));
                tf10.setText(rest1.getString("weight"));
                tf11.setText(rest1.getString("trainer_name"));
                tf12.setText(rest1.getString("remarks"));
                tf13.setText(rest1.getString("amount"));
                tf14.setText(rest1.getString("dateofpayment"));
                tf15.setText(rest1.getString("duedate"));
            }
            
        } catch(Exception exx){
            exx.printStackTrace();
        }
    }
});

 }
     @Override
 public void actionPerformed(ActionEvent e){
     try {
        /* if(e.getSource()==bt3){
             MyConnection obj1=new MyConnection();
             String q1="select * from add_trainer where catogory='public'";
             ResultSet rest1 =obj1.stm.executeQuery(q1);
             while(rest1.next()){
                 ch5.add(rest1.getString("name"));
             }
         }*/
        /* if(e.getSource()==bt4){
             MyConnection obj1=new MyConnection();
             String q1="select * from add_trainer where catogory='personal'";
             ResultSet rest1 =obj1.stm.executeQuery(q1);
             while(rest1.next()){
                 ch5.add(rest1.getString("name"));
             }
         }*/
         String name=tf1.getText();
String fname=tf2.getText();
String email=tf3.getText();
String address=tf4.getText();
String cont=tf5.getText();

String tcat=tf6.getText();
String minag=tf7.getText();
String gender=tf8.getText();
float height=Float.parseFloat(tf9.getText());
float weight=Float.parseFloat(tf10.getText());
String tname=tf11.getText();
String remarks=tf12.getText();
int id=Integer.parseInt(tf0.getText());
String amount=tf13.getText();
String dateofpayment=tf14.getText();
String duedate=tf15.getText();

if(e.getSource()==bt1){
    MyConnection obj=new MyConnection();
String q="update add_customer set name='"+name+"',fname='"+fname+"',email='"+email+"',address='"+address+"',contactNo='"+cont+"',payments_plan='"+minag+"',gender='"+gender+"',height='"+height+"',weight='"+weight+"',remarks='"+remarks+"',trainer_name='"+tname+"',category='"+tcat+"',amount='"+amount+"',dateofpayment='"+dateofpayment+"',duedate='"+duedate+"'";
obj.stm.executeUpdate(q);
JOptionPane.showMessageDialog(null,"Data Updated Successfully....");
setVisible(false);
new UpdateCustomer().setVisible(true);
}
//if(e.getSource()==bt2)
 //{
 //JOptionPane.showMessageDialog(null,"Are you Sure?");
 //setVisible(false);
 //}
     }catch(Exception ex){
         ex.printStackTrace();
     }
     if(e.getSource()==bt2)
 {
 JOptionPane.showMessageDialog(null,"Are you Sure?");
 setVisible(false);
 }
 }
 public static void main(String args[])
{
 new UpdateCustomer().setVisible(true);
}
}

 


