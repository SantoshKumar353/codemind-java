import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j,f=0;
        for(i=1;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if((i*i)+(j*j)==n)
                {
                    f=1;
                }
            }
        }
        if(f==1)
            System.out.println("True");
        else
            System.out.println("False");
    }
}