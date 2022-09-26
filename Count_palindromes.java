import java.util.Scanner;
class hmn
{
    public static void main(String args[])
    {
        Scanner ds=new Scanner(System.in);
        int n=ds.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=ds.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            int temp=a[i];
            int rev=0;
            while(temp>0)
            {
                rev=(rev*10)+temp%10;
                temp/=10;
            }
            if(rev==a[i])
            {
                c++;
            }
        }
        System.out.println(c);
    }
}