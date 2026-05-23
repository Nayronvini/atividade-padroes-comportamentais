package br.edu.ifpb.ads.padroes.atv1;

public class AssinanteDisco implements Interessado {
    private String termoDeInteresse;
    private TipoInteresse tipo;
    private Notificador notificador;

    public AssinanteDisco(String termoDeInteresse, TipoInteresse tipo, Notificador notificador) {
        this.termoDeInteresse = termoDeInteresse.toLowerCase();
        this.tipo = tipo;
        this.notificador = notificador;
    }

    @Override
    public void atualizar(Disco disco) {
        boolean match = false;

        switch (tipo) {
            case TITULO -> match = disco.getTitulo().toLowerCase().contains(termoDeInteresse);
            case ARTISTA -> match = disco.getArtista().toLowerCase().contains(termoDeInteresse);
            case GENERO -> match = disco.getGenero().toLowerCase().contains(termoDeInteresse);
        }

        if (match) {
            String mensagem = "Novo disco adicionado! " + disco.getTitulo() + " - " + disco.getArtista();
            notificador.notificar(mensagem);
        }
    }
}