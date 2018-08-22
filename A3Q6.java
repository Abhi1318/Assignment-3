public class Array 
{
    public static void main(String[] args)
    {
       int i,j,temp;
       int a[]={1,1,1,1,0,0,1,0};
       System.out.println("Entered Array:");
       for(i=0;i<8;i++)
       {
           System.out.print(a[i]+" ");
       }
       for(i=0;i<8;i++)
       {
           for(j=i;j<8;j++)
           {
               if(a[i]>a[j])
               {
                   temp=a[i];
                   a[i]=a[j];
                   a[j]=temp;
               }
           }
       }
       System.out.println("\nArray in Ascending Order:");
       for(i=0;i<8;i++)
       {
           System.out.print(a[i]+" ");
       }
    }
}