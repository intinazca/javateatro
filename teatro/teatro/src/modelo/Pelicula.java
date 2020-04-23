/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author wedin
 */
public class Pelicula {
    
    private int idPelicula;
    String nombrep, duracion, fechaEstrenop,fotopelicula;
    int idPaisf, idClasificacionf; 

    public Pelicula(String nombrep, String duracion, String fechaEstrenop, String fotopelicula, int idPaisf, int idClasificacionf) {
        this.nombrep = nombrep;
        this.duracion = duracion;
        this.fechaEstrenop = fechaEstrenop;
        this.fotopelicula = fotopelicula;
        this.idPaisf = idPaisf;
        this.idClasificacionf = idClasificacionf;
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getNombrep() {
        return nombrep;
    }

    public void setNombrep(String nombrep) {
        this.nombrep = nombrep;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getFechaEstrenop() {
        return fechaEstrenop;
    }

    public void setFechaEstrenop(String fechaEstrenop) {
        this.fechaEstrenop = fechaEstrenop;
    }

    public String getFotopelicula() {
        return fotopelicula;
    }

    public void setFotopelicula(String fotopelicula) {
        this.fotopelicula = fotopelicula;
    }

    public int getIdPaisf() {
        return idPaisf;
    }

    public void setIdPaisf(int idPaisf) {
        this.idPaisf = idPaisf;
    }

    public int getIdClasificacionf() {
        return idClasificacionf;
    }

    public void setIdClasificacionf(int idClasificacionf) {
        this.idClasificacionf = idClasificacionf;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "idPelicula=" + idPelicula + ", nombrep=" + nombrep + ", duracion=" + duracion + ", fechaEstrenop=" + fechaEstrenop + ", fotopelicula=" + fotopelicula + ", idPaisf=" + idPaisf + ", idClasificacionf=" + idClasificacionf + '}';
    }
    
    
}
