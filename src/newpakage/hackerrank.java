package newpakage;

import java.io.*;
import java.util.*;
import java.util.LinkedList;

public class hackerrank {
    // Write your code here.
    public static void main(String[] arg){
        int n;
        Scanner data = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        n = data.nextInt();
        int[] arr = new int[n];
        for(int k=0;k<n;k++)
            arr[k]=data.nextInt();

        //here the program starts;
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=arr[j]&arr[i];
                System.out.println("One of the options are: "+temp);
                max=Math.max(max,temp);
            }
        }
        System.out.println("Final answer is: "+max);
    }

}