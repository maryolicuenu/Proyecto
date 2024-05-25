package unipacifico.edu.pasantia.presentacion;

import static Gestion.pasantiaGestion.main;
import java.io.IOException;
import java.util.ArrayList;
import unipacifico.edu.pasantia.logica.Pasantia;
import unipacifico.edu.pasantia.persistencia.GestionDAO;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import unipacifico.edu.pasantia.logica.Pasantia;
import static unipacifico.edu.pasantia.presentacion.GestionConvenio.main;





public class GestionConvenio extends javax.swing.JFrame {

    /**
     * Creates new form gestionConvenio
     */
    public GestionConvenio() {
        initComponents();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CampoFechaFinalizacion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CampoNumConvenio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CampoFechaInicio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campoRepresentante = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        campoNombreEmpresa = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        campoArchivoConvenio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        campoCorreo = new javax.swing.JTextField();
        BotonRegistrar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        Inactivar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" 《Gestion Convenio》");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(247, 22, 120, 20);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Numero Convenio");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(45, 84, 85, 15);

        CampoFechaFinalizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoFechaFinalizacionActionPerformed(evt);
            }
        });
        getContentPane().add(CampoFechaFinalizacion);
        CampoFechaFinalizacion.setBounds(150, 80, 158, 19);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fecha Inicio");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(340, 120, 79, 15);
        getContentPane().add(CampoNumConvenio);
        CampoNumConvenio.setBounds(420, 120, 158, 19);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha Finalizacion");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 120, 89, 15);
        getContentPane().add(CampoFechaInicio);
        CampoFechaInicio.setBounds(150, 120, 158, 19);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre Empresa");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 160, 103, 15);

        campoRepresentante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoRepresentanteActionPerformed(evt);
            }
        });
        getContentPane().add(campoRepresentante);
        campoRepresentante.setBounds(150, 160, 158, 19);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Correo");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 200, 33, 15);

        campoNombreEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNombreEmpresaActionPerformed(evt);
            }
        });
        getContentPane().add(campoNombreEmpresa);
        campoNombreEmpresa.setBounds(150, 200, 158, 19);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Representante");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(340, 80, 71, 15);

        campoArchivoConvenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoArchivoConvenioActionPerformed(evt);
            }
        });
        getContentPane().add(campoArchivoConvenio);
        campoArchivoConvenio.setBounds(420, 80, 158, 19);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Archivo Convenio");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(320, 160, 86, 15);

        campoCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCorreoActionPerformed(evt);
            }
        });
        getContentPane().add(campoCorreo);
        campoCorreo.setBounds(420, 160, 158, 19);

        BotonRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        BotonRegistrar.setText("Registrar");
        BotonRegistrar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 255, 255), new java.awt.Color(0, 255, 255)));
        BotonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonRegistrar);
        BotonRegistrar.setBounds(90, 240, 100, 30);

        Modificar.setForeground(new java.awt.Color(255, 255, 255));
        Modificar.setText("Modificar");
        Modificar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255)));
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        getContentPane().add(Modificar);
        Modificar.setBounds(260, 240, 95, 30);

        Inactivar.setForeground(new java.awt.Color(255, 255, 255));
        Inactivar.setText("Inactivar");
        Inactivar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255)));
        getContentPane().add(Inactivar);
        Inactivar.setBounds(430, 240, 95, 30);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(63, 290, 520, 403);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoFechaFinalizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoFechaFinalizacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoFechaFinalizacionActionPerformed

    private void campoNombreEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNombreEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNombreEmpresaActionPerformed

    private void campoArchivoConvenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoArchivoConvenioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoArchivoConvenioActionPerformed

    private void campoCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCorreoActionPerformed

      public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestionConvenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionConvenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionConvenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionConvenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionConvenio().setVisible(true);
            }
        });
    }
    
    
    private void BotonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarActionPerformed
     String numeroConvenio = CampoNumConvenio.getText(); 
     String nombreEmpresa = campoNombreEmpresa.getText();
     String fechaInicio = CampoFechaInicio.getText();
     String fechafinalizacion = CampoFechaFinalizacion.getText();
     String correo = campoCorreo.getText();
     String Representante = campoRepresentante.getText();
     
     ConvenioMacro marc = new Convenio (numConvenio, nombreEmpresa, fechaInicio, fechafinalizacion, correo, Representante);
     listaGestion.add(marc);
     try{
       GestionDAO dao = new GestionDAO();
       dao.guardar(listaGestion);
     
       catch(IOExcepcion error){
           JOptionPane.showMessageDialog(null,"no se pudo almacenar el convenio");
               }
       pintarTabla();
     }  catch (IOException ex) {  
            
        }
     
                    
    }//GEN-LAST:event_BotonRegistrarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModificarActionPerformed

    private void campoRepresentanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoRepresentanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoRepresentanteActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonRegistrar;
    private javax.swing.JTextField CampoFechaFinalizacion;
    private javax.swing.JTextField CampoFechaInicio;
    private javax.swing.JTextField CampoNumConvenio;
    private javax.swing.JButton Inactivar;
    private javax.swing.JButton Modificar;
    private javax.swing.JTextField campoArchivoConvenio;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JTextField campoNombreEmpresa;
    private javax.swing.JTextField campoRepresentante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
      private ArrayList<Pasantia>listaGestion;


        }
  
    
