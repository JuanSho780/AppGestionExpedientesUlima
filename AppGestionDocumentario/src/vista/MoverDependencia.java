package vista;
    import modelo.*;
    import javax.swing.DefaultComboBoxModel;
    import javax.swing.JComboBox;
    import javax.swing.JOptionPane;
    import tda.*;

public class MoverDependencia extends javax.swing.JFrame {
    private AdministradorDelSistema adm;
    
    public MoverDependencia(AdministradorDelSistema adm) {
        this.adm = adm;
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

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        main = new javax.swing.JButton();
        dependencia = new javax.swing.JButton();
        expediente = new javax.swing.JButton();
        usuario = new javax.swing.JButton();
        ChauChau = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        botonMoverAntiguedad = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        botonMoverPrioridad = new javax.swing.JButton();
        dependenciaOrigen = new javax.swing.JTextField();
        dependenciaDestino = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        IDdelExpediente = new javax.swing.JTextField();
        botonMoveID = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lmg/Ulima (1).png"))); // NOI18N

        main.setBackground(new java.awt.Color(242, 111, 33));
        main.setForeground(new java.awt.Color(255, 255, 255));
        main.setText("Página de la institución");
        main.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainActionPerformed(evt);
            }
        });

        dependencia.setForeground(new java.awt.Color(242, 111, 33));
        dependencia.setText("Dependencia");
        dependencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dependenciaActionPerformed(evt);
            }
        });

        expediente.setBackground(new java.awt.Color(242, 110, 34));
        expediente.setForeground(new java.awt.Color(255, 255, 255));
        expediente.setText("Expediente");
        expediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expedienteActionPerformed(evt);
            }
        });

        usuario.setBackground(new java.awt.Color(242, 110, 34));
        usuario.setForeground(new java.awt.Color(255, 255, 255));
        usuario.setText("Usuario");
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });

        ChauChau.setBackground(new java.awt.Color(242, 110, 34));
        ChauChau.setForeground(new java.awt.Color(255, 255, 255));
        ChauChau.setText("Cerrar sesión");
        ChauChau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChauChauActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(dependencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(expediente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ChauChau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel1)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dependencia, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(expediente, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ChauChau, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(371, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(242, 110, 34));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DEPENDENCIA -> Mover dependencia");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel2)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        botonMoverAntiguedad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonMoverAntiguedad.setForeground(new java.awt.Color(242, 111, 33));
        botonMoverAntiguedad.setText("Mover por antiguedad");
        botonMoverAntiguedad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(242, 111, 33), new java.awt.Color(242, 111, 33), new java.awt.Color(242, 111, 33), new java.awt.Color(242, 111, 33)));
        botonMoverAntiguedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMoverAntiguedadActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Dependencia origen: ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Dependencia destino: ");

        botonMoverPrioridad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonMoverPrioridad.setForeground(new java.awt.Color(242, 111, 33));
        botonMoverPrioridad.setText("Mover por prioridad");
        botonMoverPrioridad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(242, 111, 33), new java.awt.Color(242, 111, 33), new java.awt.Color(242, 111, 33), new java.awt.Color(242, 111, 33)));
        botonMoverPrioridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMoverPrioridadActionPerformed(evt);
            }
        });

        dependenciaOrigen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));

        dependenciaDestino.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lmg/campus.png"))); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(242, 111, 33), new java.awt.Color(242, 111, 33), new java.awt.Color(242, 111, 33), new java.awt.Color(242, 111, 33)));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Ingrese el ID del expediente:");

        IDdelExpediente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        IDdelExpediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDdelExpedienteActionPerformed(evt);
            }
        });

        botonMoveID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonMoveID.setForeground(new java.awt.Color(242, 111, 33));
        botonMoveID.setText("Mover por ID");
        botonMoveID.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(242, 111, 33), new java.awt.Color(242, 111, 33), new java.awt.Color(242, 111, 33), new java.awt.Color(242, 111, 33)));
        botonMoveID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMoveIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(botonMoveID, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(IDdelExpediente, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(IDdelExpediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonMoveID, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(botonMoverAntiguedad, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(dependenciaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(botonMoverPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(dependenciaOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(85, 85, 85)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(dependenciaOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(dependenciaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonMoverPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonMoverAntiguedad, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void mainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainActionPerformed
        // ESTE BOTON TE LLEVA AL HOME (PRINCIPAL)
        principal frame = new principal(this.adm);
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mainActionPerformed

    private void dependenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dependenciaActionPerformed
        // ESTE BOTON TE LLEVA AL SUB-HOME DE DEPENDENCIA
        DependenciaGUI frame = new DependenciaGUI(this.adm);
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dependenciaActionPerformed

    private void expedienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expedienteActionPerformed
        // ESTE BOTON TE LLEVA AL SUB-HOME DE EXPEDIENTE
        ExpedienteGUI frame = new ExpedienteGUI(this.adm);
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_expedienteActionPerformed

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // ESTE BOTON TE LLEVA A REGISTRAR UN NUEVO USUARIO
        UsuarioFont frame = new UsuarioFont(this.adm);
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_usuarioActionPerformed

    private void ChauChauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChauChauActionPerformed
        // ESTE BOTON CIERRA SESION
        login frame = new login();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ChauChauActionPerformed

    private void botonMoverPrioridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMoverPrioridadActionPerformed
        // ESTE BOTON MUEVO UN TRAMITE DE UNA DEPENDENCIA ORIGEN A UNA DESTINO (CON LOS DATOS DADOS) -> POR PRIORIDAD
        
        String depOrigen = dependenciaOrigen.getText();
        String depDestino = dependenciaDestino.getText();
        
        Dependencia origen = this.adm.obtenerDependencia(depOrigen);
        Dependencia destino = this.adm.obtenerDependencia(depDestino);
        if (origen != null && destino != null) {
            this.adm.moverExpedientePrioridad(depOrigen, depDestino);
            JOptionPane.showMessageDialog(this, "Se realizó la acción con exito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            //ERROR: NO EXISTE ALGUNA DE LAS DEPENDENCIAS DADAS
            JOptionPane.showMessageDialog(this, "No existe dependencia", "Error", JOptionPane.ERROR_MESSAGE);
        }
        MoverDependencia frame = new MoverDependencia(this.adm);
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonMoverPrioridadActionPerformed

    private void botonMoveIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMoveIDActionPerformed
        // ESTE BOTON MUEVO UN TRAMITE DE UNA DEPENDENCIA ORIGEN A UNA DESTINO (CON LOS DATOS DADOS) -> POR UID
        
        String depOrigen = dependenciaOrigen.getText();
        String depDestino = dependenciaDestino.getText();
        String IDexpediente = IDdelExpediente.getText();
        
        Dependencia origen = this.adm.obtenerDependencia(depOrigen);
        Dependencia destino = this.adm.obtenerDependencia(depDestino);
        if (origen != null && destino != null) {
            if (origen.existeTramite(IDexpediente)) {
                this.adm.moverExpedienteporID(depOrigen, depDestino, IDexpediente);
                JOptionPane.showMessageDialog(this, "Se realizó la acción con exito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                //ERROR: NO EXISTE ALGUN TRAMITE CON ESE ID EN DEPENDENCIA DE ORIGEN
                JOptionPane.showMessageDialog(this, "No existe algún trámite con ese ID en dependencia de origen", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            //ERROR: NO EXISTE ALGUNA DE LAS DEPENDENCIAS DADAS
            JOptionPane.showMessageDialog(this, "No existe dependencia", "Error", JOptionPane.ERROR_MESSAGE);
        }
        MoverDependencia frame = new MoverDependencia(this.adm);
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonMoveIDActionPerformed

    private void botonMoverAntiguedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMoverAntiguedadActionPerformed
        // ESTE BOTON MUEVO UN TRAMITE DE UNA DEPENDENCIA ORIGEN A UNA DESTINO (CON LOS DATOS DADOS) -> POR ANTIGUEDAD

        String depOrigen = dependenciaOrigen.getText();
        String depDestino = dependenciaDestino.getText();
        
        Dependencia origen = this.adm.obtenerDependencia(depOrigen);
        Dependencia destino = this.adm.obtenerDependencia(depDestino);
        if (origen != null && destino != null) {
            this.adm.moverExpedienteAntiguedad(depOrigen, depDestino);
            JOptionPane.showMessageDialog(this, "Se realizó la acción con exito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            //ERROR: NO EXISTE ALGUNA DE LAS DEPENDENCIAS DADAS
            JOptionPane.showMessageDialog(this, "No existe dependencia", "Error", JOptionPane.ERROR_MESSAGE);
        }
        MoverDependencia frame = new MoverDependencia(this.adm);
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonMoverAntiguedadActionPerformed

    private void IDdelExpedienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDdelExpedienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDdelExpedienteActionPerformed
    
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
            java.util.logging.Logger.getLogger(MoverDependencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MoverDependencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MoverDependencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MoverDependencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new MoverDependencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChauChau;
    private javax.swing.JTextField IDdelExpediente;
    private javax.swing.JButton botonMoveID;
    private javax.swing.JButton botonMoverAntiguedad;
    private javax.swing.JButton botonMoverPrioridad;
    private javax.swing.JButton dependencia;
    private javax.swing.JTextField dependenciaDestino;
    private javax.swing.JTextField dependenciaOrigen;
    private javax.swing.JButton expediente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton main;
    private javax.swing.JButton usuario;
    // End of variables declaration//GEN-END:variables
}
