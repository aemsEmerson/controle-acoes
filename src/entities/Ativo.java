package entities;

import java.time.LocalDate;

public class Ativo {
    private String ticker;
    private LocalDate dataCompra;
    private Double valorCompra;
    private Integer quantidade;

    public Ativo(String ticker, LocalDate dataCompra, Double valorCompra, Integer quantidade) {
        this.ticker = ticker;
        this.dataCompra = dataCompra;
        this.valorCompra = valorCompra;
        this.quantidade = quantidade;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }

    public Double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(Double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Ativo{" +
                "ticker='" + ticker + '\'' +
                ", dataCompra=" + dataCompra +
                ", valorCompra=" + valorCompra +
                ", quantidade=" + quantidade +
                '}';
    }
}
