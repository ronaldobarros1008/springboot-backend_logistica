package com.rsblog.domain.service;

import org.springframework.stereotype.Service;

import com.rsblog.domain.exception.EntidadeNaoEncontradaException;
import com.rsblog.domain.model.Entrega;
import com.rsblog.domain.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BuscaEntregaService {
	
	private EntregaRepository entregaRepository;

	public Entrega buscar(Long entregaId) {
		return entregaRepository.findById(entregaId)
				.orElseThrow(() -> new EntidadeNaoEncontradaException("Entrega não encontrada"));		
	}
}
