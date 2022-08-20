package main.java;

public class PositionException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public PositionException() {}
	
	public PositionException(String message) {super(message);}
	
	public PositionException(String message, Throwable cause) {super(message, cause);}
	
	public PositionException(Throwable cause) {super(cause);}
	
}
