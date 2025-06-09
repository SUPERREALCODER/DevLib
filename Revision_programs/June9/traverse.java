package Revision_programs.June9;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class traverse {

        public static void main(String[] args){
            int arr[] = {1, 2, 3, 4, 5};
            int c=0;
            Node head = new Node(arr[0]);
            Node mover = head; 
            Node temp;
            for(int i=1;i<arr.length;i++){ 
                temp = new Node(arr[i]);
                mover.next=temp;
                mover =temp;
            }   
            temp =head;
            while(temp !=null){
                System.out.print(temp.data + " ");
                temp = temp.next; 
                c++; // Move to the next node
            }
            System.out.println(c);
        }
    
}
