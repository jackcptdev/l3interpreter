package l3interpreter.inter;

public class IdentifierNotExistException extends Exception {

	private static final long serialVersionUID = 1L;

	public IdentifierNotExistException() {
		super();
	}

	public IdentifierNotExistException(String message) {
		super(message);
	}

	public IdentifierNotExistException(Throwable t) {
		super(t);
	}

	public IdentifierNotExistException(String message, Throwable t) {
		super(message, t);
	}
}
