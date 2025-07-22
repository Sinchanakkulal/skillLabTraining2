//find the four armstrong number between 101 and 999

public class armstrong_num{
    public static void main(String[] args)
    {
        System.out.println("four armstrong number between 101 to 999");
        for(int i=101;i<=999;i++)
        {
            int sum=0;
            int originalnum=i;

            int digit1=i/100;
            int digit2=(i/10)%10;
            int digit3=i%10;

            sum=(digit1*digit1*digit1)+(digit2*digit2*digit2)+(digit3*digit3*digit3);
            if(sum==originalnum){
                System.out.println(originalnum);
            }
        }
    }
}
