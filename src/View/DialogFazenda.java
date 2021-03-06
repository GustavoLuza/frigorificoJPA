/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.DaoFazenda;
import Model.Fazenda;
import Tipos.TipoAnimal;
import Tipos.TipoPasto;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author gusta
 */
public class DialogFazenda extends javax.swing.JDialog {

    DaoFazenda dao = new DaoFazenda();
    
    private void carregaPasto(){
        DefaultComboBoxModel cdm= new DefaultComboBoxModel(TipoPasto.values());
        ComboPasto.setModel(cdm);
    }
    
    private void carregaAnimal(){
        DefaultComboBoxModel cdm= new DefaultComboBoxModel(TipoAnimal.values());
        ComboAnimal.setModel(cdm);
    }
    
    
    private void carregaFazenda(){
        TableFazenda.setModel( new MyTableModel(Fazenda.class, dao.getFazendaList(), TableFazenda));
                
    }
    
    private void carregaFazenda(String filtro){
        TableFazenda.setModel( new MyTableModel(Fazenda.class, dao.getFazendaList(filtro), TableFazenda));
    }
    
    //INICIAR COMPONENTES
    private void iniciaComponentes(){
        TextCodigo.setText("");
        TextNome.setText("");
        TextCNPJ.setText("");
        TextEndereco.setText("");
        TextTelefone.setText("");
        TextContato.setText("");
        ComboPasto.setSelectedIndex(0);
        ComboAnimal.setSelectedIndex(0);
        TextPesquisar.setText("");
        TextNome.requestFocus();
    }
    //CRIAR UM OBJETO A PARTIR DA TELA
    private Fazenda populateObjeto(){
        return(new Fazenda(TextCodigo.getText().isEmpty() ? 0 : Integer.parseInt(TextCodigo.getText()), TextNome.getText(),TextCNPJ.getText(),TextTelefone.getText(),TextEndereco.getText(),(TipoPasto)ComboPasto.getSelectedItem(),(TipoAnimal)ComboAnimal.getSelectedItem(),TextContato.getText()));
    }
    //PREENCHER OS COMPONENTES COM UM OBJETO
    private void populateComponente(Fazenda fazenda){
        TextCodigo.setText(fazenda.getId()+""); //"" converte para string nesse caso
        TextNome.setText(fazenda.getNome());
        TextCNPJ.setText(fazenda.getCnpj());
        TextEndereco.setText(fazenda.getEndereco());
        TextTelefone.setText(fazenda.getTelefone());
        TextContato.setText(fazenda.getNome_contato());
        ComboPasto.setSelectedItem(fazenda.getPasto());
        ComboAnimal.setSelectedItem(fazenda.getAnimal());
    }
        
