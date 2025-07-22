
//find the left and right diagonal sums of a n*n squre matrix
import java.util.Scanner;

public class sumofdiagonal{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n*n matrix");
        int n=sc.nextInt();

        System.out.println("enter the matrix");
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
       }
       
       int sumL=0,j=0;
        for(int i=0;i<n;i++)
        {
            sumL+=arr[i][j];
            j=j+1;
        }
        System.out.println("sum of left diagonal is"+sumL);
         
        int k=n-1,sumR=0;
        for(int i=0;i<n;i++)
        {
            sumR+=arr[i][k];
            k--;
        }      
        System.out.println("sum of right diagonal is "+sumR);  
    }
}
