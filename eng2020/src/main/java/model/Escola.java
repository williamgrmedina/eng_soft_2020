/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Medina
 */
public class Escola {
    private String nome;
    private String cep;
    private int numero;
    private String telefone;
    private int qtd_alunos;
    private String perfil;
    private String nome_resp;
    private String email_resp;
    private String login_resp;
    private String senha_resp;
    private String status;

    public String getLogin_resp() {
        return login_resp;
    }

    public void setLogin_resp(String login_resp) {
        this.login_resp = login_resp;
    }

    public String getSenha_resp() {
        return senha_resp;
    }

    public void setSenha_resp(String senha_resp) {
        this.senha_resp = senha_resp;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getQtd_alunos() {
        return qtd_alunos;
    }

    public void setQtd_alunos(int qtd_alunos) {
        this.qtd_alunos = qtd_alunos;
    }

    public String getNome_resp() {
        return nome_resp;
    }

    public void setNome_resp(String nome_resp) {
        this.nome_resp = nome_resp;
    }

    public String getEmail_resp() {
        return email_resp;
    }

    public void setEmail_resp(String email_resp) {
        this.email_resp = email_resp;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
}
