package br.edu.ifpb.ads.padroes.atv1.interessados;

import br.edu.ifpb.ads.padroes.atv1.Disco;
import br.edu.ifpb.ads.padroes.atv1.interesses.CriterioInteresse;
import br.edu.ifpb.ads.padroes.atv1.notificacoes.Notificador;

public class AssinanteDisco implements Interessado {

    private CriterioInteresse criterio;
    private Notificador notificador;

    public AssinanteDisco(
            CriterioInteresse criterio,
            Notificador notificador
    ) {
        this.criterio = criterio;
        this.notificador = notificador;
    }

    @Override
    public void atualizar(Disco disco) {

        if (criterio.corresponde(disco)) {

            String mensagem =
                    "Novo disco adicionado! "
                            + disco.getTitulo()
                            + " - "
                            + disco.getArtista();

            notificador.notificar(mensagem);
        }
    }
}