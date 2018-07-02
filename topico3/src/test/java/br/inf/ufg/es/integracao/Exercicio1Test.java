package br.inf.ufg.es.integracao;

import org.junit.Test;
import br.ufg.inf.es.integracao.exercicio1.Aluno;
import br.ufg.inf.es.integracao.exercicio1.Alunos;
import br.ufg.inf.es.integracao.exercicio1.Exercicio1;
import java.io.File;
import java.io.IOException;
import javax.xml.bind.JAXBException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import org.junit.Assert;
        
public class Exercicio1Test {
    @Test
    public void casoTestePrincipal() throws IOException, JAXBException {

        Aluno aluno = new Aluno();
        aluno.setEmail("aluno@hotmail.com");
        aluno.setNome("Aluno1");
        ArrayList<Aluno> novoAluno = new ArrayList<Aluno>();
        novoAluno.add(0, aluno);
        Alunos turma = new Alunos();
        turma.setAlunos(novoAluno);

        FileWriter arq = new FileWriter("arqTest.csv");
        PrintWriter gravarArq = new PrintWriter(arq);
        gravarArq.printf("AlunoExemplo;aluno_exemplo@hotmail.com");
        arq.close();

        Assert.assertEquals("AlunoExemplo", Exercicio1.receberCsv("arqTest.csv").getAlunos().get(0).getNome());
        Assert.assertEquals("aluno_exemplo@hotmail.com", Exercicio1.receberCsv("arqTest.csv").getAlunos().get(0).getEmail());

        File file = new File( "arqTest.csv");
        
        file.delete();
    }
}
