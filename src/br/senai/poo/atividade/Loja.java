package br.senai.poo.atividade;

import java.util.ArrayList;

public class Loja {
    private ArrayList<Produto> produtos;

    public Loja() {
        produtos = new ArrayList<>();
    }
    public void adicionarProduto (Eletronico eletronico){
        produtos.add(eletronico);
        System.out.println("Produto Cadastrado com sucesso!");
    }
    public ArrayList<Produto> listarProdutos(){
        return produtos;
    }
}
