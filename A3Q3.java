import java.util.Scanner;
public class PrimeNumbers 
{
    public static void main(String[] args)
    {
        int i,j,cnt=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    cnt++;
                }
            }
            if(cnt==2)
            {
                System.out.println(i);
            }
            cnt=0;
        }
        
    }
}