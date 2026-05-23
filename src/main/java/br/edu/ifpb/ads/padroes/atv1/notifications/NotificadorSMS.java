package br.edu.ifpb.ads.padroes.atv1;

public class NotificadorSMS implements Notificador {

    @Override
    public void notificar(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }

}