import java.util.Random;
import java.util.Scanner;


public class Main{
    public static void main(String[] args){
        Random rand = new Random();
        int x = rand.nextInt(100);


        Scanner scan = new Scanner(System.in);
        int guess;
        
        int count= 0;
        do {
            System.out.println("Enter your first guess:");
            guess = scan.nextInt();
            count++;
            if (guess<x){
                System.out.println("Too low");
            }
            
            if (guess>x){
                System.out.println("Too high");
            }
            // if guess is less than x
            //if guess is more than x
            //count how many guesses
            //if count is less than 7, you print a very good response
        } while (guess!=x);
        if (count<=7){
            System.out.println("You got an impossibly good score!");
        }
        if (count>=8 && count<=10){
            System.out.println("You did a good job");
        }
        if (count>10){
            System.out.println("Try the divide and conquer strategy next time");
        }
        System.out.print(guess);


    }
}
