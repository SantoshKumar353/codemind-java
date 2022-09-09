import java.util.Scanner;
class Mul
{
    public static void main(String args[])
    {
        int a,b,m;
        Scanner cs=new Scanner (System.in);
        a=cs.nextInt();
        b=cs.nextInt();
        
        m=a*b;
        System.out.print(m);
        cs.close();
    }
}