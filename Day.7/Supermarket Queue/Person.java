public class Person{
	
	private String name;
	private Person next;
	
	public Person(String name){
		
		this.name = name;
		this.next = next;

	}

	public String getName(){
		
		return name;
	}
	
	public void setNext(Person newPerson){
		
		this.next = newPerson;
	}
	
	public Person getNext(){
		
		return this.next;
	}
} 