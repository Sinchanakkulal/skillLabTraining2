import java.util.Scanner;

public class sequence {
    public static void main(String[] args)
    {
        //int n=6;

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n value");
        int n=sc.nextInt();
        
        System.out.println("enter the sequence");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        
       sc.close();

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }


        System.out.println();
        boolean flag=true;
        int r=(arr[1]/arr[0]);//common ratio for first two terms in GP
        int d=(arr[1]-arr[0]);//common difference for first two terms in AP

        if(n<3)
        {
            System.out.println("this sequence cannot determine the AP or GP .give the sequence of 3 or more");
            return;
        }
        else if(d==(arr[2]-arr[1]))
        {
            
             for(int i=2;i<n;i++)
            {
            if(d==(arr[i]-arr[i-1]))
            {
                flag=true;
            }
            // else{
            //     flag=false;
            //     System.out.println("given sequence is not AP");
            //     break;
            // }
            }
            if(flag==true)
            {
                System.out.println("given sequence is AP");
                return;
            }

        }
        else if (r==(arr[2]/arr[1])) {
           
            for(int i=2;i<n;i++)
            {
                if(r==(arr[i]/arr[i-1]))
                {
                    flag=true;
                }

                if(flag==true)
                {
                   System.out.println("given sequence is GP"); 
                   return;
                }
            }
            
        }
        else
        {
            System.out.println("given sequence is neither AP nor GP");
            return;
        }

    }
}
