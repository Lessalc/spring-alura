package com.lessalc.forum.controller.dto;

import java.time.LocalDateTime;

import com.lessalc.forum.modelo.Resposta;

public class RespostaDto {

	private Long id;
	private String mensagem;
	private LocalDateTime dataCriação;
	private String nomeAuthor;
	
	public RespostaDto(Resposta resposta) {
		this.id = resposta.getId();
		this.mensagem = resposta.getMensagem();
		this.dataCriação = resposta.getDataCriacao();
		this.nomeAuthor = resposta.getAutor().getNome();
	}

	public Long getId() {
		return id;
	}

	public String getMensagem() {
		return mensagem;
	}

	public LocalDateTime getDataCriação() {
		return dataCriação;
	}

	public String getNomeAuthor() {
		return nomeAuthor;
	}
	
	
}
