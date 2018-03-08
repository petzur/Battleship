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
        
        for(int i = 1;i<this.ships+1;i++)
        {    
        Scanner sc = new Scanner(System.in);
        boolean set = false;
        int seth = 0;
        int setw = 0;
        
        while(set!=true){
            System.out.println("Set poistion Ship startheight");
            seth = sc.nextInt();
            System.out.println("Set poistion Ship startwidth");
            setw = sc.nextInt();
            
            if(this.Playerboard[seth][setw] != '*') set = true;
            
            if(this.Playerboard[seth][setw] == '*' || seth >=31 || setw >=31) 
            System.out.println("Can't put Ship!");
        }
        
        Ship[] battleships = new Ship[this.ships+1];
        battleships[i]= new Ship(battleships, i, Playerboard, seth, setw);
        this.Playerboard = battleships[i].buildShip();
        
        }
       
    }

    public void printBoard(Player Player){
        for(int i = 0;i<Player.this.Playerboard[0].length;i++){
            for(int j = 0;j<Player.this.Playerboard.length;j++){
                System.out.print(Player.Playerboard[i][j]);
            }
            System.out.println();
        }
    }
    
}
