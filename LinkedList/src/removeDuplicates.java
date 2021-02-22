import java.util.Scanner;
public class removeDuplicates {
	
	public static void print(Node<Integer> head) {
		while(head != null) {
			System.out.print(head.data+" ");
			head= head.next;
		}
		System.out.println();
	}
	
	
	
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
	
	
	public static Node<Integer> removeduplicates(Node<Integer>head) {
		
		
		if(head==null)
			
		{
			
			return head;
		}
	
	while(head.next != null)
	{
		
		if(head.data == head.next.data)
		{
			
			
			head.next=head.next.next;
			
			
		
		}
		
		else
		{
		
		
		head=head.next;
		
		}
		
		
	}
return head;
	}
	public static void main(String[] args) {
		Node <Integer>head = takeInput();

		removeduplicates(head);
		
	    print(head);

	}

}

	





