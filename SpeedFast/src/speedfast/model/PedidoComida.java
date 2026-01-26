package speedfast.model;

public class PedidoComida extends Pedido {

    public PedidoComida(int id, String direccion, double distanciaKm) {
        super(id, direccion, distanciaKm);
    }

    @Override
    public int calcularTiempoEntrega() {
        return 20 + (int) (distanciaKm * 2);
    }

    @Override
    public void asignarRepartidor() {
        this.repartidor = "Luis Díaz";
    }
}

