package wrong.pedidos;

public class NotificadorEmail {

    public void enviar(String destinatario, String mensaje) {
        System.out.println("[NotificadorEmail] Enviando a " + destinatario + ": " + mensaje);
    }
}
