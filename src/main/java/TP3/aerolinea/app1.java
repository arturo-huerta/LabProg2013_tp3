/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3.aerolinea;

/**
 *
 * @author tincho
 */
public class app1 extends javax.swing.JFrame {

    /**
     * Creates new form pepe
     */
    public app1() {
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
        jTextField = new javax.swing.JPanel();
        jTextFieldPApellido = new javax.swing.JTextField();
        jTextFieldPNombre = new javax.swing.JTextField();
        jTextFieldPDNI = new javax.swing.JTextField();
        jButtonPasajeroLimpiar = new javax.swing.JButton();
        jButtonPasajeroCrear = new javax.swing.JButton();
        jLabelPCApe = new javax.swing.JLabel();
        jLabelPCnombre = new javax.swing.JLabel();
        jLabelPCDNI = new javax.swing.JLabel();
        jPanelPLeer = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabelPLDNI = new javax.swing.JLabel();
        jLabelPLApe = new javax.swing.JLabel();
        jLabelPLnombre = new javax.swing.JLabel();
        jTextFieldPLDNI = new javax.swing.JTextField();
        jTextFieldPLApe = new javax.swing.JTextField();
        jTextFieldPLnombre = new javax.swing.JTextField();
        jLabelPLBuscar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldPLBuscarDNI = new javax.swing.JTextField();
        jButtonPLBuscar = new javax.swing.JButton();
        jButtonPLLimpiar = new javax.swing.JButton();
        jPanelPModificar = new javax.swing.JPanel();
        jPanelPEliminar = new javax.swing.JPanel();
        jTextFieldPEDNI = new javax.swing.JTextField();
        jLabelPEDNI = new javax.swing.JLabel();
        jTabbedPaneTickets = new javax.swing.JTabbedPane();
        jPanelTCrear = new javax.swing.JPanel();
        jPanelTLeer = new javax.swing.JPanel();
        jPanelTModificar = new javax.swing.JPanel();
        jPanelTEliminar = new javax.swing.JPanel();
        jTabbedPaneVuelo = new javax.swing.JTabbedPane();
        jPanelVCrear = new javax.swing.JPanel();
        jPanelVLeer = new javax.swing.JPanel();
        jPanelVModificar = new javax.swing.JPanel();
        jPanelVEliminar = new javax.swing.JPanel();
        jTabbedPaneAeropuerto1 = new javax.swing.JTabbedPane();
        jPanelACrear1 = new javax.swing.JPanel();
        jPanelALeer1 = new javax.swing.JPanel();
        jPanelAModificar1 = new javax.swing.JPanel();
        jPanelAEliminar1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestor de Aerolíneas");

        jTextFieldPApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPApellidoActionPerformed(evt);
            }
        });

        jButtonPasajeroLimpiar.setText("Limpiar");
        jButtonPasajeroLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPasajeroLimpiarActionPerformed(evt);
            }
        });

        jButtonPasajeroCrear.setText("Crear");
        jButtonPasajeroCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPasajeroCrearActionPerformed(evt);
            }
        });

        jLabelPCApe.setText("Apellido");

        jLabelPCnombre.setText("Nombre");

        jLabelPCDNI.setText("DNI");

        javax.swing.GroupLayout jTextFieldLayout = new javax.swing.GroupLayout(jTextField);
        jTextField.setLayout(jTextFieldLayout);
        jTextFieldLayout.setHorizontalGroup(
            jTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTextFieldLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jTextFieldLayout.createSequentialGroup()
                        .addComponent(jButtonPasajeroCrear)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonPasajeroLimpiar)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jTextFieldLayout.createSequentialGroup()
                        .addGroup(jTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jTextFieldLayout.createSequentialGroup()
                                .addComponent(jLabelPCnombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldPNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jTextFieldLayout.createSequentialGroup()
                                .addComponent(jLabelPCDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldPDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jTextFieldLayout.createSequentialGroup()
                                .addComponent(jLabelPCApe, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                                .addComponent(jTextFieldPApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36))))
        );
        jTextFieldLayout.setVerticalGroup(
            jTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTextFieldLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldPApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jTextFieldLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabelPCApe, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPCnombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPCDNI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                .addGroup(jTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPasajeroLimpiar)
                    .addComponent(jButtonPasajeroCrear))
                .addContainerGap())
        );

        jTabbedPanePasajero.addTab("Crear", jTextField);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "N°Ticket", "Codigo Vuelo", "Codigo Aeropuerto"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabelPLDNI.setText("DNI");

        jLabelPLApe.setText("Apellido");

        jLabelPLnombre.setText("Nombre");

        jTextFieldPLDNI.setEditable(false);

        jTextFieldPLApe.setEditable(false);

        jTextFieldPLnombre.setEditable(false);

        jLabelPLBuscar.setText("Buscar");

        jLabel4.setText("DNI");

        jTextFieldPLBuscarDNI.setText("Ingrese DNI");

        jButtonPLBuscar.setText("Buscar");

        jButtonPLLimpiar.setText("Limpiar");

        javax.swing.GroupLayout jPanelPLeerLayout = new javax.swing.GroupLayout(jPanelPLeer);
        jPanelPLeer.setLayout(jPanelPLeerLayout);
        jPanelPLeerLayout.setHorizontalGroup(
            jPanelPLeerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanelPLeerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPLeerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabelPLnombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelPLApe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                    .addComponent(jLabelPLDNI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPLeerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextFieldPLApe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(jTextFieldPLDNI, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldPLnombre))
                .addGroup(jPanelPLeerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPLeerLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addComponent(jLabelPLBuscar)
                        .addGap(76, 76, 76))
                    .addGroup(jPanelPLeerLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPLeerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPLeerLayout.createSequentialGroup()
                                .addComponent(jButtonPLBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonPLLimpiar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextFieldPLBuscarDNI))
                        .addContainerGap())))
        );
        jPanelPLeerLayout.setVerticalGroup(
            jPanelPLeerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPLeerLayout.createSequentialGroup()
                .addGroup(jPanelPLeerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPLeerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelPLeerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPLDNI)
                            .addComponent(jTextFieldPLDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabelPLBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPLeerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPLApe)
                    .addComponent(jTextFieldPLApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldPLBuscarDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPLeerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPLnombre)
                    .addComponent(jTextFieldPLnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPLBuscar)
                    .addComponent(jButtonPLLimpiar))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))
        );

        jTabbedPanePasajero.addTab("Leer", jPanelPLeer);

        javax.swing.GroupLayout jPanelPModificarLayout = new javax.swing.GroupLayout(jPanelPModificar);
        jPanelPModificar.setLayout(jPanelPModificarLayout);
        jPanelPModificarLayout.setHorizontalGroup(
            jPanelPModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
        );
        jPanelPModificarLayout.setVerticalGroup(
            jPanelPModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 313, Short.MAX_VALUE)
        );

        jTabbedPanePasajero.addTab("Modificar", jPanelPModificar);

        jLabelPEDNI.setText("DNI:");

        javax.swing.GroupLayout jPanelPEliminarLayout = new javax.swing.GroupLayout(jPanelPEliminar);
        jPanelPEliminar.setLayout(jPanelPEliminarLayout);
        jPanelPEliminarLayout.setHorizontalGroup(
            jPanelPEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPEliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPEDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPEDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(190, Short.MAX_VALUE))
        );
        jPanelPEliminarLayout.setVerticalGroup(
            jPanelPEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPEliminarLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanelPEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPEDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPEDNI))
                .addContainerGap(238, Short.MAX_VALUE))
        );

        jTabbedPanePasajero.addTab("Eliminar", jPanelPEliminar);

        jTabbedPaneContainer.addTab("Pasajero", jTabbedPanePasajero);

        javax.swing.GroupLayout jPanelTCrearLayout = new javax.swing.GroupLayout(jPanelTCrear);
        jPanelTCrear.setLayout(jPanelTCrearLayout);
        jPanelTCrearLayout.setHorizontalGroup(
            jPanelTCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
        );
        jPanelTCrearLayout.setVerticalGroup(
            jPanelTCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 313, Short.MAX_VALUE)
        );

        jTabbedPaneTickets.addTab("Crear", jPanelTCrear);

        javax.swing.GroupLayout jPanelTLeerLayout = new javax.swing.GroupLayout(jPanelTLeer);
        jPanelTLeer.setLayout(jPanelTLeerLayout);
        jPanelTLeerLayout.setHorizontalGroup(
            jPanelTLeerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
        );
        jPanelTLeerLayout.setVerticalGroup(
            jPanelTLeerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 313, Short.MAX_VALUE)
        );

        jTabbedPaneTickets.addTab("Leer", jPanelTLeer);

        javax.swing.GroupLayout jPanelTModificarLayout = new javax.swing.GroupLayout(jPanelTModificar);
        jPanelTModificar.setLayout(jPanelTModificarLayout);
        jPanelTModificarLayout.setHorizontalGroup(
            jPanelTModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
        );
        jPanelTModificarLayout.setVerticalGroup(
            jPanelTModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 313, Short.MAX_VALUE)
        );

        jTabbedPaneTickets.addTab("Modificar", jPanelTModificar);

        javax.swing.GroupLayout jPanelTEliminarLayout = new javax.swing.GroupLayout(jPanelTEliminar);
        jPanelTEliminar.setLayout(jPanelTEliminarLayout);
        jPanelTEliminarLayout.setHorizontalGroup(
            jPanelTEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
        );
        jPanelTEliminarLayout.setVerticalGroup(
            jPanelTEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 313, Short.MAX_VALUE)
        );

        jTabbedPaneTickets.addTab("Eliminar", jPanelTEliminar);

        jTabbedPaneContainer.addTab("Ticket", jTabbedPaneTickets);

        javax.swing.GroupLayout jPanelVCrearLayout = new javax.swing.GroupLayout(jPanelVCrear);
        jPanelVCrear.setLayout(jPanelVCrearLayout);
        jPanelVCrearLayout.setHorizontalGroup(
            jPanelVCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
        );
        jPanelVCrearLayout.setVerticalGroup(
            jPanelVCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 313, Short.MAX_VALUE)
        );

        jTabbedPaneVuelo.addTab("Crear", jPanelVCrear);

        javax.swing.GroupLayout jPanelVLeerLayout = new javax.swing.GroupLayout(jPanelVLeer);
        jPanelVLeer.setLayout(jPanelVLeerLayout);
        jPanelVLeerLayout.setHorizontalGroup(
            jPanelVLeerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
        );
        jPanelVLeerLayout.setVerticalGroup(
            jPanelVLeerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 313, Short.MAX_VALUE)
        );

        jTabbedPaneVuelo.addTab("Leer", jPanelVLeer);

        javax.swing.GroupLayout jPanelVModificarLayout = new javax.swing.GroupLayout(jPanelVModificar);
        jPanelVModificar.setLayout(jPanelVModificarLayout);
        jPanelVModificarLayout.setHorizontalGroup(
            jPanelVModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
        );
        jPanelVModificarLayout.setVerticalGroup(
            jPanelVModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 313, Short.MAX_VALUE)
        );

        jTabbedPaneVuelo.addTab("Modificar", jPanelVModificar);

        javax.swing.GroupLayout jPanelVEliminarLayout = new javax.swing.GroupLayout(jPanelVEliminar);
        jPanelVEliminar.setLayout(jPanelVEliminarLayout);
        jPanelVEliminarLayout.setHorizontalGroup(
            jPanelVEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
        );
        jPanelVEliminarLayout.setVerticalGroup(
            jPanelVEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 313, Short.MAX_VALUE)
        );

        jTabbedPaneVuelo.addTab("Eliminar", jPanelVEliminar);

        jTabbedPaneContainer.addTab("Vuelo", jTabbedPaneVuelo);

        javax.swing.GroupLayout jPanelACrear1Layout = new javax.swing.GroupLayout(jPanelACrear1);
        jPanelACrear1.setLayout(jPanelACrear1Layout);
        jPanelACrear1Layout.setHorizontalGroup(
            jPanelACrear1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
        );
        jPanelACrear1Layout.setVerticalGroup(
            jPanelACrear1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 313, Short.MAX_VALUE)
        );

        jTabbedPaneAeropuerto1.addTab("Crear", jPanelACrear1);

        javax.swing.GroupLayout jPanelALeer1Layout = new javax.swing.GroupLayout(jPanelALeer1);
        jPanelALeer1.setLayout(jPanelALeer1Layout);
        jPanelALeer1Layout.setHorizontalGroup(
            jPanelALeer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
        );
        jPanelALeer1Layout.setVerticalGroup(
            jPanelALeer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 313, Short.MAX_VALUE)
        );

        jTabbedPaneAeropuerto1.addTab("Leer", jPanelALeer1);

        javax.swing.GroupLayout jPanelAModificar1Layout = new javax.swing.GroupLayout(jPanelAModificar1);
        jPanelAModificar1.setLayout(jPanelAModificar1Layout);
        jPanelAModificar1Layout.setHorizontalGroup(
            jPanelAModificar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
        );
        jPanelAModificar1Layout.setVerticalGroup(
            jPanelAModificar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 313, Short.MAX_VALUE)
        );

        jTabbedPaneAeropuerto1.addTab("Modificar", jPanelAModificar1);

        javax.swing.GroupLayout jPanelAEliminar1Layout = new javax.swing.GroupLayout(jPanelAEliminar1);
        jPanelAEliminar1.setLayout(jPanelAEliminar1Layout);
        jPanelAEliminar1Layout.setHorizontalGroup(
            jPanelAEliminar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
        );
        jPanelAEliminar1Layout.setVerticalGroup(
            jPanelAEliminar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 313, Short.MAX_VALUE)
        );

        jTabbedPaneAeropuerto1.addTab("Eliminar", jPanelAEliminar1);

        jTabbedPaneContainer.addTab("Aeropuerto", jTabbedPaneAeropuerto1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneContainer)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneContainer)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPApellidoActionPerformed

    private void jButtonPasajeroLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPasajeroLimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPasajeroLimpiarActionPerformed

    private void jButtonPasajeroCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPasajeroCrearActionPerformed
        
    }//GEN-LAST:event_jButtonPasajeroCrearActionPerformed

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
            java.util.logging.Logger.getLogger(app1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(app1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(app1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(app1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new app1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPLBuscar;
    private javax.swing.JButton jButtonPLLimpiar;
    private javax.swing.JButton jButtonPasajeroCrear;
    private javax.swing.JButton jButtonPasajeroLimpiar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelPCApe;
    private javax.swing.JLabel jLabelPCDNI;
    private javax.swing.JLabel jLabelPCnombre;
    private javax.swing.JLabel jLabelPEDNI;
    private javax.swing.JLabel jLabelPLApe;
    private javax.swing.JLabel jLabelPLBuscar;
    private javax.swing.JLabel jLabelPLDNI;
    private javax.swing.JLabel jLabelPLnombre;
    private javax.swing.JPanel jPanelACrear1;
    private javax.swing.JPanel jPanelAEliminar1;
    private javax.swing.JPanel jPanelALeer1;
    private javax.swing.JPanel jPanelAModificar1;
    private javax.swing.JPanel jPanelPEliminar;
    private javax.swing.JPanel jPanelPLeer;
    private javax.swing.JPanel jPanelPModificar;
    private javax.swing.JPanel jPanelTCrear;
    private javax.swing.JPanel jPanelTEliminar;
    private javax.swing.JPanel jPanelTLeer;
    private javax.swing.JPanel jPanelTModificar;
    private javax.swing.JPanel jPanelVCrear;
    private javax.swing.JPanel jPanelVEliminar;
    private javax.swing.JPanel jPanelVLeer;
    private javax.swing.JPanel jPanelVModificar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPaneAeropuerto1;
    private javax.swing.JTabbedPane jTabbedPaneContainer;
    private javax.swing.JTabbedPane jTabbedPanePasajero;
    private javax.swing.JTabbedPane jTabbedPaneTickets;
    private javax.swing.JTabbedPane jTabbedPaneVuelo;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel jTextField;
    private javax.swing.JTextField jTextFieldPApellido;
    private javax.swing.JTextField jTextFieldPDNI;
    private javax.swing.JTextField jTextFieldPEDNI;
    private javax.swing.JTextField jTextFieldPLApe;
    private javax.swing.JTextField jTextFieldPLBuscarDNI;
    private javax.swing.JTextField jTextFieldPLDNI;
    private javax.swing.JTextField jTextFieldPLnombre;
    private javax.swing.JTextField jTextFieldPNombre;
    // End of variables declaration//GEN-END:variables
}
