package com.accenture.rentacar.app.service;

import java.util.List;

import com.accenture.rentacar.app.entity.Cliente;

public interface IClienteService{
	
	public Cliente  guardar (Cliente cliente);
	public void borrar (Long id);
	public Cliente buscarClientePorID (Long Id);
	public List<Cliente> listarTodos();
}
