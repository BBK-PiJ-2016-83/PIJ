public class Utilities{
	
	Element head = null;
	Element last;

	public void push(int element){
		
		Element newElement = new Element(element);
		
		newElement.setNext(head);
		head = newElement;
		System.out.println("Pushing " + head.getElement() + " ...");
		
	}
	
	public void pop(){
			
			if (!empty()){
				
				if (head.getNext() == null){
				
					System.out.println("Poping... it's a " + head.getElement());
					head = null;
					return;
				}
				
				else{
				
					Element current = head;
					System.out.println("Poping... it's a " + head.getElement());
					current = null;
					head = head.getNext();
				}
			}
			else{
				
			}
	}
	
	public boolean empty(){
		
		if (head != null){
			
			return false;
		}
		else{
			
			System.out.println("List is empty.");
			return true;
		}
	}
}