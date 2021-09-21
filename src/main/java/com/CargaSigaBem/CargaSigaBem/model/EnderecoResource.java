package com.CargaSigaBem.CargaSigaBem.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EnderecoResource{

    @JsonProperty("id")
    private String id;

    @JsonProperty("cepOrigem")
    private String cepOrigem;

    @JsonProperty("cepDestino")
    private String cepDestino;

    @JsonProperty("NomeDestinario")
    private String nomeDestinatario;

    @JsonProperty("Peso")
    private String peso;


        public EnderecoResource(String id, String cepOrigem, String cepDestino, String nomeDestinatario, String peso) {
            this.id = id;
            this.cepOrigem = cepOrigem;
            this.cepDestino = cepDestino;
            this.nomeDestinatario = nomeDestinatario;
            this.peso = peso;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getCepOrigem() {
            return cepOrigem;
        }

        public void setCepOrigem(String cepOrigem) {
            this.cepOrigem = cepOrigem;
        }

        public String getCepDestino() {
            return cepDestino;
        }

        public void setCepDestino(String cepDestino) {
            this.cepDestino = cepDestino;
        }

        public String getNomeDestinatario() {
            return nomeDestinatario;
        }

        public void setNomeDestinatario(String nomeDestinatario) {
            this.nomeDestinatario = nomeDestinatario;
        }

        public String getPeso() {
            return peso;
        }

        public void setPeso(String peso) {
            this.peso = peso;
        }
}
