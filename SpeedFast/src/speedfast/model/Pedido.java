package speedfast.model;

public abstract class Pedido {

    protected int id;
    protected String direccion;
    protected double distanciaKm;
    protected String repartidor;

    public Pedido(int id, String direccion, double distanciaKm) {
        this.id = id;
        this.direccion = direccion;
        this.distanciaKm = distanciaKm;
    }

    public int getId() {
        return id;
    }

    public String getRepartidor() {
        return repartidor;
    }

    public void mostrarResumen() {
        System.out.println("Pedido #" + id);
        System.out.println("Dirección: " + direccion);
        System.out.println("Distancia: " + distanciaKm + " km");
        System.out.println("Repartidor asignado: " + repartidor);
    }

    public abstract int calcularTiempoEntrega();

    public void asignarRepartidor(String nombre) {
        this.repartidor = nombre;
    }

    public abstract void asignarRepartidor();
}
