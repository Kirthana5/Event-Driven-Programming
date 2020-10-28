package labex_13;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kirthana Balasubramanian
 */
public class toggle_bg extends MouseAdapter implements ActionListener{

    /**
     * @param args the command line arguments
     */
    
    JFrame f;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
    JLabel l1,l2,l3,l4;
   
    public toggle_bg()
    {
        // Name for JFrame
        f=new JFrame("TOGGLE BACKGROUND");
        
        //Font
        Font font=new Font("Georgia",Font.BOLD+Font.ITALIC,18);
        Font fontt=new Font("Georgia",Font.BOLD+Font.ITALIC,24);

        
        //label
        l1=new JLabel("DO YOU WANNA TOGGLE BACKGROUND??  (^_^)");
        l1.setBounds(200,30,600,80);
        l1.setFont(font);
        
        l2=new JLabel("HERE WE GO....!!   ($_$)");
        l2.setBounds(200,102,600,80);
        l2.setFont(font);
        
        l3=new JLabel("CLICK ON THE ABOVE BUTTONS TO TOGGLE THE BACKGROUND (@_@)");
        l3.setBounds(200,470,700,80);
        l3.setFont(font);
        
        l4=new JLabel();
        l4.setBounds(890,290,700,90);
        l4.setFont(fontt);
        l4.setForeground(Color.white);
        
        //Buttons to toggle background
        b1=new JButton("RED");
        b1.setBounds(200,200,200,70);
        b1.setBackground(Color.red);
        b1.setFont(font);
        
        b2=new JButton("GREEN");
        b2.setBounds(420,200,200,70);
        b2.setBackground(Color.green);
        b2.setFont(font);
        
        b3=new JButton("PEACOCKGREEN");
        b3.setBounds(640,200,200,70);
        b3.setBackground(new Color(0,169,137));
        b3.setFont(font);
        
        b4=new JButton("ULTRAVIOLET");
        b4.setBounds(200,290,200,70);
        b4.setBackground(new Color(118,91,255));
        b4.setFont(font);
        
        b5=new JButton("YELLOW");
        b5.setBounds(420,290,200,70);
        b5.setBackground(Color.yellow);
        b5.setFont(font);
        
        b6=new JButton("PURPLE");
        b6.setBounds(640,290,200,70);
        b6.setBackground(new Color(120,50,126));
        b6.setFont(font);
        
        b7=new JButton("MAGENTA");
        b7.setBounds(200,380,200,70);
        b7.setBackground(Color.magenta);
        b7.setFont(font);
        
        b8=new JButton("BLUE");
        b8.setBounds(420,380,200,70);
        b8.setBackground(Color.blue);
        b8.setFont(font);
        
        b9=new JButton("CYAN");
        b9.setBounds(640,380,200,70);
        b9.setBackground(Color.cyan);
        b9.setFont(font);
        
        
        
        //adding actionListener for each button in order to toggle the background color on every click on button
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
       
        
        //adding buttons and labels to JFrame
        f.add(b1); f.add(b2); f.add(b3);
        f.add(b4); f.add(b5); f.add(b6);
        f.add(b7); f.add(b8); f.add(b9);
        f.add(l1); f.add(l2); f.add(l3); f.add(l4);
        
        f.setSize(600,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource().equals(b1))
        {
            f.getContentPane().setBackground(b1.getBackground());
            l4.setText("HURRAY!! YOU'VE SELECTED "+b1.getText()+"   (@_@)");
        }
        if(e.getSource().equals(b2))
        {
            f.getContentPane().setBackground(b2.getBackground());
            l4.setText("HURRAY!! YOU'VE SELECTED "+b2.getText()+"    (@_@)");
        }
        if(e.getSource().equals(b3))
        {
            f.getContentPane().setBackground(b3.getBackground());
            l4.setText("HURRAY!! YOU'VE SELECTED "+b3.getText()+"    (@_@)");
        }
        if(e.getSource().equals(b4))
        {
            f.getContentPane().setBackground(b4.getBackground());
            l4.setText("HURRAY!! YOU'VE SELECTED "+b4.getText()+"    (@_@)");
        }
        if(e.getSource().equals(b5))
        {
            f.getContentPane().setBackground(b5.getBackground());
            l4.setText("HURRAY!! YOU'VE SELECTED "+b5.getText()+"    (@_@)");
        }
        if(e.getSource().equals(b6))
        {
            f.getContentPane().setBackground(b6.getBackground());
            l4.setText("HURRAY!! YOU'VE SELECTED "+b6.getText()+"    (@_@)");
        }
        if(e.getSource().equals(b7))
        {
            f.getContentPane().setBackground(b7.getBackground());
            l4.setText("HURRAY!! YOU'VE SELECTED "+b7.getText()+"    (@_@)");
        }
        if(e.getSource().equals(b8))
        {
            f.getContentPane().setBackground(b8.getBackground());
            l4.setText("HURRAY!! YOU'VE SELECTED "+b8.getText()+"    (@_@)");
        }
        if(e.getSource().equals(b9))
        {
            f.getContentPane().setBackground(b9.getBackground());
            l4.setText("HURRAY!! YOU'VE SELECTED "+b9.getText()+"    (@_@)");
        }
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        new toggle_bg();
    }
    
}
