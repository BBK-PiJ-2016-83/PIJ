public class ArrayUtilities{
	
	private int element;
	private ArrayUtilities next;
	
public ArrayUtilities (int element){

	this.element = element;
	this.next = null;
	}
	
public static void toList(int array[]){
	
	ArrayUtilities head = null;
	
	for (int i = 0; i < array.length; i++){
	
		ArrayUtilities newElement = new ArrayUtilities(array[i]);
				
		head = newElement;
		newElement.next = head;
		System.out.println(head.element);
	}
}
}