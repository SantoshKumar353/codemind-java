import java.util.*;
class sol
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1,c=0;
        System.out.format("%d %d ",a,b);
        for(int i=0;i<n-2;i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.format("%d ",c);
        }
    }
}