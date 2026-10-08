package br.senai.poo.atividade;

public abstract class Produto {
    private Integer nome;
    private Integer codigo;
    private Double preco;

    public Produto(Integer nome, Integer codigo, Double preco) {
        this.nome = nome;
        setCodigo(codigo);
        setPreco(preco);
    }

    public Integer getNome() {
        return nome;
    }

    public void setNome(Integer nome) {
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
        if (preco <= 0) {
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