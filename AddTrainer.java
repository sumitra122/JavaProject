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



public class AddTrainer extends JFrame implements ActionListener
{
 JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18;
 JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10,tf11,tf12,tf13;
 Choice ch1,ch2,ch3;
 JButton bt1,bt2;
 JPanel p1,p2,p3;
 Font f1,f;
public AddTrainer()
{
 super("tainer add");
 setSize(850,700);
 setLocation(600,200);
 setResizable(false);
 
 ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("gym_management_icons/trainer2.jpg"));
 Image im=img.getImage().getScaledInstance(370,650,Image.SCALE_DEFAULT);
 l15=new JLabel(new ImageIcon(im));

 f1=new Font("Lucida Fax",Font.BOLD,25);
f=new Font("MS UI Gothic",Font.BOLD,18);

l1=new JLabel("Name");
l2=new JLabel("Father Name");
l3=new JLabel("E-mail");
l4=new JLabel("Address");
l5=new JLabel("Contact no");
l6=new JLabel("Emergency no");
l7=new JLabel("Tainer Category");
l8=new JLabel("Trainer ID");
l9=new JLabel("Min Aggrement");
l10=new JLabel("Gender");
l11=new JLabel("Hieght(inc)");
l12=new JLabel("Weight(kg)");
l13=new JLabel("Remarks");
l16=new JLabel("Trainer Fees");
l17=new JLabel("Date Of Paymemet");
l18=new JLabel("Due Date");
l14=new JLabel("Welcome New Trainer");

l14.setFont(f1);
l14.setForeground(decode("#f39c12"));
l14.setHorizontalAlignment(JLabel.CENTER);

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

ch1=new Choice();
ch2=new Choice();
ch3=new Choice();

ch1.add("Public");
ch1.add("Personal");

ch2.add("1 Months");
ch2.add("3 Months");
ch2.add("6 Months");
ch2.add("1 Years");
ch2.add("2 Years");
ch2.add("3 Years");

ch3.add("Male");
ch3.add("Female");

bt1=new JButton("Submit");
bt2=new JButton("Cancel");

bt1.setBackground(Color.BLACK);
bt1.setBackground(Color.CYAN);
bt2.setBackground(Color.BLACK);
bt2.setBackground(Color.RED);

bt1.addActionListener(this);
bt2.addActionListener(this);

l1.setFont(f);
l2.setFont(f);
l3.setFont(f);
l4.setFont(f);
l5.setFont(f);
l6.setFont(f);
l7.setFont(f);
l8.setFont(f);
l9.setFont(f);
l10.setFont(f);
l11.setFont(f);
l12.setFont(f);
l13.setFont(f);
l16.setFont(f);
l17.setFont(f);
l18.setFont(f);

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

ch1.setFont(f);
ch2.setFont(f);
ch3.setFont(f);

bt1.setFont(f);
bt2.setFont(f);

p1=new JPanel();
p1.setLayout(new GridLayout(18,2,10,10));
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
p1.add(ch1);
p1.add(l8);
p1.add(tf7);
p1.add(l9);
p1.add(ch2);
p1.add(l10);
p1.add(ch3);
p1.add(l11);
p1.add(tf8);
p1.add(l12);
p1.add(tf9);
p1.add(l13);
p1.add(tf10);
p1.add(l16);
p1.add(tf11);
p1.add(l17);
p1.add(tf12);
p1.add(l18);
p1.add(tf13);

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
l6.setForeground(decode("#d2d7d3"));
l7.setForeground(decode("#d2d7d3"));
l8.setForeground(decode("#d2d7d3"));
l9.setForeground(decode("#d2d7d3"));
l10.setForeground(decode("#d2d7d3"));
l11.setForeground(decode("#d2d7d3"));
l12.setForeground(decode("#d2d7d3"));
l13.setForeground(decode("#d2d7d3"));
l16.setForeground(decode("#d2d7d3"));
l17.setForeground(decode("#d2d7d3"));
l18.setForeground(decode("#d2d7d3"));

tf6.setForeground(Color.RED);

setLayout(new BorderLayout(0,0));

add(p2,"North");
add(p3,"West");
add(p1,"Center");

}
 @Override
 public void actionPerformed(ActionEvent e)
{

if(e.getSource()==bt1)
{
String name=tf1.getText();
String fname=tf2.getText();
String email=tf3.getText();
String address=tf4.getText();
String cont=tf5.getText();
String eno=tf6.getText();
String tcat=ch1.getSelectedItem();
int tid=Integer.parseInt(tf7.getText());
String minag=ch2.getSelectedItem();
String gender=ch3.getSelectedItem();
float height=Float.parseFloat(tf8.getText());
float weight=Float.parseFloat(tf9.getText());
String remarks=tf10.getText();
String trainer_fee=tf11.getText();
String dateofpayment=tf12.getText();
String duedate=tf13.getText();


try
{
MyConnection obj=new MyConnection();
String q="insert into add_trainer values('"+tid+"','"+name+"','"+fname+"','"+email+"','"+address+"','"+cont+"','"+eno+"','"+tcat+"','"+minag+"','"+gender+"','"+height+"','"+weight+"','"+remarks+"','"+trainer_fee+"','"+dateofpayment+"','"+duedate+"')";
obj.stm.executeUpdate(q);
JOptionPane.showMessageDialog(null,"Data Insert.....");
setVisible(false);
new AddTrainer().setVisible(true);

}
catch(Exception ex)
 {
  ex.printStackTrace();
 }
}
if(e.getSource()==bt2)
 {
 JOptionPane.showMessageDialog(null,"Are you Sure?");
 setVisible(false);
 }
}
public static void main(String args[])
{
 new AddTrainer().setVisible(true);
}
}