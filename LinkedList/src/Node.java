
public class Node<T> {
	
	T data;
	//reference of Node type is next
	Node<T> next;
	
	Node(T data){
		this.data=data;
		next=null;
	}
}
