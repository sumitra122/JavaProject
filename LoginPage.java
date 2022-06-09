
package gym_manager;

import java.awt.BorderLayout;
import java.awt.Color;
import static java.awt.Color.decode;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Image;
import java.sql.*;
import java.awt.event.*;
import java.util.Arrays;
import javax.swing.*;

public class LoginPage extends JFrame implements ActionListener {
    JLabel L1,L2,L3,L4,L5;
    JTextField tf;
    JPasswordField pf;
    JPanel p1,p2;
    JButton b1, b2;
    Font f, f1;
    
    LoginPage()
    {
       super("Login");
       setLocation(800,400);
       setResizable(false);
       setSize(400,200);
       
       f=new Font("Arial", Font.BOLD,20);
       f1=new Font("Arial", Font.BOLD,15);
       
       L1=new JLabel("Welcome To The Fitness Point");
       L2=new JLabel("Username");
       L3=new JLabel("Password");
       
       L1.setHorizontalAlignment(JLabel.CENTER);
       L1.setForeground(Color.RED);
       L2.setForeground(Color.BLUE);
       L3.setForeground(Color.BLUE);
       L1.setFont(f);
       L2.setFont(f1);
       L3.setFont(f1);
       
       
       
       tf = new JTextField();
       pf=new JPasswordField();
       
       tf.setFont(f1);
       pf.setFont(f1);
       
       ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("gym_management_icons/login.png"));
       Image img2=img.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
       ImageIcon img3=new ImageIcon(img2);
       L4=new JLabel(img3);
       
       
       b1=new JButton("Login");
       b2=new JButton("Cancel");
       b1.addActionListener(this);
       b2.addActionListener(this);
       
       b1.setBackground(Color.BLACK);
       b2.setBackground(Color.BLACK);
       b1.setForeground(Color.WHITE);
       b2.setForeground(Color.WHITE);
       b1.setFont(f1);
       b2.setFont(f1);
       
       p1=new JPanel();
       p1.setLayout(new GridLayout(3,2,10,10));
       p1.add(L2);
       p1.add(tf);
       p1.add(L3);
       p1.add(pf);
       p1.add(b1);
       p1.add(b2);
       
      
       
         
       setLayout(new BorderLayout(50,40));
       
       add(L1,"North");
       add(L4,"East");
       add(p1,"Center");
       
       
    }
    @Override
     public void actionPerformed(ActionEvent e){
      String name=tf.getText();
        String pass;
        pass = pf.getText();
      if(e.getSource()==b1)
      {
        try{
            MyConnection obj=new MyConnection();        
            String q="select * from loginpage where username='"+name+"'and password='"+pass+"'";
            ResultSet rest=obj.stm.executeQuery(q);
            if(rest.next()){
            new HomePage().setVisible(true);
            this.setVisible(false);
            }
            else{
            JOptionPane.showMessageDialog(null,"Wrong password");
            
            }
            if(e.getSource()==b2)
 {
 JOptionPane.showMessageDialog(null,"Are you Sure?");
 setVisible(false);
 }
        }        
        catch(Exception ex){
             ex.printStackTrace();
        }
         
      }
    }
   
    public static void main(String args[]) {
    new LoginPage().setVisible(true);
    }
    
}
