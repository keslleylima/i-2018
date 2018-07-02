/**
 * Copyright (c) 2018.
 * Keslley Lima da Silva
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.es.integracao.exercicio4;

/**
 *
 * Classe que representa instância de uma comunicacao
 */
class Comunicacao {
     
    private String meio;
    private String preferencia;
    private String detalhes;
    private String uso;
    
    /**
     *  Metodo que acessa atirbutos de meio
     * @return 
     */
    public String getMeio() {
        return meio;
    }
    
    /**
     *  Metodo que atualiza atirbutos de meio
     * @param meio 
     */
    public void setMeio(String meio) {
        this.meio = meio;
    }
    
    /**
     *  Metodo que acessa atirbutos de preferencia
     * @return 
     */
    public String getPreferencia() {
        return preferencia;
    }
    
    /**
     *  Metodo que atualiza atirbutos de preferencia
     * @param preferencia 
     */
    public void setPreferencia(String preferencia) {
        this.preferencia = preferencia;
    }
    
    /**
     *  Metodo que atualiza atirbutos de detalhes
     * @return 
     */
    public String getDetalhes() {
        return detalhes;
    }

    /**
     *  Metodo que atualiza atirbutos de detalhes
     * @param detalhes 
     */
    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }
    
    /**
     *  Metodo que acessa atirbutos de uso
     * @return 
     */
    public String getUso() {
        return uso;
    }
    
    /**
     *  Metodo que atualiza atirbutos de uso
     * @param uso 
     */
    public void setUso(String uso) {
        this.uso = uso;
    }  
}
