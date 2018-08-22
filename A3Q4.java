import java.util.Scanner;
import java.lang.Math;
public class ArmstrongNumber 
{
    public static void main(String[] args)
    {
        int temp,temp2;
        double sum=0,ld,cnt=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        temp=n;
        while(temp!=0)
        {
            cnt++;
            temp/=10;
        }
        temp2=n;
        while(temp2!=0)
        {
            ld=temp2%10;
            sum=sum+Math.pow(ld,cnt);
            temp2/=10;
        }
        if(sum==n)
        {
            System.out.println(n+" is Armstrong Number.");
        }
        else
        {
            System.out.println(n+" is not an Armstrong Number.");
        }
    }
}