/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3.aerolinea;

/**
 *
 * @author tincho
 */
public class pepe extends javax.swing.JFrame {

    /**
     * Creates new form pepe
     */
    public pepe() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPaneContainer = new javax.swing.JTabbedPane();
        jTabbedPanePasajero = new javax.swing.JTabbedPane();
        jTabbedPanePCrear = new javax.swing.JTabbedPane();
        jTabbedPanePLeer = new javax.swing.JTabbedPane();
        jTabbedPanePActualizar = new javax.swing.JTabbedPane();
        jTabbedPanePEliminar = new javax.swing.JTabbedPane();
        jTabbedPaneTickets = new javax.swing.JTabbedPane();
        jTabbedPaneTCrear = new javax.swing.JTabbedPane();
        jTabbedPaneTLeer = new javax.swing.JTabbedPane();
        jTabbedPaneTActualizar = new javax.swing.JTabbedPane();
        jTabbedPaneTEliminar = new javax.swing.JTabbedPane();
        jTabbedPaneVuelo = new javax.swing.JTabbedPane();
        jTabbedPaneVCrear = new javax.swing.JTabbedPane();
        jTabbedPaneVLeer = new javax.swing.JTabbedPane();
        jTabbedPaneVActualizar = new javax.swing.JTabbedPane();
        jTabbedPaneVEliminar = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestor de Aerolíneas");

        jTabbedPanePasajero.addTab("Crear", jTabbedPanePCrear);
        jTabbedPanePasajero.addTab("Leer", jTabbedPanePLeer);
        jTabbedPanePasajero.addTab("Actualizar", jTabbedPanePActualizar);
        jTabbedPanePasajero.addTab("Eliminar", jTabbedPanePEliminar);

        jTabbedPaneContainer.addTab("Pasajero", jTabbedPanePasajero);

        jTabbedPaneTickets.addTab("Crear", jTabbedPaneTCrear);
        jTabbedPaneTickets.addTab("Leer", jTabbedPaneTLeer);
        jTabbedPaneTickets.addTab("Actualizar", jTabbedPaneTActualizar);
        jTabbedPaneTickets.addTab("Eliminar", jTabbedPaneTEliminar);

        jTabbedPaneContainer.addTab("Ticket", jTabbedPaneTickets);

        jTabbedPaneVuelo.addTab("Crear", jTabbedPaneVCrear);
        jTabbedPaneVuelo.addTab("Leer", jTabbedPaneVLeer);
        jTabbedPaneVuelo.addTab("Actualizar", jTabbedPaneVActualizar);
        jTabbedPaneVuelo.addTab("Eliminar", jTabbedPaneVEliminar);

        jTabbedPaneContainer.addTab("Vuelo", jTabbedPaneVuelo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jTabbedPaneContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jTabbedPaneContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(pepe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pepe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pepe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pepe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pepe().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane jTabbedPaneContainer;
    private javax.swing.JTabbedPane jTabbedPanePActualizar;
    private javax.swing.JTabbedPane jTabbedPanePCrear;
    private javax.swing.JTabbedPane jTabbedPanePEliminar;
    private javax.swing.JTabbedPane jTabbedPanePLeer;
    private javax.swing.JTabbedPane jTabbedPanePasajero;
    private javax.swing.JTabbedPane jTabbedPaneTActualizar;
    private javax.swing.JTabbedPane jTabbedPaneTCrear;
    private javax.swing.JTabbedPane jTabbedPaneTEliminar;
    private javax.swing.JTabbedPane jTabbedPaneTLeer;
    private javax.swing.JTabbedPane jTabbedPaneTickets;
    private javax.swing.JTabbedPane jTabbedPaneVActualizar;
    private javax.swing.JTabbedPane jTabbedPaneVCrear;
    private javax.swing.JTabbedPane jTabbedPaneVEliminar;
    private javax.swing.JTabbedPane jTabbedPaneVLeer;
    private javax.swing.JTabbedPane jTabbedPaneVuelo;
    // End of variables declaration//GEN-END:variables
}
