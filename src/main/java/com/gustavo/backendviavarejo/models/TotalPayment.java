package com.gustavo.backendviavarejo.models;

public class TotalPayment {
    private Integer numeroParcelas;
    private Double valor;
    private Double taxaJurosAoMes;

    public TotalPayment(Integer numeroParcelas, Double valor, Double taxaJurosAoMes) {
        this.numeroParcelas = numeroParcelas;
        this.valor = valor;
        this.taxaJurosAoMes = taxaJurosAoMes;
    }

    public Integer getNumeroParcelas() {
        return numeroParcelas;
    }

    public void setNumeroParcelas(Integer numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getTaxaJurosAoMes() {
        return taxaJurosAoMes;
    }

    public void setTaxaJurosAoMes(Double taxaJurosAoMes) {
        this.taxaJurosAoMes = taxaJurosAoMes;
    }
}
