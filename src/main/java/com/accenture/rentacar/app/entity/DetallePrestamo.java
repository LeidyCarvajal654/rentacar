package com.accenture.rentacar.app.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.accenture.rentacar.app.util.UtilDate;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javassist.SerialVersionUID;

@Entity
@Table(name = "Detalle_prestamo")

public class DetallePrestamo implements Serializable {//Siempre se debe usar, hace que sea mas eficiente el programa

	private static final long SerialVersionUID= 1L;//"final"Sirve para declarar variables constantes
	
	@Id  //Le decimos a jpa que ese es el id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
		
    @ManyToOne(fetch = FetchType.LAZY)//Utlizarlo para relacionar tablas, de muchos a uno
    @JoinColumn(name="vehiculo_id")// Dice que columna es la que se creará en la tabla 
    @JsonIgnoreProperties ({"hibertnateLazyInitializer", "handler"})
    //clave foranea: columna con la cual yo me relaciono con otra tabla
    
	private Vehiculo vehiculo;
    
       
    @Temporal(TemporalType.DATE)
    @Column(name="fecha_inicio_prestamo")
    private Date fechaInicioPrestamo;
    
    @Temporal(TemporalType.DATE)
    @Column(name="fecha_fin_prestamo")
    private Date fechaFinPrestamo;
    
    @Temporal(TemporalType.DATE)
    @Column(name="total_dias_prestamo")
    private Date totalDiasPrestamo;   
    
    @PrePersist
    public void calcularDias() {
    	UtilDate.calcularDias(fechaInicioPrestamo, fechaFinPrestamo);
    }
    
   
    
}

//Diagrama entidad relacion: many to one, many to many, etc
// for each: Lo que cambia es lo que hay dentro de la declaración del for, el alcance es 
