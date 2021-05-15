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
        System.out.println("Sum is:"+sum);
        int sub=a-b;
        System.out.println("sub is:"+sub);
    }
}
