package ProductosOficina;

import java.awt.desktop.AboutEvent;
import java.util.ArrayList;

public class Empresa {
    private Integer stock;
    private String nombre;
    private double precio;

    public Empresa() {
    }

    public Empresa(Integer stock, String nombre, double precio) {
        this.stock = stock;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "stock=" + stock +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }


    public void diferencClasesProdLista(ArrayList<Empresa> lista) {
        for (Empresa prod : lista) {
            if (prod instanceof Sillas) {
                System.out.printf("Clase sillas ");
                System.out.println(prod.toString());
            } else if (prod instanceof Escritorios) {
                System.out.printf("Clase escritorios ");
                System.out.println(prod.toString());
            } else if (prod instanceof Impresoras) {
                System.out.printf("Clase impresoras ");
                System.out.println(prod.toString());
            } else if (prod instanceof Notebooks) {
                System.out.printf("Clase PracticaProdOficina.Notebooks ");
                System.out.println(prod.toString());
            }
        }
    }

    public void actualizarPrecios(ArrayList<Empresa> lista){
        for(Empresa prod : lista){
            if(prod instanceof Sillas){
                System.out.println("Precio anterior de Silla "+ prod.getNombre() +" "+ prod.getPrecio());
                prod.setPrecio(prod.getPrecio()+(prod.getPrecio() * 0.05));
                System.out.println("Precio actualizado de Silla "+ prod.getNombre() +" "+ prod.precio);
            } else if (prod instanceof Escritorios) {
                System.out.println("Precio anterior de Escritorio "+ prod.getNombre() +" "+ prod.getPrecio());
                prod.setPrecio(prod.getPrecio()+(prod.getPrecio() * 0.1));
                System.out.println("Precio actualizado de Escritorio "+ prod.getNombre() +" "+ prod.getPrecio());
            }else if(prod instanceof Impresoras){
                System.out.println("Precio anterior de Impresora "+ prod.getNombre() +" "+ prod.getPrecio());
                prod.setPrecio(prod.getPrecio()+(prod.getPrecio() * 0.15));
                System.out.println("Precio actualizado de Impresora "+ prod.getNombre() +" "+ prod.getPrecio());
            }else if(prod instanceof Notebooks){
                System.out.println("Precio anterior de Notebook "+ prod.getNombre() +" "+ prod.getPrecio());
                prod.setPrecio(prod.getPrecio()+(prod.getPrecio() * 0.2));
                System.out.println("Precio actualizado de Notebook "+ prod.getNombre() +" "+ prod.getPrecio());
            }
        }
    }
}
