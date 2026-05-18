/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaderestaurante;

/**
 *
 * @author nahue
 */
public class Bebida extends Plato{
    private boolean esAlcoholica;

    public Bebida(String nombre, double precioBase, CategoriaComida categoria, boolean esAlcoholica) {
        super(nombre, precioBase, categoria);
        this.esAlcoholica = esAlcoholica;
    }
    
    @Override
    public double calcularPrecio(){
        if (this.esAlcoholica){
            return (super.getPrecioBase() * 0.2) + super.getPrecioBase();
        } else{
            return super.getPrecioBase();
        }
    }

    @Override
    public String toString() {
        return "Bebida: " + getNombre() + " Precio: " + getPrecioBase() + " Categoria: " + getCategoria() + " Tiene alcohol?: " + this.esAlcoholica;
    }
    
    
    
    
    
}
