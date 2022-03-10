package com.ana.random_meal_generator.exceptions;

public class IntegrationException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public IntegrationException() {
		super();
	}

	public IntegrationException(String message, Throwable cause) {
        super(message, cause);
    }

    public IntegrationException(String message) {
        super(message);
    }

    public IntegrationException(Throwable cause) {
        super(cause);
    }
}
