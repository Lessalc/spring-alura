package com.lessalc.forum.controller.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.lessalc.forum.modelo.Topico;

public class TopicoDto {

	private Long id;
	private String titulo;
	private String mensagem;
	private LocalDateTime dataCriacao;
	
	TopicoDto(Topico topico){
		this.id = topico.getId();
		this.titulo = topico.getTitulo();
		this.mensagem = topico.getMensagem();
		this.dataCriacao = topico.getDataCriacao();
	}
	
	public Long getId() {
		return id;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getMensagem() {
		return mensagem;
	}
	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public static List<TopicoDto> converter(List<Topico> topicos) {

		return topicos.stream().map(x -> new TopicoDto(x)).collect(Collectors.toList());
	}
	
	
	
}