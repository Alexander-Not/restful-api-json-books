package com.mateusmr.socialbooks.service.exceptions;

public class AutorNaoEncontradoException extends RuntimeException {

	private static final long serialVersionUID = 3387482709175081926L;

	public AutorNaoEncontradoException(String mensagem) {
		super(mensagem);
	}

	public AutorNaoEncontradoException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}

}
