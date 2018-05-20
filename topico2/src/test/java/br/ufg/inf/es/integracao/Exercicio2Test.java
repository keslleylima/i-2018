package br.ufg.inf.es.integracao;

import br.ufg.inf.es.integracao.serelizacao.exercicio2.Cliente;
import br.ufg.inf.es.integracao.serelizacao.exercicio2.Serelizacao;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Exercicio2Test {
    @Test
    public void deserelizadoIgual() throws Exception {
        Cliente cliente = new Cliente("Keslley", "14");

        byte[] bytes = Serelizacao.serelizar(cliente);
        Cliente clienteDeserelizado = Serelizacao.deserializar(bytes);
        System.out.println(clienteDeserelizado.getNome());
        System.out.println(clienteDeserelizado.getIdentificador());
        Assert.assertEquals(true,clienteDeserelizado.getNome().equals(cliente.getNome()));
        Assert.assertEquals(true,clienteDeserelizado.getIdentificador().equals(cliente.getIdentificador()));
    }
}
