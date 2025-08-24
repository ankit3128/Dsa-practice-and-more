import java.util.ArrayList;
public class StackB{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
     static class Stack{
        static Node head =null;
        public static boolean isEmpty(){
            return head ==null;

        }
        //  push 
        public static void push(int data){
            Node newNode=new Node(data);
            if(isEmpty()){
                head =newNode;
            }
            newNode.next=head;
            head =newNode;

        }
        // pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
        }

     }
}