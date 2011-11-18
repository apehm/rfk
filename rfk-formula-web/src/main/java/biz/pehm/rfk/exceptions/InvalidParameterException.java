package biz.pehm.rfk.exceptions;

/**
 * Indicates that the value of a parameter that is used for the calculation
 * has an invalid (non-null) value.
 * @author Alexander Pehm <alexander at pehm.biz>
 */
public class InvalidParameterException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidParameterException(String message, Throwable cause){
        super(message, cause);
    }
    
}
