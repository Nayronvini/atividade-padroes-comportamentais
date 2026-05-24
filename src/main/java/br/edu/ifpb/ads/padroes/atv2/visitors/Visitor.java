package br.edu.ifpb.ads.padroes.atv2.visitors;

import br.edu.ifpb.ads.padroes.atv2.itens.ProdutoFisico;
import br.edu.ifpb.ads.padroes.atv2.itens.Servico;

public interface Visitor {
    void visitarProdutoFisico(ProdutoFisico produto);

    void visitarServico(Servico servico);
}
