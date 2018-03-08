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

        for(int k = 0 ; k <32;k++) {
            board[k][0] = '*';
            board[0][k] = '*';
            System.out.print(board[k][k]);
        }
        for(int i = 0 ; i <=31;i++) {
            for(int j = 0 ; j<=31;j++) {
            System.out.print(board[j]);
            }
        }
        
        return board;
    }
    
}

    