/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author K3rn3l P4n1c
 */
public class Player {
    
    private int ships;
    private char[][] Playerboard;
    
    public Player(char[][] Board,int ships){
        this.Playerboard = Board;
        this.ships = ships;
    }
    
    public void setShip(){
         int seth = 0;
         int setw = 0;
        Scanner sc = new Scanner(System.in);
        boolean set = false;
        
        while(set!=true){
            
            System.out.println("Set poistion Ship startheight");
             seth = sc.nextInt();
             System.out.println("Set poistion Ship startwidth");
             setw = sc.nextInt();
            
            if(this.Playerboard[seth][setw] != '*') set = true;
        }
        
       Ship s1 = new Ship(seth,setw);

    }

    
    
}
