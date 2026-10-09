package br.senai.poo.atividade;

public abstract class Produto {
    private String nome;
    private Integer codigo;
    private Double preco;

    public Produto(String nome, Integer codigo, Double preco) {
        this.nome = nome;
        setCodigo(codigo);
        setPreco(preco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        if (codigo == null || codigo < 0) {
            throw new IllegalArgumentException("Erro, valor inválido!");
        } else {
            this.codigo = codigo;
        }
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        if (codigo == null || preco <= 0) {
            throw new IllegalArgumentException("Erro, valor inválido!");
        } else {
            this.preco = preco;
        }
    }

    public abstract String exibirInformacoes();

    @Override
    public String toString() {
        return "Produto{" +
                "nome=" + nome +
                ", codigo=" + codigo +
                ", preco=" + preco +
                '}';
    }
}