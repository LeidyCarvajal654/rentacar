package com.accenture.rentacar.app.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.rentacar.app.dao.IVehiculoDao;
import com.accenture.rentacar.app.entity.Vehiculo;


@Service
public class VehiculoServiceImpl implements IVehiculoService {
	
	@Autowired
	private IVehiculoDao vehiculoDao; //cree variable pero no la instancié, no hay necesidad de instanciarla lo reconoce con autowired
	

	@Override
	public Vehiculo guardar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		return vehiculoDao.save(vehiculo);
	}

	@Override
	public void borrar(Long id) {
		vehiculoDao.deleteById(id);

	}

	@Override
	public Vehiculo buscarVehiculoPorId(Long id) {
		// TODO Auto-generated method stub
		return vehiculoDao.findById(id).orElse(null);
	}

	@Override
	public List<Vehiculo> listarTodos() {
		// TODO Auto-generated method stub
		return (List<Vehiculo>) vehiculoDao.findAll();
		
	@Override
	
	public List<Vehiculo> guardarVarios(Vehiculo[] vhiculo ){
		List<Vehiculo> retorno = new ArrayList<Vehiculo>();  //Declarar una lista de array
		for (Vehiculo vehiculo : Vehiculos) {
			retorno.add(vehiculoDao.save(vehiculo)); //Con esta funcion va entrando y lo pone en la lista
			
			//este es un for each, no hay que decir hasta donde llegar, ejemplo un array
			
			vehiculoDao.save(vehiculo);
		}
		
		return retorno;
	}
	}

}
