package br.edu.ifpb.ads.padroes.atv2.visitors;

import br.edu.ifpb.ads.padroes.atv2.itens.ProdutoFisico;
import br.edu.ifpb.ads.padroes.atv2.itens.Servico;

public class VisitorImpressao implements Visitor{

    @Override
    public void visitarProdutoFisico(ProdutoFisico produto) {
        System.out.println(
                "Produto Físico: "
                        + produto.getNome()
                        + " | Valor: "
                        + produto.getValor()
        );
    }

    @Override
    public void visitarServico(Servico servico) {
        System.out.println(
                "Serviço: "
                        + servico.getDescricao()
                        + " | Valor: "
                        + servico.getValor()
        );
    }
}
