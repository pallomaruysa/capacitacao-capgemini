package com.br.orientacaooo.model.entity;

public class Produto{
    private int codigoProduto;
    private String descricaoProduto;
    private Double precoProduto;
    private  int codigoFornecedor;

    public Produto() {

    }

    public Produto( String descricaoProduto, Double precoProduto, int codigoFornecedor, int codigoProduto){
        this.codigoProduto = codigoProduto;
        this.descricaoProduto = descricaoProduto;
        this.precoProduto = precoProduto;
        this.codigoFornecedor = codigoFornecedor;
    }

    public Produto(String descricaoProduto, Double precoProduto, int codigoFornecedor) {
        this.descricaoProduto = descricaoProduto;
        this.precoProduto = precoProduto;
        this.codigoFornecedor = codigoFornecedor;
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public Double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(Double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public int getCodigoFornecedor() {
        return codigoFornecedor;
    }

    public void setCodigoFornecedor(int codigoFornecedor) {
        this.codigoFornecedor = codigoFornecedor;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigoProduto=" + codigoProduto +
                ", descricaoProduto='" + descricaoProduto + '\'' +
                ", precoProduto=" + precoProduto +
                ", codigoFornecedor=" + codigoFornecedor +
                '}' + '\n';
    }
}
