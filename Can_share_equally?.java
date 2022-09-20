import java.util.*;
class coin
{
    public static void main(String args[])
    {
        Scanner df=new Scanner(System.in);
        int a=df.nextInt();
        int b=df.nextInt();
        if(a%2==0 && (a>0 || b%2==0))
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}