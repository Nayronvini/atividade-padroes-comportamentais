package br.edu.ifpb.ads.padroes.atv1.interesses;

import br.edu.ifpb.ads.padroes.atv1.Disco;

public class InteresseArtista implements CriterioInteresse {

    private String artista;

    public InteresseArtista(String artista) {
        this.artista = artista.toLowerCase();
    }

    @Override
    public boolean corresponde(Disco disco) {
        return disco.getArtista()
                .toLowerCase()
                .contains(artista);
    }
}