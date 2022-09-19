import java.util.Scanner;
class temp
{
    public static void main(String args[])
    {
        float c,f;
        Scanner ds=new Scanner(System.in);
        c=ds.nextFloat();
        f=(c*9)/5+(32);
        System.out.format("%.2f",f);
    }
}