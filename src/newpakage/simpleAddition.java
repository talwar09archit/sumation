package newpakage;

import java.util.Scanner;

public class simpleAddition {
    static int CheckRepetition(String m)
    {
        int max=0;
        int count=0;
        char[] ch = m.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='0') {
                if(max<count) {
                    max = count;
                }
                count=0;
            }
            else if(ch[i]=='1'){
                count++;
            }
            if(i==ch.length-1&&max<count){
                max=count;
            }
        }
        return max;
    }
    public static void main(String[] arg)
    {
        int number;
        Scanner data = new Scanner(System.in);
        number = data.nextInt();
        String m = Integer.toBinaryString(number);
        int k = CheckRepetition(m);
        System.out.print(k);
    }
}
