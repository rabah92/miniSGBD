package bdd;

public class BddException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	//elle gere quoi cette exception ? 
	public BddException(String message) {
		super(message);
		System.out.println(message);
	}


}
