//reverse the string in the sentence 
import java.util.Scanner;

public class reverse_string{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        //System.out.println(str);

        //System.out.println(str.charAt(3));

       String[] words = str.split(" ");
        
    //     //how words are stored in the array of words
    //    for (int i = 0; i < words.length; i++) 
    //    {
    //        System.out.println(words[i]+" ");
    //    }

    for(int i=words.length-1;i>=0;i--)
    {
        System.out.print(words[i]+" ");
    }

    }
}
