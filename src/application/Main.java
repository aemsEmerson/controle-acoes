package application;

import entities.Ativo;
import service.GerenciadorInvestimentos;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        GerenciadorInvestimentos carteira = new GerenciadorInvestimentos();

        Ativo petr4 = new Ativo("PETR4", LocalDate.of(2025,1,10), 29.90, 16);
        carteira.adicionarAtivo(petr4);

        Ativo taee11 = new Ativo("TAEE11", LocalDate.of(2025, 2, 10), 35.10, 5);
        carteira.adicionarAtivo(taee11);
        carteira.listarAtivo();
    }
}