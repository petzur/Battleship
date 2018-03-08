/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


/**
 *
 * @author K3rn3l P4n1c
 */
public class Board {

   
    public static char[][] create() {
         
         char[][] board = new char[32][32];
        for(int i = 0 ; i <32;i++) {
            for(int j = 0; j<32;j++){
                if(i==0 || i==31)board[i][j]='*';
                else if(j==0 || j==31)board[i][j]='*';
                else board[i][j]=' ';
            }     
        }
        return board;
        
    }
    
}

    