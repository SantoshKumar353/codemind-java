import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        char code;
        Scanner sc=new Scanner(System.in);
        code=sc.nextLine().charAt(0);
        code=Character.toUpperCase(code);
        switch(code)
        {
            case 'V':
                    System.out.println("Violet");
                    break;
            case 'I':
                System.out.println("Indigo");
                break;
            case 'B':
                System.out.println("Blue");
                break;
            case 'G':
                System.out.println("Green");
                break;
            case 'Y':
                System.out.println("Yellow");
                break;
            case 'O':
                System.out.println("Orange");
                break;
            case 'R':
                System.out.println("Red");
                break;
            default:
                System.out.println("-1");
                break;
        }
    }
}