import java.util.Scanner;
public class ReverseNumber 
{
    public static void main(String[] args)
    {
       int n,ld,rev=0,temp;
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       temp=n;
       while(temp!=0)
       {
           ld=temp%10;
           rev=rev*10+ld;
           temp/=10;
       }
       System.out.println("Entered Number: "+n+"\nReverse of "+n+": "+rev);
    }
}
