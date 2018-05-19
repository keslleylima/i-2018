package br.ufg.inf.es.integracao.exercicio7;

public class Exercicio7 {

    public static void converteTextParaBinario (String arqTexto, String arqBinario){
        Charset utf8 = Charset.forName("UTF-8");
        Path file = Paths.get(arqText);

        FileOutputStream tmpBinary = new FileOutputStream(arqBinary);
        DataOutputStream archive = new DataOutputStream(tmpBinary);
        int index = 0;

        for (String line : Files.readAllLines(file, utf8)) {
            byte[] lineByte = line.getBytes(utf8);
            archive.writeInt(index);
            archive.writeInt(line.length());
            archive.write(lineByte, 0, line.length());
            index ++;
        }
    }

    /**
     * Esse método valide se o nome do arquivo texto é válido, ou seja, não é vazio.
     * @param arquivo parametro de entrada que é o nome do arquivo;
     * @return retorna valor booleando (verdadeiro ou falso).
     */
    public static boolean validaNomeArquivo (String arquivo){
        if (arquivo.equals(null) || arquivo.equals("")) {
            return true;
        }else{
            return false;
        }
    }

    /**
     * Esse método valide se o contéudo é válido, ou seja, não é vazio.
     * @param conteudo parametro de entrada que é a seq. de caracteres
     * @return retorna o valor booleano (true ou false).
     */
    public static boolean validaNomeConteudo (String conteudo){
        if (conteudo.equals(null) || conteudo.equals("")) {
            return true;
        }else{
            return false;
        }
    }
}

