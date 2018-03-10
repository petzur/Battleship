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
   boolean win = false;
   
   while(win!=true){
       
       Player1.attack(Player1,Player2);
       win = Player1.checkwin(Player1, Player2, Player2.Playerboard);
       if(win == true) break;
       Player2.attack(Player2, Player1);
       win = Player2.checkwin(Player2, Player1, Player1.Playerboard);
    }
   
    System.out.println("GG");
    
    }
  
}
 

       // TASK

    // 32x32 size board(Working !!!)
    // 1) 1 Ship - size 4 length(Working !!!)
    // 2) 2 Players - 2 Boards ( Working !!!)
    // 3) Place more ships ( Working !!! )
    // 3) Gamelogic - hitting ship or not. (Working!!!)
    // 4) switching boards. (Working !!!) 
    // 6) Destroy Ship(Working !!!)
    // 7) ShowHitBox on a 2nd Board(Working !!!)
    // 8) WIN,LOOSE->CONDITION(Working !!!)
    
    
        //TODO

    // 9) Build different Ships(coding...)
    // 5) clear console (coding...) 