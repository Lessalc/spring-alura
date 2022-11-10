package com.lessalc.forum.repository;

import com.lessalc.forum.modelo.Curso;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@DataJpaTest
class CursoRepositoryTest {

    @Autowired
    private CursoRepository repository;

    @Test
    public void deveriaCarregarUmCursoAoBuscarPeloSeuNome() {
        String nomeCurso = "HTML 5";
        Curso curso = repository.findByNome(nomeCurso);

        Assert.assertNotNull(curso);
        Assert.assertEquals(nomeCurso, curso.getNome());

    }

    @Test
    public void naoDeveriaCarregarUmCursoAoBuscarPorUmNomeInexistente() {
        String nomeCurso = "JPA";
        Curso curso = repository.findByNome(nomeCurso);

        Assert.assertNull(curso);
    }
}