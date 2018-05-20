/**
 * Copyright (c) 2018.
 * Keslley Lima da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao;

import br.ufg.inf.es.integracao.exercicio5.Exercicio5;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class Exercicio5Test {
    @Test

    public void ValorArquivoEntradaVazio() throws IOException {
        Assert.assertEquals(false,Exercicio5.validaNomeArquivoEntrada(""));
    }

    @Test
    public void ValorArquivoSaidaVazio() throws IOException {
        Assert.assertEquals(false,Exercicio5.validaNomeArquivoSaida(""));
    }
}
