import java.util.Scanner;

public class Assessment {

    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number to square: ");
        int num = in.nextInt();
        System.out.println("Your number squared is: " + square(num));
    }
    public static int square(int num)
    {
        return num * num;
    }
}


class Sum
{
    public static void main(String[] arg)
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        a=sc.nextInt();
        System.out.println("Enter second number");
        b=sc.nextInt();
        c=addition(a,b);
        System.out.println(" Addition of two numbers is : "+c);
    }
    static int addition(int x,int y)
    {
        return x+y;
    }
}