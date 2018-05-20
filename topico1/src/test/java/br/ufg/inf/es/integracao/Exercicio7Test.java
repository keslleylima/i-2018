/**
 * Copyright (c) 2018.
 * Keslley Lima da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao;

import br.ufg.inf.es.integracao.exercicio7.Exercicio7;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class Exercicio7Test {

    @Test
    public void arquivoValidoBinario() throws IOException {
        Assert.assertEquals(false,Exercicio7.validaNomeArqBin(""));
    }

    @Test
    public void arquivoValidoText() throws IOException {
        Assert.assertEquals(false,Exercicio7.validaNomeArqText(""));
    }

}
