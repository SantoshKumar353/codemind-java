import java.util.Scanner;
class sol
{
    public static float totbill(int units)
    {
        float amt;
        if(units<200)
        amt=units*1.20f;
        else if(units>=200 && units<400)
        amt=units*1.50f;
        else if(units>=400 && units<600)
        amt=units*1.80f;
        else
        amt=units*2.00f;
        if(amt>400)
        amt=amt+0.15f*amt;
        else
        amt=amt+100;
        return amt;
    }
    public static void main(String args[])
    {
        String cost_id,name;
        int units;
        float bill;
        Scanner dc=new Scanner(System.in);
        cost_id=dc.nextLine();
        name=dc.nextLine();
        units=dc.nextInt();
        bill=sol.totbill(units);
        System.out.format("%.2f",bill);
        
    }
}