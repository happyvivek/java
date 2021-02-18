import java.util.ArrayList;

/*
//java has generic class ArrayList
//import ArrayList class
//by default Arraylist creates
//As soon as it creates 10 size array capacity but size is=0

*******Array***********
1. Array--Size of array needs to be defined.Hence if size is 10 it stores 40 bytes even if its empty.
If you dont specify size u cant create array.
Space allocation is must.

If im in scenerio i dont know the size of array or elements i would be needing.
There is no point in defining array as it will waste the space.

*/
public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<>();
		System.out.println(list1.size());
		list1.add(10);
		list1.add(20);
		list1.add(30);
		System.out.println(list1.size());
		System.out.println(list1.get(2));
		
		//if you add in already occupied indexes it shifts by 1
		list1.add(2,50);
		System.out.println(list1.get(2));
		
		//Iterating over all elements in list
		
		for(int i=0; i<list1.size(); i++)
		{
		
			System.out.println("printing "+i+" elment: "+list1.get(i));
		

	}
		
		
		
		list1.remove(0);
		list1.set(1,20);
//for each works on all elements of the list
		//use only for traversal,it doesn't work for elements operations
		for(int elem: list1)
		{
			System.out.println("**printing elements:*** "+elem);
}
		
}
}