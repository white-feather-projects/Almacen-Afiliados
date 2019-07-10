/**
 * 
 */
package com.cbp.web.execptions;

/**
 * @author Equipo
 *
 */
public class ServiceException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * Instanciar el objeto ServiceException
     */
    public ServiceException() {
    }

    /**
     * Instanciar el objeto ServiceException
     *
     * @param message String
     */
    public ServiceException(String message) {
        super(message);
    }

    /**
     * Instanciar el objeto ServiceException
     *
     * @param message String
     * @param cause Throwable
     */
    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Instanciar el objeto ServiceException
     *
     * @param cause Throwable
     */
    public ServiceException(Throwable cause) {
        super(cause);
    }

    /**
     * Instanciar el objeto ServiceException
     *
     * @param message String
     * @param cause Throwable
     * @param enableSuppression boolean
     * @param writableStackTrace boolean
     */
    public ServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
