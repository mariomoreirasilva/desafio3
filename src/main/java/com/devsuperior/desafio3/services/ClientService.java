package com.devsuperior.desafio3.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.devsuperior.desafio3.dto.ClientDTO;
import com.devsuperior.desafio3.entities.Client;
import com.devsuperior.desafio3.repositories.ClientRepository;

public class ClientService {
	@Autowired
	private ClientRepository repository;
	//Busca de recurso por id
	public ClientDTO findById(Long id) {
		Client client = repository.findById(id).get();
		return new ClientDTO(client);
		
	}
	
}
