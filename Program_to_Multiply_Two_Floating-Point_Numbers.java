import java.util.Scanner;
class Mult
{
    public static void main(String args[])
    {
        double a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextFloat();
        b=sc.nextFloat();
        
        c=a*b;
        System.out.format("%.2f",c);
        sc.close();
    }
}