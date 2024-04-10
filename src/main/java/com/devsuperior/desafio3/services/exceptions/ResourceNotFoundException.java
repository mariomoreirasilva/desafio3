package com.devsuperior.desafio3.services.exceptions;
//classe para retornar erro de não encontrar o findbyid na console
public class ResourceNotFoundException extends RuntimeException {
	
	public ResourceNotFoundException(String msg) {
		super(msg);
	}

}
