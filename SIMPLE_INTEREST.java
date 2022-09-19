import java.util.*;
class sim
{
    public static void main(String args[])
    {
        int p,t,r,si;
        Scanner ds=new Scanner(System.in);
        p=ds.nextInt();
        t=ds.nextInt();
        r=ds.nextInt();
        si=p*t*r/(100);
        System.out.print(si);
    }
}