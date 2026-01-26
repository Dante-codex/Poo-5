package speedfast.model;

public class PedidoEncomienda extends Pedido {

    public PedidoEncomienda(int id, String direccion, double distanciaKm) {
        super(id, direccion, distanciaKm);
    }

    @Override
    public int calcularTiempoEntrega() {
        return 25 + (int) (distanciaKm * 1.5);
    }

    @Override
    public void asignarRepartidor() {
        this.repartidor = "Daniela Tapia";
    }
}

