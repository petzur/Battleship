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
public class Ship {
    
    public int x = 0;
    public int y = 0;
    
    public Ship(int y, int x,char[][] board){
        
        this.x = x;
        this.y = y;
        
        for(int i = 0;i<3;i++){
            board[y][x+i]='O';
            
        }
        
    }
    
    
    
}
