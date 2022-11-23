package com.lessalc.forum.controller;

import com.lessalc.forum.modelo.Curso;
import com.lessalc.forum.modelo.Topico;
import com.lessalc.forum.modelo.Usuario;
import com.lessalc.forum.repository.CursoRepository;
import org.aspectj.lang.annotation.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.net.URI;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@DataJpaTest
@ActiveProfiles("test")
public class TopicosControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private CursoRepository repository;

    @Autowired
    private TestEntityManager em;

    @BeforeAll
    public static void insereDados(){

    }

    @Test
    public void deveriaRetornarCategoriaEspecificaPeloId() throws Exception{
        URI uri = new URI("/topicos");

        mockMvc.perform(MockMvcRequestBuilders
                .get(uri))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$").isEmpty());
    }
}