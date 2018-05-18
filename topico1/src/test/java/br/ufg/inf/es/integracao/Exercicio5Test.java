package br.ufg.inf.es.integracao;

import br.ufg.inf.es.integracao.exercicio5.Exercicio5;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class Exercicio5Test {
    @Test

    public void ValorArquivoEntradaVazio() throws IOException {
        Assert.assertEquals(true,Exercicio5.validaNomeArquivoEntrada(""));
    }

    @Test
    public void ValorArquivoSaidaVazio() throws IOException {
        Assert.assertEquals(true,Exercicio5.validaNomeArquivoSaida(""));
    }
}
