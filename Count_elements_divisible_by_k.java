import java.util.Scanner;
class dfg
{
    public static void main(String args[])
    {
        Scanner fd=new Scanner(System.in);
        int n=fd.nextInt();
        int k=fd.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=fd.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]%k==0)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}