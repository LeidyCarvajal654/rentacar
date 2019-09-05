package com.accenture.rentacar.app.service;

import java.util.List;

import com.accenture.rentacar.app.entity.Vehiculo;

public interface IVehiculoService {
	
	public Vehiculo guardar(Vehiculo vehiculo); //Debo imporar todos los datos a guardar el vehiculo, la entidad completa
	
	public void borrar (Long id); // Acá solo necesito el id 
	
	public Vehiculo buscarVehiculoPorId(Long id); //Traerá un solo vehicuo a través del id 
	
	public List<Vehiculo> listarTodos();

}
