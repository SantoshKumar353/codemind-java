import java.util.Scanner;
class guess
{
    public static void main(String args[])
    {
        int a;
        Scanner ds=new Scanner(System.in);
        a=ds.nextInt();
        if(a%2==0)
        {
            System.out.print("Even");
        }
        else
        {
            System.out.print("Odd");
        }
    }
}