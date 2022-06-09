package gym_manager;


import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import com.toedter.calendar.JDateChooser;
  import java.awt.Choice;
import java.awt.Font;
import java.awt.*;
import static java.awt.Color.decode;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

import java.awt.event.MouseEvent;
import javax.swing.*;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

   public class CustomerFees extends JFrame implements ActionListener
   {
 
   JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
   JButton bt1,bt2;
   Choice ch1,ch2;
   JTextField tf1,tf2,tf3,tf4,tf5,tf6;
   JPanel p1,p2,p3;
  /* JDateChooser jd1;
    JDateChooser jd2;*/

    CustomerFees()
    {

      super("customer fees");
      setSize(670,400);
      setLocation(700,400);
      setResizable(false);
      Font f=new Font("MS UI Gothic",Font.BOLD,18);
      Font f1=new Font("Lucida Fax",Font.BOLD,25);

      ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("gym_management_icons/fees2.png"));
      Image im=img.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
      l6=new JLabel(new ImageIcon(im));

      l1=new JLabel("Receipt ID");
      l2=new JLabel("Name");
      l3=new JLabel("Category");
     // l7=new JLabel("Month");
      l4=new JLabel("Charge fees per Month");
      l5=new JLabel("Pay Fees");
      l9=new JLabel("Trainer Name");
      l8 = new JLabel("Date Due");
      l7 = new JLabel("Date of Payment");
      l5.setFont(f1);
      l5.setHorizontalAlignment(JLabel.CENTER);
      

      tf1=new JTextField();
      tf2=new JTextField();
      tf3=new JTextField();
      tf4=new JTextField();
      tf5=new JTextField();
      tf6=new JTextField();
      
    


    l1.setFont(f);
    l2.setFont(f);
    l3.setFont(f);
    l4.setFont(f);
    l7.setFont(f);
    l9.setFont(f);
     l8.setFont(f);
   
     tf1.setFont(f);
     tf2.setFont(f);
     tf3.setFont(f);
     tf4.setFont(f);
     tf5.setFont(f);
     tf6.setFont(f);
     
     tf1.setCaretColor(decode("#d2d7d3"));
     tf2.setCaretColor(decode("#d2d7d3"));
     tf3.setCaretColor(decode("#d2d7d3"));
     tf4.setCaretColor(decode("#d2d7d3"));
      tf5.setCaretColor(decode("#d2d7d3"));
     tf6.setCaretColor(decode("#d2d7d3"));
     
      tf1.setOpaque(false);
      tf2.setOpaque(false);
      tf3.setOpaque(false);
      tf4.setOpaque(false);
      tf5.setOpaque(false);
      tf6.setOpaque(false);
      
      tf1.setForeground(decode("#d2d7d3"));
      tf2.setForeground(decode("#d2d7d3"));
      tf3.setForeground(decode("#d2d7d3"));
      tf4.setForeground(decode("#d2d7d3"));
       tf5.setForeground(decode("#d2d7d3"));
      tf6.setForeground(decode("#d2d7d3"));
    
      l1.setForeground(Color.WHITE);
      l2.setForeground(Color.WHITE);
      l3.setForeground(Color.WHITE);
      l4.setForeground(Color.WHITE);
      l7.setForeground(Color.WHITE);
      l9.setForeground(Color.WHITE);
      l8.setForeground(Color.WHITE);
      l5.setForeground(Color.YELLOW);
      
     /* jd1 = new com.toedter.calendar.JDateChooser();
      jd2 = new com.toedter.calendar.JDateChooser();*/

//jDateChooser1.setOpaque(false);

//jPanel2.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, 250, 30));


      ch1=new Choice();
      try
      { 
         MyConnection obj=new MyConnection();
         String q="select recipt_no from add_customer";
         ResultSet rest=obj.stm.executeQuery(q);
         while(rest.next())
         {
            ch1.add(rest.getString("recipt_no"));
          }
      }
    catch(Exception ex)
    {
      ex.printStackTrace();
    }
     /*ch1.setFont(f);
     ch2=new Choice();
     ch2.add("January");
     ch2.add("February");
     ch2.add("March");
     ch2.add("April");
     ch2.add("May");
     ch2.add("June");
     ch2.add("July");
     ch2.add("August");
     ch2.add("September");
     ch2.add("October");
     ch2.add("November");
     ch2.add("December");
     

     ch2.setFont(f);*/

      bt1=new JButton("Submit");
      bt2=new JButton("Cancel");
   
      bt1.setFont(f);
      bt2.setFont(f);
  
      bt1.setBackground(Color.BLACK);
      bt1.setForeground(Color.CYAN);
      bt2.setBackground(Color.BLACK);
      bt2.setForeground(Color.RED);
    
      bt1.addActionListener(this);
      bt2.addActionListener(this);

      p1=new JPanel();
      p1.setLayout(new GridLayout(1,1,10,10));
      p1.add(l5);

      p2=new JPanel();
      p2.setLayout(new GridLayout(8,2,10,10));
      p2.add(l1);
      p2.add(ch1);
      p2.add(l2);
      p2.add(tf1);
      p2.add(l3);
      p2.add(tf2);
      p2.add(l9);
      p2.add(tf3);
      p2.add(l7);
      p2.add(tf5);
       p2.add(l8);
      p2.add(tf6);
      p2.add(l4);
      p2.add(tf4);
      p2.add(bt1);
      p2.add(bt2);

     p3=new JPanel();
     p3.setLayout(new GridLayout(1,1,10,10));
     p3.add(l6);
     
        p1.setBackground(decode("#013243"));
        p2.setBackground(decode("#22313f"));
        p3.setBackground(decode("#22313f"));

     setLayout(new BorderLayout(0,0));
     
    
      
     add(p1,"North");
     add(p2,"Center");
     add(p3,"West");

     ch1.addMouseListener(new MouseAdapter()
     {
        @Override
       public void mouseClicked(MouseEvent arg)
      {
         int id=Integer.parseInt(ch1.getSelectedItem());
         try
         {
           MyConnection obj1=new MyConnection();
           String q1="select * from add_customer where recipt_no='"+id+"'";
           ResultSet rest;
             rest = obj1.stm.executeQuery(q1);
           while(rest.next())
          {
             tf1.setText(rest.getString("name"));
             tf2.setText(rest.getString("category"));
             tf3.setText(rest.getString("trainer_name"));
            }
      /*String fees=tf4.getText();
      MyConnection obj2=new MyConnection();
      String q2="select fees from pay_customer where name='"+fees+"'";
      ResultSet rest1=obj2.stm.executeQuery(q2);
      while(rest1.next())
      {
        tf4.setText(rest1.getString("fees"));
       }
     String date_of_payment=tf5.getText();
      MyConnection obj3=new MyConnection();
      String q3="select fees from pay_customer where name='"+date_of_payment+"'";
      ResultSet rest2=obj3.stm.executeQuery(q3);
      while(rest2.next())
      {
        tf5.setText(rest2.getString("date_of_payment"));
       }
       String due_date=tf6.getText();
      MyConnection obj4=new MyConnection();
      String q4="select fees from pay_customer where name='"+due_date+"'";
      ResultSet rest3=obj2.stm.executeQuery(q4);
      while(rest3.next())
      {
        tf4.setText(rest3.getString("due_date"));
       }*/
    
      
         }
     
     catch(Exception exx)
     {
         exx.printStackTrace();
     }
      }
     });
    }
    public void actionPerformed(ActionEvent e){
       String id=ch1.getSelectedItem();
       String name=tf1.getText();
       String catogory=tf2.getText();
        String tname=tf3.getText();
         float fees=Float.parseFloat(tf4.getText());
         String date_of_payment=tf5.getText();
        String due_date=tf6.getText();
       
       
      
      
       try
       {
           if(e.getSource()==bt1)
            {
             MyConnection obj2=new MyConnection();
             String q2="insert into pay_customer values('"+id+"','"+name+"','"+catogory+"','"+tname+",'"+fees+"','"+date_of_payment+"','"+due_date+"')";
             obj2.stm.executeUpdate(q2);
             JOptionPane.showMessageDialog(null,"your fees successfully submit:)");
             setVisible(false);
         }
          if(e.getSource()==bt2)
            {
                JOptionPane.showMessageDialog(null,"Are you Sure?");
                setVisible(false);
               }
             }
         catch(Exception exxx)
         {
           exxx.printStackTrace();
        }
    }
    
 public static void main(String args[])
  {
  new  CustomerFees().setVisible(true);
   }
}
        


     
      
 




       