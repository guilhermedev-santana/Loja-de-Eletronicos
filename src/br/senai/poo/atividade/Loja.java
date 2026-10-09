package br.senai.poo.atividade;

import java.util.ArrayList;

public class Loja {
    private ArrayList<Eletronico> produtos;

    public Loja() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Eletronico produto) {
        for (Produto p : produtos) {
            if (p.getCodigo() == produto.getCodigo()) {
                throw new IllegalArgumentException("Erro, Código Inválido!");
            }
        }
        produtos.add(produto);
        System.out.println("Produto Cadastrado com sucesso!");
    }

    public ArrayList<Eletronico> listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Lista Vazia.");
            return null;
        }
        return produtos;
    }

    public Produto buscarPorNome(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        System.out.println("Produto não encontrado.");
        return null;
    }

    public ArrayList<Eletronico> buscarPorCategoria(CategoriaProdutoEnum categoria) {
        ArrayList<Eletronico> encontrado = new ArrayList<>();
        for (Eletronico produto : produtos) {
            if (produto.getCategoria().equals(categoria)) {
                encontrado.add(produto);
            }
        }
        if (encontrado.isEmpty()) {
            System.out.println("Lista Vazia.");
            return null;
        } else return encontrado;
    }
}
