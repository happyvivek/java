import java.util.Scanner;

public class deleteNode {

	
	public static void print(Node<Integer> head) {
		while(head != null) {
			System.out.print(head.data+" ");
			head= head.next;
		}
		System.out.println();
	}
	
	/*
	public static void delete(Node<Integer> head, int pos)
	{
		syste
		
	}
	*/
	
	public static Node<Integer> takeInput()
	
	{
		
		Node<Integer> tail = null; 
		Node<Integer> head = null;
		
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		
		
		while(data != -1)
		{
			Node<Integer> newnode = new Node<>(data);
			
			if(head == null) {
				tail = newnode;
				head = newnode;
				
			} else {
				
				tail.next = newnode;
				tail = tail.next;//tail=newnode;
			}
		
		//Node<Integer> newnode = new Node<>(data);
		//tail = newnode;
		//tail=tail.next;
			data = s.nextInt();
		
		}
		
		
		return head;
	}
	
	
	public static void delete(Node<Integer>head,int pos)
	
	{
		int i = 0 ;
		
		while(i < pos - 1)
		{
			head=head.next;
			System.out.println("progress address is: "+head+" ");
			i++;
		}
		
		Node<Integer> previous = head;
		System.out.println("previous node next is: "+previous+" ");
		
			Node<Integer>current=previous.next;
			Node<Integer>next = current.next;
			System.out.println("current node next is: "+current+" ");
			
			previous.next=next;
			System.out.println(current.next+ "node");
			
		//	i++;
			
			//System.out.println("previous address is: "+head+" ");	
		}
		
	
		
	
	


	public static void main(String[] args) {
		int pos;
		Node<Integer> head = takeInput();
		delete(head, 3);
        //head = delete(head, 3);
        //head = delete(head, 0); 
		print(head);
	


}

}