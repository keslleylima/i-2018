package br.inf.ufg.es.integracao;

import org.junit.Test;
import br.ufg.inf.es.integracao.exercicio3.Endereco;
import br.ufg.inf.es.integracao.exercicio3.Estudante;
import br.ufg.inf.es.integracao.exercicio3.Exercicio3parte1;
import br.ufg.inf.es.integracao.exercicio3.Exercicio3parte2;
import br.ufg.inf.es.integracao.exercicio3.Turma;
import java.io.IOException;
import javax.xml.stream.XMLStreamException;

public class Exercicio3Test {

    @Test(expected = IllegalArgumentException.class)
    public void nomeInvalido() throws FileNotFoundException, UnsupportedEncodingException {
        Exercicio3parte1.escreverNoArquivo("Teste exercício 3", "");
    }

    @Test(expected = IllegalArgumentException.class)
    public void nomeInvalido3b() throws IOException, XMLStreamException {
        Exercicio3parte2.criaObjeto("");
    }
}
