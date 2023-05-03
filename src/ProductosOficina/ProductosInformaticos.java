package ProductosOficina;

public class ProductosInformaticos extends Empresa{
    private String nombreFabricante;

    public ProductosInformaticos() {
    }

    public ProductosInformaticos(Integer stock, String nombre, double precio, String nombreFabricante) {
        super(stock, nombre, precio);
        this.nombreFabricante = nombreFabricante;
    }

    public String getNombreFabricante() {
        return nombreFabricante;
    }

    public void setNombreFabricante(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }

    @Override
    public String toString() {
        return "nombreFabricante='" + nombreFabricante + '\'' +
                "} " + super.toString();
    }
}
