package br.edu.ifpb.ads.padroes.atv2;

import java.util.List;
import java.util.ArrayList;
import br.edu.ifpb.ads.padroes.atv2.itens.*;
import br.edu.ifpb.ads.padroes.atv2.visitors.*;


public class Main {

    public static void main(String[] args) {

        List<Item> itens = new ArrayList<>();
        Visitor visitorImposto = new VisitorImposto();
        Visitor visitorImpressao = new VisitorImpressao();

        itens.add(new ProdutoFisico("Notebook", 3000.0));
        itens.add(new ProdutoFisico("Mouse", 150.0));

        itens.add(new Servico("Manutenção", 500.0));
        itens.add(new Servico("Consultoria", 1200.0));

        System.out.println("--- RELATÓRIO DE IMPOSTOS ---");

        for (Item item : itens) {
            item.accept(visitorImposto);
        }

        System.out.println();

        System.out.println("--- IMPRESSÃO DOS ITENS ---");

        for (Item item : itens) {
            item.accept(visitorImpressao);
        }
    }
}
