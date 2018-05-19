package topico2.src.test.java.ufg.inf.ufg.br.integracao;

import org.testng.Assert;
import org.testng.annotations.Test;
import topico2.src.main.java.br.ufg.inf.es.integracao.serelizacao.exercicio1.Serelizador;

import java.io.IOException;


public class Exercicio1Test {

    @Test
    public void arquivoValido() throws IOException {
        Assert.assertEquals(false,Serelizador.validaNomeArquivo(""));
    }

}
