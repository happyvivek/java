import java.util.*;
/*
 * Make sure you have 2 imp things
 * node.next,node.data,head
 * head as reference variable of node type(or of node class)
 * next as reference variable for type node Node<T> next
 * Node<Integer> head = node1; //Initialize with first node reference variable
 * head=head.next;
 * In order to take input data for node elements in list
 * keep track of tail,id tail=null then tail=newnode else tail.next=newnode and tail=newnode
 */
public class LinkedListInput {

	
	public static void print(Node<Integer> head) {
		while(head != null) {
			System.out.print(head.data+" ");
			head= head.next;
		}
		System.out.println();
	}
	
	
	public static Node<Integer> takeInput() 
	{
		Node<Integer> head = null;
		Node<Integer> tail =null;
		
		Scanner s = new Scanner(System.in);
		int data=s.nextInt();
		
		while(data != -1) {
			
			Node<Integer> newnode = new Node<>(data);
			
			
			if(head == null) {
				tail = newnode;
				head = newnode;
				
			} else {
				
				tail.next = newnode;
				tail = tail.next;//tail=newnode;
			}
			
			data = s.nextInt();
			
		}
	 	
		return head;
	}
	

	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		print(head);
	


}

}