    public DialogFazenda(java.awt.Frame parent, boolean modal) {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TextCodigo = new javax.swing.JTextField();
        TextNome = new javax.swing.JTextField();
        TextEndereco = new javax.swing.JTextField();
        TextContato = new javax.swing.JTextField();
        TextPesquisar = new javax.swing.JTextField();
        ComboPasto = new javax.swing.JComboBox<>();
        ComboAnimal = new javax.swing.JComboBox<>();
        TextCNPJ = new javax.swing.JFormattedTextField();
        TextTelefone = new javax.swing.JFormattedTextField();
        ButtonPesquisar = new javax.swing.JButton();
        ButtonNovo = new javax.swing.JButton();
        ButtonSalvar = new javax.swing.JButton();
        ButtonRemover = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableFazenda = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FAZENDA");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("CADASTRO DE FAZENDA"));

        jLabel1.setText("CÓDIGO");

        jLabel2.setText("NOME");

        jLabel3.setText("CNPJ");

        jLabel4.setText("ENDEREÇO");

        jLabel5.setText("TELEFONE");

        jLabel6.setText("TIPO DE PASTO");

        jLabel7.setText("TIPO DE ANIMAL");

        jLabel8.setText("NOME DO CONTATO");

        jLabel9.setText("PESQUISAR POR NOME OU CNPJ");

        TextCodigo.setEditable(false);

        ComboPasto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ComboAnimal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        try {
            TextCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            TextTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        ButtonPesquisar.setText("PESQUISAR");
        ButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPesquisarActionPerformed(evt);
            }
        });

        ButtonNovo.setText("NOVO");
        ButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNovoActionPerformed(evt);
            }
        });

        ButtonSalvar.setText("SALVAR");
        ButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalvarActionPerformed(evt);
            }
        });

        ButtonRemover.setText("REMOVER");
        ButtonRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRemoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(TextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(TextEndereco))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TextContato)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(TextTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(TextCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(ComboPasto, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(ComboAnimal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TextPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonPesquisar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(ButtonNovo)
                        .addGap(91, 91, 91)
                        .addComponent(ButtonSalvar)
                        .addGap(80, 80, 80)
                        .addComponent(ButtonRemover)))
                .addContainerGap(288, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TextCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TextEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TextTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TextContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ComboPasto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ComboAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TextPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonPesquisar))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonNovo)
                    .addComponent(ButtonSalvar)
                    .addComponent(ButtonRemover))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        TableFazenda.setModel(new javax.swing.table.DefaultTableModel(
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
        TableFazenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableFazendaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableFazenda);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        try{
            this.carregaAnimal();
            this.carregaPasto();
            this.carregaFazenda();
        }catch(Exception ex){
            System.out.println("ERRO: "+ex.getMessage());
        }
    }//GEN-LAST:event_formWindowOpened

    private void ButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNovoActionPerformed
        // TODO add your handling code here:
           this.iniciaComponentes();
    }//GEN-LAST:event_ButtonNovoActionPerformed

    private void ButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalvarActionPerformed
        // TODO add your handling code here:
        //NOME
        try {
            double teste;
            teste = Double.parseDouble(TextNome.getText());
            JOptionPane.showMessageDialog(null, "NÃO É PERMITIDO NÚMEROS NO CAMPO DE NOME");
            TextNome.setText("");
            TextNome.requestFocus();
            return;
        } catch (Exception nome) {
            
        }
        
        if (TextNome.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "CAMPO NOME NÃO PODE SER VAZIO");
            TextNome.requestFocus();
            return;
        }
        
        //CNPJ
        if(TextCNPJ.getText().equals("  .   .   /    -  ")){
            JOptionPane.showMessageDialog(null, "CAMPO CNPJ NÃO PODE SER VAZIO");
            TextCNPJ.setText("");
            TextCNPJ.requestFocus();
            return;
        }
        
        //ENDEREÇO
        if (TextEndereco.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "CAMPO ENDEREÇO NÃO PODE SER VAZIO");
            TextEndereco.requestFocus();
            return;
        }
        
        //TELEFONE
        if(TextTelefone.getText().equals("(  )       -    ")){
            JOptionPane.showMessageDialog(null, "CAMPO TELEFONE NÃO PODE SER VAZIO");
            TextTelefone.setText("");
            TextTelefone.requestFocus();
            return;
        }
        
        //CONTATO
        try {
            double teste;
            teste = Double.parseDouble(TextContato.getText());
            JOptionPane.showMessageDialog(null, "NÃO É PERMITIDO NÚMEROS NO CAMPO CONTATO");
            TextContato.setText("");
            TextContato.requestFocus();
            return;
        } catch (Exception nome) {
            
        }
        
        if (TextContato.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "CAMPO CONTATO NÃO PODE SER VAZIO");
            TextContato.requestFocus();
            return;
        }
        
        try{
           if(TextCodigo.getText().isEmpty()){ //REGISTRO NOVO
               dao.addFazenda(populateObjeto());
           }else{ //ATUALIZAÇÃO
               dao.updateFazenda(populateObjeto());
           }
           this.iniciaComponentes();
           this.carregaFazenda();
        }catch(Exception ex){
            System.out.println("ERRO: "+ex.getMessage());
        }
    }//GEN-LAST:event_ButtonSalvarActionPerformed

    private void ButtonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRemoverActionPerformed
        // TODO add your handling code here:
        if (TextCodigo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"DE UM DUPLO CLIQUE NO REGISTRO QUE DESEJA EXCLUIR");
            return;
        }
        if (JOptionPane.showConfirmDialog(null, "DESEJA EXCLUIR?")!=0){
            iniciaComponentes();
            return;
        }
        try{
            dao.deleteFazenda(populateObjeto());
            iniciaComponentes();
            carregaFazenda();
        }catch(Exception ex){
            System.out.println("ERRO: "+ex.getMessage());
        }
    }//GEN-LAST:event_ButtonRemoverActionPerformed

    private void ButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPesquisarActionPerformed
        // TODO add your handling code here:
        if(TextPesquisar.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null,"DIGITE ALGO PARA PESQUISAR");
            TextPesquisar.requestFocus();
        }
        try{
            this.carregaFazenda(TextPesquisar.getText());
           }catch(Exception ex){
            System.out.println("ERRO: "+ex.getMessage());
        }
    }//GEN-LAST:event_ButtonPesquisarActionPerformed

    private void TableFazendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableFazendaMouseClicked
        // TODO add your handling code here:
            if (evt.getClickCount()==2){
                String valor= TableFazenda.getValueAt(TableFazenda.getSelectedRow(),0)+""; //+"" TRANSFORMA EM STRING
                int codigo = Integer.parseInt(valor);
                populateComponente(dao.getFazenda(codigo));
            }
    }//GEN-LAST:event_TableFazendaMouseClicked

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
            java.util.logging.Logger.getLogger(DialogFazenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogFazenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogFazenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogFazenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogFazenda dialog = new DialogFazenda(new javax.swing.JFrame(), true);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonNovo;
    private javax.swing.JButton ButtonPesquisar;
    private javax.swing.JButton ButtonRemover;
    private javax.swing.JButton ButtonSalvar;
    private javax.swing.JComboBox<String> ComboAnimal;
    private javax.swing.JComboBox<String> ComboPasto;
    private javax.swing.JTable TableFazenda;
    private javax.swing.JFormattedTextField TextCNPJ;
    private javax.swing.JTextField TextCodigo;
    private javax.swing.JTextField TextContato;
    private javax.swing.JTextField TextEndereco;
    private javax.swing.JTextField TextNome;
    private javax.swing.JTextField TextPesquisar;
    private javax.swing.JFormattedTextField TextTelefone;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
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
    // End of variables declaration//GEN-END:variables
}
