public class Element{
	
		private int element;
		private Element next;
	
	public Element(int element){
		
		this.element = element;
		this.next = null;
	}
	
	public int getElement(){
		
		return element;
	}
	
	public void setNext(Element newElement){
		
		next = newElement;
	}
	
	public Element getNext(){
		
		return next;
	}

}