package br.senai.poo.atividade;

public class Principal {
    public static void main(String[] args) {
        Loja loja = new Loja();
        loja.adicionarProduto(new Eletronico("Galaxy S25", 205, 4350., CategoriaProdutoEnum.SMARTPHONE));
        loja.adicionarProduto(new Eletronico("iPhone 17", 301, 5220., CategoriaProdutoEnum.SMARTPHONE));
        loja.adicionarProduto(new Eletronico("Redmi Note", 265, 1680., CategoriaProdutoEnum.SMARTPHONE));
        loja.adicionarProduto(new Eletronico("Dell Inspiron", 105, 3499.99, CategoriaProdutoEnum.NOTEBOOK));
        loja.adicionarProduto(new Eletronico("Lenovo IdeaPad", 204, 3400., CategoriaProdutoEnum.NOTEBOOK));
        loja.adicionarProduto(new Eletronico("Mouse Gamer", 206, 199.99, CategoriaProdutoEnum.PERIFERICO));

        System.out.println("\n+++++ INFORMAÇÕES DETALHADAS +++++");
        for (Eletronico produtos : loja.listarProdutos()) {
            System.out.println(produtos.exibirInformacoes(true));
        }
        System.out.println("\n+++++ INFORMAÇÕES RESUMIDAS +++++");
        for (Eletronico produtos : loja.listarProdutos()) {
            System.out.println(produtos.exibirInformacoes(false));
        }
        System.out.println("\n+++++ SMARTPHONES +++++");
        for (Eletronico produtos : loja.buscarPorCategoria(CategoriaProdutoEnum.SMARTPHONE)) {
            System.out.println(produtos.exibirInformacoes());
        }
        System.out.println("\n+++++ NOTEBOOKS +++++");
        for (Eletronico produtos : loja.buscarPorCategoria(CategoriaProdutoEnum.NOTEBOOK)) {
            System.out.println(produtos.exibirInformacoes());
        }
    }
}