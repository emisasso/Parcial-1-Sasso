package ProductosOficina;

public class Impresoras extends ProductosInformaticos implements Ofertas{
    private int impresionesPorMinuto;

    public Impresoras() {
    }

    public Impresoras(Integer stock, String nombre, double precio, String nombreFabricante, int impresionesPorMinuto) {
        super(stock, nombre, precio, nombreFabricante);
        this.impresionesPorMinuto = impresionesPorMinuto;
    }

    public int getImpresionesPorMinuto() {
        return impresionesPorMinuto;
    }

    public void setImpresionesPorMinuto(int impresionesPorMinuto) {
        this.impresionesPorMinuto = impresionesPorMinuto;
    }

    @Override
    public String toString() {
        return "Impresoras{" +
                "impresionesPorMinuto=" + impresionesPorMinuto +
                " " + super.toString();
    }

    @Override
    public void prcioConDescuento(int descuento) {
        System.out.println("El precio de la impresora "+ getNombre() + " con descuento especial es "+(getPrecio()-(getPrecio()*descuento/100)));
    }
}
