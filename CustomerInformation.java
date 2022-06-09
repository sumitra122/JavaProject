
package gym_manager;

import java.awt.*;
import static java.awt.Color.decode;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class CustomerInformation extends JFrame implements ActionListener {
    String x[]={"Recipt Id","Name", "Father's Name", "Email", "Address","Contact no", "Payments plan", "gender", "height", "Weight","Amount","Date OF Payment","Due Date", "Remarks", "Trainer name", "catg"};
    JButton b1;
    String y[][]=new String[1000][16];
    int i=0,j=0;
    JLabel l1,l2;
    JTextField tf1;
    JPanel p1,p2,p3;
    JTable t;
    Font f,f1;
    CustomerInformation()
    {
        super("Customer Information");
        setSize(1500,700);
        setLocation(280,350);
        
          Font f=new Font("MS UI Gothic",Font.BOLD,15);
          try{
              MyConnection obj=new MyConnection();
              String q="Select * from add_customer";
              ResultSet rest=obj.stm.executeQuery(q);
              while(rest.next()){
                 y[i][j++]=rest.getString("recipt_no"); 
                 y[i][j++]=rest.getString("name"); 
                 y[i][j++]=rest.getString("fname"); 
                 y[i][j++]=rest.getString("email"); 
                 y[i][j++]=rest.getString("address"); 
                 y[i][j++]=rest.getString("contactNo"); 
                 y[i][j++]=rest.getString("payments_plan"); 
                 y[i][j++]=rest.getString("gender"); 
                 y[i][j++]=rest.getString("height");
                 y[i][j++]=rest.getString("weight"); 
                 y[i][j++]=rest.getString("amount"); 
                 y[i][j++]=rest.getString("dateofpayment");
                 y[i][j++]=rest.getString("duedate"); 
                 y[i][j++]=rest.getString("remarks"); 
                 y[i][j++]=rest.getString("trainer_name");
                 y[i][j++]=rest.getString("category"); 
                 i++;
                 j=0;
                 
                }
              t=new JTable(y,x);
              t.setFont(f);
              t.setBackground(decode("#013243"));
              t.setForeground(decode("#d2d7d3"));
          }
          catch (Exception ex) {
              ex.printStackTrace();
          }
          JScrollPane sp=new JScrollPane(t);
          Font f1=new Font("Lucida Fax",Font.BOLD,25);
          
          l1=new JLabel("Delete any student");
          l1.setHorizontalAlignment(JLabel.CENTER);
          l1.setFont(f1);
          l1.setForeground(Color.YELLOW);
          
          p1=new JPanel();
          p1.setLayout(new GridLayout(1,1,10,10));
          p1.add(l1);
          
          tf1=new JTextField();
          b1=new JButton("Delete Customer");
          tf1.setFont(f);
          b1.setFont(f);
          
          b1.setBackground(Color.BLACK);
          b1.setForeground(Color.RED);
          b1.addActionListener(this);
          
          p2=new JPanel();
          p2.setLayout(new GridLayout(1,2,10,10));
         
          p2.add(tf1);
          p2.add(b1);
          
           p3=new JPanel();
          p3.setLayout(new GridLayout(2,1,10,10));
          p3.add(p1);
          p3.add(p2);
          
          l2=new JLabel("Customer Recipt");
          l2.setForeground(Color.WHITE);
          l2.setFont(f1);
          
                      
          p2=new JPanel();
          p2.setLayout(new GridLayout(1,3,10,10));
          p2.add(l2);
          p2.add(tf1);
          p2.add(b1);
           
          p3=new JPanel();
          p3.setLayout(new GridLayout(2,1,10,10));
          p3.add(p1);
          p3.add(p2);
          
          
                  
          p1.setBackground(decode("#22313f"));
          p2.setBackground(decode("#22313f"));
          p3.setBackground(decode("#22313f"));
          
          add(p3,"South");
          add(sp);
    }
    @Override
         public void actionPerformed(ActionEvent e){
             int id=Integer.parseInt(tf1.getText());
             if(e.getSource()==b1)
             {
                 try 
                 {
                     MyConnection obj1=new MyConnection();
                     String q="Delete from add_customer where recipt_no='"+id+"'";
                     obj1.stm.executeUpdate(q);
                     setVisible(false);
                     new CustomerInformation().setVisible(true);
                     
                 }
                 catch (Exception evx) {
                     evx.printStackTrace();
                 }
             }
         }
         public static void main(String args[]){
             new CustomerInformation().setVisible(true);
         }

}  



