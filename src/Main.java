import ProductosOficina.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Empresa empresita = new Empresa();

        Sillas sillon = new Sillas(4, "Gamer", 45000, true);
        Escritorios escritorioL = new Escritorios(10 ,"Escritorio en L", 30000, 60, 200);
        Impresoras miImpresora = new Impresoras(10, "MiImpresora", 25000, "Sanyo", 20);
        Notebooks bangho = new Notebooks(6, "bagok", 125000, "Samsung", 10);


        ArrayList<Empresa> productos = new ArrayList<Empresa>();
        productos.add(sillon);
        productos.add(escritorioL);
        productos.add(miImpresora);
        productos.add(bangho);

        empresita.diferencClasesProdLista(productos);

        miImpresora.prcioConDescuento(20);
        sillon.prcioConDescuento(30);

        empresita.actualizarPrecios(productos);



    }
}