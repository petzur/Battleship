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
    
    private final int ships;
    private char[][] Playerboard;
    public String Name;
    
    
    public Player(char[][] Board,int ships){
        this.Playerboard = Board;
        this.ships = ships;
        Scanner sc = new Scanner(System.in);
        System.out.println("Name Your CREW : ");
        this.Name = sc.nextLine();
    }
    
    
      public void setShip(){
  
        Scanner sc = new Scanner(System.in);
        for(int i = 1;i<this.ships+1;i++)
        {    
        boolean set = false;
        int seth = 0;
        int setw = 0;
        
        while(set!=true){
            System.out.println("Set poistion Ship startheight");
            seth = sc.nextInt();
            System.out.println("Set poistion Ship startwidth");
            setw = sc.nextInt();
            
            set = Collision(seth,setw,set);
        }
        
        Ship[] battleships = new Ship[this.ships+1];
        battleships[i]= new Ship(battleships, i, Playerboard, seth, setw);
        this.Playerboard = battleships[i].buildShip();
        
        }
       
    }

    public void printBoard(Player Player, char[][] board){
        for(int i = 0;i<board[0].length;i++){
            for(int j = 0;j<board.length;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    
    public void attack(Player Player,Player Enemy){
         
        Scanner sc = new Scanner(System.in);
        boolean set = false;
        boolean hit = true;
        int attackw = 0;
        int attackh = 0;
        
        while(set!=true){
            System.out.println("----"+Player.Name+"------ATTACK---"+Enemy.Name+"----");
            System.out.println("Attack y coordinate");
            attackw = sc.nextInt();
            System.out.println("Attack x coordinate");
            attackh = sc.nextInt();
            
            set = Collision(attackh,attackw,set);
          }
         
        if(Enemy.Playerboard[attackh][attackw]=='O'){
            System.out.println("HIT SHIP AT :  " +
                            attackw+"  "+attackh  ); 
            hit=true;
        }  
        
        else{ System.out.println("MISSED THE SHIP AT :  " +
                            attackw+"  "+attackh);
        
            hit=false;
        }
        
        Hitboard(Player,attackh,attackw,hit); 
        setShots(Player,Player1shots,attackh,attackw,hit);
                
                
        
    }
    
    
    
    
    public boolean Collision(int seth,int setw, boolean collision){
        if(this.Playerboard[seth][setw] != '*') collision = true;
            
            if(this.Playerboard[seth][setw] == '*' || seth >=31 || setw >=31){ 
            System.out.println("Can't put Ship!");
            collision = false;
            }
            
            return collision;
    
    }

    public String log = "";
    public int logcounter = 1;
    
    void Hitboard(Player Player, int hity, int hitx,boolean hit) {
        if(hit==true)log = log + "\n"+logcounter+")"+"  Hit at "+hity +" "+ hitx;
        if(hit==false)log = log + "\n"+logcounter+")"+"  Missed at "+hity +" "+ hitx;
        System.out.println(log);
        logcounter++;
    }
    
       char[][] Player1shots = Board.create();
       char[][] Player2shots = Board.create();
    
       public void setShots(Player Player, char[][] board, int y, int x, boolean checkhit){
        
           if(checkhit == true)  board[y][x]='!';
           if(checkhit == false) board[y][x]='X';
           
          printBoard(Player,board);
    }
    
}
