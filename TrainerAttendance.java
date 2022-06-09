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



public class TrainerAttendance extends JFrame implements ActionListener
{
   JLabel l1,l2,l3,l4;
   Choice ch1,ch2,ch3;
   Font f1,f2;
   JButton bt1,bt2;
   JPanel p1,p2;
   
     TrainerAttendance()
    {

        super("Trainer attendence");
        setLocation(800,400);
        setSize(400,250);
        setResizable(false);

        Font f1=new Font("Lucida Fax",Font.BOLD,25);
        Font f2=new Font("MS UI Gothic",Font.BOLD,18);
      
        l1=new JLabel("Trainer Id");
        l2=new JLabel("Morning time");
        l3=new JLabel("Evening time");
        l4=new JLabel("Trainer Attendence");

        l1.setForeground(Color.WHITE);
        l2.setForeground(Color.WHITE);
        l3.setForeground(Color.WHITE);
        l4.setForeground(Color.YELLOW);
        
        l4.setFont(f1);
        l4.setHorizontalAlignment(JLabel.CENTER);

        l1.setFont(f2);
        l2.setFont(f2);
        l3.setFont(f2);
         

        ch1=new Choice();
        ch1.add("Absent");
        ch1.add("Present");

        ch2=new Choice();
        ch2.add("Absent");
        ch2.add("Present");

        ch3=new Choice();
        try
        {
          MyConnection obj=new MyConnection();
          String q="select tid from add_trainer";
          ResultSet rest=obj.stm.executeQuery(q);
          while(rest.next())
         {
           ch3.add(rest.getString("tid"));
         }
        }
   
       catch (Exception e)
       {
          e.printStackTrace();
       }
        
        ch1.setFont(f2);
        ch2.setFont(f2);
        ch3.setFont(f2);
        
        ch1.setBackground(decode("#013243"));
        ch1.setForeground(Color.WHITE);
        ch2.setBackground(decode("#013243"));
        ch2.setForeground(Color.WHITE);
        ch3.setBackground(decode("#013243"));
        ch3.setForeground(Color.WHITE);

        bt1=new JButton("submit");
        bt2=new JButton("Cancel");
    
        bt1.setBackground(Color.BLACK);
        bt2.setBackground(Color.BLACK);
       
        bt1.setForeground(Color.WHITE);
        bt2.setForeground(Color.RED);
                
        bt1.addActionListener(this);
        bt1.addActionListener(this);

        bt1.setFont(f2);
        bt2.setFont(f2);
   
        p1=new JPanel();
        p1.setLayout(new GridLayout(4,2,10,10));
        p1.add(l1);
        p1.add(ch3);
        p1.add(l2);
        p1.add(ch2);
        p1.add(l3);
        p1.add(ch1);
        p1.add(bt1);
        p1.add(bt2);
       

        
        p2=new JPanel();
        p2.setLayout(new GridLayout(1,1,10,10));
        p2.add(l4);
      
        p1.setBackground(decode("#013243"));
        p2.setBackground(decode("#22313f"));

       setLayout(new BorderLayout(0,0));
       add(p2,"North");
       add(p1,"Center");

    
        }
   @Override
   public void actionPerformed(ActionEvent e)
  {

      String tid=ch3.getSelectedItem();
      String mng_attn=ch3.getSelectedItem();
      String evg_attn=ch3.getSelectedItem();
      String date=new java.util.Date().toString();
      if(e.getSource()==bt1)
      {
         try
          {
             MyConnection obj1=new MyConnection();
             String q1="insert into trainer_attendence values('"+tid+"','"+mng_attn+"','"+evg_attn+"','"+date+"')";
             
             obj1.stm.executeUpdate(q1);
             
             JOptionPane.showMessageDialog(null,"insert data successfully");
             setVisible(false);
           }
         catch(Exception ex) {
         
          ex.printStackTrace();
          
         }
 
      }

      if(e.getSource()==bt2)
      {
        
         JOptionPane.showMessageDialog(null,"Are you sure......?");
             setVisible(false);
        }

     }
    
  
  public static void main(String args[])
  {
    new TrainerAttendance().setVisible(true);
   }
}