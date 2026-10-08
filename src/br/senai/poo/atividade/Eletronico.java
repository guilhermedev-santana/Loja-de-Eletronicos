package br.senai.poo.atividade;

public class Eletronico extends Produto {

    private static Integer proximoId = 1;
    private CategoriaProdutoEnum categoria;
    private Integer id;


    public Eletronico(Integer nome, Integer codigo, Double preco, CategoriaProdutoEnum categoria) {
        super(nome, codigo, preco);
        this.categoria = categoria;
        id = proximoId++;
    }

    public Integer getId() {
        return id;
    }

    public CategoriaProdutoEnum getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProdutoEnum categoria) {
        this.categoria = categoria;
    }

    @Override
    public String exibirInformacoes() {
        return "Nome: " + getNome() + "\nCódigo: " + getCodigo() + "\nPreço: " + getPreco() + "\nCategoria: " + getCategoria() + "\nId: " + getId();
    }

    public String exibirInformacoes(boolean detalhado) {
        if (detalhado) {
            return "Eletrônico (" + getId() + ")" + "\nNome: " + getNome() + "\nCódigo: " + getCodigo() + "\nPreço: " + getPreco() + "\nCategoria: " + getCategoria();
        } else {
            return "Nome: " + getNome();
        }
    }
}
