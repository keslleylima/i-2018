package br.ufg.inf.es.integracao;

import br.ufg.inf.es.integracao.exercicio4.Exercicio4;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Exercicio4Test {
    @Test

    public void arquivoValido() throws IOException {
        Assert.assertEquals(true,Exercicio4.validaNomeArquivo(""));
    }

    @Test
    public void conteudoValido() throws IOException {
        Assert.assertEquals(true,Exercicio4.validaNomeConteudo(""));
    }

}
