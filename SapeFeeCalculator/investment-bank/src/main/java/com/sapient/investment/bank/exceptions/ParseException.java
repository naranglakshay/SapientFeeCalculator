package com.sapient.investment.bank.exceptions;


/**
 * 
 * @author lakshaynarang
 *
 */
public class ParseException extends RuntimeException {
	

   private static final long serialVersionUID = 1L;

	public ParseException() {
        super();
    }
    public ParseException(String message, Throwable cause) {
        super(message, cause);
    }
    public ParseException(String message) {
        super(message);
    }
    public ParseException(Throwable cause) {
        super(cause);
    }

}
