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
public class Restaurante {
    private String nombre;
    private ArrayList<Plato> platosDisponibles;
    private ArrayList<Cliente> clientes;
    private ArrayList<Pedido> pedidos;
    
    public Restaurante (){
        this.platosDisponibles = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }
    
    public Restaurante (String nombre){
        this();
        this.nombre = nombre;
    }
    
    public void agregarPlato (Plato plato){
        this.platosDisponibles.add(plato);
    }
    
    public void agregarCliente (Cliente cliente){
        this.clientes.add(cliente);
    }
    
    public void registrarPedido (Pedido pedido){
        this.pedidos.add(pedido);
    }
    
    public Cliente buscarClientesPorNombre(String nombre){
        for (Cliente c : this.clientes){
            if (c.getNombre().equals(nombre)){
                return c;
            }
        }
        return null;
    }
    
    public void listarPedidos(){
        for (Pedido p : this.pedidos){
            System.out.println("\n" + p);
        }
    }
    
    public double calcularRecaudacionTotal(){
        double sum = 0;
        for (Pedido p : this.pedidos){
            if (p.isConfirmado()){
                sum += p.calcularTotal();
            }
        }
        return sum;
    }
    
    @Override
    public String toString() {
        StringBuilder info = new StringBuilder();
        
        info.append("=== RESTAURANTE: ").append(this.nombre).append(" ===\n");
        info.append("Cantidad de Platos en el Menú: ").append(this.platosDisponibles.size()).append("\n");
        info.append("Clientes Registrados: ").append(this.clientes.size()).append("\n");
        info.append("Pedidos Realizados: ").append(this.pedidos.size()).append("\n");
        info.append("Recaudación Total: $").append(this.calcularRecaudacionTotal()).append("\n");
        info.append("===================================");
        
        return info.toString();
    }
    
    
    
    
    
    
    
    
    
}
