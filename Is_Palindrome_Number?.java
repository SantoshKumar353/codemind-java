import java.util.Scanner;
class sol
{
    public static int ispal(int n)
    {
        int rev=0;
        int temp=n;
        while(n!=0)
        {
            rev=rev*10+n%10;
            n=n/10;
        }
        if(temp==rev)
        {
            return 2;
        }
        return 1;
    }
    public static void main(String args[])
    {
        Scanner ds=new Scanner(System.in);
        int n=ds.nextInt();
        System.out.println(ispal(n));
    }
}