package ProductosOficina;

public class Notebooks extends ProductosInformaticos{
    private int memoriaEnGb;

    public Notebooks() {
    }

    public Notebooks(Integer stock, String nombre, double precio, String nombreFabricante, int memoriaEnGb) {
        super(stock, nombre, precio, nombreFabricante);
        this.memoriaEnGb = memoriaEnGb;
    }



    public int getMemoriaEnGb() {
        return memoriaEnGb;
    }

    public void setMemoriaEnGb(int memoriaEnGb) {
        this.memoriaEnGb = memoriaEnGb;
    }

    @Override
    public String toString() {
        return "Notebooks{" +
                "memoriaEnGb=" + memoriaEnGb +
                " " + super.toString();
    }
}
