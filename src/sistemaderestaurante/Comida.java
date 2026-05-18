/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaderestaurante;

/**
 *
 * @author nahue
 */
public class Comida extends Plato {
    private boolean tieneGuarnicion;

    public Comida(String nombre, double precioBase, CategoriaComida categoria, boolean tieneGuarnicion) {
        super(nombre, precioBase, categoria);
        this.tieneGuarnicion = tieneGuarnicion;
    }
    
    @Override
    public double calcularPrecio(){
        if (tieneGuarnicion){
            return (super.getPrecioBase() * 0.1) + super.getPrecioBase();
        } else {
            return super.getPrecioBase();
        }
    }

    @Override
    public String toString() {
        return "Comida: " + getNombre() + " Precio: " + getPrecioBase() + " Categoria: " + getCategoria() + " Tiene guarnicion?: " + this.tieneGuarnicion;
    }
    
    
    
    
    
}
