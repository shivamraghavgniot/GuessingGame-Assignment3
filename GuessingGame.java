import java.util.Scanner;
class Game{
  int min;
  int max; 
  int num; 
  int num1;
  int num2;
  int num3;
public int minimum(){
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter the minimum limit number of guessing game");
  min=sc.nextInt();
  return min; 
}
  public int maximum(){
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter the maximum limit number of guessing game");
  max=sc.nextInt();
  return max; 
}
public int guesser(){
  Scanner sc= new   Scanner(System.in);
System.out.println( "Now  enter a guess number b/w "+min+" and "+max );
num=sc.nextInt();
  if(num>=min && num<=max)
  {
    num=num+1-1;
  }
  else 
  {
    System.out.println("Guesser, it's wrong entry.");
num =-9999;
  }
  return num; 
}
 public  int player1(){
    Scanner sc = new Scanner(System.in);
   if (num>=min && num<=max){
     System.out.println(" ");
     System.out.println("Now Players turn.");
     System.out.println(" ");
System.out.println("Player1 enter the your guess number b/w "+min+" and "+max);
num1=sc.nextInt();
     if(num1>=min && num1<=max)
       num1=num1+1-1;
     else 
     {
       System.out.println("Player1, wrong entry.Restart the game. ");
       num=-9999;
     }
       
   }
   return num1;
  }
  public int player2(){
    Scanner sc= new Scanner(System.in);
  if (num>=min && num<=max){
System.out.println("Player2 enter the your guess number b/w "+min+" and "+max );
num2=sc.nextInt();
     if(num2>=min && num2<=max)
       num2=num2+1-1;
     else 
     {
       System.out.println("Player2, wrong entry. Restart the game. ");
    num=-9999;
     }
 }
   return num2;
  }
  public int player3(){
    Scanner sc= new Scanner(System.in);
   if (num>=min && num<=max){
System.out.println("Player3 enter the your guess number b/w "+min+" and "+max  );
num3=sc.nextInt();
     if(num3>=min && num3<=max)
       num3=num3+1-1;
     else 
     {
       System.out.println("Player3, wrong entry.Restart the game.");
    num=-9999;
     }
       
   }
   return num3;
  }
  public void umpire(){
   // while (num>0 && num<21){
if(num==num1 && num==num2 && num==num3)
  { 
    System.out.println("player 1, 2 & 3 won");
  }
else if(num==num1 && num==num2) 
  {
    System.out.println(" player 1 and 2 won the match"); 
  }
 else if(num==num1 && num==num3)
   System.out.println("player 1 and 3 won");
   else if (num == num2 && num==num3){
     System.out.println("player 2 and player 3 won");}
else if(num== num1)
     { System.out.println("player 1 won");
     }
    else if(num==num2)
    { 
      System.out.println("player 2 won");
    }  
else if(num== num3)
{
  System.out.println("player 3 won");
}
 else
      System.out.println("None won");
    }
  }

public class GuessingGame {
  public static void main(String[] args) {
     System.out.println("Hi Guesser..!! ");
    Game g= new Game();
    g.minimum();
    g.maximum();
    g.guesser();
    g.player1();
    g.player2();
    g.player3();
    g.umpire();

  }
}