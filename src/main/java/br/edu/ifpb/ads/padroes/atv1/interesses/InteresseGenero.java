package br.edu.ifpb.ads.padroes.atv1.interesses;

import br.edu.ifpb.ads.padroes.atv1.Disco;

public class InteresseGenero implements CriterioInteresse {

    private String genero;

    public InteresseGenero(String genero) {
        this.genero = genero.toLowerCase();
    }

    @Override
    public boolean corresponde(Disco disco) {
        return disco.getGenero()
                .toLowerCase()
                .contains(genero);
    }
}