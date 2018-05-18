package br.ufg.inf.es.integracao;

import br.ufg.inf.es.integracao.exercicio3.Exercicio3;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class Exercicio3Test {
    @Test

    public void arquivoInvalido() throws IOException {
        Assert.assertEquals(false,Exercicio3.verificaArquivoValido(""));
    }
}
