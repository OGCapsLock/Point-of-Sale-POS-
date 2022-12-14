/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerFormaPagamento;
import java.util.ArrayList;
import model.ModelFormaPagamento;
import util.BLMascaras;


public class ViewPagamentoPDV extends javax.swing.JDialog {

    ArrayList<ModelFormaPagamento> listaModelFormaPagamentos = new ArrayList<>();
    ControllerFormaPagamento controllerFormaPagamento = new ControllerFormaPagamento();
    BLMascaras bLMascaras = new BLMascaras();
    private float valorTotal;
    private float desconto;
    private float valorRecebido;
    private float troco;
    private String formaPagamento;
    private boolean confirmado;

    /**
     * Creates new form ViewPagamentoPDV
     */
    public ViewPagamentoPDV(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        listaFormaPagamento();
        confirmado = false;
        calcularPagamento();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxFormaPagamento = new javax.swing.JComboBox<>();
        jFormattedTextFieldSubtotal = new javax.swing.JFormattedTextField();
        jFormattedTextFieldDesconto = new javax.swing.JFormattedTextField();
        jFormattedTextFieldValorRecebido = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldValorTotal = new javax.swing.JTextField();
        jTextFieldTroco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButtonConfirma = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("FORMAS DE PAGAMENTOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("PAGAMENTO:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("SUBTOTAL:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("DESCONTO:");

        jComboBoxFormaPagamento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBoxFormaPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxFormaPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFormaPagamentoActionPerformed(evt);
            }
        });

