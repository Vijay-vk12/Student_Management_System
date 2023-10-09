package CustomException;

public class InvalidChoicException extends RuntimeException {

	
	String message;
	public InvalidChoicException(String message)
	{
		this.message=message;
	}
	public String getMessage()
	{
		return message;
	}
	
}
