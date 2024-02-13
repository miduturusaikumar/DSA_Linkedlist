
//Length of Likedlist

class Node
{
    int data;
    Node next;
    Node(int data)   //creating Node constructor for last element
    {
        this.data=data;
        this.next=null;
    }
    Node(int data,Node next)  //creating Node constructor for attaching data address
    {
        this.data=data;
        this.next=next;
    }
}
public class LengthofLL
{
   static Node convertLL(int arr[])
   {
       Node head=new Node(arr[0]);
       Node mover=head;
       for(int i=1;i<arr.length;i++)
       {
           Node temp=new Node(arr[i]);
           mover.next=temp;
           mover=temp;
       }
       return head;
       
   }
   static int lengthLL(Node head)
   {
       int count=0;
       while(head != null)
       {
          head= head.next;
          count++;
       }
       return count;
   }

	public static void main(String[] args) {
	      int arr[]={2,3,4,5,6};
	      Node head=convertLL(arr);
	      Node temp=head;
	      System.out.print(lengthLL(head));
	      
	}
}

