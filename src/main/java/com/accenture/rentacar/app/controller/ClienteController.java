package com.accenture.rentacar.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.rentacar.app.entity.Cliente;
import com.accenture.rentacar.app.service.IClienteService;

@RestController
@RequestMapping("/service")

public class ClienteController {
	
    @Autowired
	private IClienteService clienteService;
    
    @GetMapping("/clientes")
    public List<Cliente>listar(){
    	return clienteService.listarTodos();
    }
    	
    	@GetMapping("/clientes/{id}")
    	public Cliente buscarPorID(@PathVariable Long id) {
    		
    		return clienteService.buscarClientePorID(id);
    	}
    	
    	@PostMapping("/clientes")
    	public Cliente guardar (@RequestBody Cliente cliente) {
    		return clienteService.guardar(cliente);
    	}
    	
    	@SuppressWarnings ("unused")
    	@PostMapping("/actualizar")
    	public Cliente actualizar (@RequestBody Cliente cliente) {
    		
    		Cliente entcliente = new Cliente ();
    		Cliente clienteActual = clienteService.buscarClientePorID(cliente.getId()); 
    		entcliente.setId(cliente.getId());
    		entcliente.setCedula(cliente.getCedula());
    		entcliente.setNombre(cliente.getNombre());
    		entcliente.setApellido(cliente.getApellido());
    		entcliente.setDireccion(cliente.getDireccion());
    		entcliente.setTelefono(cliente.getTelefono());
    		entcliente.setEmail(cliente.getEmail());
    		entcliente.setFechaCreacionRegistro(cliente.getFechaCreacionRegistro());
    		
    		return clienteService.guardar(entcliente);
    		
    		//prepersist se ejecuta antes de guardar 	
    	
    }
}	
	

//
		
	
	
	

