/**
 * Copyright (c) 2018.
 * Keslley Lima da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao;

import br.ufg.inf.es.integracao.exercicio8.Exercicio8;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class Exercicio8Test {

    @Test
    public void arquivovalidoBInario() throws IOException {
        Assert.assertEquals(false,Exercicio8.validaNomeArqBin(""));
    }

    @Test
    public void ordemLinhaValido() throws IOException {
        Assert.assertEquals(false,Exercicio8.validaLinha(-3));
    }

}
