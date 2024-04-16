import java.util.Random;
import java.util.Scanner;
public class number
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int randomno = rand.nextInt(100) + 1;
        //System.out.println("Random Number is : "+randomno);
        int tryCount = 0;

        while(true)
        {
        
        System.out.println("/nWelcome to the number guessing game!\n");
        System.out.println("Guess a number between 1 to 100 : \n");
        
        int guess = sc.nextInt();
        tryCount++;

         if(guess == randomno)
            {
                System.out.println("Congratulation, You guessed the number!");
                System.out.println("It took you : " + tryCount + "tries");
                 break;
            }
            else if(randomno > guess)
            {
                System.out.println("Your guess is too low. Try again : \n");
            }
            else
            {
                System.out.println("Your guess is too high. Try again : \n");
            }
        }
       
    }
}