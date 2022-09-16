import java.util.Scanner;
class Ascii
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        char ch=sc.next().charAt(0);
        int asciiv=ch;
        System.out.println(asciiv);
    }
}