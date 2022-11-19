public class Billetera {
    
    //Construtor.
    public Billetera(int cantidadMaximaConsumo, int costos){
        this.setCantidadMaximaConsumo(cantidadMaximaConsumo);
        this.setCostos(costos);
    }
    
    //Atributos.
    private int cantidadMaximaConsumo;
    private int costos;

    //Getters y setters.
    public int getCantidadMaximaConsumo() {
        return cantidadMaximaConsumo;
    }

    public void setCantidadMaximaConsumo(int cantidadMaximaConsumo) {
        this.cantidadMaximaConsumo = cantidadMaximaConsumo;
    }

    public int getCostos() {
        return costos;
    }

    public void setCostos(int costos) {
        this.costos = costos;
    }
}
