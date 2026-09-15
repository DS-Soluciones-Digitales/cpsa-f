package correct;

import com.google.inject.AbstractModule;
import correct.inventarios.InventarioRepository;
import correct.inventarios.InventarioRepositoryImpl;
import correct.pedidos.Notificador;
import correct.pedidos.NotificadorEmail;

public class PedidosModule extends AbstractModule {

    @Override
    protected void configure() {
        // ✅ Aquí se decide, en un solo lugar, qué implementación concreta
        // se entrega para cada abstracción. Cambiar NotificadorEmail por
        // NotificadorSms, por ejemplo, no requiere tocar PedidoService.
        bind(InventarioRepository.class).to(InventarioRepositoryImpl.class);
        bind(Notificador.class).to(NotificadorEmail.class);
    }
}
