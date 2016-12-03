public class SortedList{
	
	public Element head = null;
	
	public void addElement(int element){
		
		Element newElement = new Element(element);
		
		if (head == null){
		
			head = newElement;
			return;
		}
		
		if (head.getElement() > newElement.getElement()){
			
			newElement.setNext(head);
			head = newElement;
		}
			 
		Element current = head;
		Element last = current.getNext();
		
		while (current.getNext() != null){
			
			if (current.getElement() <= newElement.getElement() && current.getNext().getElement() > newElement.getElement()){
				
				current.setNext(newElement);
				newElement.setNext(last);
				return;
			}
			current = current.getNext();
			last = current.getNext();
		}
		current.setNext(newElement);
		newElement.setNext(last);
		return;
		
	}

	public void printList(){
		
		Element current = head;

		while (current != null){
			
			System.out.println(current.getElement());
			current = current.getNext();
		}
	}

	public static void main (String [] args){
		
		SortedList list = new SortedList();
		
		list.addElement(1);
		list.addElement(5);
		list.addElement(2);
		list.addElement(9);
		list.addElement(8);
		list.addElement(3);
		
		list.printList();
	}
}