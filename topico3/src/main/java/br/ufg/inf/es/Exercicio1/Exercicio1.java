import com.sun.xml.internal.txw2.Document;

import javax.swing.text.html.parser.Element;
import java.io.*;

/**
 * Created by aluno on 07/05/18.
 */
public class Exercicio1 {

    public static void main(String[] args) {

        Element alunos = new Element();

        //Define alunos como root

        Document documento = new Document(alunos);

        //Cria o elemento aluno

        Element aluno = new Element("aluno");

        //Criando os elementos de aluno

        Element nome = new Element("nome");

        nome.setText("Glaucio Guerra");

        Element email = new Element("email");

        telefone.setText("teste@hotmai.com");

        //Adicionando elementos nome e email

        contato.addContent(nome);

        contato.addContent(email);

        //Adicionado o aluno a alunos

        alunos.addContent(aluno);

        //Classe responsável por gerar o XML

        XMLOutputter xout = new XMLOutputter();

        try {

            //Criando o arquivo de saida

            FileWriter arquivo = new FileWriter(

                    new File("c:/arquivo.xml"));

            //Imprimindo o XML no arquivo

            xout.output(documento, arquivo);

        } catch (IOException e) {

            e.printStackTrace();

        }


    }

    public void createCsvFile(){
        //A estrutura try-catch é usada pois o objeto BufferedWriter exige que as excessões sejam tratadas
        try{

            //Criação de um buffer para a escrita em uma stream
            BufferedWriter StrW = new BufferedWriter(new FileWriter("C:\\aluno.csv"));

            //Escrita dos dados da tabela
            StrW.write("Nome;Email\n");

            //Fecha o buffer
            StrW.close();
        }catch (FileNotFoundException ex)
        {
            ex.printStackTrace();
        }catch (IOException e)
        {
            e.printStackTrace(); }
    }


}
