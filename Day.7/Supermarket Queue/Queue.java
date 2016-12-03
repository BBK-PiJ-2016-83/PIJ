public class Queue implements PersonQueue{
	
	Person first = null;
	
	public void insert(Person person){
		
		person.setNext(first);
		first = person;
	}
	
	public void printQueue(){
		
		Person current = first;
		
		if (current == null){
			
			System.out.println("The queue is empty !!!");
			return;
		}
		
		while (current != null){
			
			System.out.println(current.getName());
			current = current.getNext();
		}
	}
	
	public Person retrive(){
		
		Person current = first;
		Person last = first.getNext();
		
		if (current.getNext() == null){
			
			first = null;
			return first;
		}
		
		while (current.getNext() != null){
			
			if (last.getNext() == null){
				
				current.setNext(null);
				return last;
			}
			
			current = current.getNext();
			last = current.getNext();
		}
		
		
		return null;
	}

}
