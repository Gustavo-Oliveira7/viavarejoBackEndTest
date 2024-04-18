package com.gustavo.backendviavarejo.models;

public class PaymentTerms {
    private Double valorEntrada;
    private Integer qtdeParcelas;

    public PaymentTerms(Double valorEntrada, Integer qtdeParcelas) {
        this.valorEntrada = valorEntrada;
        this.qtdeParcelas = qtdeParcelas;
    }

    public Double getValorEntrada() {
        return valorEntrada;
    }

    public void setValorEntrada(Double valorEntrada) {
        this.valorEntrada = valorEntrada;
    }

    public Integer getQtdeParcelas() {
        return qtdeParcelas;
    }

    public void setQtdeParcelas(Integer qtdeParcelas) {
        this.qtdeParcelas = qtdeParcelas;
    }
}
