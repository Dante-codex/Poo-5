package speedfast.controller;

import speedfast.interfaces.Cancelable;
import speedfast.interfaces.Despachable;
import speedfast.interfaces.Rastreable;
import speedfast.model.Pedido;

import java.util.ArrayList;

public class ControladorEnvios implements Despachable, Cancelable, Rastreable {

    private ArrayList<String> historial = new ArrayList<>();

    public void registrarEntrega(Pedido pedido) {
        historial.add(
                pedido.getClass().getSimpleName() +
                        " #" + pedido.getId() +
                        " – entregado por " + pedido.getRepartidor()
        );
    }

    @Override
    public void despachar() {
        System.out.println("Pedido despachado correctamente.");
    }

    @Override
    public void cancelar() {
        System.out.println("→ Pedido cancelado exitosamente.");
    }

    @Override
    public void verHistorial() {
        System.out.println("Historial:");
        for (String h : historial) {
            System.out.println("- " + h);
        }
    }
}
