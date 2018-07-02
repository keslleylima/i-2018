package br.inf.ufg.es.integracao;
import br.ufg.inf.es.integracao.exercicio2.Calcado;
import br.ufg.inf.es.integracao.exercicio2.Calcados;
import br.ufg.inf.es.integracao.exercicio2.Exercicio2;
import br.ufg.inf.es.integracao.exercicio2.Sapato;
import br.ufg.inf.es.integracao.exercicio2.Tenis;
import org.junit.Test;

public class Exercicio2Test {

    @Test(expected = IllegalArgumentException.class)
    public void nomeInvalido() throws Exception {
        Exercicio2.main("");
    }

}
