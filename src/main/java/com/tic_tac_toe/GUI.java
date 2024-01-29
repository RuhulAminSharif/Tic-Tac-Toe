package com.tic_tac_toe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class GUI {
    JFrame frame;
    
    JPanel panel, panel1, panel2, panel3, panel4, panel5, panel6, panel7, panel8;
    JPanel panel9, panel10, panel11, panel12, panel13, panel14, panel15;
    
    JButton button1, button2, button3, button4, button5, button6;
    JButton button7, button8, button9, button10, button11;
    
    JLabel label1, label2;
    
    JTextField textfield1, textfield2;
    
    Font f, f1;
    
    GUI(){
        frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 600, 500);
        frame.setTitle("Tic-Tac-Toe");
        frame.getContentPane().setLayout(new BorderLayout(0,0));
        
        panel = new JPanel();
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        panel5 = new JPanel();
        panel6 = new JPanel();
        panel7 = new JPanel();
        panel8 = new JPanel();
        panel9 = new JPanel();
        panel10 = new JPanel();
        panel11 = new JPanel();
        panel12 = new JPanel();
        panel13 = new JPanel();
        panel14 = new JPanel();
        panel15 = new JPanel();
        
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        button8 = new JButton();
        button9 = new JButton();
        button10 = new JButton();
        button11 = new JButton();
        
        label1 = new JLabel();
        label2 = new JLabel();
        
        textfield1 = new JTextField();
        textfield2 = new JTextField();
        
        f = new Font("Times New Roman", Font.BOLD, 15);
        f1 = new Font("Times New Roman", Font.BOLD, 20);
    }
}
