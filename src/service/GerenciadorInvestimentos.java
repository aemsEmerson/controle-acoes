package service;

import entities.Ativo;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorInvestimentos {
    private List<Ativo> ativos = new ArrayList<>();

    public void adicionarAtivo(Ativo ativo){
        ativos.add(ativo);
        System.out.println("Ativo Cadastrado!");
    }

    public void listarAtivo(){
        if(ativos.isEmpty()){
            System.out.println("Nenhum arquivo!");
        } else {
            for(Ativo atv : ativos){
                System.out.println(atv);
            }
        }
    }
}
