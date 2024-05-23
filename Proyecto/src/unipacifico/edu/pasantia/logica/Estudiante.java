
package unipacifico.edu.pasantia.logica;


public class Estudiante {
    
    private String codigo;
    private String nombre;
    private String semestre;
    private boolean activo;
    private boolean inactivo;
    private boolean nuevoEstado;
    
    private Estudiante () {}
    
    public Estudiante (String nombre) {
        this.nombre = nombre;
        
    }
    public Estudiante(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
                  
    }
    public void setCodigo(String nuevoCodigo) {
     this.codigo  = nuevoCodigo;
    }
    public void setNombre (String nuevoNombre) { 
    this.nombre = nuevoNombre;
}
     public void setSemestre(String nuevoSemestre) {
    this.semestre = nuevoSemestre;
    
}
     public void SetActivo(boolean nuevoEstado) {
         this.activo = nuevoEstado;
     }
     
     public void SetInactivo(boolean NuevoEstado) {
         this.inactivo = nuevoEstado;
          }
     public String getCodigo() {
         return this.codigo;
     }
     
     public String getNombre () {
         return this.nombre;
         
     }
     public String getSemtre () {
         return this.semestre;
     }
     
     public boolean getActivo () {
         return this.activo;
     }
     public boolean getInactivo () {
         return this.inactivo;
     }

   
    
    
}
