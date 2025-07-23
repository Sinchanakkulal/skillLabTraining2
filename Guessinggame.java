import java.util.Scanner;


public class Guessinggame {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int number=(int)(Math.random()*10);
        System.out.println("computer generated the ramdom number ");

        System.out.println("you have 5 trials to guess the number ");
        int count=0;
        while(count<5){
            System.out.println("enter the number between 1 to 100");
            int guess=sc.nextInt();
            if(guess>number)
            {
                System.out.println("your guess is too high!,Try again");
                count++;
            }
            else if(guess<number)
            {
                System.out.println("your guess is too low!,try again");
                count++;
                
            }
            else{
                System.out.println("you guessed it,hurry");
                break;
            }
            
        }
        if(count==5)
        {
            System.out.println("you have exceded the limit.Better luck next time :<");
        }

        sc.close();
        
    }
}
