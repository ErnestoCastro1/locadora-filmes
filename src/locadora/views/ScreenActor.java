/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.views;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import locadora.controller.ActorController;
import locadora.dao.ExceptionDAO;

/**
 *
 * @author Ernesto.Castro
 */
public class ScreenActor extends javax.swing.JFrame {
    
    private TelaPrincipal telaPrincipal;
    private Integer codActor = 0;
    /**
     * Creates new form ScreenActor
     * @param telaPrincipal 
     */
   
     public ScreenActor() {
        initComponents();
    }
    public ScreenActor(TelaPrincipal telaPrincipal) {
        this.telaPrincipal = telaPrincipal;
        initComponents();
    }
    
    public void buscarActor(Integer codActor, String name, String nationality){
     this.codActor = codActor;
     this.jTextFieldName.setText(name);
     for(int i=0;i<jComboBoxNationality.getItemCount();i++){
         if(jComboBoxNationality.getItemAt(i).equals(nationality))
             jComboBoxNationality.setSelectedIndex(i);
     }
    }

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitle = new javax.swing.JLabel();
        jPanelCadastActor = new javax.swing.JPanel();
        jLabelName = new javax.swing.JLabel();
        jLabelNationality = new javax.swing.JLabel();
        jButtonClean = new javax.swing.JButton();
        cancelarCadastro = new javax.swing.JButton();
        jButtonConsult = new javax.swing.JButton();
        jButtonSavActor = new javax.swing.JButton();
        jTextFieldName = new javax.swing.JTextField();
        jComboBoxNationality = new javax.swing.JComboBox<>();
        jButtonDleteActor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Video Locadora Hora da Pipoca");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                fecharTela(evt);
            }
        });

        jLabelTitle.setFont(new java.awt.Font("MV Boli", 0, 36)); // NOI18N
        jLabelTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon.png"))); // NOI18N
        jLabelTitle.setText("CADASTRO DE ACTOR");

        jPanelCadastActor.setBackground(new java.awt.Color(153, 153, 153));
        jPanelCadastActor.setPreferredSize(new java.awt.Dimension(780, 400));

        jLabelName.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabelName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelName.setText("Nome:");

        jLabelNationality.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabelNationality.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNationality.setText("Nacionalidade:");

        jButtonClean.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonClean.setText("Limpar");
        jButtonClean.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cleanActors(evt);
            }
        });
        jButtonClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActor(evt);
            }
        });

        cancelarCadastro.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cancelarCadastro.setText("Cancelar");
        cancelarCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancela(evt);
            }
        });
        cancelarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarCadastro(evt);
            }
        });

        jButtonConsult.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonConsult.setText("Consultar");
        jButtonConsult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrir_telaConsultActor(evt);
            }
        });

        jButtonSavActor.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonSavActor.setText("Salvar");
        jButtonSavActor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveActor(evt);
            }
        });
        jButtonSavActor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSavActorActionPerformed(evt);
            }
        });

        jTextFieldName.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N

        jComboBoxNationality.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um pa??s ", "Afeganist??o", "??frica do Sul", "Akrotiri", "Alb??nia", "Alemanha", "Andorra", "Angola", "Anguila", "Ant??rctida", "Ant??gua e Barbuda", "Ar??bia Saudita", "Arctic Ocean", "Arg??lia", "Argentina", "Arm??nia", "Aruba", "Ashmore and Cartier Islands", "Atlantic Ocean", "Austr??lia", "??ustria", "Azerbaij??o", "Baamas", "Bangladeche", "Barbados", "Bar??m", "B??lgica", "Belize", "Benim", "Bermudas", "Bielorr??ssia", "Birm??nia", "Bol??via", "B??snia e Herzegovina", "Botsuana", "Brasil", "Brunei", "Bulg??ria", "Burquina Faso", "Bur??ndi", "But??o", "Cabo Verde", "Camar??es", "Camboja", "Canad??", "Catar", "Cazaquist??o", "Chade", "Chile", "China", "Chipre", "Clipperton Island", "Col??mbia", "Comores", "Congo-Brazzaville", "Congo-Kinshasa", "Coral Sea Islands", "Coreia do Norte", "Coreia do Sul", "Costa do Marfim", "Costa Rica", "Cro??cia", "Cuba", "Curacao", "Dhekelia", "Dinamarca", "Dom??nica", "Egipto", "Emiratos ??rabes Unidos", "Equador", "Eritreia", "Eslov??quia", "Eslov??nia", "Espanha", "Estados Unidos", "Est??nia", "Eti??pia", "Faro??", "Fiji", "Filipinas", "Finl??ndia", "Fran??a", "Gab??o", "G??mbia", "Gana", "Gaza Strip", "Ge??rgia", "Ge??rgia do Sul e Sandwich do Sul", "Gibraltar", "Granada", "Gr??cia", "Gronel??ndia", "Guame", "Guatemala", "Guernsey", "Guiana", "Guin??", "Guin?? Equatorial", "Guin??-Bissau", "Haiti", "Honduras", "Hong Kong", "Hungria", "I??men", "Ilha Bouvet", "Ilha do Natal", "Ilha Norfolk", "Ilhas Caim??o", "Ilhas Cook", "Ilhas dos Cocos", "Ilhas Falkland", "Ilhas Heard e McDonald", "Ilhas Marshall", "Ilhas Salom??o", "Ilhas Turcas e Caicos", "Ilhas Virgens Americanas", "Ilhas Virgens Brit??nicas", "??ndia", "Indian Ocean", "Indon??sia", "Ir??o", "Iraque", "Irlanda", "Isl??ndia", "Israel", "It??lia", "Jamaica", "Jan Mayen", "Jap??o", "Jersey", "Jibuti", "Jord??nia", "Kosovo", "Kuwait", "Laos", "Lesoto", "Let??nia", "L??bano", "Lib??ria", "L??bia", "Listenstaine", "Litu??nia", "Luxemburgo", "Macau", "Maced??nia", "Madag??scar", "Mal??sia", "Mal??vi", "Maldivas", "Mali", "Malta", "Man, Isle of", "Marianas do Norte", "Marrocos", "Maur??cia", "Maurit??nia", "M??xico", "Micron??sia", "Mo??ambique", "Mold??via", "M??naco", "Mong??lia", "Monserrate", "Montenegro", "Mundo", "Nam??bia", "Nauru", "Navassa Island", "Nepal", "Nicar??gua", "N??ger", "Nig??ria", "Niue", "Noruega", "Nova Caled??nia", "Nova Zel??ndia", "Om??", "Pacific Ocean", "Pa??ses Baixos", "Palau", "Panam??", "Papua-Nova Guin??", "Paquist??o", "Paracel Islands", "Paraguai", "Peru", "Pitcairn", "Polin??sia Francesa", "Pol??nia", "Porto Rico", "Portugal", "Qu??nia", "Quirguizist??o", "Quirib??ti", "Reino Unido", "Rep??blica Centro-Africana", "Rep??blica Dominicana", "Rom??nia", "Ruanda", "R??ssia", "Salvador", "Samoa", "Samoa Americana", "Santa Helena", "Santa L??cia", "S??o Bartolomeu", "S??o Crist??v??o e Neves", "S??o Marinho", "S??o Martinho", "S??o Pedro e Miquelon", "S??o Tom?? e Pr??ncipe", "S??o Vicente e Granadinas", "Sara Ocidental", "Seicheles", "Senegal", "Serra Leoa", "S??rvia", "Singapura", "Sint Maarten", "S??ria", "Som??lia", "Southern Ocean", "Spratly Islands", "Sri Lanca", "Suazil??ndia", "Sud??o", "Sud??o do Sul", "Su??cia", "Su????a", "Suriname", "Svalbard e Jan Mayen", "Tail??ndia", "Taiwan", "Tajiquist??o", "Tanz??nia", "Territ??rio Brit??nico do Oceano ??ndico", "Territ??rios Austrais Franceses", "Timor Leste", "Togo", "Tokelau", "Tonga", "Trindade e Tobago", "Tun??sia", "Turquemenist??o", "Turquia", "Tuvalu", "Ucr??nia", "Uganda", "Uni??o Europeia", "Uruguai", "Usbequist??o", "Vanuatu", "Vaticano", "Venezuela", "Vietname", "Wake Island", "Wallis e Futuna", "West Bank", "Z??mbia", "Zimbabu??" }));

        jButtonDleteActor.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonDleteActor.setText("Apagar");
        jButtonDleteActor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagarActor(evt);
            }
        });

        javax.swing.GroupLayout jPanelCadastActorLayout = new javax.swing.GroupLayout(jPanelCadastActor);
        jPanelCadastActor.setLayout(jPanelCadastActorLayout);
        jPanelCadastActorLayout.setHorizontalGroup(
            jPanelCadastActorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastActorLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanelCadastActorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadastActorLayout.createSequentialGroup()
                        .addComponent(jLabelName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelCadastActorLayout.createSequentialGroup()
                        .addGroup(jPanelCadastActorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonSavActor)
                            .addComponent(jLabelNationality))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelCadastActorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxNationality, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelCadastActorLayout.createSequentialGroup()
                                .addComponent(jButtonClean)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonDleteActor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonConsult)
                                .addGap(27, 27, 27)
                                .addComponent(cancelarCadastro)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCadastActorLayout.setVerticalGroup(
            jPanelCadastActorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastActorLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanelCadastActorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelName)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanelCadastActorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNationality)
                    .addComponent(jComboBoxNationality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanelCadastActorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarCadastro)
                    .addComponent(jButtonConsult)
                    .addComponent(jButtonSavActor)
                    .addComponent(jButtonClean)
                    .addComponent(jButtonDleteActor))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(jLabelTitle)
                .addContainerGap(176, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCadastActor, javax.swing.GroupLayout.DEFAULT_SIZE, 816, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelCadastActor, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cleanActors(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cleanActors
        jTextFieldName.setText("");
        jComboBoxNationality.setSelectedIndex(0);
    }//GEN-LAST:event_cleanActors

    private void saveActor(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveActor
        
        String name = jTextFieldName.getText();
        String nationality = jComboBoxNationality.getSelectedItem().toString();
        boolean successs;
        
        try{
            
            ActorController atorController = new ActorController();
            if (codActor == 0){
            successs = atorController.cadastrarActor(name, nationality);
            } else {
                successs = atorController.updateActor(codActor, name, nationality);
            }
            if(successs == true){
                JOptionPane.showMessageDialog(null, "O cadastro foi relaizado com sucesso!");
                this.cleanActors(evt);
            } else {
                JOptionPane.showMessageDialog(null, "Os campos n??o est??o preenchidos corretamente!");
            }
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage());
        }
                
    }//GEN-LAST:event_saveActor

    private void fecharTela(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_fecharTela
       dispose();
       this.telaPrincipal.setVisible(true);
    }//GEN-LAST:event_fecharTela

    private void cancelarCadastro(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarCadastro
        dispose();
        this.telaPrincipal.setVisible(true);
    }//GEN-LAST:event_cancelarCadastro

    private void jButtonSavActorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSavActorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSavActorActionPerformed

    private void limparActor(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActor
         jTextFieldName.setText("");
        jComboBoxNationality.setSelectedIndex(0);
    }//GEN-LAST:event_limparActor

    private void abrir_telaConsultActor(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrir_telaConsultActor

       ScreenConsultActor telaConsultaAtor = new ScreenConsultActor(this);
       telaConsultaAtor.setVisible(true);
       this.setVisible(false);
       
    }//GEN-LAST:event_abrir_telaConsultActor

    private void cancela(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancela

        this.dispose();
        telaPrincipal.setVisible(true);
    }//GEN-LAST:event_cancela

    private void apagarActor(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagarActor

        boolean success;
        ActorController actorController = new ActorController();
        
        try {
            success = actorController.deleteActor(codActor);
            if(success){
                JOptionPane.showMessageDialog(null, "Actor apagado com sucesso!");
                this.limparActor(evt);
            } else
                JOptionPane.showMessageDialog(null, "[ERRO] ao apagar actor, nenhum actor selecionado.");
        } catch (ExceptionDAO ex) {
            Logger.getLogger(ScreenActor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_apagarActor

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
            java.util.logging.Logger.getLogger(ScreenActor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScreenActor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScreenActor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScreenActor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScreenActor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarCadastro;
    private javax.swing.JButton jButtonClean;
    private javax.swing.JButton jButtonConsult;
    private javax.swing.JButton jButtonDleteActor;
    private javax.swing.JButton jButtonSavActor;
    private javax.swing.JComboBox<String> jComboBoxNationality;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelNationality;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanelCadastActor;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables
}
