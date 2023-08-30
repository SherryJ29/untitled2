public class FaceMismatchException extends Exception{
	
	public FaceMismatchException(boolean status) {
		super("Face Matches "+ status);
	}

}
