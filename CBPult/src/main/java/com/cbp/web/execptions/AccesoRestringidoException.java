package com.cbp.web.execptions;

/**
 * Manejo de excepciones de la sesion
 * @author Equipo
 */
public class AccesoRestringidoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * Instanciar el objeto AccesoRestringidoException
     */
    public AccesoRestringidoException() {
    }

    /**
     * Instanciar el objeto AccesoRestringidoException
     *
     * @param message String
     */
    public AccesoRestringidoException(String message) {
        super(message);
    }

    /**
     * Instanciar el objeto AccesoRestringidoException
     *
     * @param message String
     * @param cause Throwable
     */
    public AccesoRestringidoException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Instanciar el objeto AccesoRestringidoException
     *
     * @param cause Throwable
     */
    public AccesoRestringidoException(Throwable cause) {
        super(cause);
    }

    /**
     * Instanciar el objeto AccesoRestringidoException
     *
     * @param message String
     * @param cause Throwable
     * @param enableSuppression boolean
     * @param writableStackTrace boolean
     */
    public AccesoRestringidoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
