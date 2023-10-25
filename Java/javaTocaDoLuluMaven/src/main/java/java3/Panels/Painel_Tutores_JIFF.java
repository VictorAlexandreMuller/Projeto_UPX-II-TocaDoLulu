package java3.Panels;

import java4.Cadastros.CadastroPetsJIFF;
import java4.Cadastros.CadastroTutoresJIFF;

public class Painel_Tutores_JIFF extends javax.swing.JInternalFrame {

    public Painel_Tutores_JIFF() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DesktopPaneControl_Pets = new javax.swing.JDesktopPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        TABLE_TUTORES___ = new javax.swing.JTable();
        BOTAO_NOVO_TUTORES___ = new javax.swing.JButton();
        BOTAO_ALTERAR_TUTORES___ = new javax.swing.JButton();
        BOTAO_DELETAR_TUTORES___ = new javax.swing.JButton();
        BOTAO_SAIR_TUTORES___ = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle(" Tutores");

        DesktopPaneControl_Pets.setBackground(new java.awt.Color(107, 77, 59));
        DesktopPaneControl_Pets.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "  TUTORES  ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Gill Sans Ultra Bold", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        TABLE_TUTORES___.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(TABLE_TUTORES___);

        DesktopPaneControl_Pets.setLayer(jScrollPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout DesktopPaneControl_PetsLayout = new javax.swing.GroupLayout(DesktopPaneControl_Pets);
        DesktopPaneControl_Pets.setLayout(DesktopPaneControl_PetsLayout);
        DesktopPaneControl_PetsLayout.setHorizontalGroup(
            DesktopPaneControl_PetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DesktopPaneControl_PetsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
                .addContainerGap())
        );
        DesktopPaneControl_PetsLayout.setVerticalGroup(
            DesktopPaneControl_PetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopPaneControl_PetsLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );

        BOTAO_NOVO_TUTORES___.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        BOTAO_NOVO_TUTORES___.setText("Novo");
        BOTAO_NOVO_TUTORES___.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTAO_NOVO_TUTORES___ActionPerformed(evt);
            }
        });

        BOTAO_ALTERAR_TUTORES___.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        BOTAO_ALTERAR_TUTORES___.setText("Alterar");
        BOTAO_ALTERAR_TUTORES___.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTAO_ALTERAR_TUTORES___ActionPerformed(evt);
            }
        });

        BOTAO_DELETAR_TUTORES___.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        BOTAO_DELETAR_TUTORES___.setText("Deletar");
        BOTAO_DELETAR_TUTORES___.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTAO_DELETAR_TUTORES___ActionPerformed(evt);
            }
        });

        BOTAO_SAIR_TUTORES___.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        BOTAO_SAIR_TUTORES___.setText("Sair");
        BOTAO_SAIR_TUTORES___.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTAO_SAIR_TUTORES___ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BOTAO_NOVO_TUTORES___, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BOTAO_DELETAR_TUTORES___, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BOTAO_ALTERAR_TUTORES___, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BOTAO_SAIR_TUTORES___, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DesktopPaneControl_Pets)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(DesktopPaneControl_Pets)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(BOTAO_NOVO_TUTORES___)
                .addGap(18, 18, 18)
                .addComponent(BOTAO_ALTERAR_TUTORES___)
                .addGap(18, 18, 18)
                .addComponent(BOTAO_DELETAR_TUTORES___)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, Short.MAX_VALUE)
                .addComponent(BOTAO_SAIR_TUTORES___)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BOTAO_NOVO_TUTORES___ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTAO_NOVO_TUTORES___ActionPerformed
        CadastroTutoresJIFF obj = new CadastroTutoresJIFF();
        DesktopPaneControl_Pets.add(obj).setVisible(true);
    }//GEN-LAST:event_BOTAO_NOVO_TUTORES___ActionPerformed

    private void BOTAO_ALTERAR_TUTORES___ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTAO_ALTERAR_TUTORES___ActionPerformed
        
    }//GEN-LAST:event_BOTAO_ALTERAR_TUTORES___ActionPerformed

    private void BOTAO_DELETAR_TUTORES___ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTAO_DELETAR_TUTORES___ActionPerformed
        
    }//GEN-LAST:event_BOTAO_DELETAR_TUTORES___ActionPerformed

    private void BOTAO_SAIR_TUTORES___ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTAO_SAIR_TUTORES___ActionPerformed
        this.dispose();
    }//GEN-LAST:event_BOTAO_SAIR_TUTORES___ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOTAO_ALTERAR_TUTORES___;
    private javax.swing.JButton BOTAO_DELETAR_TUTORES___;
    private javax.swing.JButton BOTAO_NOVO_TUTORES___;
    private javax.swing.JButton BOTAO_SAIR_TUTORES___;
    private javax.swing.JDesktopPane DesktopPaneControl_Pets;
    private javax.swing.JTable TABLE_TUTORES___;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
