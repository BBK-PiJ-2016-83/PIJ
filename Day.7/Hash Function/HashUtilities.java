public interface HashUtilities{
	
	static int shortHash(int num){
		
		int hash = num % 1000;
		return Math.abs(hash);
	}
	
}