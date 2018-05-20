/**
 * Copyright (c) 2018.
 * Keslley Lima da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao;

import br.ufg.inf.es.integracao.serelizacao.exercicio1.Serelizador;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;


public class Exercicio1Test {

    @Test
    public void arquivoValido() throws IOException {
        Assert.assertEquals(false,Serelizador.validaNomeArquivo(""));
    }

}
