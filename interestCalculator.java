import java.util.Scanner;

public class interestCalculator {
    public staic void main(String[] args){
        System.out.println("welcome to the interest and compound calculator");
        
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the principle");
        double Principal=sc.nextDouble();

        System.out.println("enter the Rate");
        double Rate=sc.nextDouble(); 

        System.out.println("enter the Time");
        double Time=sc.nextDouble();

        System.out.println("calculator type:interest or compound");
        String choice=sc.next();

        switch (choice) {
            case interest:System.out.println("interest: "+(Principal*Rate*Time)/100);
                
                break;
            case compound:double Amount (A) = Principal * (1 + Rate / (n * 100))^(n * Time);
            System.out.println("compound interest: "+Amount - Principal);

            default:System.out.println("choose the proper option ");
                break;
        }
        // Simple Interest (SI) = (Principal * Rate * Time) / 100

        // Amount (A) = Principal * (1 + Rate / (n * 100))^(n * Time)
        // Compound Interest (CI) = Amount - Principal
    }
    
}
