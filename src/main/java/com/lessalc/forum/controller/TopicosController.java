package com.lessalc.forum.controller;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lessalc.forum.controller.dto.TopicoDto;
import com.lessalc.forum.modelo.Topico;
import com.lessalc.forum.repository.TopicoRepository;


@RestController
public class TopicosController {
	
	@Autowired
	private TopicoRepository repository;
	
	@RequestMapping("/topicos")
	public List<TopicoDto> lista(){	
		List<Topico> topicos = repository.findAll();
		return TopicoDto.converter(topicos);
	}

}
