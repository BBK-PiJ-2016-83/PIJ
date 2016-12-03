public class Patient{

	private String name;
	private int age;
	private Patient next;

public Patient (String name, int age){

	this.name = name;
	this.next = next;
	this.age = age;
	}

public String getName(){

	return name;
	}

public int getAge(){

	return age;
	}

public void setNext(Patient newPatient){

	this.next = newPatient;
	}

public Patient getNext(){

	return next;
	}
}
