package com.accenture.rentacar.app.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="vehiculos")
public class Vehiculo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id; //no es el dato primitivo es de clase long, por ser muchos registros en las tablas
	
	@Column(name="modelo_auto")// para saber como se va a ver en la tabla 
	private short ModeloAuto;
	private String marca;
	private String placa;
	private String linea;
	private String color;
	
	
	
	@Column(name = "fecha_creacion_registro") //cambiar los datos de la taba 
	@Temporal (TemporalType.DATE)  //
	private Date fechaCreacionRegistro; //Java util, trabaja como objeto // javasql para guardarlo en tabla
	
	@PrePersist
	private void preGuardado() {
		fechaCreacionRegistro = new Date(); // Con esta instrucción sacamos la fecha del sistema en java
		
	}
	
		
	public Date getFechaCreacionRegistro() {
		return fechaCreacionRegistro;
	}


	public void setFechaCreacionRegistro(Date fechaCreacionRegistro) {
		this.fechaCreacionRegistro = fechaCreacionRegistro;
	}




	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public short getModeloAuto() {
		return ModeloAuto;
	}
	public void setModeloAuto(short modeloAuto) {
		this.ModeloAuto = ModeloAuto;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getLinea() {
		return linea;
	}
	public void setLinea(String linea) {
		this.linea = linea;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
}
