
package gym_manager;
import java.awt.Color;
import java.awt.Font;
import java.awt.*;
import static java.awt.Color.decode;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Image;

public class HomePage extends JFrame implements ActionListener {
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    Font f,f1,f2;
    JPanel pf;
    HomePage()
    {
        super("Home Page");
        setSize(1600,900);
        setLocation(200,100);
        setUndecorated(true);
        
        f=new Font("Lucida Fax",Font.BOLD,20);
        f1=new Font("Gadugi",Font.BOLD,35);
        f2=new Font("MS UI Gothic", Font.BOLD,35);
        
        ImageIcon ic =new ImageIcon(ClassLoader.getSystemResource("gym_management_icons/gym3.jpg"));
        Image img=ic.getImage().getScaledInstance(1600, 900, Image.SCALE_DEFAULT);
        ImageIcon ic1=new ImageIcon(img);
        l1=new JLabel(ic1);
        
        JMenuBar m1=new JMenuBar();
        JMenu men1=new JMenu("Master");
        JMenuItem ment1=new JMenuItem("Add Trainer");
        JMenuItem ment2=new JMenuItem("Add Customer");
        
        JMenu men2=new JMenu("Attendance");
        JMenuItem ment3=new JMenuItem("Trainer Attendance");
        JMenuItem ment4=new JMenuItem("Customer Attendance");
        
        JMenu men3=new JMenu("Personal Information");
        JMenuItem ment5=new JMenuItem("Trainer Information");
        JMenuItem ment6=new JMenuItem("Customer Information");
        
        JMenu men4=new JMenu("Update Information");
        JMenuItem ment7=new JMenuItem("Upadate Trainer");
        JMenuItem ment8=new JMenuItem("Update Customer");
        
        JMenu men5=new JMenu("Search Records");
        JMenuItem ment9=new JMenuItem("Trainer Dues");
        JMenuItem ment10=new JMenuItem("Customer Dues");
        
        
        
        JMenu men7=new JMenu("Exit");
        JMenuItem ment13=new JMenuItem("Exit");
        
        men1.add(ment1);
        men1.add(ment2);
        
        men2.add(ment3);
        men2.add(ment4);
        
        men3.add(ment5);
        men3.add(ment6);
        
        men4.add(ment7);
        men4.add(ment8);
        
        men5.add(ment9);
        men5.add(ment10);
        
       
        
        men7.add(ment13);
        
        m1.add(men1);
        m1.add(men2);
        m1.add(men3);
        m1.add(men4);
        m1.add(men5);
    
        m1.add(men7);
        
        men1.setFont(f);
        men2.setFont(f);
        men3.setFont(f);
        men4.setFont(f);
        men5.setFont(f);
       
        men7.setFont(f);
        
        ment1.setFont(f1);
        ment2.setFont(f1);
        ment3.setFont(f1);
        ment4.setFont(f1);
        ment5.setFont(f1);
        ment6.setFont(f1);
        ment7.setFont(f1);
        ment8.setFont(f1);
       ment9.setFont(f1);
        ment10.setFont(f1);
       
        ment13.setFont(f1);
        
        m1.setBackground(decode("#013243"));
        
        men1.setForeground(Color.WHITE);
        men2.setForeground(Color.WHITE);
        men3.setForeground(Color.WHITE);
        men4.setForeground(Color.WHITE);
        men5.setForeground(Color.WHITE);
       
        men7.setForeground(Color.RED);
        
        ment1.setBackground(Color.BLACK);
        ment2.setBackground(Color.BLACK);
        ment3.setBackground(Color.BLACK);
        ment4.setBackground(Color.BLACK);
        ment5.setBackground(Color.BLACK);
        ment6.setBackground(Color.BLACK);
        ment7.setBackground(Color.BLACK);
        ment8.setBackground(Color.BLACK);
        ment9.setBackground(Color.BLACK);
        ment10.setBackground(Color.BLACK);
       
        ment13.setBackground(Color.BLACK);
        
        ment1.setForeground(Color.YELLOW);
        ment2.setForeground(Color.YELLOW);
        ment3.setForeground(Color.YELLOW);
        ment4.setForeground(Color.YELLOW);
        ment5.setForeground(Color.YELLOW);
        ment6.setForeground(Color.YELLOW);
        ment7.setForeground(Color.YELLOW);
        ment8.setForeground(Color.YELLOW);
        ment9.setForeground(Color.YELLOW);
        ment10.setForeground(Color.YELLOW);
       
        ment13.setForeground(Color.RED);
        
        ment1.addActionListener(this);
        ment2.addActionListener(this);
        ment3.addActionListener(this);
        ment4.addActionListener(this);
        ment5.addActionListener(this);
        ment6.addActionListener(this);
        ment7.addActionListener(this);
        ment8.addActionListener(this);
        ment9.addActionListener(this);
        ment10.addActionListener(this);
       
        ment13.addActionListener(this);
        
        setJMenuBar(m1);
        add(l1);
   
    }
    
    @Override
  public void actionPerformed(ActionEvent e){
    String comnd=e.getActionCommand();
        switch (comnd) {
            case "Add Trainer":
                new AddTrainer().setVisible(true);
                break;
            case "Add Customer":
                new AddCustomer().setVisible(true);
                break;
            case "Trainer Attendance":
                new TrainerAttendance().setVisible(true);
                break;
            case "Customer Attendance":
                new CustomerAttendance().setVisible(true);
                break;
            case "Trainer Information":
                new TrainerInformation().setVisible(true);
                break;
            case "Customer Information":
                new CustomerInformation().setVisible(true);
                break;
            case "Upadate Trainer":
                new UpdateTrainer().setVisible(true);
                break;
            case "Update Customer":
                new UpdateCustomer().setVisible(true);
                break;
            case "Trainer Dues":
                new TrainerSearch().setVisible(true);
                break;
            case "Customer Dues":
                new Search().setVisible(true);
                break;
           
            case "Exit":
                System.exit(0);
            default:
                break;
        }
    }
    public static void main(String args[]) {
        new HomePage().setVisible(true);
    } 

   
}
