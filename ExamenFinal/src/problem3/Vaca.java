package problem3;

public class Vaca {
    private int peso;
    private int produccion;

    Vaca(int peso, int produccion){
        this.peso = peso;
        this.produccion = produccion;
    }



    public int getPeso() {
        return peso;
    }

    public int getProduccion() {
        return produccion;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setProduccion(int produccion) {
        this.produccion = produccion;
    }
}
