package wrong;

import wrong.inventarios.Producto;
import wrong.pedidos.Pedido;

public class Main {
    public static void main(String[] args) {
        Producto laptop = new Producto("Laptop", 5, 1200.0);
        Pedido pedido = new Pedido(1001, laptop, 2, "cliente@correo.com");
        pedido.confirmar();
    }
}
