package br.edu.ifpb.ads.padroes.atv2.visitors;

import br.edu.ifpb.ads.padroes.atv2.itens.ProdutoFisico;
import br.edu.ifpb.ads.padroes.atv2.itens.Servico;

public class VisitorImposto implements Visitor{

    @Override
    public void visitarProdutoFisico(ProdutoFisico produto) {
        double imposto = produto.getValor() * 0.10;

        System.out.println(
                "Produto: " + produto.getNome()
                        + " | Imposto: " + imposto
        );
    }

    @Override
    public void visitarServico(Servico servico) {
        double imposto = servico.getValor() * 0.15;

        System.out.println(
                "Serviço: " + servico.getDescricao()
                        + " | Imposto: " + imposto
        );
    }
}
