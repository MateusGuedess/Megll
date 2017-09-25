package com.megll.mateusguedes.megll;

/**
 * Created by Mateus Guedes on 25/09/2017.
 */

public class Cliente {

    private String id;
    private String nomeCliente;
    private String telefone;
    private String celular;
    private String documento;
    private String email;
    private String endereco;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
