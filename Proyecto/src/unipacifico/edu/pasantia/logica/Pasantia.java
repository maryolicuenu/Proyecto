
package unipacifico.edu.pasantia.logica;


public class Pasantia {
    
     private String codigoP;
    private String nombreP;
    private String fechainicio;
    private String fechaFinalizaion;
    private String descripcion;
    private boolean activo;
    private boolean inactivo;
    private boolean nuevoEstado;
    
public Pasantia (String nombrep) {
    this.nombreP = nombrep;
    }    
    
    public Pasantia (String codigop, String nombrep) {
        this.codigoP = codigop;
        this.nombreP = nombrep;        
    }
    public void setCodigop(String nuevoCodigop) {
        this.codigoP = nuevoCodigop;
    }
    public void setNombrep (String nuevoNombrep) {
        this.nombreP = nuevoNombrep;
    }
    
   public void setFechainicio(String nuevaFechainicio) {
       this.fechainicio = nuevaFechainicio;
   }
   
   public void setFechafinalizacion (String nuevaFechafinalizacion) {
       this.fechaFinalizaion = nuevaFechafinalizacion;
   }
   public void setDescripcion (String nuevadescripcion) {
       this.descripcion = nuevadescripcion;
   }
   public void setActivo (boolean nuevoEstado) {
       this.activo = nuevoEstado;
   }
   public void setInactivo (boolean nuevoEstado ) {
       this.inactivo = nuevoEstado;
   }
   public String getNombrep () {
        return this.nombreP;
   }
   public String getCodigoP () {
       return this.codigoP;
   }
   public String getFechainicio () {
       return this.fechainicio;
   }
   public String getFechafinalizacion () {
       return this.fechaFinalizaion;
   }
   public String getDescripcion () {
       return this.descripcion;
   }
   public boolean getActivo () {
       return this.activo;
   }
   public boolean getInactivo () {
       return this.inactivo;
       
   }
    
}
