
/**
 * Copyright (c) 2018.
 * Keslley Lima da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.exercicio1;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * Esse programa (linha de comandos) que recebe como argumento o nome
 * de um arquivo no formato CSV (colunas separadas por “;”) e produz
 * um documento XML equivalente.
 */
public class Exercicio1 {

    public static void main(String[] args) {
        String nomeArqCsv = "arq.csv";
        String nomeArqXml = "arq.xml";
        Alunos alunos = new Alunos();
        try {
            receberCsv(nomeArqCsv);
            gerarXml(alunos,nomeArqXml);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    /**
     * Esse método recebe o nome de um arquivocsv, seus dados alterados para
     * formato UTF-8  e transformados em objetos, no caso nome e email.
     * @param nomeArquivo
     * @return
     * @throws IOException
     */
    public static Alunos receberCsv (String nomeArquivo) throws IOException {

        Alunos alunos = new Alunos();
        Path arq;
        char divisor = ';';
        arq= Paths.get(nomeArquivo);
        Charset utf8 = Charset.forName("UTF-8");
        ArrayList<Aluno> arrayAux = new ArrayList<Aluno>();
        int i = 0;
        for (String line : Files.readAllLines(arq, utf8)) {
            Aluno aluno = new Aluno();
            System.out.println("ssss");
            String[] aux = line.split(String.valueOf(divisor));
            aluno.setNome(aux[0]);
            aluno.setEmail(aux[1]);
            arrayAux.add(i,aluno);
            i++;

        }
        alunos.setAlunos(arrayAux);
        return alunos;
    }

    /**
     * Esse método tem como finalidade gerar um arquivo xml por meio do nom e
     * dados de um arquivo no formato CSV.
     * @param alunos parametro referente ao conjunto de objetos de alunos
     * @param nomeArq nome do arquivo XML a ser passado como parametro.
     */
    public static void gerarXml (Alunos alunos, String nomeArq) throws JAXBException {
        JAXBContext contexto = JAXBContext.newInstance(Alunos.class);
        Marshaller mar = contexto.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        mar.marshal(alunos, new File(nomeArq));
    }

}
