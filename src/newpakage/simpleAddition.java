package newpakage;

import java.util.Scanner;

public class simpleAddition {
    public static void main(String[] arg)
    {
        int a,b;
        Scanner data=new Scanner(System.in);
        a=data.nextInt();
        b=data.nextInt();
        int sum=a+b;
        System.out.print("Sum is:"+sum);
    }
}
