import java.util.Scanner;
public class EvenNumbers 
{
    public static void main(String[] args)
    {
        int i;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(i=0;i<=n;i++)
        {
            if(i%2==0)
            {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}