        jFormattedTextFieldSubtotal.setEnabled(false);
        jFormattedTextFieldSubtotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jFormattedTextFieldSubtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldSubtotalActionPerformed(evt);
            }
        });

        jFormattedTextFieldDesconto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jFormattedTextFieldDesconto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextFieldDescontoFocusLost(evt);
            }
        });
        jFormattedTextFieldDesconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldDescontoActionPerformed(evt);
            }
        });

        jFormattedTextFieldValorRecebido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jFormattedTextFieldValorRecebido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextFieldValorRecebidoFocusLost(evt);
            }
        });
        jFormattedTextFieldValorRecebido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldValorRecebidoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("VALOR RECEBIDO:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBoxFormaPagamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jFormattedTextFieldSubtotal)
                    .addComponent(jFormattedTextFieldDesconto)
                    .addComponent(jFormattedTextFieldValorRecebido, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jFormattedTextFieldSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextFieldDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextFieldValorRecebido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 153, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "VALOR TOTAL A PAGAR", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("VALOR TOTAL R$:");

        jTextFieldValorTotal.setBackground(new java.awt.Color(255, 255, 0));
        jTextFieldValorTotal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextFieldValorTotal.setForeground(new java.awt.Color(255, 0, 0));
        jTextFieldValorTotal.setText("0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap())
        );

        jTextFieldTroco.setBackground(new java.awt.Color(255, 255, 0));
        jTextFieldTroco.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldTroco.setForeground(new java.awt.Color(255, 0, 0));
        jTextFieldTroco.setText("0");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("TROCO:");

        jButtonConfirma.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonConfirma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconfinder_checkmark-24_103184.png"))); // NOI18N
        jButtonConfirma.setText("CONFIRMAR");
        jButtonConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmaActionPerformed(evt);
            }
        });

        jMenu1.setText("COMANDOS");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem1.setText("CANCELAR/SAIR");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonConfirma)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jButtonConfirma))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmaActionPerformed
        // TODO add your handling code here:
        this.desconto = Float.parseFloat(jFormattedTextFieldDesconto.getText());
        this.setValorRecebido(Float.parseFloat(jFormattedTextFieldValorRecebido.getText()));
        this.troco = Float.parseFloat(jTextFieldTroco.getText());
        this.valorTotal = Float.parseFloat(jTextFieldValorTotal.getText());
        this.formaPagamento = jComboBoxFormaPagamento.getSelectedItem().toString();
        confirmado = true;
        dispose();
    }//GEN-LAST:event_jButtonConfirmaActionPerformed

    private void jFormattedTextFieldDescontoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldDescontoFocusLost
        // TODO add your handling code here:
       //jFormattedTextFieldDesconto.setText(bLMascaras.converterPontoPraVirgula(jFormattedTextFieldDesconto.getText()));
        calcularPagamento();
    }//GEN-LAST:event_jFormattedTextFieldDescontoFocusLost

    private void jFormattedTextFieldValorRecebidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldValorRecebidoFocusLost
        // TODO add your handling code here:
       //jFormattedTextFieldValorRecebido.setText(bLMascaras.converterVirgulaParaPonto(jFormattedTextFieldValorRecebido.getText()));
        calcularPagamento();
    }//GEN-LAST:event_jFormattedTextFieldValorRecebidoFocusLost

    private void jComboBoxFormaPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFormaPagamentoActionPerformed
        // TODO add your handling code here:
       // jFormattedTextFieldDesconto.requestFocus();
        jFormattedTextFieldValorRecebido.requestFocus();
        
    }//GEN-LAST:event_jComboBoxFormaPagamentoActionPerformed

    private void jFormattedTextFieldDescontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldDescontoActionPerformed
        // TODO add your handling code here:
        jFormattedTextFieldValorRecebido.requestFocus();
    }//GEN-LAST:event_jFormattedTextFieldDescontoActionPerformed

    private void jFormattedTextFieldValorRecebidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldValorRecebidoActionPerformed
        // TODO add your handling code here:
        jButtonConfirma.requestFocus();
    }//GEN-LAST:event_jFormattedTextFieldValorRecebidoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jFormattedTextFieldSubtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldSubtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldSubtotalActionPerformed

    //verificar exceptions
    private void calcularPagamento() {
        float subTotal, desconto = 0, recebido = 0, pagar, troco;

        try {
            subTotal = Float.parseFloat(jFormattedTextFieldSubtotal.getText());
        } catch (Exception e) {
            subTotal = 0;
        }

         try {
            if(!jFormattedTextFieldDesconto.getText().equals(""))
                desconto = Float.parseFloat(jFormattedTextFieldDesconto.getText());
        } catch (Exception e) {
            desconto = 0;
           jFormattedTextFieldDesconto.setText("0");
        }

        try {
           if(!jFormattedTextFieldValorRecebido.getText().equals(""))
                recebido = Float.parseFloat(jFormattedTextFieldValorRecebido.getText());
        } catch (Exception e) {
            recebido = 0;
            jFormattedTextFieldValorRecebido.setText("0");
        }

        //calcular valor a pagar
        pagar = subTotal - desconto;
        jTextFieldValorTotal.setText(bLMascaras.arredondamentoComPontoDuasCasasString(pagar));
        //Calcular desconto
        troco = recebido - pagar;
        jTextFieldTroco.setText(bLMascaras.arredondamentoComPontoDuasCasasString(troco));

    }

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
            java.util.logging.Logger.getLogger(ViewPagamentoPDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPagamentoPDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPagamentoPDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPagamentoPDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewPagamentoPDV dialog = new ViewPagamentoPDV(new javax.swing.JFrame(), true);
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

    /**
     * Preenche o combobox com as formas de pagamentos
     */
    private void listaFormaPagamento() {
        listaModelFormaPagamentos = controllerFormaPagamento.getListaFormaPagamentoController();
        jComboBoxFormaPagamento.removeAllItems();
        for (int i = 0; i < listaModelFormaPagamentos.size(); i++) {
            jComboBoxFormaPagamento.addItem(listaModelFormaPagamentos.get(i).getDescricaoForPag());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConfirma;
    private javax.swing.JComboBox<String> jComboBoxFormaPagamento;
    private javax.swing.JFormattedTextField jFormattedTextFieldDesconto;
    private javax.swing.JFormattedTextField jFormattedTextFieldSubtotal;
    private javax.swing.JFormattedTextField jFormattedTextFieldValorRecebido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextFieldTroco;
    private javax.swing.JTextField jTextFieldValorTotal;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the valorTotal
     */
    public float getValorTotal() {
        return valorTotal;
    }

    /**
     * @param valorTotal the valorTotal to set
     */
    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    /**
     * @return the desconto
     */
    public float getDesconto() {
        return desconto;
    }

    /**
     * @param desconto the desconto to set
     */
    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    /**
     * @return the valorRecebido
     */
    public float getValorRecebido() {
        return valorRecebido;
    }

    /**
     * @param valorRecebido the valorRecebido to set
     */
    public void setValorRecebido(float valorRecebido) {
        this.valorRecebido = valorRecebido;
    }

    /**
     * @return the troco
     */
    public float getTroco() {
        return troco;
    }

    /**
     * @param troco the troco to set
     */
    public void setTroco(float troco) {
        this.troco = troco;
    }

    /**
     * @return the formaPagamento
     */
    public String getFormaPagamento() {
        return formaPagamento;
    }

    /**
     * @param formaPagamento the formaPagamento to set
     */
    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void setTextFieldValorTotal() {
        this.jFormattedTextFieldSubtotal.setText(this.valorTotal + "");
    }

    /**
     * @return the confirmado
     */
    public boolean isConfirmado() {
        return confirmado;
    }

    /**
     * @param confirmado the confirmado to set
     */
    public void setConfirmado(boolean confirmado) {
        this.confirmado = confirmado;
    }

}
