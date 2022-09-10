import java.util.Scanner;
class Dck
{
    public static void main(String args[])
    {
        int a,b,c,d;
        Scanner ds=new Scanner(System.in);
        a=ds.nextInt();
        b=ds.nextInt();
        c=ds.nextInt();
        d=(2*a*b*c*512);
        System.out.print(d);
    }
    
}