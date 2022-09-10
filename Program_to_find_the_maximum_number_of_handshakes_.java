import java.util.Scanner;
class Hnad
{
    public static void main(String args[])
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=((a-1)*a)/2;
        System.out.print(b);
    }
}