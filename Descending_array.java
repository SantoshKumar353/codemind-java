import java.util.*;
class dfs
{
    public static void main(String args[])
    {
        Scanner ds=new Scanner(System.in);
        int n=ds.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=ds.nextInt();
        }
        int c=0;
        for(int i=0;i<n-1;i++)
        {
            if(a[i]>a[i+1])
            {
                c++;
            }
        }
        if(c==(n-1))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}