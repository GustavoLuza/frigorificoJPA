/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import View.DialogAnimal;
import View.DialogCliente;
import View.DialogColaborador;
import View.DialogFazenda;
import View.DialogFrigorifico;
import View.DialogProduto;
import View.DialogVenda;

/**
 *
 * @author gusta
 */
public class FrameMenu extends javax.swing.JFrame {

    /**
     * Creates new form FrameMenu
     */
    public FrameMenu() {
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

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuBar5 = new javax.swing.JMenuBar();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jSeparator2 = new javax.swing.JSeparator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar6 = new javax.swing.JMenuBar();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        ItemAnimal = new javax.swing.JMenuItem();
        ItemCliente = new javax.swing.JMenuItem();
        ItemColaborador = new javax.swing.JMenuItem();
        ItemFazenda = new javax.swing.JMenuItem();
        ItemFrigorifico = new javax.swing.JMenuItem();
        ItemProduto = new javax.swing.JMenuItem();
        ItemVenda = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("File");
        jMenuBar3.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("File");
        jMenuBar4.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar4.add(jMenu7);

        jMenu8.setText("File");
        jMenuBar5.add(jMenu8);

        jMenu9.setText("Edit");
        jMenuBar5.add(jMenu9);

        jMenuItem1.setText("jMenuItem1");

        jMenu10.setText("File");
        jMenuBar6.add(jMenu10);

        jMenu11.setText("Edit");
        jMenuBar6.add(jMenu11);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Java.jpg"))); // NOI18N

        jMenu1.setText("CADASTROS E PESQUISAS");

        ItemAnimal.setText("ANIMAL");
        ItemAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemAnimalActionPerformed(evt);
            }
        });
        jMenu1.add(ItemAnimal);

        ItemCliente.setText("CLIENTE");
        ItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemClienteActionPerformed(evt);
            }
        });
        jMenu1.add(ItemCliente);

        ItemColaborador.setText("COLABORADOR");
        ItemColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemColaboradorActionPerformed(evt);
            }
        });
        jMenu1.add(ItemColaborador);

        ItemFazenda.setText("FAZENDA");
        ItemFazenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemFazendaActionPerformed(evt);
            }
        });
        jMenu1.add(ItemFazenda);

        ItemFrigorifico.setText("FRIGORIFICO");
        ItemFrigorifico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemFrigorificoActionPerformed(evt);
            }
        });
        jMenu1.add(ItemFrigorifico);

        ItemProduto.setText("PRODUTO");
        ItemProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemProdutoActionPerformed(evt);
            }
        });
        jMenu1.add(ItemProduto);

        ItemVenda.setText("VENDA");
        ItemVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemVendaActionPerformed(evt);
            }
        });
        jMenu1.add(ItemVenda);
        jMenu1.add(jSeparator1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 3, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ItemAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemAnimalActionPerformed
        // TODO add your handling code here:
        new DialogAnimal(this, true).setVisible(true);
    }//GEN-LAST:event_ItemAnimalActionPerformed

    private void ItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemClienteActionPerformed
        // TODO add your handling code here:
        new DialogCliente(this, true).setVisible(true);
    }//GEN-LAST:event_ItemClienteActionPerformed

    private void ItemColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemColaboradorActionPerformed
        // TODO add your handling code here:
        new DialogColaborador(this, true).setVisible(true);
    }//GEN-LAST:event_ItemColaboradorActionPerformed

    private void ItemFazendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemFazendaActionPerformed
        // TODO add your handling code here:
        new DialogFazenda(this, true).setVisible(true);
    }//GEN-LAST:event_ItemFazendaActionPerformed

    private void ItemFrigorificoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemFrigorificoActionPerformed
        // TODO add your handling code here:
        new DialogFrigorifico(this, true).setVisible(true);
    }//GEN-LAST:event_ItemFrigorificoActionPerformed

    private void ItemProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemProdutoActionPerformed
        // TODO add your handling code here:
        new DialogProduto(this, true).setVisible(true);
    }//GEN-LAST:event_ItemProdutoActionPerformed

    private void ItemVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemVendaActionPerformed
        // TODO add your handling code here:
        new DialogVenda(this, true).setVisible(true);
    }//GEN-LAST:event_ItemVendaActionPerformed

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
            java.util.logging.Logger.getLogger(FrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ItemAnimal;
    private javax.swing.JMenuItem ItemCliente;
    private javax.swing.JMenuItem ItemColaborador;
    private javax.swing.JMenuItem ItemFazenda;
    private javax.swing.JMenuItem ItemFrigorifico;
    private javax.swing.JMenuItem ItemProduto;
    private javax.swing.JMenuItem ItemVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuBar jMenuBar5;
    private javax.swing.JMenuBar jMenuBar6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}