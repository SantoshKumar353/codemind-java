import java.util.*;
class sol
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int p=1;
            for(int j=0;j<n;j++)
            {
                if(i!=j)
                {
                    p*=arr[j];
                }
            }
            System.out.print(p+" ");
        }
    }
}
    