public class Market {
	
	Queue queue = new Queue();
	
	public void addPerson(Person person){
		
		queue.insert(person);
	}
	
	public void print(){
		
		queue.printQueue();
	}
	
	public Person serve(){
		
		return queue.retrive();
	}
	
	public static void main(String[]args){
		
		Market market = new Market();
		
		Person one = new Person("Person one");	
		market.addPerson(one);
		
		Person two = new Person("Person two");	
		market.addPerson(two);
		
		Person three = new Person("Person three");	
		market.addPerson(three);
		
		Person four = new Person("Person four");	
		market.addPerson(four);
		
		Person five = new Person("Person five");	
		market.addPerson(five);
		
		market.print();
		
		System.out.println();
		
		market.serve();
		
		market.print();
		
		System.out.println();
		
		market.serve();
		
		market.print();
		
		System.out.println();
		
		market.serve();
		
		market.print();
		
		System.out.println();
		
		market.serve();
		
		market.print();
		
		System.out.println();
		
		market.serve();
		
		market.print();
	}
}