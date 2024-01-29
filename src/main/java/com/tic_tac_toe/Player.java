package com.tic_tac_toe;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Player{
    char start = 'X';
    int xcnt=0, ocnt=0;
    char[][] pattern = new char[3][3];
    public String win_draw()
    {
        for (int a = 0; a < 8; a++) {
            char[] line = new char[3];
 
            switch (a) {
            case 0:
                line[0] = pattern[0][0];
                line[1] = pattern[0][1];
                line[2] =  pattern[0][2];
                break;
            case 1:
                line[0] = pattern[0][0];
                line[1] = pattern[1][1];
                line[2] =  pattern[2][2];
                break;
            case 2:
                line[0] = pattern[0][0];
                line[1] = pattern[1][0];
                line[2] =  pattern[2][0];
                break;
            case 3:
                line[0] = pattern[0][1];
                line[1] = pattern[1][1];
                line[2] =  pattern[2][1];
                break;
            case 4:
                line[0] = pattern[0][2];
                line[1] = pattern[1][2];
                line[2] =  pattern[2][2];
                break;
            case 5:
                line[0] = pattern[0][2];
                line[1] = pattern[1][1];
                line[2] =  pattern[2][0];
                break;
            case 6:
                line[0] = pattern[1][0];
                line[1] = pattern[1][1];
                line[2] =  pattern[1][2];
                break;
            case 7:
                line[0] = pattern[2][0];
                line[1] = pattern[2][1];
                line[2] =  pattern[2][2];
                break;
            }
            if (line[0]=='X'&&line[1]=='X'&&line[2]=='X') return "X";
            else if (line[0]=='O'&&line[1]=='O'&&line[2]=='O') return "O";   
        }
        int cnt=0;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(pattern[i][j]=='X'||pattern[i][j]=='O') cnt++; 
            }
        }
        if(cnt==9) return "draw";
        return "S";
    }
    void choosePlayer(){
	if(start=='X'){
            start='O';
	}
	else{
            start='X';
        }
    }
    
}
