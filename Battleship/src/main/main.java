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


public class main {
    
    public static void main(String[] args){
    
 

   Player Player1 = new Player(Board.create(),1);
   Player Player2 = new Player(Board.create(),1);
   
   Player1.setShip();
   Player2.setShip();
   // Player Player 2 = New Player(Board,Ship); 
    
    
    //32x32 size board
    // 1 ship - size 4 length
    // 2 Players - 2 Boards
    // Gamelogic - hitting ship or not.
    // switching boards.

    }
  
}
