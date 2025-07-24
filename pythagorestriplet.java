import java.util.Scanner;

public class pythagorestriplet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("enter the array of integers");
        int[] arr = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        // for(int i=0;i<n;i++)
        // {
        //     System.out.print(arr[i]+" " );
        // }

        sc.close();
        boolean flag=false;
        System.out.print("pythagores triplet ");
        for(int i=0;i<n;i++)
        {
            int c=arr[i];
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                    continue;
                }

                for(int k=0;k<n;k++)
                {
                    if(k==i || k==j)
                    {
                        continue;
                    }
                    if(c*c==arr[j]*arr[j]+arr[k]*arr[k])
                    {
                        System.out.println("found"+"["+arr[j]+","+arr[k]+","+c+"]");
                        flag=true;
                    }
                    }
                    }
                }          
                    if(!flag)
                    {
                        System.out.println("are not found");
                    }
                    
                
            }
           
        }
