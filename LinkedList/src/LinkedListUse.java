
public class LinkedListUse {

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
        
        
	}

}
