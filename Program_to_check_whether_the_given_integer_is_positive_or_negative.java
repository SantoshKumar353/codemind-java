import java.util.Scanner;
class num
{
    public static void main(String args[])
    {
        int a;
        Scanner ds=new Scanner(System.in);
        a=ds.nextInt();
        if(a>0)
            System.out.print("Positive Number");
        else
            System.out.print("Negative Number");
    }
}