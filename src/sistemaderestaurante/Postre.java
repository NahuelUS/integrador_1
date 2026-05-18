/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaderestaurante;

/**
 *
 * @author nahue
 */
public class Postre extends Plato {
    public boolean conHelado;

    public Postre(String nombre, double precioBase, CategoriaComida categoria, boolean conHelado) {
        super(nombre, precioBase, categoria);
        this.conHelado = conHelado;
    }
    
    @Override
    public double calcularPrecio(){
        if (this.conHelado){
            return (super.getPrecioBase() * 0.15) + super.getPrecioBase();
        } else{
            return super.getPrecioBase();
        }
    }

    @Override
    public String toString() {
        return "Postre: " + getNombre() + " Precio: " + getPrecioBase() + " Categoria: " + getCategoria() + " Tiene helado?: " + this.conHelado;
    }
    
    
    
    
    
}
