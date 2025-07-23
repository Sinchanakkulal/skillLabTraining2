import java.text.NumberFormat.Style;
import java.util.Scanner;

public class digitalroot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number to find the single digital root is :");
        int num=sc.nextInt();

        int digit=digitalroot(num);
        System.out.println("single digit root is :"+digit);
    }
        public static int digitalroot(int num) {
        while(num>9)
        {
            int sum=0;
            while(num>0)
            {
                int rem=num%10;
                num=num/10;
                sum+=rem;
            }
            num=sum;
        }
        return num;


    }
    
}
