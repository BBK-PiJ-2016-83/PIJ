public class Hospital{

	Patient first = null;

public void addPatient (String name, int age, String illness){

	Patient newPatient = new Patient(name, age, illness);

	if (first == null){

		first = newPatient;
		return;
	}
	else{
	
	Patient current = first;

		while (current.getNext() != null){

		current = current.getNext();
		}

	current.setNext(newPatient);
	return;
	}
	
}

public void deletePatient(String name){

	if (first.getName().equals(name)){
	
	first = first.getNext();
	return;
	}
	
	Patient current = first;

	while (current.getNext() != null){
	
		if (current.getNext().getName().equals(name)){

			current.setNext(current.getNext().getNext());
		}

		if (current.getNext() == null)
		{
			current = first.getNext();
		}

		current = current.getNext();
	}

}

public void printPatient(){

	Patient current = first;

	while (current != null){

		System.out.println (current.getName());	
		System.out.println (current.getAge());	
		System.out.println (current.getIllness());
		
		current = current.getNext();
		}
}

public static void main (String [] arguments){

	Hospital list = new Hospital();

	list.addPatient("Patient 1", 45, "x");
	list.addPatient("Patient 2", 42, "y");	
	list.addPatient("Patient 3", 48, "z");	
	list.addPatient("Patient 4", 43, "c");

	list.printPatient();		
	System.out.println();
	list.deletePatient("Patient 4");
	list.deletePatient("Patient 1");

	list.printPatient();	
}
}
	