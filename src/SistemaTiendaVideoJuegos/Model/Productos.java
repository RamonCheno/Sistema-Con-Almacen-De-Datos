/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaTiendaVideoJuegos.Model;

import java.util.Date;

/**
 *
 * @author Ramon Cheno Ocaño
 */
public class Productos {
    String nombre, descripcion, generoVideogame;
    Date fechaLanzamiento;
    int desarrollador, distribuidor, ventas;

    public Productos(String nombre, String descripcion, String generoVideogame, 
            Date fechaLanzamiento, int desarrollador, int distribuidor, 
            int ventas) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.generoVideogame = generoVideogame;
        this.fechaLanzamiento = fechaLanzamiento;
        this.desarrollador = desarrollador;
        this.distribuidor = distribuidor;
        this.ventas = ventas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getGeneroVideogame() {
        return generoVideogame;
    }

    public void setGeneroVideogame(String generoVideogame) {
        this.generoVideogame = generoVideogame;
    }

    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(Date fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public int getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(int desarrollador) {
        this.desarrollador = desarrollador;
    }

    public int getDistribuidor() {
        return distribuidor;
    }

    public void setDistribuidor(int distribuidor) {
        this.distribuidor = distribuidor;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }
    
    
    
}
