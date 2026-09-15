package correct.pedidos;

public class NotificadorEmail implements Notificador {

    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("[NotificadorEmail] Enviando a " + destinatario + ": " + mensaje);
    }
}
