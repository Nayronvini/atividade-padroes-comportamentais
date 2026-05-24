package br.edu.ifpb.ads.padroes.atv2.itens;

import br.edu.ifpb.ads.padroes.atv2.visitors.Visitor;

public class ProdutoFisico implements Item {

    private String nome;
    private double valor;

    public ProdutoFisico(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitarProdutoFisico(this);
    }

    @Override
    public double getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }
}
