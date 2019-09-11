package com.accenture.rentacar.app.util;

import java.time.DateTimeException;
import java.util.Date;

public class UtilDate {

	public static final double VALOR_PI = 3.14;
	
	public static int calcularDias(Date fechaInicio, Date fechaFin) {
		long diferencia = fechaFin.getTime()-fechaInicio.getTime(); //Me calcula la fecha actual desde los origenes de los tiempos on milisegundos 
		Long d= (diferencia/(1000*60*60*24));
		int dias =d.intValue();// Me convierte el resultado en long 
		return dias;
		
		
	public static int calcularDias (Date fechaInicio, Date fechaFin) {	
		try {// aqui va la logica que quiero controlar
			long diferencia =fechaFin.getTime() - fechaInicio.getTime();
			Long d= (diferencia/0);
			int dias =d.intValue();
			return dias;
			
		}
		catch(DateTimeException e) {//lo que quiero hacer cuando la excepción se genere
			throw e;
			
		}
		
		
		// try catch me sirve para atrapar los errores antes de que ocurran 
		
		/*public final class UtilDate // cuando se declara la clase con final, nadie puede heredar de ella */
		
		//  ventaja de los metodos y variables estáticas
		// una buena practica es declarar las constantes en mayusculas 
		
		//finally: hace que lo que hay en el try catch se ejecute, aseí esté bueno  malo 
		
	}

}
