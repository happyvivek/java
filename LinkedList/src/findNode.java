import java.util.Scanner;
public class findNode {
	
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
	
	
	public static int findme(Node<Integer>head,int nodedata) {
		
		int counter = 0;
	
		
		while(head.data != nodedata) {
			
			
			//nodedata=head.data;
			counter++;
			head=head.next;
			if(head == null) {
				return -1;
			}
		}
		
		
	return counter;	
	}


	public static void main(String[] args) {
		Node <Integer>head = takeInput();
		int dataIndex=0;
		dataIndex=findme(head,10);
		
	    System.out.println("Element found at Index: " +dataIndex);

	}

}
