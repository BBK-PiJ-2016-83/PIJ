public class Hospital{

	Patient first = null;
	Patient last = null;

public void addPatient(String name){

	Patient newPatient = new Patient(name);

	if (first == null){

	first = newPatient;
	first.setPrev(null);
	return;
	}
	else{

	Patient current = first;

		while (current.getNext() != null){
		
			current = current.getNext();
		}

		current.setNext(newPatient);
		newPatient.setPrev(current);
		last = current.getNext();
		return;

	}
}
public boolean isEmpty (){

	if (first == null){
		
		return true;
	}
	else{
	
	return false;
	}
}
	
public void printPatient (){
	
	if (isEmpty()){
	
	System.out.println("The list is empty !!!");
	return;
	}
	
	Patient current = first;

	while (current != null){

		System.out.println (current.getName());
		current = current.getNext();
	}
}

public void reversePrintPatient (){
	
	Patient current = last;

	while (current != null){

		System.out.println(current.getName());
		current = current.getPrev();	
	}	
}

public void deletePatient(String name){

	Patient current = first;

	if (first == null){

		System.out.println ("The list is empty !!!");
		}

	if (first.getName().equals(name)){

		first = first.getNext();
		first.setPrev(null);
		return;
	}

	while (current != null){

		if (current.getName().equals(name) ){

			current.getPrev().setNext(current.getNext());
			current.getNext().setPrev(current.getPrev());
		}

		if (current.getNext() == null){

			current = first.getNext();	
			current.setPrev(null);
		}
		
		current = current.getNext();
	}
} 	
	

public static void main (String[] args){

	Hospital list = new Hospital();
	
	list.addPatient("a");
	list.addPatient("b");
	list.addPatient("c");
	list.addPatient("d");

	//list.printPatient();
	//list.reversePrintPatient();

	list.deletePatient("d");
	list.printPatient();
	}	
}