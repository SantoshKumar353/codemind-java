import java.util.*;
class temp
{
    public static void main(String args[])
    {
        float c,f;
        Scanner ds=new Scanner(System.in);
        c=ds.nextFloat();
        f=(c-32)*5/(9);
        System.out.format("%.2f",f);
    }
}