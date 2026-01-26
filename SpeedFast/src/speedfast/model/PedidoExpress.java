package speedfast.model;

public class PedidoExpress extends Pedido {

    public PedidoExpress(int id, String direccion, double distanciaKm) {
        super(id, direccion, distanciaKm);
    }

    @Override
    public int calcularTiempoEntrega() {
        return 15;
    }

    @Override
    public void asignarRepartidor() {
        this.repartidor = "Repartidor Express";
    }
}

