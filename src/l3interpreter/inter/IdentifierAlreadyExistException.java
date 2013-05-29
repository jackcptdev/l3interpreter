package l3interpreter.inter;

public class IdentifierAlreadyExistException extends Exception {

	private static final long serialVersionUID = 1L;

	public IdentifierAlreadyExistException() {
		super();
	}

	public IdentifierAlreadyExistException(String message) {
		super(message);
	}

	public IdentifierAlreadyExistException(Throwable t) {
		super(t);
	}

	public IdentifierAlreadyExistException(String message, Throwable t) {
		super(message, t);
	}

}
