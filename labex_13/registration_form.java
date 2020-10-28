/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex_13;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Kirthana Balasubramanian
 */
public class registration_form extends MouseAdapter{

    /**
     * @param args the command line arguments
     */
    
    JFrame f;
    JTextField t1,t2,t3,t4,t5;
    JPasswordField tt,dd;
    JLabel l1,l2,l3,l4;
    JCheckBox c;
    JButton b;

    public registration_form() 
    {
        f=new JFrame("REGISTRATION FORM");
        
        //Font
        Font font=new Font("TimesNewRoman",Font.BOLD,26);
        Font font1=new Font("TimesNewRoman",Font.PLAIN,16);
       
        l1=new JLabel("----------------------------REGISTER----------------------------");
        l1.setBounds(100,150,800,40);
        l1.setFont(font);
        
        l2=new JLabel("Create your account.It's free and only takes a minute.");
        l2.setBounds(100,200,800,50);
        l2.setFont(font);
        l2.setForeground(Color.darkGray);
        
        t1=new JTextField("  First Name");
        t1.setBounds(100,270,300,40);
        t1.setFont(font1);
        t1.setForeground(Color.darkGray);
        t1.addMouseListener(new MouseAdapter()
        {
           public void mouseClicked(MouseEvent e) 
           {
               t1.setText("");
               t1.setForeground(Color.black);
           }
        });
        
        t2=new JTextField("  Last Name");
        t2.setBounds(420,270,300,40);
        t2.setFont(font1);
        t2.setForeground(Color.darkGray);
        t2.addMouseListener(new MouseAdapter()
        {
           public void mouseClicked(MouseEvent e) 
           {
               t2.setText("");
               t2.setForeground(Color.black);
           }
        });
        
        t3=new JTextField("  Email");
        t3.setBounds(100,330,620,40);
        t3.setFont(font1);
        t3.setForeground(Color.darkGray);
        t3.addMouseListener(new MouseAdapter()
        {
           public void mouseClicked(MouseEvent e) 
           {
               t3.setText("");
               t3.setForeground(Color.black);
           }
        });
        
        t4=new JTextField("  Password");
        t4.setBounds(100,390,620,40);
        t4.setFont(font1);
        t4.setVisible(true);
        t4.setForeground(Color.darkGray);
        t4.addMouseListener(new MouseAdapter()
        {
           public void mouseEntered(MouseEvent e) 
           {
               t4.setText("");
               tt=new JPasswordField();
               tt.setBounds(100,390,620,40);
               f.remove(t4);
               f.add(tt);
               t4.setForeground(Color.black);
           }
        });
        
        t5=new JTextField("  Confirm Password");
        t5.setBounds(100,450,620,40);
        t5.setFont(font1);
        t5.setForeground(Color.darkGray);
        t5.addMouseListener(new MouseAdapter()
        {
           public void mouseEntered(MouseEvent e) 
           {
               t5.setText("");
               dd=new JPasswordField();
               dd.setBounds(100,450,620,40);
               f.remove(t5);
               f.add(dd);   
               t5.setForeground(Color.black);
           }
        });
        
        c=new JCheckBox("I accept the Terms of Use & Privacy Policy.");
        c.setBounds(100,520,620,40);
        c.setFont(font1);
        c.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                b.setEnabled(true);
            }
            
        });
        
        b=new JButton("               Register Now               ");
        b.setBounds(100,580,620,40);
        b.setFont(font1);
        b.setForeground(Color.white);
        b.setBackground(new Color(34,139,34));
        b.setEnabled(false);
        b.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(null,"Hi "+t1.getText()+"!\nYou've registered successfully!!");
            }
            
        });
        
        l3=new JLabel("Already have an account?");
        l3.setBounds(190,640,200,40);
        l3.setFont(font1);
        
        
        l4=new JLabel("<HTML><U>Sign in</U></HTML>");
        l4.setBounds(391,640,50,40);
        l4.setFont(font1);
        l4.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent e)
            {
                JOptionPane.showInputDialog(null,"Enter Username:");
                JOptionPane.showInputDialog(null,"Enter Password:");
                try 
                {
                    new welcome_page();
                } 
                catch (IOException ex) 
                {
                    
                }
            }
        });
        
        
       
        f.add(l1);
        f.add(l2);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(t4);
        f.add(t5);
        f.add(c);
        f.add(b);
        f.add(l3);
        f.add(l4);
        
        f.setSize(1000,1000);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
    public static void main(String[] args)   {
        // TODO code application logic here
        new registration_form();
        
        
    }
   
}

class welcome_page
{
    JFrame f1;
    JLabel l2;

    public welcome_page() throws IOException
    {
        f1=new JFrame();
         
        BufferedImage b=null;
        b=ImageIO.read(new File("welcome.jpg"));
        Image d=b.getScaledInstance(1000,1000,Image.SCALE_SMOOTH);
        ImageIcon i=new ImageIcon(d);
        
        l2=new JLabel(i);
         
        f1.setContentPane(l2);
    
        f1.setSize(1000,1000);
        f1.setLayout(null);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
    
}
