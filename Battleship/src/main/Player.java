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
       Ship.set(Playerboard);
    }

    
    
}
