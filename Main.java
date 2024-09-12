import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(100);
        int count=0;
  
        Scanner scan = new Scanner(System.in);
        int guess;
        int n=1;

        do { 
            System.out.println("Enter your "+n+" Guess:");
            guess = scan.nextInt();
            n++;
            count++;
            if(guess<x){
                System.out.println("Too low!");
            }
            if(guess>x){
                System.out.println("Too high!");
            }
        } while (guess!=x);
        

        if(count <= 7){
            System.out.println("You got a impossible good score!");
        }
        if(count > 7 && count <= 10){
            System.out.println("You did good job!");
        }
        if(count > 10){
            System.out.println("Try the divide and consequer strategy next time");
        }
    }
}