import java.util.Scanner;

public class linkedListLength {

	
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
		
	
			data = s.nextInt();
		
		}
		
		
		return head;
	}
	
	
	public static int length(Node<Integer>head)
	
	{
		int count = 0;
		
		while(head != null)
		{
			
			head = head.next;
		
		count++;
		}
		
		return count;
	}
	

	public static void main(String[] args) {
		int pos;
		Node<Integer> head = takeInput();
		int length = length(head);
		
		System.out.println("LL length is: "+length);
				
}

}