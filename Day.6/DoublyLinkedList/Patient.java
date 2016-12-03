public class Patient{

	private String name;
	private Patient next;
	private Patient prev;

public Patient (String name){

	this.name = name;
	this.next = null;
	this.prev = null;
	}

public String getName (){

	return name;
	}

public void setNext (Patient newPatient){

	this.next = newPatient;
	}

public Patient getNext (){

	return next;
	}

public void setPrev (Patient newPatient){

	this.prev = newPatient;
	}

public Patient getPrev(){

	return prev;
	}
}

	

