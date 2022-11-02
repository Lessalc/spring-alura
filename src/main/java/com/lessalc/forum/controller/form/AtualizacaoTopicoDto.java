package com.lessalc.forum.controller.form;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.lessalc.forum.modelo.Topico;
import com.lessalc.forum.repository.TopicoRepository;

public class AtualizacaoTopicoDto implements Serializable{
	private static final long serialVersionUID = 1L;

	@NotNull @NotEmpty @Length(min=5)
	private String titulo;
	@NotNull @NotEmpty @Length(min=5)
	private String mensagem;
	
	public AtualizacaoTopicoDto() {
		// TODO Auto-generated constructor stub
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public Topico atualizar(Long id, TopicoRepository topicoRepository) {
		Topico topico = topicoRepository.getReferenceById(id);
		topico.setTitulo(this.titulo);
		topico.setMensagem(this.mensagem);
		return topico;
	}

	
}
