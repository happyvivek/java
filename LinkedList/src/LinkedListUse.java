/*
 * Make sure you have 2 imp things
 * node.next,node.data,head
 * head as reference variable of node type(or of node class)
 * next as reference variable for type node Node<T> next
 * Node<Integer> head = node1; //Initialize with first node reference variable
 * head=head.next;
 */
public class LinkedListUse {

	public static void print(Node<Integer> head) {
		while(head != null) {
			System.out.print(head.data+" ");
			head= head.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
	
		Node<Integer> node1 = new Node<>(10);
		Node<Integer> node2 = new Node<>(20);
		Node<Integer> node3 = new Node<>(30);
		Node<Integer> node4 = new Node<>(40);
        System.out.println(node1.data);  
        System.out.println(node1.next); 
        System.out.println(node2.data);
        System.out.println(node2.next);
        
       node1.next=node2;
       node2.next=node3;
       node3.next=node4;
       /*
       System.out.println(node2);
       System.out.println(node1.next);
       System.out.println(node2.next);
       
       */
 //traversing across the nodes       
        
        
  Node<Integer> head = node1;  
  System.out.println(head.data);
  
  
  while(head != null) {
	  
	  System.out.print(head.data+" ");
	  head = head.next;
  }
  
  //Calling print function
  
  print(head);
        
	}

}
