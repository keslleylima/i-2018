package topico2.src.test.java.ufg.inf.ufg.br.integracao;

import org.testng.Assert;
import org.testng.annotations.Test;
import topico2.src.main.java.br.ufg.inf.es.integracao.serelizacao.exercicio2.Cliente;
import topico2.src.main.java.br.ufg.inf.es.integracao.serelizacao.exercicio2.Serelizacao;

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
