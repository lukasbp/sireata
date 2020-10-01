package br.edu.utfpr.dv.sireata.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepartamentoTest {

    @Test
    void TestDepartmentName() {
        Departamento d = new Departamento();

        d.setNome("Teste");
        String name = d.getNome();

        assertEquals("Teste", name);
    }
    @Test
    void TestDepartmentSite() {
        Departamento d = new Departamento();

        d.setNome("www.teste.com.br");
        String name = d.getNome();

        assertEquals("www.teste.com.br", name);
    }
    @Test
    void TestDepartmentId() {
        Departamento d = new Departamento();

        d.setIdDepartamento(1);
        int id = d.getIdDepartamento();

        assertEquals(1, id);
    }

}
