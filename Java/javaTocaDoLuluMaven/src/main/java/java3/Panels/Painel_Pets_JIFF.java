package java3.Panels;

import java4.Cadastros.Cadastro_Pets_JIFF;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Painel_Pets_JIFF extends javax.swing.JInternalFrame {

        
    // PROFESSOR POO ----------------------
    JFrame pai;
    
    public Painel_Pets_JIFF(JFrame framePai) {
        initComponents();
        pai = framePai;
    }
    // PROFESSOR POO ----------------------
    
    public Painel_Pets_JIFF() {
        initComponents();
    }

    /** WARNING: Do NOT modify this code. */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DesktopPaneControl_Pets = new javax.swing.JDesktopPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        TABLE_PETS___ = new javax.swing.JTable();
        BOTAO_NOVO_PET___ = new javax.swing.JButton();
        BOTAO_ALTERAR_PET___ = new javax.swing.JButton();
        BOTAO_DELETAR_PET___ = new javax.swing.JButton();
        BOTAO_SAIR_PET___ = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle(" Pets");

        DesktopPaneControl_Pets.setBackground(new java.awt.Color(161, 121, 82));
        DesktopPaneControl_Pets.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "  PETS  ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Gill Sans Ultra Bold", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        TABLE_PETS___.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(TABLE_PETS___);

        BOTAO_NOVO_PET___.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        BOTAO_NOVO_PET___.setText("Novo");
        BOTAO_NOVO_PET___.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTAO_NOVO_PET___ActionPerformed(evt);
            }
        });

        BOTAO_ALTERAR_PET___.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        BOTAO_ALTERAR_PET___.setText("Alterar");
        BOTAO_ALTERAR_PET___.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTAO_ALTERAR_PET___ActionPerformed(evt);
            }
        });

        BOTAO_DELETAR_PET___.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        BOTAO_DELETAR_PET___.setText("Deletar");
        BOTAO_DELETAR_PET___.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTAO_DELETAR_PET___ActionPerformed(evt);
            }
        });

        BOTAO_SAIR_PET___.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        BOTAO_SAIR_PET___.setText("Sair");
        BOTAO_SAIR_PET___.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTAO_SAIR_PET___ActionPerformed(evt);
            }
        });

        DesktopPaneControl_Pets.setLayer(jScrollPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPaneControl_Pets.setLayer(BOTAO_NOVO_PET___, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPaneControl_Pets.setLayer(BOTAO_ALTERAR_PET___, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPaneControl_Pets.setLayer(BOTAO_DELETAR_PET___, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPaneControl_Pets.setLayer(BOTAO_SAIR_PET___, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout DesktopPaneControl_PetsLayout = new javax.swing.GroupLayout(DesktopPaneControl_Pets);
        DesktopPaneControl_Pets.setLayout(DesktopPaneControl_PetsLayout);
        DesktopPaneControl_PetsLayout.setHorizontalGroup(
            DesktopPaneControl_PetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DesktopPaneControl_PetsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
            .addGroup(DesktopPaneControl_PetsLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(BOTAO_NOVO_PET___, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BOTAO_ALTERAR_PET___, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BOTAO_DELETAR_PET___, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 335, Short.MAX_VALUE)
                .addComponent(BOTAO_SAIR_PET___, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        DesktopPaneControl_PetsLayout.setVerticalGroup(
            DesktopPaneControl_PetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopPaneControl_PetsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DesktopPaneControl_PetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BOTAO_NOVO_PET___)
                    .addComponent(BOTAO_ALTERAR_PET___)
                    .addComponent(BOTAO_DELETAR_PET___)
                    .addComponent(BOTAO_SAIR_PET___))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DesktopPaneControl_Pets)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(DesktopPaneControl_Pets)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void BOTAO_NOVO_PET___ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTAO_NOVO_PET___ActionPerformed
        
        
        Cadastro_Pets_JIFF obj = new Cadastro_Pets_JIFF();
        DesktopPaneControl_Pets.add(obj).setVisible(true);
        
        // PROFESSOR POO ----------------------
        // NewJDialog x = new  NewJDialog(pai, true);
        // x.setVisible(true);
        // PROFESSOR POO ----------------------
    }//GEN-LAST:event_BOTAO_NOVO_PET___ActionPerformed

    private void BOTAO_ALTERAR_PET___ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTAO_ALTERAR_PET___ActionPerformed
        
    }//GEN-LAST:event_BOTAO_ALTERAR_PET___ActionPerformed

    private void BOTAO_DELETAR_PET___ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTAO_DELETAR_PET___ActionPerformed
        
    }//GEN-LAST:event_BOTAO_DELETAR_PET___ActionPerformed

    private void BOTAO_SAIR_PET___ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTAO_SAIR_PET___ActionPerformed
        this.dispose();
    }//GEN-LAST:event_BOTAO_SAIR_PET___ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOTAO_ALTERAR_PET___;
    private javax.swing.JButton BOTAO_DELETAR_PET___;
    private javax.swing.JButton BOTAO_NOVO_PET___;
    private javax.swing.JButton BOTAO_SAIR_PET___;
    private javax.swing.JDesktopPane DesktopPaneControl_Pets;
    private javax.swing.JTable TABLE_PETS___;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
