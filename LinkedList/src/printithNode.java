import java.util.Scanner;

public class printithNode {

	
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
	
	
	public static int printIthNode(Node<Integer>head, int pos)
	
	{
		int i = 0;
		
		while(i < pos - 1)
		{
			
			head = head.next;
			i++;
		
		
		}
		
		return head.data;
	}
	

	public static void main(String[] args) {
	
		Node<Integer> head = takeInput();
		int data = printIthNode(head, 3);
		
		System.out.println("Data Returned is: "+data);
				
}

}