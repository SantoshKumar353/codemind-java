import java.util.Scanner;
class Atr
{
    public static void main(String args[])
    {
        int c;
        double s;
        Scanner sc=new Scanner(System.in);
        c=sc.nextInt();
        
        s=32+(c*1.8);
        
        System.out.format("%.2f",s);
        
        sc.close();
    }
}