
package unipacifico.edu.pasantia.logica;

import java.io.Serializable;


public class Pasantia implements Serializable{
    
    private String codigo;
    private String nombre;
    private String fechainicio;
    private String fechafinalizaion;
    private String descripcion;
    private String numeroPasantes;
    private String numeroConvenioMacro;
    private boolean estado;

   

    public Pasantia(String codigoP, String nombreP, String fechainicio, String fechafinalizaion, String descripcion, String numeroPasantes, String numeroConvenioMacro, String numeroConvenioMacro1) {
        this.codigo = codigoP;
        this.nombre = nombreP;
        this.fechainicio = fechainicio;
        this.fechafinalizaion = fechafinalizaion;
        this.descripcion = descripcion;
        this.numeroPasantes = numeroPasantes;
        this.numeroConvenioMacro = numeroConvenioMacro;
    }

   

   
    public String getCodigoP() {
        return codigo;
    }

    public void setCodigoP(String codigoP) {
        this.codigo = codigoP;
    }

    public String getNombreP() {
        return nombre;
    }

    public void setNombreP(String nombreP) {
        this.nombre = nombreP;
    }

    public String getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(String fechainicio) {
        this.fechainicio = fechainicio;
    }

    public String getFechafinalizaion() {
        return fechafinalizaion;
    }

    public void setFechafinalizaion(String fechafinalizaion) {
        this.fechafinalizaion = fechafinalizaion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNumeroPasantes() {
        return numeroPasantes;
    }

    public void setNumeroPasantes(String numeroPasantes) {
        this.numeroPasantes = numeroPasantes;
    }

    public String getNumeroConvenioMacro() {
        return numeroConvenioMacro;
    }

    public void setNumeroConvenioMacro(String numeroConvenioMacro) {
        this.numeroConvenioMacro = numeroConvenioMacro;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

   
}