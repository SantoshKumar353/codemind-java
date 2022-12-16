import java.util.*;
class sol{
    public static int rev(int x)
    {
        int temp=0;
        while(x>0)
        {
            temp=temp*10+(x%10);
            x/=10;
        }
        return temp;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        while(1==1)
        {
            x+=rev(x);
            if(x==rev(x))
            {
                System.out.format("%d",x);
                break;
            }
        }
    }
}