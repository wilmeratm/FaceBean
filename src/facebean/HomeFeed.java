/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * HomeFeed.java
 *
 * Created on 12-10-2011, 04:55:06 PM
 */

package facebean;

/**
 *
 * @author stefany
 */
public class HomeFeed extends javax.swing.JFrame {

    /** Creates new form HomeFeed */
    public HomeFeed() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VerPerfil_btn = new javax.swing.JButton();
        ModPer_btn = new javax.swing.JButton();
        Buscar_btn = new javax.swing.JButton();
        exit_btn = new javax.swing.JButton();
        label1 = new java.awt.Label();
        actualizacion_tx = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        usuario_lbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        VerPerfil_btn.setFont(new java.awt.Font("Tahoma", 1, 11));
        VerPerfil_btn.setText("Ver mi Perfil");
        VerPerfil_btn.setName("VerPerfil_btn"); // NOI18N
        VerPerfil_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VerPerfil_btnMouseClicked(evt);
            }
        });

        ModPer_btn.setFont(new java.awt.Font("Tahoma", 1, 11));
        ModPer_btn.setText("Modificar mi Perfil");
        ModPer_btn.setName("ModPer_btn"); // NOI18N
        ModPer_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModPer_btnMouseClicked(evt);
            }
        });

        Buscar_btn.setFont(new java.awt.Font("Tahoma", 1, 11));
        Buscar_btn.setText("Buscar Amigos");
        Buscar_btn.setName("Buscar_btn"); // NOI18N
        Buscar_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Buscar_btnMouseClicked(evt);
            }
        });

        exit_btn.setFont(new java.awt.Font("Tahoma", 1, 11));
        exit_btn.setText("Salir");
        exit_btn.setName("exit_btn"); // NOI18N
        exit_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit_btnMouseClicked(evt);
            }
        });

        label1.setFont(new java.awt.Font("Tahoma", 1, 24));
        label1.setName("label1"); // NOI18N
        label1.setText("Noticias");

        actualizacion_tx.setFont(new java.awt.Font("Tahoma", 0, 12));
        actualizacion_tx.setText("Status");
        actualizacion_tx.setName("actualizacion_tx"); // NOI18N

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 12));
        jTextField2.setText("Status");
        jTextField2.setName("jTextField2"); // NOI18N

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 12));
        jTextField3.setText("Status");
        jTextField3.setName("jTextField3"); // NOI18N

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 12));
        jTextField4.setText("Status");
        jTextField4.setName("jTextField4"); // NOI18N

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 12));
        jTextField5.setText("Status");
        jTextField5.setName("jTextField5"); // NOI18N

        usuario_lbl.setFont(new java.awt.Font("Tahoma", 0, 12));
        usuario_lbl.setText("Usuario");
        usuario_lbl.setName("usuario_lbl"); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel2.setText("Usuario");
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel3.setText("Usuario");
        jLabel3.setName("jLabel3"); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel4.setText("Usuario");
        jLabel4.setName("jLabel4"); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel5.setText("Usuario");
        jLabel5.setName("jLabel5"); // NOI18N

        jLabel7.setName("jLabel7"); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facebean/wallpaper.jpg"))); // NOI18N
        jLabel8.setName("jLabel8"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(VerPerfil_btn)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(ModPer_btn)
                                    .addGap(209, 209, 209)
                                    .addComponent(Buscar_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
                                    .addComponent(exit_btn)
                                    .addGap(71, 71, 71))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(195, 195, 195)
                                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(325, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(usuario_lbl)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(actualizacion_tx, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                                    .addComponent(jTextField2)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField5))
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VerPerfil_btn)
                    .addComponent(ModPer_btn)
                    .addComponent(Buscar_btn)
                    .addComponent(exit_btn))
                .addGap(42, 42, 42)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(actualizacion_tx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuario_lbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(146, 146, 146))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VerPerfil_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VerPerfil_btnMouseClicked
        Perfil per= new Perfil ();
        per.setVisible(true);
        dispose();

    }//GEN-LAST:event_VerPerfil_btnMouseClicked

    private void ModPer_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModPer_btnMouseClicked
        ModificarPerfil mod= new ModificarPerfil();
        mod.setVisible(true);
        dispose();
    }//GEN-LAST:event_ModPer_btnMouseClicked

    private void exit_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_btnMouseClicked
        Login log = new Login ();
        log.setVisible(true);
        dispose();
    }//GEN-LAST:event_exit_btnMouseClicked

    private void Buscar_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Buscar_btnMouseClicked
       ResultBusqueda bus= new ResultBusqueda();
       bus.setVisible(true);
       dispose();
    }//GEN-LAST:event_Buscar_btnMouseClicked

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeFeed().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar_btn;
    private javax.swing.JButton ModPer_btn;
    private javax.swing.JButton VerPerfil_btn;
    private javax.swing.JTextField actualizacion_tx;
    private javax.swing.JButton exit_btn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private java.awt.Label label1;
    private javax.swing.JLabel usuario_lbl;
    // End of variables declaration//GEN-END:variables

}
