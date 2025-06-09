
class Node{
    int data;
    Node next;

    Node(int data1,Node node1){
        this.data = data1;
        this.next=node1;
    }
       Node(int data1){
        this.data = data1;
        this.next=null;
    }


 }

public class linkedlist {
public static void main(String[] args) {
    int arr[] ={0,1,2};
    Node x= new Node(arr[0]);
    System.out.println(x.next);
}
 
}
