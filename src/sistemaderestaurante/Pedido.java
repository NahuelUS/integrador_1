/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaderestaurante;

import java.util.ArrayList;

/**
 *
 * @author nahue
 */
public class Pedido implements Descontable, Entregable {
    private Cliente cliente;
    private ArrayList <Plato> platos;
    private MetodoEntrega metodoEntrega;
    private boolean confirmado;
    private double descuento;
    
    
    public Pedido (Cliente cliente, MetodoEntrega metodoEntrega){
        this(cliente, metodoEntrega, 0.0);
        this.platos = new ArrayList <>();
        this.confirmado = false;
    }
    public Pedido (Cliente cliente, MetodoEntrega metodoEntrega, double descuento){
        this.cliente = cliente;
        this.metodoEntrega = metodoEntrega;
        this.platos = new ArrayList <>();
        this.confirmado = false;
        this.descuento = descuento;
    }
    
    public void agregarPlato(Plato plato){
        this.platos.add(plato);
    }
    
    public void confirmar (){
        this.confirmado = true;
    }
    

    
    @Override
    public double aplicarDescuento(double porcentaje) {
        double subtotal = 0;
        for (Plato p : this.platos) {
            subtotal += p.calcularPrecio();
        }
    
        return subtotal - (subtotal * porcentaje); 
    }
    
    public double calcularTotal() {
        if (this.platos.size() > 2 && this.descuento > 0) {
            return aplicarDescuento(this.descuento); 
        } 
    
        double sum = 0;
        for (Plato p : this.platos) {
            sum += p.calcularPrecio();
        }
        return sum;
    }
    
    
    @Override
    public void entregar(){
        if (this.metodoEntrega == MetodoEntrega.DELIVERY){
            System.out.println("\nPedido en camino hacia: " + this.cliente);
        
        } else{
            System.out.println("\nPedido listo para servir en mesa.");
        }
    
    }

    @Override
    public String toString() {
        StringBuilder ticket = new StringBuilder();
        ticket.append("=== TICKET DE PEDIDO ===\n");
        ticket.append("Cliente: ").append(this.cliente).append("\n");
        ticket.append("Método de Entrega: ").append(this.metodoEntrega).append("\n");
        
        if (this.confirmado) {
            ticket.append("Estado: Confirmado\n");
        } else {
            ticket.append("Estado: Pendiente de confirmación\n");
        }
        
        ticket.append("Total a pagar: $").append(this.calcularTotal()).append("\n");
        ticket.append("Platos elegidos:\n");
        
        for (Plato p : this.platos) {
            ticket.append(" - ").append(p.getNombre()).append("\n");
        }
        
        return ticket.toString();
    }

    public boolean isConfirmado() {
        return confirmado;
    }
    
    
    
    
    
    
    
    
}
