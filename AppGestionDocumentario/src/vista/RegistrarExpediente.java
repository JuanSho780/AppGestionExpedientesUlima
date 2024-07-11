package vista;
    import java.io.File;
    import javax.swing.JFileChooser;
    import javax.swing.JOptionPane;
    import javax.swing.filechooser.FileNameExtensionFilter;
    import modelo.*;


public class RegistrarExpediente extends javax.swing.JFrame {

    private String identificador;
    private String prioridad;
    private String nombre;
    private String dni;
    private String telefono;
    private String email;
    private String asunto;
    private String docRef;
    
    private AdministradorDelSistema adm;
    
    public RegistrarExpediente(AdministradorDelSistema adm) {
        this.adm = adm;
        initComponents();
        associateComponents();
    }

 private void associateComponents(){
     
 }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        prioridadExp = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        asuntoExp = new javax.swing.JTextField();
        botonRegistrarExpediente = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        main2 = new javax.swing.JButton();
        dependencia2 = new javax.swing.JButton();
        expediente2 = new javax.swing.JButton();
        usuario2 = new javax.swing.JButton();
        ChauChau2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        DNIUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dependenciaExp = new javax.swing.JTextField();
        subirArchivo = new javax.swing.JButton();
        noDocumentoSeleccionado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(242, 110, 34));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("EXPEDIENTE -> Registrar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(261, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel3)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Prioridad del expediente:");

        prioridadExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prioridadExpActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setText("Asunto:");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setText("Documento de referencia:");

        botonRegistrarExpediente.setBackground(new java.awt.Color(242, 110, 34));
        botonRegistrarExpediente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonRegistrarExpediente.setForeground(new java.awt.Color(255, 255, 255));
        botonRegistrarExpediente.setText("Registrar expediente");
        botonRegistrarExpediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarExpedienteActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lmg/Ulima (1).png"))); // NOI18N

        main2.setBackground(new java.awt.Color(242, 110, 34));
        main2.setForeground(new java.awt.Color(255, 255, 255));
        main2.setText("Página de la institución");
        main2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                main2ActionPerformed(evt);
            }
        });

        dependencia2.setBackground(new java.awt.Color(242, 110, 34));
        dependencia2.setForeground(new java.awt.Color(255, 255, 255));
        dependencia2.setText("Dependencia");
        dependencia2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dependencia2ActionPerformed(evt);
            }
        });

        expediente2.setForeground(new java.awt.Color(242, 110, 34));
        expediente2.setText("Expediente");
        expediente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expediente2ActionPerformed(evt);
            }
        });

        usuario2.setBackground(new java.awt.Color(242, 110, 34));
        usuario2.setForeground(new java.awt.Color(255, 255, 255));
        usuario2.setText("Usuario");
        usuario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuario2ActionPerformed(evt);
            }
        });

        ChauChau2.setBackground(new java.awt.Color(242, 110, 34));
        ChauChau2.setForeground(new java.awt.Color(255, 255, 255));
        ChauChau2.setText("Cerrar sesión");
        ChauChau2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChauChau2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(dependencia2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(expediente2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(usuario2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ChauChau2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel13)
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel13)
                .addGap(34, 34, 34)
                .addComponent(main2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dependencia2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(expediente2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(usuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ChauChau2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("DNI del usuario:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("Dependencia:");

        DNIUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DNIUsuarioActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lmg/logo Ulima Blanco (1).png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lmg/campus.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        subirArchivo.setText("Buscar archivo");
        subirArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subirArchivoActionPerformed(evt);
            }
        });

        noDocumentoSeleccionado.setText("No hay un documento seleccionado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(prioridadExp, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(DNIUsuario)
                                        .addComponent(asuntoExp, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(botonRegistrarExpediente)
                                        .addComponent(dependenciaExp, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(subirArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(noDocumentoSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(27, 27, 27)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prioridadExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DNIUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dependenciaExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(asuntoExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(subirArchivo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(noDocumentoSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonRegistrarExpediente)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29)))
                .addComponent(jLabel2)
                .addContainerGap(148, Short.MAX_VALUE))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1244, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ChauChau2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChauChau2ActionPerformed
        // ESTE BOTON CIERRA SESION
        login frame = new login();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ChauChau2ActionPerformed

    private void usuario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuario2ActionPerformed
        // ESTE BOTON TE LLEVA A REGISTRAR UN USUARIO
        UsuarioFont frame = new UsuarioFont(this.adm);
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_usuario2ActionPerformed

    private void expediente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expediente2ActionPerformed
        // ESTE BOTON TE LLEVA AL SUB-HOME DE EXPEDIENTE
        ExpedienteGUI frame = new ExpedienteGUI(this.adm);
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_expediente2ActionPerformed

    private void dependencia2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dependencia2ActionPerformed
        // ESTE BOTON TE LLEVA AL SUB-HOME DE DEPENDENCIA
        DependenciaGUI frame = new DependenciaGUI(this.adm);
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dependencia2ActionPerformed

    private void main2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_main2ActionPerformed
        // ESTE BOTON TE LLEVA AL HOME (PRINCIPAL) DEL SISTEMA
        principal frame = new principal(this.adm);
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_main2ActionPerformed

    private void prioridadExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prioridadExpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prioridadExpActionPerformed

    private void DNIUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DNIUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DNIUsuarioActionPerformed

    private void botonRegistrarExpedienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarExpedienteActionPerformed
        // ESTE BOTON REGISTRA EL EXPEDIENTE SEGUN LO PUESTO EN LOS ESPACIOS EN BLANCO
        String asunto = asuntoExp.getText();
        File docRef = selectedFile;
        String prioridadText = prioridadExp.getText();
        String DNIusuario = DNIUsuario.getText();
        String dependenciaNombre = dependenciaExp.getText();
        File docRefActual = this.selectedFile;

        // Verificar si algún campo está vacío
        if (asunto.isEmpty() || docRef == null || prioridadText.isEmpty() || DNIusuario.isEmpty() || dependenciaNombre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos deben estar completos", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                int prioridadExpediente = Integer.parseInt(prioridadText);

                Dependencia DepenActual = this.adm.obtenerDependencia(dependenciaNombre);

                if (DepenActual != null) {
                    System.out.println("Se ha encontrado la dependencia");
                    if (this.adm.existeUsuario(DNIusuario)) {
                        System.out.println("Se ha encontrado el usuario");
                        Expediente nuevo = this.adm.registrarExpedienteEnDependencia(prioridadExpediente, DNIusuario, asunto, dependenciaNombre, docRefActual);
                        System.out.println("Se ha creado el expediente");
                        JOptionPane.showMessageDialog(this, "Se ha registrado el expediente con éxito, su ID es " + nuevo.getID(), "Éxito", JOptionPane.INFORMATION_MESSAGE);
                        RegistrarExpediente frame = new RegistrarExpediente(this.adm);
                        frame.setVisible(true);
                        this.dispose();
                    } else {
                        // ERROR USUARIO INEXISTENTE
                        JOptionPane.showMessageDialog(this, "Usuario inexistente", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    // ERROR DEPENDENCIA INEXISTENTE
                    JOptionPane.showMessageDialog(this, "Dependencia inexistente", "Error", JOptionPane.ERROR_MESSAGE);
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "La prioridad debe ser un número", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_botonRegistrarExpedienteActionPerformed
    java.io.File selectedFile = null;
    private void subirArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subirArchivoActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Documentos", "doc", "docx", "pdf");
        fileChooser.setFileFilter(filter);

        int returnValue = fileChooser.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            selectedFile = fileChooser.getSelectedFile();
            
            noDocumentoSeleccionado.setText(selectedFile.getName());
        }
    }//GEN-LAST:event_subirArchivoActionPerformed
    
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
            java.util.logging.Logger.getLogger(RegistrarExpediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarExpediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarExpediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarExpediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new RegistrarExpediente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChauChau2;
    private javax.swing.JTextField DNIUsuario;
    private javax.swing.JTextField asuntoExp;
    private javax.swing.JButton botonRegistrarExpediente;
    private javax.swing.JButton dependencia2;
    private javax.swing.JTextField dependenciaExp;
    private javax.swing.JButton expediente2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton main2;
    private javax.swing.JLabel noDocumentoSeleccionado;
    private javax.swing.JTextField prioridadExp;
    private javax.swing.JButton subirArchivo;
    private javax.swing.JButton usuario2;
    // End of variables declaration//GEN-END:variables
}
