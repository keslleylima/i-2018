/**
 * Copyright (c) 2018.
 * Keslley Lima da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao;

import br.ufg.inf.es.integracao.exercicio1.Exercicio1;
import org.junit.Test;
import java.io.IOException;

public class Exercicio1Test {

    @Test(expected = IllegalArgumentException.class)
    public void nomeArquivoInvalido() throws IOException {
        Exercicio1.returnHexadecimal("");
    }
}
