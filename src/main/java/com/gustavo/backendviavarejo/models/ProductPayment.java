package com.gustavo.backendviavarejo.models;

public class ProductPayment {
    private Product produto;
    private PaymentTerms condicaoPagamento;

    public ProductPayment(Product produto, PaymentTerms condicaoPagamento) {
        this.produto = produto;
        this.condicaoPagamento = condicaoPagamento;
    }

    public Product getProduto() {
        return produto;
    }

    public void setProduto(Product produto) {
        this.produto = produto;
    }

    public PaymentTerms getCondicaoPagamento() {
        return condicaoPagamento;
    }

    public void setCondicaoPagamento(PaymentTerms condicaoPagamento) {
        this.condicaoPagamento = condicaoPagamento;
    }
}
