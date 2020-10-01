package br.edu.utfpr.dv.sireata.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepartamentoTest {

    @Test
    void TestDepartment() {
        Departamento d = new Departamento();

        d.setNome("Teste");
        String name = d.getNome();

        assertEquals("Teste", name);
    }


}