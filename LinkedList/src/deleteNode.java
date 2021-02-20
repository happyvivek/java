import java.util.Scanner;

public class deleteNode {

	
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
	
	
	public static Node<Integer> delete(Node<Integer>head,int pos)
	
	{
		int i = 0 ;
		Node<Integer> previous = null;
		Node<Integer> current = null;
		Node<Integer> next = null;
		Node<Integer> temp = null;
		
		System.out.println("Printing input head:" +head);
		System.out.println("Printing input head:" +head.next);
		System.out.println("Printing ith elemnt:" +pos);
		
		if(pos == 0) {
			temp=head.next;
			head.next = null;
			head=temp;
			System.out.println("Printing ith elemnt:" +temp);
			System.out.println("Printing ith elemnt:" +head);
			
			
			//return head;
		}	
		
		else {
			temp=head;
		while(i < pos)
		{
			
			previous=head;
			head=head.next;
			System.out.println("progress address is: "+head+" ");
			i++;
			
		
		}
		
		current = head;
		next=current.next;
		
		System.out.println("previous address is: " +previous+" ");
		System.out.println("current address is: " +current+" ");
		System.out.println("next address is: " +next+" ");
		
		previous.next=next;
		
		System.out.println("Next address pd previous node is: " +previous.next+" ");
	       
		}
		
		return temp;
		
	}
		
	
	


	public static void main(String[] args) {
		int pos;
		Node<Integer> head = takeInput();
		head=delete(head, 1);
        //head = delete(head, 3);
        //head = delete(head, 0); 
		System.out.println("Printing input head:" +head);
		print(head);
	


}

}