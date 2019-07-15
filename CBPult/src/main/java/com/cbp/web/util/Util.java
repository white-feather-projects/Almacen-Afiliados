/**
 * 
 */
package com.cbp.web.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.validation.Validator;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * @author Equipo
 *
 */
public class Util {

	private static final Logger logger = Logger.getLogger(Util.class.getName());

	/**
	 * Constantes para enmascarar datos de usuarios
	 */
	public static final String MASCARA_RIF = "999999999";
	public static final String MASCARA_DECIMAL = "9999,99";
	public static final String MASCARA_CUENTA = "99999999999999999999";
	public static final String MASCARA_CODIGO_TELEFONO = "0999";
	public static final String MASCARA_NUMERO_TELEFONO = "9999999";
	public static final String MASCARA_NUMERO_CUENTA_OCULTO = "{0}************{1}";
	public static final Locale LOCALE = new Locale("es");
	public static final int MINIMO_CARACTERES_CLAVE = 8;
	public static final int MAXIMO_CARACTERES_CLAVE = 12;
	public static final int MAXIMO_CARACTERES_CUENTA = 20;

	/**
	 * Constante que almacena el formato de fecha simple
	 */
	public static final String FORMATO_FECHA_SIMPLE = "dd/MM/yyyy";

	/**
	 * Constante que almacena el formato de fecha simple
	 */
	public static final String FORMATO_FECHA_COMPLETA_HORA_24H = "dd/MM/yyyy  HH:mm:ss";

	/**
	 * Constante que almacena el formato de fecha simple completo
	 */
	public static final String FORMATO_FECHA_SIMPLE_COMPLETO = "yyyyMMdd";

	/**
	 * Constante que almacena el formato de fecha simple
	 */
	public static final String FORMATO_FECHA_COMPLETA = "dd/MM/yyyy hh:mm:ss";

	/**
	 * Constante que almacena el formato de fecha simple
	 */
	public static final String FORMATO_FECHA_COMPLETA_LETRAS = "yyyy-MM-dd";

	/**
	 * Constantes para los MAPS
	 */
	/**
	 * Indica si un registro u objeto existe o no
	 */
	public static final String EXISTE = "existe";
	/**
	 * Indica un usuario
	 */
	public static final String USUARIO = "usuario";
	/**
	 * Indica la lista de usuarios
	 */
	public static final String USUARIOS = "usuarios";
	/**
	 * Indica la lista de empresas
	 */
	public static final String EMPRESAS = "empresas";
	/**
	 * Indica si un registro es o no valido
	 */
	public static final String VALIDO = "valido";
	/**
	 * Indica el id del usuario
	 */
	public static final String ID_USUARIO = "idUsuario";
	/**
	 * Indica el id de la empresa
	 */
	public static final String ID_EMPRESA = "idEmpresa";
	/**
	 * Indica el nombre de la empresa
	 */
	public static final String NOMBRE_EMPRESA = "nombreEmpresa";
	/**
	 * Indica el codigo de la empresa
	 */
	public static final String CODIGO_EMPRESA = "codigoEmpresa";
	/**
	 * Lista de modulos
	 */
	public static final String MODULOS = "modulos";
	/**
	 * Permite indicar si un usuario se encuentra bloqueado
	 */
	public static final String USUARIO_BLOQUEADO = "usuario_bloqueado";
	/**
	 * Permite indicar si la clave esta vencida
	 */
	public static final String CLAVE_VENCIDA = "clave_vencida";
	/**
	 * Permite indicar si existe una conexion simultanea de algun usuario
	 */
	public static final String CONEXION_SIMULTANEA = "conexionSimultanea";

	/**
	 * Indica la ultima fecha de conexion
	 */
	public static final String FECHA_ULTIMA_CONEXION = "fechaUltimaConexion";

