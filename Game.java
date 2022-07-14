// rock, paper, scissor game
//0= Rock
//1= Paper
//2 = Scizzer

import java.io.*;
import java.util.Scanner;
import java.util.Random;

class Game
{
  public static void main(String arg [ ])
  {
    System.out.println(" Enter 0 for Rock ,1 for Paper , 2 for Scissor");
    System.out.println("  >>>>>>>>>>ONLY<<<<<<<<<<< ");  
    System.out.println("Start ur Game");

    Scanner sc = new Scanner(System.in);
     int UserInput = sc.nextInt();
   
    Random random = new Random();
    int ComputerInput = random.nextInt(3);
  
   if(UserInput == ComputerInput)
    {
      System.out.println("ITS A DRWA") ;
    }
 else if(UserInput == 0 && ComputerInput == 2 || UserInput == 1 && ComputerInput == 0 || UserInput == 2 && ComputerInput == 1)
             {
                     System.out.println("!!!!!!!!!YOU WIN!!!!!!!!!");
              }
      else
             {
                        System.out.println("!!!!!!!!!!!COMPUTER WIN!!!!!!!!!!");
             }


          if(ComputerInput == 2) 
           {
               System.out.println("computer choice is Scissor"); 
           }
       else if(ComputerInput == 0)
               {
                    System.out.println("computer choice is Rock"); 
               }
        else if(ComputerInput == 1)
                {
                    System.out.println("computer choice is Paper"); 
                }
                    System.out.println("!!!!!!!!!!!!THANK YOU!!!!!!!!!!"); 
               
  }
} 