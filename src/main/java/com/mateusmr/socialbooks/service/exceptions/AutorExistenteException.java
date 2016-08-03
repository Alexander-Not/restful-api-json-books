package com.mateusmr.socialbooks.service.exceptions;

public class AutorExistenteException extends RuntimeException {

	private static final long serialVersionUID = 3387482709175081926L;

	public AutorExistenteException(String mensagem) {
		super(mensagem);
	}

	public AutorExistenteException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}

}
