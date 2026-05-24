package br.edu.ifpb.ads.padroes.atv1.interesses;

import br.edu.ifpb.ads.padroes.atv1.Disco;

public class InteresseTitulo implements CriterioInteresse {

    private String titulo;

    public InteresseTitulo(String titulo) {
        this.titulo = titulo.toLowerCase();
    }

    @Override
    public boolean corresponde(Disco disco) {
        return disco.getTitulo()
                .toLowerCase()
                .contains(titulo);
    }
}