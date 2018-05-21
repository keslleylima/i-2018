
/**
 * Copyright (c) 2018.
 * Keslley Lima da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.exercicio2;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
//import com.fasterxml.jackson.databind.MappingIterator;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Exercicio2 {

    /**
     * Esse método Carrega o conteúdo de um arquivo contendo um documento XML.
     * Após carregar o documento XML, a aplicação disponibiliza uma lista de
     * calçados, conforme o conteúdo do documento carregado.
     * @param args
     * @throws FileNotFoundException
     * @throws XMLStreamException
     */
    public static void main(String[] args) throws FileNotFoundException, XMLStreamException {
        if (nomeArquivoValido(args[0])) {
            FileInputStream aux = new FileInputStream(args[0]);
            XMLInputFactory factory = XMLInputFactory.newFactory();
            XMLStreamReader arquivo = factory.createXMLStreamReader(aux);

            Calcados calcados = new Calcados();
            ArrayList<Tenis> tenisAux = new ArrayList<Tenis>();
            ArrayList<Sapato> sapatosAux = new ArrayList<Sapato>();
            int cont = 0;
            int qt_tenis = 0;
            int qt_sapato = 0;
            while (cont != XMLStreamConstants.END_DOCUMENT) {
                if (cont == XMLStreamConstants.START_ELEMENT) {
                    String calcado = arquivo.getLocalName();
                    if (calcado.equals("tenis")) {
                        //Tenis tenis = mapper.readValue(arquivo, Tenis.class);
                        //tenisAux.add(qt_tenis, tenis);
                        qt_tenis++;
                    } else {
                        //Sapato sapatos = mapper.readValue(arquivo, Sapato.class);
                        //sapatosAux.add(qt_sapato, sapatos);
                        qt_sapato++;
                    }
                }
                cont = arquivo.next();
            }
            calcados.setTenis(tenisAux);
            calcados.setSapatos(sapatosAux);

        } else {
            throw new IllegalArgumentException("Arquivo é invalido!");
        }
    }
    /**
     * Esse metodo verifica se o nome do arquivo é válido.
     * @param nomeArq nome do arquivo.
     * @return
     */
    private static boolean nomeArquivoValido(String nomeArq) {
        if (nomeArq.equals(null) || nomeArq.trim().isEmpty()) {
            return false;
        }

        return true;
    }
}
