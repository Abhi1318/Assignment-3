import java.util.Scanner;
public class FindNumber
{
    public static void main(String[] args)
    {
       int i,j,num,flag=0;
       Scanner sc=new Scanner(System.in);
       int a[]={1,4,6,7,8,9,10};
       System.out.println("Entered Array:");
       for(i=0;i<7;i++)
       {
           System.out.print(a[i]+" ");
       }
       System.out.println("\nEnter Number to Find: ");
       num=sc.nextInt();
       for(i=0;i<7;i++)
       {
           if(a[i]==num)
           {
               System.out.println("Found!");
               flag=1;
               break;
           }
       }
       if(flag==0)
       {
           System.out.println("Not Found!");
       }
    }
}