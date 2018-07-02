/**
 * Copyright (c) 2018.
 * Keslley Lima da Silva
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.es.integracao.exercicio3;

/**
 * Essa Classe a partir de um documento XML, que está armazenado em um arquivo,
 * realiza recuperação da instância da classe Turma nele serializado.
 */
public class Exercicio3parte2 {

}

/**
 * Método que criar um objeto por meio da enntrada dos dados recuperados.
 */
public static Turma criaObjeto(String directory) throws XMLStreamException, IOException {
        
    if (nomeValido(directory)) {
        File file = new File(directory);
        XmlMapper mapper = new XmlMapper();
        String xml = pegaDados(new FileInputStream(file));
        Turma turma = mapper.readValue(xml, Turma.class);

        return turma;
    } else {
        throw new IllegalArgumentException("O nome de arquivo é invalido!");
      }
}

 /**
  * Método que recuperar os dados do arquivo.
  */
public static String pegaDados(InputStream aux) throws IOException, XMLStreamException {
    StringBuilder arq = new StringBuilder();
    String line;
    BufferedReader br = new BufferedReader(new InputStreamReader(aux));
    
    while ((line = br.readLine()) != null) {
        arq.append(line);
    }
    
    br.close();
    
    return arq.toString();
}

/**
 * Método que verifica se o nome de um arquivo é valido.
 * @param file Nome do arquivo.
 * @return True nome valido.
 */
private static boolean nomeValido(String file) {
    if (file.equals(null) || file.trim().isEmpty()) {
        return false;
    }
    
    return true;
}
