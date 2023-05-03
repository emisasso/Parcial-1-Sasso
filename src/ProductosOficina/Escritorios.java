package ProductosOficina;

public class Escritorios extends Empresa{
    private int ancho;
    private int alto;

    public Escritorios() {
    }

    public Escritorios(Integer stock, String nombre, double precio, int ancho, int alto) {
        super(stock, nombre, precio);
        this.ancho = ancho;
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    @Override
    public String toString() {
        return "Escritorios{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                " " + super.toString();
    }
}
