import java.util.Scanner;
class aplha
{
    public static void main(String args[])
    {
        char ch;
        Scanner fg=new Scanner(System.in);
        ch=fg.nextLine().charAt(0);
        if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'|| ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U')
            System.out.print("Vowel");
        else
            System.out.print("Consonant");
        fg.close();
    }
}