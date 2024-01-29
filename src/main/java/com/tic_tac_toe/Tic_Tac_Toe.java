
package com.tic_tac_toe;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Tic_Tac_Toe{
    public static void main(String[] args) {
        Player p = new Player();
        p.xcnt=0;
        p.ocnt=0;
        GameBoard game = new GameBoard();
        
        game.button1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try{
                    if(p.pattern[0][0]=='X'||p.pattern[0][0]=='O')
                        throw new Exception("Invalid move");
                    char ch = p.start;
                    String tmp = ch+"";
                    game.button1.setText(tmp);
                    p.pattern[0][0] = p.start;
                    if(p.start=='X'){
                        game.button1.setForeground(Color.RED);
                    }
                    else {
                        game.button1.setForeground(Color.BLUE);
                    }
                    p.choosePlayer();
                    
                    String w = p.win_draw();
                    if(w.equalsIgnoreCase("X")){
                        JOptionPane.showMessageDialog(game.frame, "Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
                        p.xcnt++;
                        game.textfield1.setText(String.valueOf(p.xcnt));
                    }
                    else if(w.equalsIgnoreCase("O")){
                        JOptionPane.showMessageDialog(game.frame, "Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
                        p.ocnt++;
                        game.textfield2.setText(String.valueOf(p.ocnt));
                    }
                    else if(w.equalsIgnoreCase("draw")){
                        JOptionPane.showMessageDialog(game.frame, "No one Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
//                        game.textfield1.setText(String.valueOf(p.xcnt));
//                        game.textfield2.setText(String.valueOf(p.ocnt));
                    }
                    
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(game.frame, e.getMessage(), "Tic-Tac-Toe", JOptionPane.INFORMATION_MESSAGE);
                }
		
            }
        });
        game.button2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try{
                    if(p.pattern[0][1]=='X'||p.pattern[0][1]=='O')
                        throw new Exception("Invalid move");
                    char ch = p.start;
                    String tmp = ch+"";
                    game.button2.setText(tmp);
                    p.pattern[0][1] = p.start;
                    if(p.start=='X'){
                        game.button2.setForeground(Color.RED);
                    }
                    else {
                        game.button2.setForeground(Color.BLUE);
                    }
                    p.choosePlayer();
                    
                    String w = p.win_draw();
                    if(w.equalsIgnoreCase("X")){
                        JOptionPane.showMessageDialog(game.frame, "Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
                        p.xcnt++;
                        game.textfield1.setText(String.valueOf(p.xcnt));
                    }else if(w.equalsIgnoreCase("O")){
                        JOptionPane.showMessageDialog(game.frame, "Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
                        p.ocnt++;
                        game.textfield2.setText(String.valueOf(p.ocnt));
                    }else if(w.equalsIgnoreCase("draw"))
                        JOptionPane.showMessageDialog(game.frame, "No one Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(game.frame, e.getMessage(), "Tic-Tac-Toe", JOptionPane.INFORMATION_MESSAGE);
                }
		
            }
        });
        game.button3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try{
                    if(p.pattern[0][2]=='X'||p.pattern[0][2]=='O')
                        throw new Exception("Invalid move");
                    char ch = p.start;
                    String tmp = ch+"";
                    game.button3.setText(tmp);
                    p.pattern[0][2] = p.start;
                    if(p.start=='X'){
                        game.button3.setForeground(Color.RED);
                    }
                    else {
                        game.button3.setForeground(Color.BLUE);
                    }
                    p.choosePlayer();
                    
                    String w = p.win_draw();
                    if(w.equalsIgnoreCase("X")){
                        JOptionPane.showMessageDialog(game.frame, "Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
                        p.xcnt++;
                        game.textfield1.setText(String.valueOf(p.xcnt));
                    }else if(w.equalsIgnoreCase("O")){
                        JOptionPane.showMessageDialog(game.frame, "Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
                        p.ocnt++;
                        game.textfield2.setText(String.valueOf(p.ocnt));
                    }else if(w.equalsIgnoreCase("draw"))
                        JOptionPane.showMessageDialog(game.frame, "No one Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(game.frame, e.getMessage(), "Tic-Tac-Toe", JOptionPane.INFORMATION_MESSAGE);
                }
		
            }
        });
        game.button4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try{
                    if(p.pattern[1][0]=='X'||p.pattern[1][0]=='O')
                        throw new Exception("Invalid move");
                    char ch = p.start;
                    String tmp = ch+"";
                    game.button4.setText(tmp);
                    p.pattern[1][0] = p.start;
                    if(p.start=='X'){
                        game.button4.setForeground(Color.RED);
                    }
                    else {
                        game.button4.setForeground(Color.BLUE);
                    }
                    
                    p.choosePlayer();
                    String w = p.win_draw();
                    if(w.equalsIgnoreCase("X")){
                        JOptionPane.showMessageDialog(game.frame, "Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
                        p.xcnt++;
                        game.textfield1.setText(String.valueOf(p.xcnt));
                    }else if(w.equalsIgnoreCase("O")){
                        JOptionPane.showMessageDialog(game.frame, "Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
                        p.ocnt++;
                        game.textfield2.setText(String.valueOf(p.ocnt));
                    }else if(w.equalsIgnoreCase("draw"))
                        JOptionPane.showMessageDialog(game.frame, "No one Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
                    
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(game.frame, e.getMessage(), "Tic-Tac-Toe", JOptionPane.INFORMATION_MESSAGE);
                }
		
            }
        });
        game.button5.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try{
                    if(p.pattern[1][1]=='X'||p.pattern[1][1]=='O')
                        throw new Exception("Invalid move");
                    char ch = p.start;
                    String tmp = ch+"";
                    game.button5.setText(tmp);
                    p.pattern[1][1] = p.start;
                    if(p.start=='X'){
                        game.button5.setForeground(Color.RED);
                    }
                    else {
                        game.button5.setForeground(Color.BLUE);
                    }
                    
                    p.choosePlayer();
                    String w = p.win_draw();
                    if(w.equalsIgnoreCase("X")){
                        JOptionPane.showMessageDialog(game.frame, "Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
                        p.xcnt++;
                        game.textfield1.setText(String.valueOf(p.xcnt));
                    }else if(w.equalsIgnoreCase("O")){
                        JOptionPane.showMessageDialog(game.frame, "Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
                        p.ocnt++;
                        game.textfield2.setText(String.valueOf(p.ocnt));
                    }else if(w.equalsIgnoreCase("draw"))
                        JOptionPane.showMessageDialog(game.frame, "No one Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(game.frame, e.getMessage(), "Tic-Tac-Toe", JOptionPane.INFORMATION_MESSAGE);
                }
		
            }
        });
        game.button6.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try{
                    if(p.pattern[1][2]=='X'||p.pattern[1][2]=='O')
                        throw new Exception("Invalid move");
                    char ch = p.start;
                    String tmp = ch+"";
                    game.button6.setText(tmp);
                    p.pattern[1][2] = p.start;
                    if(p.start=='X'){
                        game.button6.setForeground(Color.RED);
                    }
                    else {
                        game.button6.setForeground(Color.BLUE);
                    }
                    
                    p.choosePlayer();
                    String w = p.win_draw();
                    if(w.equalsIgnoreCase("X")){
                        JOptionPane.showMessageDialog(game.frame, "Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
                        p.xcnt++;
                        game.textfield1.setText(String.valueOf(p.xcnt));
                    }else if(w.equalsIgnoreCase("O")){
                        JOptionPane.showMessageDialog(game.frame, "Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
                        p.ocnt++;
                        game.textfield2.setText(String.valueOf(p.ocnt));
                    }else if(w.equalsIgnoreCase("draw"))
                        JOptionPane.showMessageDialog(game.frame, "No one Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(game.frame, e.getMessage(), "Tic-Tac-Toe", JOptionPane.INFORMATION_MESSAGE);
                }
		
            }
        });
        game.button7.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try{
                    if(p.pattern[2][0]=='X'||p.pattern[2][0]=='O')
                        throw new Exception("Invalid move");
                    char ch = p.start;
                    String tmp = ch+"";
                    game.button7.setText(tmp);
                    p.pattern[2][0] = p.start;
                    if(p.start=='X'){
                        game.button7.setForeground(Color.RED);
                    }
                    else {
                        game.button7.setForeground(Color.BLUE);
                    }
                    
                    p.choosePlayer();
                    String w = p.win_draw();
                    if(w.equalsIgnoreCase("X")){
                        JOptionPane.showMessageDialog(game.frame, "Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
                        p.xcnt++;
                        game.textfield1.setText(String.valueOf(p.xcnt));
                    }else if(w.equalsIgnoreCase("O")){
                        JOptionPane.showMessageDialog(game.frame, "Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
                        p.ocnt++;
                        game.textfield2.setText(String.valueOf(p.ocnt));
                    }else if(w.equalsIgnoreCase("draw"))
                        JOptionPane.showMessageDialog(game.frame, "No one Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(game.frame, e.getMessage(), "Tic-Tac-Toe", JOptionPane.INFORMATION_MESSAGE);
                }
		
            }
        });
        game.button8.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try{
                    if(p.pattern[2][1]=='X'||p.pattern[2][1]=='O')
                        throw new Exception("Invalid move");
                    char ch = p.start;
                    String tmp = ch+"";
                    game.button8.setText(tmp);
                    p.pattern[2][1] = p.start;
                    if(p.start=='X'){
                        game.button8.setForeground(Color.RED);
                    }
                    else {
                        game.button8.setForeground(Color.BLUE);
                    }
                    
                    p.choosePlayer();
                    String w = p.win_draw();
                    if(w.equalsIgnoreCase("X")){
                        JOptionPane.showMessageDialog(game.frame, "Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
                        p.xcnt++;
                        game.textfield1.setText(String.valueOf(p.xcnt));
                    }else if(w.equalsIgnoreCase("O")){
                        JOptionPane.showMessageDialog(game.frame, "Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
                        p.ocnt++;
                        game.textfield2.setText(String.valueOf(p.ocnt));
                    }else if(w.equalsIgnoreCase("draw"))
                        JOptionPane.showMessageDialog(game.frame, "No one Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(game.frame, e.getMessage(), "Tic-Tac-Toe", JOptionPane.INFORMATION_MESSAGE);
                }
		
            }
        });
        game.button9.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try{
                    if(p.pattern[2][2]=='X'||p.pattern[2][2]=='O')
                        throw new Exception("Invalid move");
                    char ch = p.start;
                    String tmp = ch+"";
                    game.button9.setText(tmp);
                    p.pattern[2][2] = p.start;
                    if(p.start=='X'){
                        game.button9.setForeground(Color.RED);
                    }
                    else {
                        game.button9.setForeground(Color.BLUE);
                    }
                    p.choosePlayer();
                    String w = p.win_draw();
                    if(w.equalsIgnoreCase("X")){
                        JOptionPane.showMessageDialog(game.frame, "Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
                        p.xcnt++;
                        game.textfield1.setText(String.valueOf(p.xcnt));
                    }else if(w.equalsIgnoreCase("O")){
                        JOptionPane.showMessageDialog(game.frame, "Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
                        p.ocnt++;
                        game.textfield2.setText(String.valueOf(p.ocnt));
                    }else if(w.equalsIgnoreCase("draw"))
                        JOptionPane.showMessageDialog(game.frame, "No one Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
                    }
                catch(Exception e){
                    JOptionPane.showMessageDialog(game.frame, e.getMessage(), "Tic-Tac-Toe", JOptionPane.INFORMATION_MESSAGE);
                }
		
            }
        });
        game.button10.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                game.button1.setText(null);
                game.button2.setText(null);
                game.button3.setText(null);
                game.button4.setText(null);
                game.button5.setText(null);
                game.button6.setText(null);
                game.button7.setText(null);
                game.button8.setText(null);
                game.button9.setText(null);
                p.start='X';
                p.pattern[0][0]=p.pattern[0][1]=p.pattern[0][2]=' ';
                p.pattern[1][0]=p.pattern[1][1]=p.pattern[1][2]=' ';
                p.pattern[2][0]=p.pattern[2][1]=p.pattern[2][2]=' ';
                
            }
        });
        game.button11.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                JFrame frame = new JFrame("Exit");
		if(JOptionPane.showConfirmDialog(frame, "Confirm You Want To Exit","Tic Tac Toe",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
                {
                    System.exit(0);			
		}
            }
        });
    }
}
