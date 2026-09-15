package correct;

import com.google.inject.Guice;
import com.google.inject.Injector;
import correct.inventarios.Producto;
import correct.pedidos.Pedido;
import correct.pedidos.PedidoService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new PedidosModule());
        PedidoService pedidoService = injector.getInstance(PedidoService.class);

        Producto laptop = new Producto("Laptop", 5, 1200.0);
        Pedido pedido = new Pedido(1001, laptop, 2, "cliente@correo.com");

        pedidoService.confirmar(pedido);
    }
}
