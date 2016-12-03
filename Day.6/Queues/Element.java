public class Element{
	
	private int element;
	private Element next;
	
	public Element(int element){
		
		this.element = element;
		this.next = next;
	}
	
	public void setNext(Element newElement){
		
		this.next = newElement;
	}
	
	public Element getNext(){
		
		return this.next;
	}
	
	public int getElement(){
		
		return this.element;
	}

}