public class Utilities{
	
	public Element head = null;
	public int size = 0;

	public void insert(int element){
		
		Element newElement = new Element(element);
		
		newElement.setNext(head);
		head = newElement;
		size++;
		System.out.println ("Inserting request " + newElement.getElement() + " ...");
	}
	
	public void retrieve(){
		
		Element remover = head;
		Element last = head.getNext();
		
		if (remover.getNext() == null && last == null){
				
				System.out.println("Retrieving request " + remover.getElement() + "... done.");
				remover = null;
				size--;
				return;
			}
		
		while (remover.getNext() != null){
			
			if (last.getNext() == null){
				
				System.out.println ("Retrieving request " + last.getElement() + "... done.");
				remover.setNext(null);
				size--;
				System.out.println("END");
				return;
			}
			
			remover = remover.getNext();
			last = remover.getNext();
		}		
		
	}
	
	public void size(){
		
		System.out.println ("There are " + size + " requests in the queue.");
	}
}