package correct.pedidos;

// ✅ Abstracción de la que depende PedidoService, en lugar de una clase
// concreta como NotificadorEmail. Permite cambiar el canal de notificación
// (email, SMS, push...) sin tocar PedidoService.
public interface Notificador {

    void enviar(String destinatario, String mensaje);
}
