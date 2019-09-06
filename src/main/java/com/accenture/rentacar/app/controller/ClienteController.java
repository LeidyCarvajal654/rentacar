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
    		
    		Cliente clienteService = new Cliente ();
    		Cliente clienteService = clienteService
    				
    			
    	
    }
}	
	

//
		
	
	
	

