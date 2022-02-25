package com.br.orientacaooo.model.entity;

public class Fornecedor {
    private int codigoFornecedor;
    private String nomeFornecedor;
    private String CNPJ;


    public Fornecedor(int codigoFornecedor, String nomeFornecedor, String CNPJ) {
        this.codigoFornecedor = codigoFornecedor;
        this.nomeFornecedor = nomeFornecedor;
        this.CNPJ = CNPJ;
    }

    public Fornecedor(String nomeFornecedor, String CNPJ) {
        this.nomeFornecedor = nomeFornecedor;
        this.CNPJ = CNPJ;
    }

    public int getCodigoFornecedor() {
        return codigoFornecedor;
    }

    public void setCodigoFornecedor(int codigoFornecedor) {
        this.codigoFornecedor = codigoFornecedor;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    @Override
    public String toString() {
        return "Fornecedor{" +
                "codigoFornecedor=" + codigoFornecedor +
                ", nomeFornecedor='" + nomeFornecedor + '\'' +
                ", CNPJ='" + CNPJ + '\'' +
                '}'+'\n';
    }
}
