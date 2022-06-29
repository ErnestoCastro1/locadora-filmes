/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.views;

import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import locadora.controller.ClientController;
import locadora.dao.ExceptionDAO;
import locadora.model.Client;

/**
 *
 * @author Aluno
 */
public class ScreenConsultClient extends javax.swing.JFrame {
    
    private ScreenClient screenClient;
    /**
     * Creates new form ScreenConsultClient
     */
    public ScreenConsultClient() {
        initComponents();
    }
    
    public ScreenConsultClient(ScreenClient screenClient){
        this.screenClient = screenClient;
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

        jLabelConsultClient = new javax.swing.JLabel();
        jPanelConsulClient = new javax.swing.JPanel();
        jLabelNameClient = new javax.swing.JLabel();
        jTextFieldNameClient = new javax.swing.JTextField();
        jButtonConsulClient = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Video Locadora Hora da Pipoca");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                fecharTela(evt);
            }
        });

        jLabelConsultClient.setFont(new java.awt.Font("MV Boli", 0, 36)); // NOI18N
        jLabelConsultClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon.png"))); // NOI18N
        jLabelConsultClient.setText("Consultar Cliente");

        jPanelConsulClient.setBackground(new java.awt.Color(153, 153, 153));
        jPanelConsulClient.setPreferredSize(new java.awt.Dimension(700, 500));

        jLabelNameClient.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabelNameClient.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNameClient.setText("Insira o nome do cliente:");

        jTextFieldNameClient.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N

        jButtonConsulClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/lupa.png"))); // NOI18N
        jButtonConsulClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarClient(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "NIF", "E-mail", "Endereço", "Data Nascimeto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanelConsulClientLayout = new javax.swing.GroupLayout(jPanelConsulClient);
        jPanelConsulClient.setLayout(jPanelConsulClientLayout);
        jPanelConsulClientLayout.setHorizontalGroup(
            jPanelConsulClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsulClientLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabelNameClient)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNameClient, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonConsulClient, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(jPanelConsulClientLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanelConsulClientLayout.setVerticalGroup(
            jPanelConsulClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsulClientLayout.createSequentialGroup()
                .addGroup(jPanelConsulClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelConsulClientLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanelConsulClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNameClient)
                            .addComponent(jTextFieldNameClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelConsulClientLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButtonConsulClient, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelConsulClient, javax.swing.GroupLayout.DEFAULT_SIZE, 969, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelConsultClient)
                .addGap(329, 329, 329))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabelConsultClient)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelConsulClient, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void consultarClient(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarClient

        String name = jTextFieldNameClient.getText();
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        tableModel.setRowCount(0);
        ClientController clientController = new ClientController();
        
        try {
            ArrayList<Client> clients = clientController.consultClient(name);
            clients.forEach((Client client)-> {
                tableModel.addRow(new Object[] {
                                                client.getCodClient(),
                                                client.getName(),
                                                client.getNif(),
                                                client.getEmail(),
                                                client.getAddress(),
                                                client.getDtBirth()
                                            });
            });
            jTable1.setModel(tableModel);
            
        }catch(ExceptionDAO e){
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, e);
        }
        
        
    }//GEN-LAST:event_consultarClient

    private void fecharTela(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_fecharTela
        this.dispose();
        this.screenClient.setVisible(true);
    }//GEN-LAST:event_fecharTela

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        if(evt.getClickCount()==2){
            Integer codClient = (Integer) jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0);
            String name = (String) jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 1);
            String nif = (String) jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 2);
            String email = (String) jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 3);
            String address = (String) jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 4);
            Date dtBirth = (Date) jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 5);
            
            this.screenClient.buscarClient(codClient, name, nif, email, address, dtBirth);
            this.screenClient.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(ScreenConsultClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScreenConsultClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScreenConsultClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScreenConsultClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScreenConsultClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConsulClient;
    private javax.swing.JLabel jLabelConsultClient;
    private javax.swing.JLabel jLabelNameClient;
    private javax.swing.JPanel jPanelConsulClient;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldNameClient;
    // End of variables declaration//GEN-END:variables
}
