package com.gustavo.backendviavarejo.service;

import com.gustavo.backendviavarejo.models.ProductPayment;
import com.gustavo.backendviavarejo.models.TotalPayment;
import org.springframework.stereotype.Service;

@Service
public class MainService {
    public TotalPayment getResult(ProductPayment product){
        Double entrada = product.getCondicaoPagamento().getValorEntrada();
        Integer qtdeParcelas = product.getCondicaoPagamento().getQtdeParcelas();
        Double valorTotal = product.getProduto().getValor();
        if (qtdeParcelas > 6) {
            Double taxaJuros = 1.15;
            Double valorComJuros = applyJuros(valorTotal,qtdeParcelas,entrada);
            TotalPayment totalPayment = new TotalPayment(qtdeParcelas,valorComJuros,taxaJuros);
            return totalPayment;
        }
        Double semJuros = withoutJuros(valorTotal,qtdeParcelas,entrada);
        return new TotalPayment(qtdeParcelas,semJuros,0.00);

    }

    public Double applyJuros(Double valorTotal, Integer qtdeParcelas,
                             Double entrada){
        Double valorDescontado = valorTotal - entrada;
        Double taxaJuros = 1.15;
        Double valorParcelas = valorDescontado/qtdeParcelas;
        Double valorComJuros = (valorParcelas * taxaJuros) * qtdeParcelas;
        return valorComJuros;
    }

    public Double withoutJuros(Double valorTotal, Integer qtdeParcelas,
                               Double entrada){
        Double valorDescontado = valorTotal - entrada;
        Double valorParcelas = valorDescontado/qtdeParcelas;
        return valorParcelas;
    }
}
