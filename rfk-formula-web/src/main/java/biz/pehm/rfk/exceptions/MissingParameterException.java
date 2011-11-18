package biz.pehm.rfk.exceptions;

/**
 *
 * @author Alexander Pehm <alexander at pehm.biz>
 */
public class MissingParameterException extends Exception {

	private static final long serialVersionUID = 1L;

	public MissingParameterException(String message, Throwable cause){
        super(message, cause);
    }
    
}
