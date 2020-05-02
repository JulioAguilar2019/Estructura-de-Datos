package entidades;

import java.util.ArrayList;

public class Venta {

    private String id;
    private String cliente;
    private double total;
    private ArrayList<Producto> Producto;

    public Venta(String id, String cliente, double total, ArrayList<Producto> Producto) {
        this.id = id;
        this.cliente = cliente;
        this.total = total;
        this.Producto = Producto;
    }

    public Venta() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public ArrayList<Producto> getProducto() {
        return Producto;
    }

    public void setProducto(ArrayList<Producto> Producto) {
        this.Producto = Producto;
    }
}
