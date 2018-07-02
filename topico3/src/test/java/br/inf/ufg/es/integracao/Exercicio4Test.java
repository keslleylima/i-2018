
package br.inf.ufg.es.integracao;

import org.junit.Test;
import br.inf.ufg.es.integracao.Exercicio4;
import java.io.IOException;

public class Exercicio4Test {
      @Test(expected = IllegalArgumentException.class)
    public void verificaStringBranco() throws IOException {
        Exercicio4.deserializar("");
    }
}
