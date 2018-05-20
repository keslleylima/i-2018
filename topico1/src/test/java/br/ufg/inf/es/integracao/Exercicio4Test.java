/**
 * Copyright (c) 2018.
 * Keslley Lima da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao;

import br.ufg.inf.es.integracao.exercicio4.Exercicio4;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class Exercicio4Test {
    @Test

    public void arquivoValido() throws IOException {
        Assert.assertEquals(false,Exercicio4.validaNomeArquivo(""));
    }

    @Test
    public void conteudoValido() throws IOException {
        Assert.assertEquals(false,Exercicio4.validaNomeConteudo(""));
    }

}
