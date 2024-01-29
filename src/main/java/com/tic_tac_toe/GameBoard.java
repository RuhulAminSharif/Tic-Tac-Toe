package com.tic_tac_toe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class GameBoard extends GUI{
    GameBoard(){
        panel.setBorder(new LineBorder(new Color(0, 0, 204), 2));
	frame.getContentPane().add(panel, BorderLayout.CENTER);
	panel.setLayout(new GridLayout(3, 5, 2, 2));
        
        panel1.setBorder(new LineBorder(new Color(0, 0, 204), 2));
	panel.add(panel1);
        panel1.setLayout(new BorderLayout(0, 0));
        button1.setText(null);
        button1.setFont(f);
        panel1.add(button1, BorderLayout.CENTER);
        
        panel2.setBorder(new LineBorder(new Color(0, 0, 204), 2));
	panel.add(panel2);
        panel2.setLayout(new BorderLayout(0, 0));
        button2.setText(null);
        button2.setFont(f);
        panel2.add(button2, BorderLayout.CENTER);
        
        panel3.setBorder(new LineBorder(new Color(0, 0, 204), 2));
	panel.add(panel3);
        panel3.setLayout(new BorderLayout(0, 0));
        button3.setText(null);
        button3.setFont(f);
        panel3.add(button3, BorderLayout.CENTER);
        
        panel4.setBorder(new LineBorder(new Color(0, 0, 204), 2));
	panel.add(panel4);
        panel4.setLayout(new BorderLayout(0, 0));
        label1.setOpaque(true);
        label1.setBackground(Color.green);
        label1.setText("Player X");
        label1.setFont(f1);
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        panel4.add(label1, BorderLayout.CENTER);
        
        panel5.setBorder(new LineBorder(new Color(0, 0, 204), 2));
	panel.add(panel5);
        panel5.setLayout(new BorderLayout(0, 0));
	textfield1.setFont(f1);
	textfield1.setHorizontalAlignment(SwingConstants.CENTER);
	textfield1.setText("0");
	panel5.add(textfield1, BorderLayout.CENTER);
	textfield1.setColumns(10);
        
        panel6.setBorder(new LineBorder(new Color(0, 0, 204), 2));
	panel.add(panel6);
        panel6.setLayout(new BorderLayout(0, 0));
        button4.setText(null);
        button4.setFont(f);
        panel6.add(button4, BorderLayout.CENTER);
        
        panel7.setBorder(new LineBorder(new Color(0, 0, 204), 2));
	panel.add(panel7);
        panel7.setLayout(new BorderLayout(0, 0));
        button5.setText(null);
        button5.setFont(f);
        panel7.add(button5, BorderLayout.CENTER);
        
        panel8.setBorder(new LineBorder(new Color(0, 0, 204), 2));
	panel.add(panel8);
        panel8.setLayout(new BorderLayout(0, 0));
        button6.setText(null);
        button6.setFont(f);
        panel8.add(button6, BorderLayout.CENTER);
        
        panel9.setBorder(new LineBorder(new Color(0, 0, 204), 2));
	panel.add(panel9);
        panel9.setLayout(new BorderLayout(0, 0));
        label2.setText("Player O");
        label2.setOpaque(true);
        label2.setBackground(Color.green);
        label2.setFont(f1);
        label2.setHorizontalAlignment(SwingConstants.CENTER);
        panel9.add(label2, BorderLayout.CENTER);
        
        panel10.setBorder(new LineBorder(new Color(0, 0, 204), 2));
	panel.add(panel10);
        panel10.setLayout(new BorderLayout(0, 0));
        textfield2.setFont(f1);
	textfield2.setHorizontalAlignment(SwingConstants.CENTER);
	textfield2.setText("0");
	panel10.add(textfield2, BorderLayout.CENTER);
	textfield2.setColumns(10);
        
        panel11.setBorder(new LineBorder(new Color(0, 0, 204), 2));
	panel.add(panel11);
        panel11.setLayout(new BorderLayout(0, 0));
        button7.setText(null);
        button7.setFont(f);
        panel11.add(button7, BorderLayout.CENTER);
        
        panel12.setBorder(new LineBorder(new Color(0, 0, 204), 2));
	panel.add(panel12);
        panel12.setLayout(new BorderLayout(0, 0));
        button8.setText(null);
        button8.setFont(f);
        panel12.add(button8, BorderLayout.CENTER);
        
        panel13.setBorder(new LineBorder(new Color(0, 0, 204), 2));
	panel.add(panel13);
        panel13.setLayout(new BorderLayout(0, 0));
        button9.setText(null);
        button9.setFont(f);
        panel13.add(button9, BorderLayout.CENTER);
        
        panel14.setBorder(new LineBorder(new Color(0, 0, 204), 2));
	panel.add(panel14);
        panel14.setLayout(new BorderLayout(0, 0));
        button10.setText("RESET");
        button10.setFont(f);
        panel14.add(button10, BorderLayout.CENTER);
        
        panel15.setBorder(new LineBorder(new Color(0, 0, 204), 2));
	panel.add(panel15);
        panel15.setLayout(new BorderLayout(0, 0));
        button11.setText("EXIT");
        button11.setFont(f);
        panel15.add(button11, BorderLayout.CENTER);
    }
}
