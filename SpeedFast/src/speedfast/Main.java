package speedfast;

import speedfast.controller.ControladorEnvios;
import speedfast.model.Pedido;
import speedfast.model.PedidoComida;
import speedfast.model.PedidoExpress;

public class Main {

    public static void main(String[] args) {

        ControladorEnvios controlador = new ControladorEnvios();

        System.out.println("[Pedido Comida]");
        Pedido pedido1 = new PedidoComida(101, "Av. Central 123", 5);
        pedido1.asignarRepartidor();
        pedido1.mostrarResumen();
        System.out.println("Tiempo estimado: " +
                pedido1.calcularTiempoEntrega() + " minutos");
        controlador.despachar();
        controlador.registrarEntrega(pedido1);

        System.out.println();

        System.out.println("[Pedido Encomienda]");
        Pedido pedido2 = new PedidoComida(105, "Av. San Martin", 10);
        pedido2.asignarRepartidor("Daniela Tapia");
        pedido2.mostrarResumen();
        System.out.println("Tiempo estimado: " +
                pedido2.calcularTiempoEntrega() + " minutos");
        controlador.despachar();
        controlador.registrarEntrega(pedido2);

        System.out.println();

        System.out.println("Cancelando Pedido Express #105...");
        Pedido pedido3 = new PedidoExpress(103, "Calle Express 999", 2);
        controlador.cancelar();

        System.out.println();
        controlador.verHistorial();
    }
}

