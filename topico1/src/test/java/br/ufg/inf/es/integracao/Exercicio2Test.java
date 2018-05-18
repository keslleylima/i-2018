package br.ufg.inf.es.integracao;

import br.ufg.inf.es.integracao.exercicio2.Exercicio2;
import org.junit.Assert;
import org.junit.Test;
import java.io.IOException;

public class Exercicio2Test {
    @Test(expected = IllegalArgumentException.class)
    public void nomeArqInvalido() throws IOException {
        Exercicio2.verificaNomeArqJpeg("");
    }

    @Test

    public void arquivoNãoJpeg() throws IOException {
        Assert.assertEquals(false,Exercicio2.verificaNomeArqJpeg("/home/keslleylima/Documentos/i-2018/test.txt"));
    }
}
