package newpakage;
import java.util.*;
public class Andoperatot {

    public static void main(String[] arg){
        int n;
        System.out.print("Enter the number of elements in the array: ");
        Scanner data = new Scanner(System.in);
        n=data.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the array: ");
        for(int k=0;k<n;k++)
            a[k]=data.nextInt();

        //here the program starts;
        int totalSwaps=0;
        for(int i=0;i<n;i++){
            int numberofSwaps = 0;
            for(int j=0;j<n-1;j++){
                if(a[j]>a[j+1]) {
                    int temo=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temo;
                    numberofSwaps++;
                }
            }
            if(numberofSwaps==0)
                break;
            else
                totalSwaps+=numberofSwaps;
        }
        for(int k=0;k<n;k++)
            System.out.println(a[k]);
        System.out.println("The total number of swapas are: "+totalSwaps);
        System.out.println("The first element is: "+a[0]);
        System.out.println("The last element is: "+a[n-1]);

    }
}
