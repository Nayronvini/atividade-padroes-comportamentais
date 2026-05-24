package br.edu.ifpb.ads.padroes.atv1;

import br.edu.ifpb.ads.padroes.atv1.notifications.*;

public class Main {
    public static void main(String[] args) {
        RepositorioDiscos repositorio = new RepositorioDiscos();

        Notificador email = new NotificadorEmail();
        Notificador sms = new NotificadorSMS();

        Interessado joao = new AssinanteDisco("Guns N' Roses", TipoInteresse.ARTISTA, sms);
        // João quer ser notificado de qualquer coisa do Guns N' Roses por SMS
        Interessado maria = new AssinanteDisco("Rock", TipoInteresse.GENERO, email);
        // Maria quer ser notificada de discos de Rock por Email

        repositorio.registrarInteressado(joao);
        repositorio.registrarInteressado(maria);

        System.out.println("--- Adicionando primeiro disco (Rock - Guns N' Roses) ---");
        // Deve notificar o João (SMS) e a Maria (Email)
        Disco disco1 = new Disco("Guns N' Roses", "Appetite For Destruction", "Rock", 1982);
        repositorio.addDisco(disco1);

        System.out.println("\n--- Adicionando segundo disco (Pop - Michael Jackson) ---");
        // Não deve notificar ninguém (não bate com os critérios)
        Disco disco2 = new Disco("Michael Jackson", "Thriller", "Pop", 1982);
        repositorio.addDisco(disco2);

        System.out.println("\n--- Adicionando terceiro disco (Rock - AC/DC) ---");
        // Deve notificar apenas a Maria (Email), pois o artista não é Guns N' Roses
        Disco disco3 = new Disco("AC/DC", "Back in Black", "Rock", 1980);
        repositorio.addDisco(disco3);
    }
}