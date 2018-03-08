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
    
 

   Player Player1 = new Player(Board.create(),2);
   Player1.setShip();
   Player1.printBoard();
    }
  
}
 

       // TASK

    // 32x32 size board(Working !!!)
    // 1) 1 ship - size 4 length(Working !!!)
    // 2) 2 Players - 2 Boards ( Working !!!)
    // 3) Place more ships ( Not Working !!! )
    // 3)Gamelogic - hitting ship or not. (coding...)
    // 4) switching boards. (coding...) Nassim
    // 5) clear console (coding...) Nassim


 