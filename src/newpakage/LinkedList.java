package newpakage;

import java.util.*;

public class LinkedList {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    //function for adding elements
    static void add(int n){
        Node newNode = new Node(n);
        if(head==null)
            head=newNode;
        else{
            Node temp = head;
            while(temp.next!=null)
                temp=temp.next;
            temp.next=newNode;
        }
    }

    //function to delete node
    static void delNode(int check){
        if(head==null) {
        }
        else {
            boolean found=false;
            Node temp = head;
            Node prev = head;
            while (temp!=null){
                if(temp.data==check){
                    prev.next=temp.next;
                    temp.next=null;
                    found=true;
                    break;
                }
                else {
                    prev = temp;
                    temp = temp.next;
                }
            }
            if (!found)
                System.out.print("No element Found");
        }
    }

    //function to display the list
    static void display(){
        Node temp=head;
        System.out.println("Here is the list: ");
        while(temp!=null){
            System.out.print(temp.data+"  ");
            temp=temp.next;
        }
    }

   public static void main(String[] arg){
        Scanner data = new Scanner(System.in);
        int n;
        System.out.print("Enter the number if arrays required: ");
        n = data.nextInt();
        for(int i=0;i<n;i++)
        {
            int p = data.nextInt();
            add(p);
        }
        boolean stop = false;
        while(!stop){
            System.out.println("Select the number corrosponding to the operation: ");
            System.out.println("1. Add element to the list");
            System.out.println("2. Delete element from the list");
            System.out.println("3. Display the list");
            int operation = data.nextInt();
            if(operation==1){
                int k = data.nextInt();
                add(k);
            }
            else if(operation==2){
                int k = data.nextInt();
                delNode(k);
            }
            else if(operation==3){
                display();
            }
            else
                System.out.print("Invalid response");
            System.out.print("Do you want to continue(y/n): ");
            char c=data.next().charAt(0);
            if(c=='n')
                stop=true;
        }
   }
}
