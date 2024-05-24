
package unipacifico.edu.pasantia.presentacion;


import java.io.IOException;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import unipacifico.edu.pasantia.persistencia.PasantiaDAO;
import unipacifico.edu.pasantia.logica.Pasantia;

public class gestionPasantias extends javax.swing.JFrame {

    

    
    public gestionPasantias() {
        initComponents();
        listaPasantia = new ArrayList<Pasantia>();
        guardarPasantia();
        pintarTabla();
        tablaPasantia.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent lse) {
               tablaSeleccionFila(lse);
           }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoNombreEmpresa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campoFechainicio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campoFechafinalizacion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        campoNumeroPasantes = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        campoNumeroConvenioMacro = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        campoDescripcion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        campoEstado = new javax.swing.JTextField();
        botonRegistroPasantia = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonInactivar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPasantia = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setForeground(new java.awt.Color(51, 51, 255));

        jLabel1.setText("Gestion Pasantias");

        jLabel2.setText("Codigo");

        campoCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCodigoActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre Empresa");

        campoNombreEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNombreEmpresaActionPerformed(evt);
            }
        });

        jLabel4.setText("Fecha Inicio");

        jLabel5.setText("Feha Finalizacion");

        campoFechafinalizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoFechafinalizacionActionPerformed(evt);
            }
        });

        jLabel6.setText("Numero Pasantes");

        campoNumeroPasantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNumeroPasantesActionPerformed(evt);
            }
        });

        jLabel7.setText("Descripcion");

        jLabel8.setText("Numero Convenio Macro");

        jLabel9.setText("Estado");

        campoEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEstadoActionPerformed(evt);
            }
        });

        botonRegistroPasantia.setText("Registrar");
        botonRegistroPasantia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistroPasantiaActionPerformed(evt);
            }
        });

        botonModificar.setText("Modificar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        botonInactivar.setText("Inactivar");

        tablaPasantia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre Empresa", "Fecha Inicio", "Fecha Finalizacion", "Numero Convenio", "Descripcion", "Numero Pasantes", "Estado"
            }
        ));
        jScrollPane1.setViewportView(tablaPasantia);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(botonRegistroPasantia)
                        .addGap(80, 80, 80)
                        .addComponent(botonModificar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(campoDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(campoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoNombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoFechainicio, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(campoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(49, 49, 49)
                                .addComponent(campoNumeroConvenioMacro, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(22, 22, 22)
                                        .addComponent(campoFechafinalizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(botonInactivar)
                                            .addComponent(campoNumeroPasantes, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(1, 1, 1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(campoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoNombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoNumeroConvenioMacro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campoFechainicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(campoFechafinalizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(campoDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(campoNumeroPasantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonRegistroPasantia)
                    .addComponent(botonModificar)
                    .addComponent(botonInactivar))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(257, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void botonRegistroPasantiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistroPasantiaActionPerformed
     String codigoP = campoCodigo.getText(); 
     String nombreP = campoNombreEmpresa.getText();
     String fechainicio = campoFechainicio.getText();
     String fechafinalizacion = campoFechafinalizacion.getText();
     String descripcion = campoDescripcion.getText();
     String estado = campoEstado.getText();
     String numeroPasantes= campoNumeroPasantes.getText();
     String numeroConvenioMacro= campoNumeroConvenioMacro.getText();
     
     Pasantia pas = new Pasantia(codigo, nombreEmpresa, fechainicio, fechafinalizacion, descripcion, estado, numeroPasantes, numeroConvenioMacro);
     listaPasantia.add(pas);
     try{
       PasantiaDAO dao = new PasantiaDAO();
       dao.guardar(listaPasantia);
     
       catch(IOExcepcion error){
           JOptionPane.showMessageDialog(null,"no se pudo almacenar pasante");
               }
       pintarTabla();
     }  catch (IOException ex) {  
            
        }  
     
    }//GEN-LAST:event_botonRegistroPasantiaActionPerformed

    private void campoCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCodigoActionPerformed

    private void campoNombreEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNombreEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNombreEmpresaActionPerformed

    private void campoFechafinalizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoFechafinalizacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoFechafinalizacionActionPerformed

    private void campoNumeroPasantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNumeroPasantesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNumeroPasantesActionPerformed

    private void campoEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEstadoActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
         String codigo = campoCodigo.getText();
         String nombreEmpresa = campoNombreEmpresa.getText();
         String descripcion = campoDescripcion.getText();
         String fechaInicio = campoFechainicio.getText();
         String fechaFinalizacion = campoFechafinalizacion.getText();
         String numeroPasantes = campoNumeroPasantes.getText();
         String numeroConvenioMacro = campoNumeroConvenioMacro.getText();
         
         Pasantias pas = new Pasantias (codigo,nombreEmpresa, descripcion, fechaInicio, fechaFinalizacion, numeroPasantes, numeroConvenioMacro);
         if(filaSeleccionada !=-1){
      listaPasantia.remove(filaSeleccionada);
      listaPasantia.add(filaSeleccionada, pas);
      
      try{
       PasantiaDAO dao = new PasantiaDAO();
       dao.guardar(listaPasantia);
       pintarTabla();
      }
      catch(IOException error){
          System.out.println("Error al modificar");
      }
    }
         Pasantia past = new Pasantia
        (codigo,nombreEmpresa, descripcion, fechaInicio, fechaFinalizacion, numeroPasantes, numeroConvenioMacro);
       pintarTabla();
    }//GEN-LAST:event_botonModificarActionPerformed
    {
    }
     public void guardarPasantia(){
     try{
         PasantiaDAO dao = new PasantiaDAO();
         listaPasantia = dao.leer();
      }
      catch(IOException error){ error.printStackTrace();}
      catch(ClassNotFoundException errorTipo){errorTipo.printStackTrace();}
    }
     
     
     
      public void pintarTabla(){
      String tabla []=new String[]{"Codigo", "nombreEmpresa", "Descripcion", "Fechainicio","Fechafinalizacion"};
      int filas = listaPasantia.size();
      String[][]valores= new String[filas][7];
      int contador =0; 
     for (Pasantia Pasante: listaPasantia){
         valores[contador][0]=Pasante.getCodigoP();
         valores[contador][1]=Pasante.getNombreP();
         valores[contador][2]=Pasante.getDescripcion();
         valores[contador][3]=Pasante.getFechainicio();
         valores[contador][4]=Pasante.getFechaFinalizaion();
          valores[contador][5]=Pasante.getNumeroPasantes();
         valores[contador][6]=Pasante.getNumeroConvenioMacro();
        contador++; 
     }
     
          DefaultTableModel modeloTabla= new DefaultTableModel(valores,tabla);
        
        tablaPasantia.setModel(modeloTabla);
       
            
}
      
      private void tablaSeleccionFila(ListSelectionEvent e){
    if (!e.getValueIsAdjusting()) {
                    int selectedRow = tablaPasantia.getSelectedRow();
                    if (selectedRow != -1) {
                        filaSeleccionada = selectedRow;
                        
                        String nombreEmpresa = (String)tablaPasantia.getValueAt(selectedRow, 0);
                        String codigo = (String)tablaPasantia.getValueAt(selectedRow, 1);
                        String descripcion = (String)tablaPasantia.getValueAt(selectedRow, 2);
                        String fechainicio = (String)tablaPasantia.getValueAt(selectedRow, 3);
                        String fechafinalizacion = (String)tablaPasantia.getValueAt(selectedRow, 4);
 pasanteSeleccionado = Pasasantia
        (codigo, nombreEmpresa, descripcion, fechainicio, fechafinalizacion );
 campoCodigo.setText(pasanteSeleccionado.getCodigoP());
 campoNombreEmpresa.setText(pasanteSeleccionado.getNombreP());
 campoDescripcion.setText(pasanteSeleccionado.getDescripcion());
 campoFechainicio.setText(pasanteSeleccionado.getFechainicio());
 campoFechafinalizacion.setText(pasanteSeleccionado.getFechaFinalizaion());
                      
                            }
    

        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonInactivar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonRegistroPasantia;
    private javax.swing.JTextField campoCodigo;
    private javax.swing.JTextField campoDescripcion;
    private javax.swing.JTextField campoEstado;
    private javax.swing.JTextField campoFechafinalizacion;
    private javax.swing.JTextField campoFechainicio;
    private javax.swing.JTextField campoNombreEmpresa;
    private javax.swing.JTextField campoNumeroConvenioMacro;
    private javax.swing.JTextField campoNumeroPasantes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPasantia;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Pasantia> listaPasantia;
    private Pasantia pasanteSeleccionado;
    private int filaSeleccionada= -1;

   
    