	/**
	 * Convierte un objeto java.util.Date a javax.xml.datatype.XMLGregorianCalendar
	 *
	 * @param date Date
	 * @return XMLGregorianCalendar
	 */
	public static XMLGregorianCalendar toXMLGregorianCalendar(Date date) {
		GregorianCalendar gCalendar = new GregorianCalendar();
		gCalendar.setTime(date);
		XMLGregorianCalendar xmlCalendar = null;
		try {
			xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gCalendar);
		} catch (DatatypeConfigurationException e) {
			logger.log(null,
					new StringBuilder("ERROR UTIL EN toXMLGregorianCalendar: ").append("-DT-").append(new Date())
							.append("-STS-").append("FAIL").append("-EXCP-").append(e.toString()).toString());
		}
		return xmlCalendar;
	}
	
	/**
     * metodo que lee el archivo de propiedades externo para obtener clave valor de parametros
     * @param val
     * @return
     * @throws IOException 
     */
    public String readProperties(String val) throws IOException {
        InputStream is = null;
        Properties prop = new Properties();
        String valueProperties = "";
        try {
        	is = new FileInputStream("c:\\confPropertiesCBP\\configuracion.properties");
            //is = new FileInputStream("/home/confPropertiesCBP/configuracion.properties");
            prop.load(is);
            valueProperties = prop.getProperty(val);
           /* if (prop.isEmpty()) {
            	is = new FileInputStream("c:\\Configuracion\\configuracion.properties");
                //is = new FileInputStream("/home/confPropertiesCBP/configuracion.properties");
                prop.load(is);
                valueProperties = prop.getProperty(val);
            } else {
                valueProperties = "Error al leer el archivo de propiedades";
            }*/
            
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(Validator.class.getName()).log(Level.SEVERE, null, ex);
        }
        return valueProperties;
    }

	/**
	 * Convierte un XMLGregorianCalendar a java.util.Date in Java
	 *
	 * @param calendar XMLGregorianCalendar
	 * @return Date
	 */
	public static Date toDate(XMLGregorianCalendar calendar) {
		if (calendar == null) {
			return null;
		}
		return calendar.toGregorianCalendar().getTime();
	}

	/**
	 * Formatea la fecha/hora
	 *
	 * @param value Date
	 * @return String
	 */
	public static String fecha(Date value) {
		if (value == null) {
			return "";
		}

		SimpleDateFormat f = new SimpleDateFormat("dd/MM/YYYY");

		return f.format(value);
	}

	/**
	 * Formatea la fecha/hora
	 *
	 * @param value Date
	 * @return String
	 */
	public static String fecha2(Date value) {
		/**/
		DateFormatSymbols sym = DateFormatSymbols.getInstance(new Locale("es", "ar"));
		sym.setMonths(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
				"Septiembre", "Octubre", "Noviembre", "Diciembre" });
		sym.setShortMonths(new String[] { "Ene", "Feb", "Mar", "May", "Jul", "Ago", "Sep", "Oct", "Nov", "Dic" });
		SimpleDateFormat date = new SimpleDateFormat("dd-MMM-yyyy", sym);

		SimpleDateFormat fecha = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy hh:mm:ss a", sym);

		return fecha.format(value);

	}

	/**
	 * Formatea la fecha/hora
	 *
	 * @param value Date
	 * @return String
	 */
	public static String fecha2New(Date value) {

		SimpleDateFormat f = new SimpleDateFormat(FORMATO_FECHA_COMPLETA, new Locale("es_ES"));

//       String fecha = f.format(value);

		/**/
		DateFormatSymbols sym = DateFormatSymbols.getInstance(new Locale("es", "ar"));
		sym.setMonths(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
				"Septiembre", "Octubre", "Noviembre", "Diciembre" });
		sym.setShortMonths(new String[] { "Ene", "Feb", "Mar", "May", "Jul", "Ago", "Sep", "Oct", "Nov", "Dic" });
		SimpleDateFormat date = new SimpleDateFormat("dd-MMM-yyyy", sym);

		SimpleDateFormat fecha = new SimpleDateFormat(FORMATO_FECHA_COMPLETA, sym);

		return fecha.format(value);

	}

	/**
	 * Formatea la fecha/hora
	 *
	 * @param fecha   Date
	 * @param formato
	 * @return String
	 * @throws java.text.ParseException
	 */
	public static Date fechaLargaCompleta(Date fecha, String formato) throws ParseException {

		if (fecha == null) {
			Date date = new Date();
		}

		SimpleDateFormat f = new SimpleDateFormat(formato);

		fecha = f.parse(fecha.toString());

		return fecha;
	}

	/**
	 * Formatea la fecha/hora
	 *
	 * @param value   Date
	 * @param formato String
	 * @return String
	 */
	public static String formatearFecha(Date value, String formato) {
		if (value == null) {
			return "";
		}

		SimpleDateFormat f = new SimpleDateFormat(formato);

		return f.format(value);
	}

	/**
	 * Formatea la fecha/hora
	 *
	 * @param value   Date
	 * @param formato String
	 * @return String
	 */
	public static Date formatearFechaDate(Date value, String formato) {
		Date valueReturn = null;
		if (value != null) {
			SimpleDateFormat f = new SimpleDateFormat(formato);
			try {
				valueReturn = f.parse(f.format(value));
			} catch (ParseException ex) {
				logger.info(Util.class.getName() + ex);
			}
		}
		return valueReturn;
	}

	/**
	 * Formatea la fecha/hora en String segun el formato recibido
	 *
	 * @param value   String
	 * @param formato String
	 * @return String fecha en String formateada
	 */
	public static String formatearFechaString(String value, String formato) {
		if (value == null || value.isEmpty()) {
			return "";
		}

		SimpleDateFormat f = new SimpleDateFormat(formato);

		return f.format(value);
	}

	/**
	 * Formatea la fecha/hora en String segun el formato recibido
	 *
	 * @param value   String
	 * @param formato String
	 * @return fecha en Date formateada
	 */
	public static Date formatearFechaStringADate(String value, String formato) {
		Date fechaSalida = new Date();
		if (value == null || value.isEmpty()) {
			return fechaSalida;
		}
		SimpleDateFormat f = new SimpleDateFormat(formato);
		try {
			fechaSalida = f.parse(value);
		} catch (ParseException e) {
			logger.info(new StringBuilder("ERROR BDSUTIL EN formatearFechaStringADate: ").append("-DT-").append(value)
					.append("-STS-").append("FAIL").append("-EXCP-").append(e.toString()).toString());
		}
		return fechaSalida;
	}

	/**
	 * Formato fecha String a XMLGregorianCalendar
	 * 
	 * @param fecha
	 * @return
	 * @throws ParseException
	 */
	public static XMLGregorianCalendar formatStringToXmlGregorianCalendar(String fecha) throws ParseException {

		DateFormat format = new SimpleDateFormat(FORMATO_FECHA_SIMPLE);
		GregorianCalendar cal = new GregorianCalendar();
		XMLGregorianCalendar xmlGregCal = null;
		try {
			Date date = format.parse(fecha);
			cal.setTime(date);
			xmlGregCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return xmlGregCal;
	}

	/**
	 * Formato fecha XMLGregorianCalendar to String
	 * 
	 * @param date
	 * @return
	 */
	public static String xmlGregorianCalendarToString(XMLGregorianCalendar date) {
		XMLGregorianCalendar fecha = date; // initialization is out of scope for this example
		SimpleDateFormat sdf = new SimpleDateFormat(FORMATO_FECHA_SIMPLE);
		GregorianCalendar gc = fecha.toGregorianCalendar();
		String formatted_string = sdf.format(gc.getTime());
		return formatted_string;
	}

	/**
	 * Se Obtiene la fecha sin hora
	 *
	 * @param date Date
	 * @return Date
	 */
	public static Date fechaSinHora(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return new GregorianCalendar(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH))
				.getTime();
	}

	/**
	 * Metodo para enmascarar una cuenta o tarjeta de debito o credito. La mascara
	 * sustituira cuatro (4) asteriscos (*) por la cantidad de caracteres
	 * seleccionados del value
	 *
	 * @param value    String Cadena a enmascarar
	 * @param cantidad int Cantidad de caracteres a enmascarar de value
	 * @return String enmascarado
	 */
	public String mascara(String value, int cantidad) {
		if (value == null || value.isEmpty() || value.equals("-1")) {
			return "";
		}

		String caracter = "**** ";

		value = value.substring(cantidad);

		return caracter.concat(value);
	}

	/**
	 * Formatea una cadena, se reemplazara por cuatro asteriscos (****) desde el
	 * inicio de la cadena hasta length()-4 de la misma ej: 1234567890 -> ****7890
	 *
	 * @param value String valor de la cadena a formatear,
	 * @return String
	 */
	public String numeroCuentaFormato(String value) {
		String x = "";
		if (!value.isEmpty()) {
			x = ("****" + value.substring(value.length() - 4, value.length()));
		}
		return x;
	}

	/**
	 * Formatea una cadena, se reemplazara por cuatro asteriscos (****) los
	 * caracteres intermedios de un String con longitud mayor a 8 ej: 1234567890 ->
	 * 1234****7890
	 *
	 * @param value String valor de la cadena a formatear,
	 * @return String
	 */
	public static String formatoAsteriscosWeb(String value) {
		if (value != null && value.length() > 8) {
			return (value.substring(0, 4) + "****" + value.substring(value.length() - 4, value.length()));
		} else {
			return (value);
		}
	}

	/**
	 * Convierte un número entero a su versión en palabras maximo 50 Ej 10 -> diez
	 * (10); 23 -> veintien caso contrario retorna el texto "mas de cincuenta (50)."
	 * site de referencia:
	 * http://www.javamexico.org/blogs/rodrigo_salado_anaya/convertir_numeros_letras
	 *
	 * @param numero
	 * @return Número en forma de palabras.
	 */
	@SuppressWarnings("rawtypes")
	public static String convierteNumeroAPalabras(int numero) {
		/* Mapa con las conversiones de los números */
		if (numero > 50) {
			return "más de cincuenta (50)";
		} else {
			HashMap numTextos = new HashMap();
			numTextos.put(0, "cero");
			numTextos.put(1, "una");
			numTextos.put(2, "dos");
			numTextos.put(3, "tres");
			numTextos.put(4, "cuatro");
			numTextos.put(5, "cinco");
			numTextos.put(6, "seis");
			numTextos.put(7, "siete");
			numTextos.put(8, "ocho");
			numTextos.put(9, "nueve");
			numTextos.put(10, "diez");
			numTextos.put(11, "once");
			numTextos.put(12, "doce");
			numTextos.put(13, "trece");
			numTextos.put(14, "catorce");
			numTextos.put(15, "quince");
			numTextos.put(16, "dieciseis");
			numTextos.put(17, "diecisiete");
			numTextos.put(18, "dieciocho");
			numTextos.put(19, "diecinueve");
			numTextos.put(20, "veinte");
			numTextos.put(21, "veintiuno");
			numTextos.put(22, "veintidós");
			numTextos.put(23, "veintitrés");
			numTextos.put(24, "veinticuatro");
			numTextos.put(25, "veinticinco");
			numTextos.put(26, "veintiséis");
			numTextos.put(27, "veintisiete");
			numTextos.put(28, "veintocho");
			numTextos.put(29, "veintinueve");
			numTextos.put(30, "treinta");
			numTextos.put(40, "cuarenta");
			numTextos.put(50, "cincuenta");

			// primer digito a leer (desde la izq) en caso de ser mayor a 9 seran decenas
			int primerDigito = 0;
			// en caso de ser mayor a 9 este numero seran unidades
			int segundoDigito = 0;
			// traduccion del numero a texto
			StringBuilder numeroEscrito = new StringBuilder();
			// si el numero no existe en el mapa se arma
			if (numTextos.get(numero) == null) {
				String numeroTXT = String.valueOf(numero);
				char[] numeroChars = new char[2];
				numeroTXT.getChars(0, numeroTXT.length(), numeroChars, 0);
				primerDigito = (Integer.parseInt(String.valueOf(numeroChars[0])));
				if (numeroTXT.length() > 1) {
					segundoDigito = (Integer.parseInt(String.valueOf(numeroChars[0])));
					numeroEscrito.append(numTextos.get(primerDigito * 10));
					numeroEscrito.append(" y ");
					numeroEscrito.append(numTextos.get(segundoDigito));
				}
				return numeroEscrito.append(" (").append(numero).append(")").toString();
			} else {
				return numeroEscrito.append(numTextos.get(numero)).append(" (").append(numero).append(")").toString();
			}
		}
	}

	public static String dateMonth(int mes) {
		String result = "";

		switch (mes) {
		case 0: {
			result = "Enero";
			break;
		}
		case 1: {
			result = "Febrero";
			break;
		}
		case 2: {
			result = "Marzo";
			break;
		}
		case 3: {
			result = "Abril";
			break;
		}
		case 4: {
			result = "Mayo";
			break;
		}
		case 5: {
			result = "Junio";
			break;
		}
		case 6: {
			result = "Julio";
			break;
		}
		case 7: {
			result = "Agosto";
			break;
		}
		case 8: {
			result = "Septiembre";
			break;
		}
		case 9: {
			result = "Octubre";
			break;
		}
		case 10: {
			result = "Noviembre";
			break;
		}
		case 11: {
			result = "Diciembre";
			break;
		}
		default: {
			result = "Error";
			break;
		}
		}
		return result;
	}

	/**
	 * Método que convierte un List<String> en un String separando los valores con
	 * una coma (,)
	 *
	 * @param listString
	 * @param separador
	 * @return String
	 */
	public String convierteListStringEnString(List<String> listString, String separador) {
		StringBuilder listcheques = new StringBuilder();
		if (listString != null) {
			for (String i : listString) {
				if (listcheques.length() > 0) {
					listcheques.append(separador);
				}
				listcheques.append(i);
			}
		}
		return listcheques.toString();
	}

	/**
	 * funcion que nos indica si el numTest es multiplo del numMultiplo
	 *
	 * @param numTest
	 * @param numMultiplo
	 * @return
	 */
	public boolean esMultiploDe(Double numTest, Double numMultiplo) {
		if ((numTest % numMultiplo) == 0) {
			return true;
		} else {
			return false;
		}
	}

	public String validarFechaSabadoDomingo(Date fecha) {

		Calendar cal = null;
		String letraD = "";
		int nD = -1;
		cal = Calendar.getInstance();
		cal.setTime(fecha);
		nD = cal.get(Calendar.DAY_OF_WEEK);
		if (nD == 1 || nD == 7) {
			SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
			return formateador.format(fecha);
		} else {
			return letraD;
		}
	}

	public boolean validaSoloNumeros(String texto) {
		return texto.replaceAll(" ", "").matches("[a-zA-ZÁÉÍÓÚáéíóúÑñ]+");
	}

	/**
	 * Constante que almacena codigo de respuesta exitoso para los dao
	 */
	public static final String CODIGO_RESPUESTA_EXITOSO = "000";

	/**
	 * Constante que almacena codigo de respuesta fallido para los dao
	 */
	public static final String CODIGO_RESPUESTA_FALLIDO = "999";

	/**
	 * Constante que almacena codigo de error para las validaciones de parametros
	 */
	public static final String CODIGO_ERROR_VALIDACIONES = "888";

	/**
	 * Constante que almacena la descripcion de respuesta exitoso para los dao
	 */
	public static final String DESCRIPCION_RESPUESTA_EXITOSO = "OK";

	/**
	 * Constante que almacena la descripcion de respuesta exitoso para los dao
	 */
	public static final String DESCRIPCION_RESPUESTA_FALLIDA = "FAIL";

	/**
	 * Constante que almacena la descripcion de respuesta exitoso para los SP que
	 * retorna un codigo de salida
	 */
	public static final String DESCRIPCION_RESPUESTA_EXITOSO_SP = "OK";

	/**
	 * Constante que almacena codigo de respuesta JPA noResultException
	 */
	public static final String CODIGO_SIN_RESULTADOS_JPA = "JPA005";
	
	/**
	 * Constante que almacena de respuesta servicio sin consulta
	 */
	public static final String CODIGO_SIN_RESULTADOS_CONSULTA = "SE001";
	
	/**
	 * Constante que almacena la descripcion de la respuesta sin consulta
	 */
	public static final String DESCRIPCION_RESPUESTA_SIN_CONSULTA = "OBJETO_NULL";
}
