/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.views;

/**
 *
 * @author Ernesto.Castro
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelImage = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Filmes = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        Itens = new javax.swing.JMenuItem();
        jMenuCadastro = new javax.swing.JMenu();
        jScreenFilm = new javax.swing.JMenuItem();
        jMenuActor = new javax.swing.JMenuItem();
        jMenuItemClient = new javax.swing.JMenuItem();
        jMenuItemItem = new javax.swing.JMenuItem();
        sair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                fecharJanela(evt);
            }
        });

        jPanelImage.setBackground(new java.awt.Color(204, 204, 204));
        jPanelImage.setPreferredSize(new java.awt.Dimension(600, 300));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(200, 200, 200, 200, new javax.swing.ImageIcon(getClass().getResource("/image/logo.png")))); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(400, 200));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 200));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 166, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelImageLayout = new javax.swing.GroupLayout(jPanelImage);
        jPanelImage.setLayout(jPanelImageLayout);
        jPanelImageLayout.setHorizontalGroup(
            jPanelImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelImageLayout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        jPanelImageLayout.setVerticalGroup(
            jPanelImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelImageLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        Filmes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon.png"))); // NOI18N
        Filmes.setText("Locação");
        Filmes.setFont(new java.awt.Font("MV Boli", 0, 36)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/seta.png"))); // NOI18N
        jMenuItem1.setText("Filmes");
        Filmes.add(jMenuItem1);

        Itens.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        Itens.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/seta.png"))); // NOI18N
        Itens.setText("Itens");
        Filmes.add(Itens);

        jMenuBar1.add(Filmes);

        jMenuCadastro.setText("Cadastro");
        jMenuCadastro.setFont(new java.awt.Font("MV Boli", 0, 36)); // NOI18N

        jScreenFilm.setFont(new java.awt.Font("Sitka Display", 0, 24)); // NOI18N
        jScreenFilm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/seta.png"))); // NOI18N
        jScreenFilm.setText("Filme");
        jScreenFilm.setToolTipText("cadastro de atores");
        jScreenFilm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrir_telaFilm(evt);
            }
        });
        jMenuCadastro.add(jScreenFilm);

        jMenuActor.setFont(new java.awt.Font("Sitka Display", 0, 24)); // NOI18N
        jMenuActor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/seta.png"))); // NOI18N
        jMenuActor.setText("Actor");
        jMenuActor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrir_telaActor(evt);
            }
        });
        jMenuCadastro.add(jMenuActor);

        jMenuItemClient.setFont(new java.awt.Font("Sitka Display", 0, 24)); // NOI18N
        jMenuItemClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/seta.png"))); // NOI18N
        jMenuItemClient.setText("Cliente");
        jMenuItemClient.setToolTipText("cadastro do cliente");
        jMenuItemClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrir_telaClient(evt);
            }
        });
        jMenuCadastro.add(jMenuItemClient);

        jMenuItemItem.setFont(new java.awt.Font("Sitka Display", 0, 24)); // NOI18N
        jMenuItemItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/seta.png"))); // NOI18N
        jMenuItemItem.setText("Item");
        jMenuItemItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrir_telaItem(evt);
            }
        });
        jMenuCadastro.add(jMenuItemItem);

        jMenuBar1.add(jMenuCadastro);

        sair.setText("Sair");
        sair.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairPrograma(evt);
            }
        });
        jMenuBar1.add(sair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelImage, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void abrir_telaFilm(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrir_telaFilm
       
       ScreenFilm telaCadastroFilme =  new ScreenFilm(this);
       this.setVisible(false);
       telaCadastroFilme.setVisible(true);
       
       
        
    }//GEN-LAST:event_abrir_telaFilm

    private void abrir_telaActor(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrir_telaActor
       ScreenActor telaCadastroActor = new ScreenActor(this);
       this.setVisible(false);
       telaCadastroActor.setVisible(true);
    }//GEN-LAST:event_abrir_telaActor

    private void fecharJanela(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_fecharJanela
       System.exit(0);
    }//GEN-LAST:event_fecharJanela

    private void abrir_telaClient(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrir_telaClient
        ScreenClient telaCadastroClient = new ScreenClient(this);
        this.setVisible(false);
        telaCadastroClient.setVisible(true);
    }//GEN-LAST:event_abrir_telaClient

    private void abrir_telaItem(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrir_telaItem
       ScreenItem telaCadastroItem = new ScreenItem(this);
       this.setVisible(false);
       telaCadastroItem.setVisible(true);
    }//GEN-LAST:event_abrir_telaItem

    private void sairPrograma(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairPrograma
       System.exit(0);
    }//GEN-LAST:event_sairPrograma

    
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Filmes;
    private javax.swing.JMenuItem Itens;
    private javax.swing.JMenuItem jMenuActor;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemClient;
    private javax.swing.JMenuItem jMenuItemItem;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelImage;
    private javax.swing.JMenuItem jScreenFilm;
    private javax.swing.JMenu sair;
    // End of variables declaration//GEN-END:variables
}
