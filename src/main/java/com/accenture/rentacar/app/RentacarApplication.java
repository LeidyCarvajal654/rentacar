package com.accenture.rentacar.app;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.accenture.utilidades.fechas.Fecha;

@SpringBootApplication
public class RentacarApplication {

	public static void main(String[] args) {
		//SpringApplication.run(RentacarApplication.class, args);
		System.out.println("Resultado"+ Fecha.calcularDias(new Date("12/05/2018"), new Date()));
	}

}
