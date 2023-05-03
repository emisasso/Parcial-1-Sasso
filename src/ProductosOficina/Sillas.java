package ProductosOficina;

public class Sillas extends Empresa implements Ofertas{
    private boolean tieneRuedas;

    public Sillas() {
    }

    public Sillas(Integer stock, String nombre, double precio, boolean tieneRuedas) {
        super(stock, nombre, precio);
        this.tieneRuedas = tieneRuedas;
    }

    public boolean isTieneRuedas() {
        return tieneRuedas;
    }

    public void setTieneRuedas(boolean tieneRuedas) {
        this.tieneRuedas = tieneRuedas;
    }

    @Override
    public String toString() {
        return "Sillas{" +
                "tieneRuedas=" + tieneRuedas +
                " " + super.toString();
    }

    @Override
    public void prcioConDescuento(int descuento) {
        System.out.println("El precio de la Silla " + getNombre() + " con descuento especial es "+(getPrecio()-(getPrecio()*descuento/100)));
    }
}
