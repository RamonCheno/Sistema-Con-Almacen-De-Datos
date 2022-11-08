/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaTiendaVideoJuegos.Model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Ramon Cheno Ocaño
 */
public class Productos {
    private int idVideojuego, ideEmpresaDev, idEmpresaEditor, numVentas;
    private String nombreVideojuego, plataforma, generoVideojuego, empresaDev, empresaEditor;
    private Date fechaLanzamiento;

    public int getIdVideojuego() {
        return idVideojuego;
    }

    public void setIdVideojuego(int idVideojuego) {
        this.idVideojuego = idVideojuego;
    }

    public int getIdeEmpresaDev() {
        return ideEmpresaDev;
    }

    public void setIdeEmpresaDev(int ideEmpresaDev) {
        this.ideEmpresaDev = ideEmpresaDev;
    }

    public int getIdEmpresaEditor() {
        return idEmpresaEditor;
    }

    public void setIdEmpresaEditor(int idEmpresaEditor) {
        this.idEmpresaEditor = idEmpresaEditor;
    }

    public int getNumVentas() {
        return numVentas;
    }

    public void setNumVentas(int numVentas) {
        this.numVentas = numVentas;
    }

    public String getNombreVideojuego() {
        return nombreVideojuego;
    }

    public void setNombreVideojuego(String nombreVideojuego) {
        this.nombreVideojuego = nombreVideojuego;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getGeneroVideojuego() {
        return generoVideojuego;
    }

    public void setGeneroVideojuego(String generoVideojuego) {
        this.generoVideojuego = generoVideojuego;
    }

    public String getEmpresaDev() {
        return empresaDev;
    }

    public void setEmpresaDev(String empresaDev) {
        this.empresaDev = empresaDev;
    }

    public String getEmpresaEditor() {
        return empresaEditor;
    }

    public void setEmpresaEditor(String empresaEditor) {
        this.empresaEditor = empresaEditor;
    }

    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(Date fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    
    
}