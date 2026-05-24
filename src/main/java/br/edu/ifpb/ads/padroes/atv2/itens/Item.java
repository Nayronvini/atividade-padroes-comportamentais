package br.edu.ifpb.ads.padroes.atv2.itens;

import br.edu.ifpb.ads.padroes.atv2.visitors.Visitor;

public interface Item {
    void accept(Visitor visitor);

    double getValor();
}
