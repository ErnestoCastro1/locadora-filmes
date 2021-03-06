/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.views;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeListener;
import locadora.controller.FilmController;
import locadora.dao.ExceptionDAO;

/**
 *
 * @author Ernesto.Castro
 */
public class ScreenFilm extends javax.swing.JFrame {

    private Integer codFilm = 0;
    private TelaPrincipal telaPricipal;
    /**
     * Creates new form ScreenFilm
     */
    
    public ScreenFilm() {
        initComponents();
    }
    
    public ScreenFilm(TelaPrincipal telaPrincipal){
        this.telaPricipal = telaPrincipal;
        initComponents();
    }
    
    public void buscarFilm(Integer codFilm, String title, String gender, String synopsis,Integer duration){
        this.codFilm = codFilm;
        this.jTextFieldTitle.setText(title);
        for(int i=0;i<jComboBoxGender.getItemCount();i++){
            if(jComboBoxGender.getItemAt(i).equals(gender))
                jComboBoxGender.setSelectedIndex(i);
        }
        this.jTextAreaSynopsis.setText(synopsis);
        this.jSpinnerDuration.setValue(duration);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCadastrFilm = new javax.swing.JLabel();
        jPanelFilm = new javax.swing.JPanel();
        jSpinnerDuration = new javax.swing.JSpinner();
        jLabelMinut = new javax.swing.JLabel();
        jLabelDuration = new javax.swing.JLabel();
        jLabelTitle = new javax.swing.JLabel();
        jTextFieldTitle = new javax.swing.JTextField();
        jLabelGender = new javax.swing.JLabel();
        jComboBoxGender = new javax.swing.JComboBox<>();
        jLabelSynopsis = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaSynopsis = new javax.swing.JTextArea();
        jButtonFilmeSave = new javax.swing.JButton();
        jButtonFilmClean = new javax.swing.JButton();
        jButtonFilmCancel = new javax.swing.JButton();
        jButtonFilmConsult = new javax.swing.JButton();
        jButtonDeleteFilm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Video Locadora Hora da Pipoca");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                fecharTela(evt);
            }
        });

        jLabelCadastrFilm.setFont(new java.awt.Font("MV Boli", 0, 36)); // NOI18N
        jLabelCadastrFilm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon.png"))); // NOI18N
        jLabelCadastrFilm.setText("CADASTRO DE FILME");
        jLabelCadastrFilm.setToolTipText("");

        jPanelFilm.setBackground(new java.awt.Color(153, 153, 153));
        jPanelFilm.setForeground(new java.awt.Color(255, 255, 255));
        jPanelFilm.setToolTipText("");
        jPanelFilm.setPreferredSize(new java.awt.Dimension(758, 500));

        jSpinnerDuration.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jSpinnerDuration.setModel(new javax.swing.SpinnerNumberModel(20, 20, 300, 10));
        jSpinnerDuration.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSpinnerDuration.setEditor(new javax.swing.JSpinner.NumberEditor(jSpinnerDuration, ""));

        jLabelMinut.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelMinut.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMinut.setText("minutos");

        jLabelDuration.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabelDuration.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDuration.setText("Dura????o:");

        jLabelTitle.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitle.setText("T??tulo:");

        jTextFieldTitle.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldTitle.setToolTipText("titulo do filme");
        jTextFieldTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTitleActionPerformed(evt);
            }
        });

        jLabelGender.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabelGender.setForeground(new java.awt.Color(255, 255, 255));
        jLabelGender.setText("G??nero:");

        jComboBoxGender.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jComboBoxGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Op????es", "A????o", "Anima????o", "Aventura", "Com??dia", "Com??dia rom??ntica", "Com??dia dram??tica", "Com??dia de a????o", "Dan??a", "Document??rio", "Docufic????o", "Drama", "Espionagem", "Faroeste", "Fantasia cient??fica", "Fic????o cient??fica", "Filmes de guerra", "Filme policial", "Musical", "Romance", "Seriado", "Suspense" }));
        jComboBoxGender.setToolTipText("Seleciona o g??nero");

        jLabelSynopsis.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabelSynopsis.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSynopsis.setText("Sinopse:");

        jTextAreaSynopsis.setColumns(2);
        jTextAreaSynopsis.setFont(new java.awt.Font("Monospaced", 2, 18)); // NOI18N
        jTextAreaSynopsis.setLineWrap(true);
        jTextAreaSynopsis.setRows(5);
        jTextAreaSynopsis.setToolTipText("Sinopse do filme");
        jTextAreaSynopsis.setMaximumSize(new java.awt.Dimension(20, 100));
        jScrollPane1.setViewportView(jTextAreaSynopsis);

        jButtonFilmeSave.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonFilmeSave.setText("Salvar");
        jButtonFilmeSave.setToolTipText("");
        jButtonFilmeSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFilmeSaveActionPerformed(evt);
            }
        });

        jButtonFilmClean.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonFilmClean.setText("Limpar");
        jButtonFilmClean.setToolTipText("");
        jButtonFilmClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFilmCleanActionPerformed(evt);
            }
        });

        jButtonFilmCancel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonFilmCancel.setText("Cancelar");
        jButtonFilmCancel.setToolTipText("");
        jButtonFilmCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFilmCancelActionPerformed(evt);
            }
        });

        jButtonFilmConsult.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonFilmConsult.setText("Consultar");
        jButtonFilmConsult.setToolTipText("");
        jButtonFilmConsult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrir_telaConsulta(evt);
            }
        });

        jButtonDeleteFilm.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonDeleteFilm.setText("Apagar");
        jButtonDeleteFilm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteFilmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFilmLayout = new javax.swing.GroupLayout(jPanelFilm);
        jPanelFilm.setLayout(jPanelFilmLayout);
        jPanelFilmLayout.setHorizontalGroup(
            jPanelFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFilmLayout.createSequentialGroup()
                .addGroup(jPanelFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFilmLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabelTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelFilmLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanelFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelFilmLayout.createSequentialGroup()
                                .addComponent(jLabelSynopsis)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelFilmLayout.createSequentialGroup()
                                .addComponent(jLabelGender)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxGender, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelFilmLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabelDuration)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinnerDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelMinut))
                    .addGroup(jPanelFilmLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonFilmeSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonFilmClean)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDeleteFilm)
                        .addGap(66, 66, 66)
                        .addComponent(jButtonFilmCancel)
                        .addGap(39, 39, 39)
                        .addComponent(jButtonFilmConsult)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanelFilmLayout.setVerticalGroup(
            jPanelFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFilmLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelGender))
                .addGap(19, 19, 19)
                .addGroup(jPanelFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSynopsis)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMinut)
                    .addComponent(jSpinnerDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDuration))
                .addGap(32, 32, 32)
                .addGroup(jPanelFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFilmeSave)
                    .addComponent(jButtonFilmClean)
                    .addComponent(jButtonFilmCancel)
                    .addComponent(jButtonFilmConsult)
                    .addComponent(jButtonDeleteFilm))
                .addGap(40, 40, 40))
        );

        jSpinnerDuration.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabelCadastrFilm)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelFilm, javax.swing.GroupLayout.DEFAULT_SIZE, 818, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCadastrFilm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelFilm, javax.swing.GroupLayout.PREFERRED_SIZE, 481, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFilmCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFilmCancelActionPerformed
        this.dispose();
        this.telaPricipal.setVisible(true);
       
    }//GEN-LAST:event_jButtonFilmCancelActionPerformed

    private void jButtonFilmCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFilmCleanActionPerformed

        jTextFieldTitle.setText("");
        jComboBoxGender.setSelectedIndex(0);
        jTextAreaSynopsis.setText("");
        jSpinnerDuration.setModel(new SpinnerNumberModel(20, 20, 300, 10));
       
           

    }//GEN-LAST:event_jButtonFilmCleanActionPerformed

    private void jButtonFilmeSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFilmeSaveActionPerformed

        int duration = Integer.parseInt(jSpinnerDuration.getValue().toString());
        String gender = jComboBoxGender.getSelectedItem().toString();
        boolean success;

        try{
            FilmController filmController = new FilmController();
            
            if(codFilm == 0){
                success = filmController.cadastrarFilm(jTextFieldTitle.getText(), gender, jTextAreaSynopsis.getText(), duration);
            } else {
                success = filmController.updateFilm(codFilm, jTextFieldTitle.getText(), gender, jTextAreaSynopsis.getText(), duration);
            }
            if(success == true){
                JOptionPane.showMessageDialog(null, "O cadastro foi realizado com sucesso!");
                this.jButtonFilmCleanActionPerformed(evt);
            } else  {
                JOptionPane.showMessageDialog(null, "Os dados n??o foram preechido corretamente");
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "[ERRO:]" + e.getMessage());
        }

    }//GEN-LAST:event_jButtonFilmeSaveActionPerformed

    private void jTextFieldTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTitleActionPerformed

    private void abrir_telaConsulta(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrir_telaConsulta
     ScreenConsultFilm telaConsultaFilme = new ScreenConsultFilm((JFrame) this);
     telaConsultaFilme.setVisible(true);
     this.setVisible(false);
    }//GEN-LAST:event_abrir_telaConsulta

    private void fecharTela(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_fecharTela
        this.dispose();
        this.telaPricipal.setVisible(true);
       
    }//GEN-LAST:event_fecharTela

    private void jButtonDeleteFilmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteFilmActionPerformed

       boolean success = false;
       FilmController filmController = new FilmController();
       
        try {
            
                
            if(codFilm != 0){
            success = filmController.deleteFilm(this.codFilm);
            }
            if(success == true){
                JOptionPane.showMessageDialog(null, "Filme apagado com sucesso!");
                this.jButtonFilmCleanActionPerformed(evt);
            } else
                JOptionPane.showMessageDialog(null, "[ERRO] ao apagar filme, nenhum filme selecionado.");
        } catch (ExceptionDAO ex) {
            Logger.getLogger(ScreenFilm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonDeleteFilmActionPerformed

 
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
            java.util.logging.Logger.getLogger(ScreenFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScreenFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScreenFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScreenFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScreenFilm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDeleteFilm;
    private javax.swing.JButton jButtonFilmCancel;
    private javax.swing.JButton jButtonFilmClean;
    private javax.swing.JButton jButtonFilmConsult;
    private javax.swing.JButton jButtonFilmeSave;
    private javax.swing.JComboBox<String> jComboBoxGender;
    private javax.swing.JLabel jLabelCadastrFilm;
    private javax.swing.JLabel jLabelDuration;
    private javax.swing.JLabel jLabelGender;
    private javax.swing.JLabel jLabelMinut;
    private javax.swing.JLabel jLabelSynopsis;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanelFilm;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerDuration;
    private javax.swing.JTextArea jTextAreaSynopsis;
    private javax.swing.JTextField jTextFieldTitle;
    // End of variables declaration//GEN-END:variables
}
