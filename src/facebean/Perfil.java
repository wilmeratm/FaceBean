/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Perfil.java
 *
 * Created on 11-28-2011, 12:16:25 AM
 */

package facebean;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author stefany
 */
public class Perfil extends javax.swing.JFrame {
        protected long pos;
        String status= "";
        String Mstatus="";
    /** Creates new form Perfil */
    public Perfil() {
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

        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        label7 = new java.awt.Label();
        label8 = new java.awt.Label();
        NomPer_tx = new javax.swing.JTextField();
        modi_btn = new javax.swing.JButton();
        exit_btn = new javax.swing.JButton();
        status_tx = new javax.swing.JTextField();
        edad_tx = new javax.swing.JTextField();
        tele_tx = new javax.swing.JTextField();
        busq_tx = new javax.swing.JTextField();
        label3 = new java.awt.Label();
        jButton3 = new javax.swing.JButton();
        actualizar_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        busqueda_btn = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        changeF_btn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        statusbox_tx = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Form"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance().getContext().getResourceMap(Perfil.class);
        label5.setFont(resourceMap.getFont("jTextField1.font")); // NOI18N
        label5.setName("label5"); // NOI18N
        label5.setText(resourceMap.getString("label5.text")); // NOI18N

        label6.setFont(resourceMap.getFont("jTextField1.font")); // NOI18N
        label6.setName("label6"); // NOI18N
        label6.setText(resourceMap.getString("label6.text")); // NOI18N

        label7.setFont(resourceMap.getFont("jTextField1.font")); // NOI18N
        label7.setName("label7"); // NOI18N
        label7.setText(resourceMap.getString("label7.text")); // NOI18N

        label8.setFont(resourceMap.getFont("jTextField1.font")); // NOI18N
        label8.setName("label8"); // NOI18N
        label8.setText(resourceMap.getString("label8.text")); // NOI18N

        NomPer_tx.setFont(resourceMap.getFont("NomPer_tx.font")); // NOI18N
        NomPer_tx.setText(resourceMap.getString("NomPer_tx.text")); // NOI18N
        NomPer_tx.setName("NomPer_tx"); // NOI18N
        NomPer_tx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomPer_txActionPerformed(evt);
            }
        });

        modi_btn.setFont(resourceMap.getFont("jTextField1.font")); // NOI18N
        modi_btn.setIcon(resourceMap.getIcon("modi_btn.icon")); // NOI18N
        modi_btn.setText(resourceMap.getString("modi_btn.text")); // NOI18N
        modi_btn.setName("modi_btn"); // NOI18N
        modi_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modi_btnMouseClicked(evt);
            }
        });

        exit_btn.setFont(resourceMap.getFont("jTextField1.font")); // NOI18N
        exit_btn.setIcon(resourceMap.getIcon("exit_btn.icon")); // NOI18N
        exit_btn.setText(resourceMap.getString("exit_btn.text")); // NOI18N
        exit_btn.setName("exit_btn"); // NOI18N
        exit_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit_btnMouseClicked(evt);
            }
        });

        status_tx.setFont(resourceMap.getFont("jTextField1.font")); // NOI18N
        status_tx.setText(resourceMap.getString("status_tx.text")); // NOI18N
        status_tx.setName("status_tx"); // NOI18N

        edad_tx.setFont(resourceMap.getFont("jTextField1.font")); // NOI18N
        edad_tx.setText(resourceMap.getString("edad_tx.text")); // NOI18N
        edad_tx.setName("edad_tx"); // NOI18N
        edad_tx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edad_txActionPerformed(evt);
            }
        });

        tele_tx.setFont(resourceMap.getFont("jTextField1.font")); // NOI18N
        tele_tx.setText(resourceMap.getString("tele_tx.text")); // NOI18N
        tele_tx.setName("tele_tx"); // NOI18N
        tele_tx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tele_txActionPerformed(evt);
            }
        });

        busq_tx.setFont(resourceMap.getFont("jTextField1.font")); // NOI18N
        busq_tx.setText(resourceMap.getString("busq_tx.text")); // NOI18N
        busq_tx.setName("busq_tx"); // NOI18N

        label3.setFont(resourceMap.getFont("jTextField1.font")); // NOI18N
        label3.setName("label3"); // NOI18N
        label3.setText(resourceMap.getString("label3.text")); // NOI18N

        jButton3.setFont(resourceMap.getFont("jTextField1.font")); // NOI18N
        jButton3.setIcon(resourceMap.getIcon("jButton3.icon")); // NOI18N
        jButton3.setText(resourceMap.getString("jButton3.text")); // NOI18N
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setName("jButton3"); // NOI18N
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        actualizar_btn.setFont(resourceMap.getFont("jTextField1.font")); // NOI18N
        actualizar_btn.setIcon(resourceMap.getIcon("actualizar_btn.icon")); // NOI18N
        actualizar_btn.setText(resourceMap.getString("actualizar_btn.text")); // NOI18N
        actualizar_btn.setName("actualizar_btn"); // NOI18N
        actualizar_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actualizar_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                actualizar_btnMouseEntered(evt);
            }
        });

        jLabel1.setIcon(resourceMap.getIcon("jLabel1.icon")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(735, 115));

        busqueda_btn.setIcon(resourceMap.getIcon("busqueda_btn.icon")); // NOI18N
        busqueda_btn.setText(resourceMap.getString("busqueda_btn.text")); // NOI18N
        busqueda_btn.setName("busqueda_btn"); // NOI18N
        busqueda_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                busqueda_btnMouseClicked(evt);
            }
        });

        jButton6.setIcon(resourceMap.getIcon("jButton6.icon")); // NOI18N
        jButton6.setText(resourceMap.getString("jButton6.text")); // NOI18N
        jButton6.setName("jButton6"); // NOI18N
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        changeF_btn.setText(resourceMap.getString("changeF_btn.text")); // NOI18N
        changeF_btn.setName("changeF_btn"); // NOI18N

        jLabel2.setBackground(resourceMap.getColor("jLabel2.background")); // NOI18N
        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        statusbox_tx.setText(resourceMap.getString("statusbox_tx.text")); // NOI18N
        statusbox_tx.setName("statusbox_tx"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NomPer_tx, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(151, 151, 151)
                                .addComponent(modi_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(exit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(edad_tx, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jButton3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tele_tx, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(statusbox_tx)
                                    .addComponent(status_tx, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(actualizar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(changeF_btn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(busq_tx, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(busqueda_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(modi_btn, 0, 0, Short.MAX_VALUE)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NomPer_tx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(actualizar_btn)
                        .addComponent(status_tx, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(changeF_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusbox_tx, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(edad_tx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tele_tx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton6, 0, 0, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(busq_tx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(busqueda_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(434, 434, 434))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exit_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_btnMouseClicked
        Login log= new Login();
        log.setVisible(true);
        dispose();
    }//GEN-LAST:event_exit_btnMouseClicked

    private void modi_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modi_btnMouseClicked
        ModificarPerfil modi= new ModificarPerfil();
        modi.setVisible(true);
        dispose();
    }//GEN-LAST:event_modi_btnMouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        Amigos am= new Amigos();
        am.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        VerSolicitudes sol= new VerSolicitudes();
        sol.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton6MouseClicked

    private void NomPer_txActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomPer_txActionPerformed
        Registro regs= new Registro();

        Profile per = new Profile(regs.dir);
        try {

            per.pro.seek(0);
            String name= per.pro.readUTF();

            this.NomPer_tx.setText(name);

        } catch (IOException ex) {
            System.out.println("Error :" + ex.getMessage());
 
        }

        
    }//GEN-LAST:event_NomPer_txActionPerformed

    private void edad_txActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edad_txActionPerformed
    
    }//GEN-LAST:event_edad_txActionPerformed

    private void tele_txActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tele_txActionPerformed
         Registro regs= new Registro();

        Profile per = new Profile(regs.dir);
        try {

            per.pro.seek(0);
            per.pro.readUTF();
            per.pro.readUTF();
            per.pro.readLong();
            per.pro.readUTF();
            per.pro.readLong();
            int tel= per.pro.readInt();
            String telefono= String.valueOf(tel);
            this.tele_tx.setText(telefono);


        } catch (IOException ex) {
            System.out.println("Error :" + ex.getMessage());

        }
    }//GEN-LAST:event_tele_txActionPerformed

    private void actualizar_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizar_btnMouseClicked
        Registro regs= new Registro();
        Profile per= new Profile(regs.dir);
        try {
            per.pro.seek(per.pro.length());
            String estatus= this.status_tx.getText();
            Date fecha= new Date();

            per.pro.writeUTF(estatus);
            per.pro.writeLong(fecha.getTime());

            status=fecha.toString()+ ":" + status;
            Mstatus= Mstatus+status;
            this.statusbox_tx.setText(Mstatus);
            
            
            pos= per.pro.getFilePointer();
            
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }


    }//GEN-LAST:event_actualizar_btnMouseClicked

    private void actualizar_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizar_btnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_actualizar_btnMouseEntered

    private void busqueda_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_busqueda_btnMouseClicked
            String email= this.busq_tx.getText();

            Archivos ar= new Archivos();
           try{

            ar.g.seek(0);
            while (ar.g.getFilePointer() < ar.g.length()) {
                String mail= ar.g.readUTF();
                if(mail.equals(email)){

                }
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_busqueda_btnMouseClicked

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Perfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NomPer_tx;
    private javax.swing.JButton actualizar_btn;
    private javax.swing.JTextField busq_tx;
    private javax.swing.JButton busqueda_btn;
    private javax.swing.JButton changeF_btn;
    private javax.swing.JTextField edad_tx;
    private javax.swing.JButton exit_btn;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private java.awt.Label label3;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private javax.swing.JButton modi_btn;
    private javax.swing.JTextField status_tx;
    private javax.swing.JTextField statusbox_tx;
    private javax.swing.JTextField tele_tx;
    // End of variables declaration//GEN-END:variables

}
