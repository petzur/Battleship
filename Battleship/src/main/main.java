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
   Player2.attack(Player2,Player1);
   Player2.attack(Player2,Player1);
   
    }
  
}
 

       // TASK

    // 32x32 size board(Working !!!)
    // 1) 1 Ship - size 4 length(Working !!!)
    // 2) 2 Players - 2 Boards ( Working !!!)
    // 3) Place more ships ( Working !!! )
    // 3) Gamelogic - hitting ship or not. (Working!!!)
    // 4) switching boards. (Working !!!) 
    // 5) clear console (coding...) Nassim
    // 6) Destroy Ship(coding...)
    // 7) ShowHitBox on a 2nd Board(???)
    // 8) WIN,LOOSE->CONDITION(coding...)


 