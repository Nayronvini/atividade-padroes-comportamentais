package br.edu.ifpb.ads.padroes.atv1;

public class NotificadorPush implements Notificador {

    @Override
    public void notificar(String mensagem) {
        System.out.println("Enviando PUSH NOTIFICATION: " + mensagem);
    }

}