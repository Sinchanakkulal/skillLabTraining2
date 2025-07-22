import java.util.Scanner;
import java.util.Arrays;
class sieve_of_eratosthenes{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); //30

        if(n<2)
        {
            System.out.println("primes are not there");
            return;
        }

        boolean[] Isprime=new boolean[n+1];
        Arrays.fill(Isprime,true);
        Isprime[0]=false;
        Isprime[1]=false;

        sieve(Isprime,2,n);

        for(int i=2;i<=n;i++)
        {
            if(Isprime[i])
            {
                System.out.print(i+" ");
            }
        }

        sc.close();
        


    }
    public static void sieve(boolean[] Isprime,int num,int n)
    {
        if(num*num>n)
        {
            return;
        }
        if(Isprime[num])
        {
            deletemultiple(Isprime,num,num*2,n);
        }
        sieve(Isprime,num+1,n);

    }
    public static void deletemultiple(boolean[] Isprime,int base,int multiple,int n)
    {
        if(multiple>n)
        {
            return;
        }
        Isprime[multiple]=false;
        deletemultiple(Isprime,base,multiple+base,n);
    }
}
