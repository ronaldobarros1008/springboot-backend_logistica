package com.rsblog.domain.exception;

public class EntidadeNaoEncontradaException extends NegocioException{

	private static final long serialVersionUID = 2196948604773883504L;

	public EntidadeNaoEncontradaException(String message) {
		super(message);
	}

}
