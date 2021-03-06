package gui;

import Classes.Apartamento;
import Classes.ArCondicionado;
import Classes.Iluminacao;
import Classes.Porta;
import javax.swing.JOptionPane;

/**
 *
 * @author full
 */
public class TelaAp extends javax.swing.JFrame {

    Apartamento ap;
    ArCondicionado ac;
    Porta porta;
    Iluminacao iluminacao;

    /**
     * Creates new form TelaAp
     */
    public TelaAp() {
        ap = new Apartamento();
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldValorApBase = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonIncluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaSaida = new javax.swing.JTextArea();
        jComboBoxApBase = new javax.swing.JComboBox();
        jCheckBoxAr = new javax.swing.JCheckBox();
        jCheckBoxPorta = new javax.swing.JCheckBox();
        jCheckBoxIluminacao = new javax.swing.JCheckBox();
        jTextFieldPrecoAr = new javax.swing.JTextField();
        jTextFieldPrecoPorta = new javax.swing.JTextField();
        jTextFieldPrecoIluminacao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Padrão de Projeto Decorator"); // NOI18N
        setResizable(false);

        jLabel1.setText("Apartamento Básico:");

        jLabel2.setText("Valor:");

        jTextFieldValorApBase.setText("5000");

        jLabel3.setText("Acessorios:");

        jLabel4.setText("Descrição");

        jButtonIncluir.setText("Incluir");
        jButtonIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncluirActionPerformed(evt);
            }
        });

        jTextAreaSaida.setColumns(20);
        jTextAreaSaida.setRows(5);
        jScrollPane1.setViewportView(jTextAreaSaida);

        jComboBoxApBase.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Escolha o tipo de Apartamento!", "Básico", "Luxo", " ", " " }));
        jComboBoxApBase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxApBaseMouseClicked(evt);
            }
        });

        jCheckBoxAr.setText("Ar Condicionado");
        jCheckBoxAr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxArActionPerformed(evt);
            }
        });

        jCheckBoxPorta.setText("Porta");
        jCheckBoxPorta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxPortaActionPerformed(evt);
            }
        });

        jCheckBoxIluminacao.setText("Iluminação");
        jCheckBoxIluminacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxIluminacaoActionPerformed(evt);
            }
        });

        jTextFieldPrecoAr.setEditable(false);

        jTextFieldPrecoPorta.setEditable(false);

        jTextFieldPrecoIluminacao.setEditable(false);

        jLabel5.setText("R$:");

        jLabel6.setText("R$:");

        jLabel7.setText("R$:");

        jLabel8.setText("R$:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(187, 187, 187)
                .addComponent(jLabel2)
                .addGap(66, 66, 66))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jCheckBoxIluminacao)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7))
                                .addComponent(jCheckBoxPorta)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jCheckBoxAr)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel5))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldPrecoAr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldPrecoIluminacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldPrecoPorta, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxApBase, 0, 237, Short.MAX_VALUE)))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldValorApBase, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonIncluir))
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldValorApBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxApBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPrecoAr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jCheckBoxAr))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPrecoPorta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jCheckBoxPorta)
                    .addComponent(jLabel3))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPrecoIluminacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jCheckBoxIluminacao)
                    .addComponent(jButtonIncluir))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncluirActionPerformed
        try {
            ap.setTipo(jComboBoxApBase.getSelectedItem() + "");
            ap.setPreco(Double.parseDouble(jTextFieldValorApBase.getText()));

            if (jComboBoxApBase.getSelectedIndex() == 1 && !jCheckBoxAr.isSelected()) {
                jTextAreaSaida.setText(ap + "");
            }
            if (jComboBoxApBase.getSelectedIndex() == 1 && jCheckBoxAr.isSelected()) {
                ac = new ArCondicionado(ap);
                jTextAreaSaida.setText(ac + "");
            }
            if (jComboBoxApBase.getSelectedIndex() == 1 && jCheckBoxIluminacao.isSelected()) {
                iluminacao = new Iluminacao(ap);
                jTextAreaSaida.setText(iluminacao + "");
            }
            if (jComboBoxApBase.getSelectedIndex() == 1 && jCheckBoxPorta.isSelected()) {
                porta = new Porta(ap);
                jTextAreaSaida.setText(porta + "");
            }
            if (jComboBoxApBase.getSelectedIndex() == 1 && jCheckBoxAr.isSelected()
                    && jCheckBoxPorta.isSelected()) {
                porta = new Porta(new ArCondicionado(ap));
                
                jTextAreaSaida.setText(porta + "\n");
            }
            if (jComboBoxApBase.getSelectedIndex() == 1 && jCheckBoxAr.isSelected()
                    && jCheckBoxPorta.isSelected() && jCheckBoxIluminacao.isSelected()) {
                iluminacao = new Iluminacao(new Porta(new ArCondicionado(ap)));
                jTextAreaSaida.setText(iluminacao + "\n");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao incluir!");
        }

    }//GEN-LAST:event_jButtonIncluirActionPerformed

    private void jComboBoxApBaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxApBaseMouseClicked
        // TODO add your handling code here:
        jTextFieldValorApBase.requestFocus();
    }//GEN-LAST:event_jComboBoxApBaseMouseClicked

    private void jCheckBoxArActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxArActionPerformed
        ac = new ArCondicionado(ap);
        if (jCheckBoxAr.isSelected()) {
            jTextFieldPrecoAr.setText(ac.getPrecoAr() + "");
        } else {
            jTextFieldPrecoAr.setText("");
        }
    }//GEN-LAST:event_jCheckBoxArActionPerformed

    private void jCheckBoxIluminacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxIluminacaoActionPerformed
        iluminacao = new Iluminacao(ap);
        if (jCheckBoxIluminacao.isSelected()) {
            jTextFieldPrecoIluminacao.setText(iluminacao.getPrecoDaIluminacao() + "");
        } else {
            jTextFieldPrecoIluminacao.setText("");
        }
    }//GEN-LAST:event_jCheckBoxIluminacaoActionPerformed

    private void jCheckBoxPortaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxPortaActionPerformed
        porta = new Porta(ap);
        if (jCheckBoxPorta.isSelected()) {
            jTextFieldPrecoPorta.setText(porta.getPrecoDaPorta() + "");
        } else {
            jTextFieldPrecoPorta.setText("");
        }
    }//GEN-LAST:event_jCheckBoxPortaActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaAp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIncluir;
    private javax.swing.JCheckBox jCheckBoxAr;
    private javax.swing.JCheckBox jCheckBoxIluminacao;
    private javax.swing.JCheckBox jCheckBoxPorta;
    private javax.swing.JComboBox jComboBoxApBase;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaSaida;
    private javax.swing.JTextField jTextFieldPrecoAr;
    private javax.swing.JTextField jTextFieldPrecoIluminacao;
    private javax.swing.JTextField jTextFieldPrecoPorta;
    private javax.swing.JTextField jTextFieldValorApBase;
    // End of variables declaration//GEN-END:variables
}
