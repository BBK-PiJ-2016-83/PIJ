public class Patient{

	private String name;
	private int age;
	private String illness;
	private Patient next;

Patient (String name, int age, String illness){

	this.name = name;
	this.age = age;
	this.illness = illness;
	this.next = null;
	}

public String getName (){

	return name;
	}

public int getAge (){

	return age;
	}

public String getIllness (){

	return illness;
	}

public void setNext (Patient nextPatient){

	this.next = nextPatient;
	}

public Patient getNext(){

	return next;
	}

}