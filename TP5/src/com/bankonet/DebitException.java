package com.bankonet;

public class DebitException extends CompteException{

	private static final long serialVersionUID = 1L;

	public DebitException() {
		super();
	}

	public DebitException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public DebitException(String message, Throwable cause) {
		super(message, cause);
	}

	public DebitException(String message) {
		super(message);
	}

	public DebitException(Throwable cause) {
		super(cause);
	}

}
