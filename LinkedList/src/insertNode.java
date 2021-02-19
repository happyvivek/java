import java.util.Scanner;

public class insertNode {

	
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
	
	
	public static Node<Integer> insert(Node<Integer> head, int data, int pos) {
		
		//Create Node
		
		Node<Integer> newnode = new Node<Integer>(data);
		if(pos == 0) {
			
			newnode.next=head;
			return newnode;
		}
		
		int i=0;
		Node<Integer> temp = head;
		while(i < pos - 1) {
			//Node<Integer> temp = head;
			temp = temp.next;
			i++;
		}
		
		newnode.next = temp.next;
		temp.next = newnode;
		return head;
		
		
	}
	

	public static void main(String[] args) {
		Node<Integer> head = takeInput();
        head = insert(head, 80, 3);
        head = insert(head, 80, 0); 
		print(head);
	


}

}