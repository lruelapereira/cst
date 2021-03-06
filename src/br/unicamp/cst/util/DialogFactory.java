/*******************************************************************************
 * Copyright (c) 2012  DCA-FEEC-UNICAMP
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v3
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl.html
 * 
 * Contributors:
 *     K. Raizer, A. L. O. Paraense, R. R. Gudwin - initial API and implementation
 ******************************************************************************/
package br.unicamp.cst.util;

import br.unicamp.cst.representation.owrl.AbstractObject;
import br.unicamp.cst.representation.owrl.Property;
import br.unicamp.cst.representation.owrl.QualityDimension;
import java.awt.Dialog;
import org.jfree.ui.RefineryUtilities;

/**
 *
 * @author rgudwin
 */
public class DialogFactory extends javax.swing.JDialog {
    
    
    boolean ok = false;

    /**
     * Creates new form AbstractObjectDialog
     */
    public DialogFactory(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jLabel2 = new javax.swing.JLabel();
        jName = new javax.swing.JTextField();
        jOK = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jValue = new javax.swing.JTextField();
        jCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setText("Name:");

        jName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNameActionPerformed(evt);
            }
        });

        jOK.setText("OK");
        jOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOKActionPerformed(evt);
            }
        });

        jLabel3.setText("Value");

        jValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jValueActionPerformed(evt);
            }
        });

        jCancel.setText("Cancel");
        jCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jOK)
                        .addGap(64, 64, 64)
                        .addComponent(jCancel)
                        .addGap(67, 67, 67))
                    .addComponent(jName)
                    .addComponent(jValue))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jOK)
                    .addComponent(jCancel))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNameActionPerformed

    private void jOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOKActionPerformed
        // TODO add your handling code here:
        ok = true;
        setVisible(false);
    }//GEN-LAST:event_jOKActionPerformed

    private void jValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jValueActionPerformed

    private void jCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCancelActionPerformed
        // TODO add your handling code here:
        ok = false;
        setVisible(false);
    }//GEN-LAST:event_jCancelActionPerformed

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
            java.util.logging.Logger.getLogger(DialogFactory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogFactory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogFactory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogFactory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogFactory dialog = new DialogFactory(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    public static AbstractObject getAbstractObject() {

    DialogFactory dialog = new DialogFactory(null,true);
    dialog.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
    //dialog.setBounds(350, 350, 200, 200);
    dialog.setTitle("Enter Abstract Object data ...");
    dialog.jValue.setEditable(false);
    dialog.jValue.setEnabled(false);
    RefineryUtilities.centerFrameOnScreen(dialog);
    dialog.setVisible(true);
    dialog.dispose();
    if (dialog.ok == true) {
        AbstractObject output = new AbstractObject(dialog.jName.getText());
        return(output);
    }
    else return(null);
}   
    
    public static Property getProperty() {

    DialogFactory dialog = new DialogFactory(null,true);
    dialog.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
    //dialog.setBounds(350, 350, 200, 200);
    dialog.setTitle("Enter Property data ...");
    dialog.jValue.setEditable(false);
    dialog.jValue.setEnabled(false);
    RefineryUtilities.centerFrameOnScreen(dialog);
    dialog.setVisible(true);
    dialog.dispose();
    if (dialog.ok == true) {
        Property output = new Property(dialog.jName.getText());
        return(output);
    }
    else return(null);
}    
    
    public static QualityDimension getQualityDimension() {

    DialogFactory dialog = new DialogFactory(null,true);
    dialog.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
    //dialog.setBounds(350, 350, 200, 200);
    dialog.setTitle("Enter Quality Dimension data ...");
    dialog.jValue.setEditable(true);
    dialog.jValue.setEnabled(true);
    RefineryUtilities.centerFrameOnScreen(dialog);
    dialog.setVisible(true);
    dialog.dispose();
    if (dialog.ok == true) {
        QualityDimension output = new QualityDimension(dialog.jName.getText(),dialog.jValue.getText());
        return(output);
    }
    else return(null);
}

    public static void editAbstractObject(AbstractObject ao) {
        DialogFactory dialog = new DialogFactory(null,true);
        dialog.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
        //dialog.setBounds(350, 350, 200, 200);
        dialog.setTitle("Edit AbstractObject data ...");
        dialog.jValue.setEditable(false);
        dialog.jValue.setEnabled(false);
        dialog.jName.setText(ao.getName());
        RefineryUtilities.centerFrameOnScreen(dialog);
        dialog.setVisible(true);
        dialog.dispose();
        if (dialog.ok == true) {
           ao.setName(dialog.jName.getText());
        }
    }
    
    public static void editProperty(Property p) {
        DialogFactory dialog = new DialogFactory(null,true);
        dialog.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
        //dialog.setBounds(350, 350, 200, 200);
        dialog.setTitle("Edit Property data ...");
        dialog.jValue.setEditable(false);
        dialog.jValue.setEnabled(false);
        dialog.jName.setText(p.getName());
        RefineryUtilities.centerFrameOnScreen(dialog);
        dialog.setVisible(true);
        dialog.dispose();
        if (dialog.ok == true) {
           p.setName(dialog.jName.getText());
        }
    }


    public static void editQualityDimension(QualityDimension qd) {
        DialogFactory dialog = new DialogFactory(null,true);
        dialog.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
        //dialog.setBounds(350, 350, 200, 200);
        dialog.setTitle("Edit Quality Dimension data ...");
        dialog.jValue.setEditable(true);
        dialog.jValue.setEnabled(true);
        dialog.jName.setText(qd.getName());
        dialog.jValue.setText(qd.getValue().toString());
        RefineryUtilities.centerFrameOnScreen(dialog);
        dialog.setVisible(true);
        dialog.dispose();
        if (dialog.ok == true) {
           qd.setName(dialog.jName.getText());
           qd.setValue(dialog.jValue.getText());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jCancel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jName;
    private javax.swing.JButton jOK;
    private javax.swing.JTextField jValue;
    // End of variables declaration//GEN-END:variables
}
