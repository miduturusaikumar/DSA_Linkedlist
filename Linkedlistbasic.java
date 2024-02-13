
//basic Likedlist structure

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
public class Main
{

	public static void main(String[] args) {
	      int arr[]={2,3,4,5,6};
	      Node head=new Node(arr[0]);  //here only head part store data:2 and address null
	      System.out.print(head.data);
	}
}
