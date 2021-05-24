package newpakage;

import java.util.*;
import java.util.LinkedList;

class Solution{
    public static LinkedList[] newll;
    public Solution(int i){
        newll=new LinkedList[i];
        for(int j=0;j<i;j++) {
            newll[j]=new LinkedList<Integer>();
        }
    }
    public void addedge(int source,int destination){
        newll[source].add(destination);
        newll[destination].add(source);
    }
    public static void main(String[] arg){
        Scanner data = new Scanner(System.in);
        int v=data.nextInt();
        int e=data.nextInt();
        Solution sc = new Solution(v);
        for(int i=0;i<e;i++){

            int source=1;
            int destination = 0;
            sc.addedge( source,destination);
        }
    }
}