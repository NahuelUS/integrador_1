/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaderestaurante;

/**
 *
 * @author nahue
 */
public abstract class Plato {
    private String nombre;
    private double precioBase;
    private CategoriaComida categoria;
    
    public Plato (){
        this("Nahuel", 10000, CategoriaComida.PRINCIPAL);
    }

    public Plato(String nombre, double precioBase, CategoriaComida categoria) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.categoria = categoria;
    }
    
    public abstract double calcularPrecio();

    public String getNombre() {
        return nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public CategoriaComida getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "Plato{" + "nombre= " + nombre + ", precioBase= " + precioBase + ", categoria= " + categoria + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
