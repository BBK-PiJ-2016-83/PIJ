public class Hospital{

	public Patient head = null;
	public int size = 0;

public void addPatient(String name, int age){

	Patient newPatient = new Patient (name, age);

	if (head == null){

		head = newPatient;
		return;
		}

	Patient current = head;

	for (int i = 0; i < size; i++){

		current = current.getNext();
		}

	current.setNext(newPatient);
	size++;
	newPatient.setNext(head);
	return;
	}

public void printPatient(){

	Patient current = head;

	for (int i =0; i <= size; i++){

		System.out.println(current.getName());
		System.out.println(current.getAge());
		System.out.println();	

		current = current.getNext();
		}
	}

public void deletePatient(String name){

	if (head == null){

		System.out.println ("The list is empty !!!");
		}

	if (name.equals(head.getName())){

		for (int i = 0; i < size; i++){

			head = head.getNext();
		}

	head.setNext(head.getNext().getNext());
	size--;
	return;
	}

	Patient current = head;

	for (int i = 0; i <= size; i++){
	
		if (name.equals(current.getNext().getName())){

			current.setNext(current.getNext().getNext());
			size--;
			return;
			}

		current = current.getNext();
		}
	}
public static void main(String[] args){

	Hospital list = new Hospital();

	list.addPatient("Anton", 32);
	list.addPatient("Georgy", 33);
	list.addPatient("Teodor", 34);
	list.addPatient("Maksim", 32);
	list.addPatient("Gencho", 33);

	list.deletePatient("Anton");

	list.printPatient();
	}
}