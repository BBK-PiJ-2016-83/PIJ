public class List{

	public static void main(String[]args){
	
		Utilities list = new Utilities();
		
		list.push(5);
		list.push(8);
		list.push(12);
		list.pop();
		list.push(13);
		list.pop();		
		list.pop();
		list.pop();
		list.empty();
	}
}