package java2.InicialPanel;

import java.awt.Color;
import static java.awt.Color.red;
import java.awt.Image;
import java.awt.Graphics;
import java3.Panels.Painel_Pets_JIFF;
import java3.Panels.Painel_Tutores_JIFF;
import java3.Panels.Painel_Veterinarios_JIFF;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class Swing_Tela_Inicial extends javax.swing.JFrame {

    
    // Construtor da classe Swing_Tela_Inicial.
    public Swing_Tela_Inicial() {
        
        // Alterar cor plano de fundo jFrame
        Color color1 = new Color(177,177,139);
        getContentPane().setBackground(color1);
        
        // Inicializa os componentes da interface gráfica.
        initComponents();
        
        //Define a posição da janela em relação a outra janela, neste caso, em relação a ela mesma.
        this.setLocationRelativeTo(this);
        
        /** --------------------------------------------------------
        //Define o diretório da imagem.
        SetImageLabel(label_icon_dog_init, "src/main/java/Imagens/icon_dog_init.png");
        ------------------------------------------------------------ */
    }
        
        
    /** WARNING: Do NOT modify this code. */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon("src/main/java/Imagens/White-spitz-dog-grass_3840x2160.jpg");
        Image image = icon.getImage();
        DesktopPaneControl = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        BOTAO_CADASTRO_PET___ = new javax.swing.JButton();
        BOTAO_CADASTRO_TUTOR___ = new javax.swing.JButton();
        BOTAO_CADASTRO_VETERINARIO___ = new javax.swing.JButton();
        BOTAO_SAIR___ = new javax.swing.JButton();
        BOTAO_CADASTRO_VETERINARIO___1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        MENU_HEADDER_BUTTON = new javax.swing.JMenu();
        MENU_ITEM_PETS = new javax.swing.JMenuItem();
        MENU_ITEM_TUTORES = new javax.swing.JMenuItem();
        MENU_ITEM_VETERINARIOS = new javax.swing.JMenuItem();
        MENU_ITEM_SAIR = new javax.swing.JMenuItem();
        MENU_HEADDER_PRECOS = new javax.swing.JMenu();
        MENU_ITEM_PRECOS = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1281, 721));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setSize(new java.awt.Dimension(1280, 720));

        DesktopPaneControl.setBackground(new java.awt.Color(177, 177, 139));
        DesktopPaneControl.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "  BEM VINDO À TOCA DO LULU  ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Gill Sans Ultra Bold", 1, 24), new java.awt.Color(30, 30, 30))); // NOI18N
        DesktopPaneControl.setPreferredSize(new java.awt.Dimension(900, 450));

        javax.swing.GroupLayout DesktopPaneControlLayout = new javax.swing.GroupLayout(DesktopPaneControl);
        DesktopPaneControl.setLayout(DesktopPaneControlLayout);
        DesktopPaneControlLayout.setHorizontalGroup(
            DesktopPaneControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1268, Short.MAX_VALUE)
        );
        DesktopPaneControlLayout.setVerticalGroup(
            DesktopPaneControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 682, Short.MAX_VALUE)
        );

        BOTAO_CADASTRO_PET___.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        BOTAO_CADASTRO_PET___.setText("Pets");
        BOTAO_CADASTRO_PET___.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTAO_CADASTRO_PET___ActionPerformed(evt);
            }
        });

        BOTAO_CADASTRO_TUTOR___.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        BOTAO_CADASTRO_TUTOR___.setText("Tutores");
        BOTAO_CADASTRO_TUTOR___.setToolTipText("");
        BOTAO_CADASTRO_TUTOR___.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTAO_CADASTRO_TUTOR___ActionPerformed(evt);
            }
        });

        BOTAO_CADASTRO_VETERINARIO___.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        BOTAO_CADASTRO_VETERINARIO___.setText("Veterinários");
        BOTAO_CADASTRO_VETERINARIO___.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTAO_CADASTRO_VETERINARIO___ActionPerformed(evt);
            }
        });

        BOTAO_SAIR___.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        BOTAO_SAIR___.setText("Sair");
        BOTAO_SAIR___.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTAO_SAIR___ActionPerformed(evt);
            }
        });

        BOTAO_CADASTRO_VETERINARIO___1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        BOTAO_CADASTRO_VETERINARIO___1.setText("Serviços");
        BOTAO_CADASTRO_VETERINARIO___1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTAO_CADASTRO_VETERINARIO___1ActionPerformed(evt);
            }
        });

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.N_RESIZE_CURSOR));

        MENU_HEADDER_BUTTON.setText("Menu");

        MENU_ITEM_PETS.setText("1- Pets");
        MENU_ITEM_PETS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENU_ITEM_PETSActionPerformed(evt);
            }
        });
        MENU_HEADDER_BUTTON.add(MENU_ITEM_PETS);

        MENU_ITEM_TUTORES.setText("2- Tutores");
        MENU_ITEM_TUTORES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENU_ITEM_TUTORESActionPerformed(evt);
            }
        });
        MENU_HEADDER_BUTTON.add(MENU_ITEM_TUTORES);

        MENU_ITEM_VETERINARIOS.setText("3- Veterinários");
        MENU_ITEM_VETERINARIOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENU_ITEM_VETERINARIOSActionPerformed(evt);
            }
        });
        MENU_HEADDER_BUTTON.add(MENU_ITEM_VETERINARIOS);

        MENU_ITEM_SAIR.setText("Sair");
        MENU_ITEM_SAIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENU_ITEM_SAIRActionPerformed(evt);
            }
        });
        MENU_HEADDER_BUTTON.add(MENU_ITEM_SAIR);

        jMenuBar1.add(MENU_HEADDER_BUTTON);

        MENU_HEADDER_PRECOS.setText("Opções");

        MENU_ITEM_PRECOS.setText("Preços");
        MENU_HEADDER_PRECOS.add(MENU_ITEM_PRECOS);

        jMenuBar1.add(MENU_HEADDER_PRECOS);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BOTAO_CADASTRO_VETERINARIO___, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(BOTAO_CADASTRO_TUTOR___, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BOTAO_CADASTRO_PET___, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BOTAO_CADASTRO_VETERINARIO___1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BOTAO_SAIR___, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DesktopPaneControl, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DesktopPaneControl, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(BOTAO_CADASTRO_PET___)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BOTAO_CADASTRO_TUTOR___)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BOTAO_CADASTRO_VETERINARIO___)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BOTAO_CADASTRO_VETERINARIO___1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BOTAO_SAIR___)
                .addGap(26, 26, 26))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    /** WARNING: Do NOT modify this code. */
    
    /** --------------------------------------------------------
    // Método "SetImageLabel", recebendo dois argumentos, JLabel e uma String 'root' que representa o caminho para uma imagem.
    private void SetImageLabel(JLabel labelName, String root){
        
        // Cria um objeto ImageIcon a partir do caminho da imagem especificado em root.
        ImageIcon image = new ImageIcon(root);
        
        // Cria um objeto Icon redimensionando a imagem para o tamanho do JLabel passado como labelName.
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        
        // Define o ícone do JLabel para a imagem redimensionada.
        labelName.setIcon(icon);
        
        // Solicita a repintura da janela para que a imagem seja exibida corretamente.
        this.repaint();
    }
    ------------------------------------------------------------ */
    
    private void MENU_ITEM_SAIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENU_ITEM_SAIRActionPerformed
        System.exit(0);
    }//GEN-LAST:event_MENU_ITEM_SAIRActionPerformed

    private void MENU_ITEM_PETSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENU_ITEM_PETSActionPerformed
        // DesktopPaneControl.removeAll();
        Painel_Pets_JIFF obj = new Painel_Pets_JIFF();
        DesktopPaneControl.add(obj).setVisible(true);
    }//GEN-LAST:event_MENU_ITEM_PETSActionPerformed

    private void MENU_ITEM_TUTORESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENU_ITEM_TUTORESActionPerformed
        // DesktopPaneControl.removeAll();
        Painel_Tutores_JIFF obj = new Painel_Tutores_JIFF();
        DesktopPaneControl.add(obj).setVisible(true);
    }//GEN-LAST:event_MENU_ITEM_TUTORESActionPerformed

    private void MENU_ITEM_VETERINARIOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENU_ITEM_VETERINARIOSActionPerformed
        // DesktopPaneControl.removeAll();
        Painel_Veterinarios_JIFF obj = new Painel_Veterinarios_JIFF();
        DesktopPaneControl.add(obj).setVisible(true);
    }//GEN-LAST:event_MENU_ITEM_VETERINARIOSActionPerformed

    private void BOTAO_SAIR___ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTAO_SAIR___ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BOTAO_SAIR___ActionPerformed

    private void BOTAO_CADASTRO_VETERINARIO___ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTAO_CADASTRO_VETERINARIO___ActionPerformed
        Painel_Veterinarios_JIFF obj = new Painel_Veterinarios_JIFF();
        DesktopPaneControl.add(obj).setVisible(true);
    }//GEN-LAST:event_BOTAO_CADASTRO_VETERINARIO___ActionPerformed

    private void BOTAO_CADASTRO_TUTOR___ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTAO_CADASTRO_TUTOR___ActionPerformed
        Painel_Tutores_JIFF obj = new Painel_Tutores_JIFF();
        DesktopPaneControl.add(obj).setVisible(true);
    }//GEN-LAST:event_BOTAO_CADASTRO_TUTOR___ActionPerformed

    private void BOTAO_CADASTRO_PET___ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTAO_CADASTRO_PET___ActionPerformed
        Painel_Pets_JIFF obj = new Painel_Pets_JIFF(this);
        DesktopPaneControl.add(obj).setVisible(true);
    }//GEN-LAST:event_BOTAO_CADASTRO_PET___ActionPerformed

    private void BOTAO_CADASTRO_VETERINARIO___1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTAO_CADASTRO_VETERINARIO___1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BOTAO_CADASTRO_VETERINARIO___1ActionPerformed

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
            java.util.logging.Logger.getLogger(Swing_Tela_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Swing_Tela_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Swing_Tela_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Swing_Tela_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Swing_Tela_Inicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOTAO_CADASTRO_PET___;
    private javax.swing.JButton BOTAO_CADASTRO_TUTOR___;
    private javax.swing.JButton BOTAO_CADASTRO_VETERINARIO___;
    private javax.swing.JButton BOTAO_CADASTRO_VETERINARIO___1;
    private javax.swing.JButton BOTAO_SAIR___;
    private javax.swing.JDesktopPane DesktopPaneControl;
    private javax.swing.JMenu MENU_HEADDER_BUTTON;
    private javax.swing.JMenu MENU_HEADDER_PRECOS;
    private javax.swing.JMenuItem MENU_ITEM_PETS;
    private javax.swing.JMenuItem MENU_ITEM_PRECOS;
    private javax.swing.JMenuItem MENU_ITEM_SAIR;
    private javax.swing.JMenuItem MENU_ITEM_TUTORES;
    private javax.swing.JMenuItem MENU_ITEM_VETERINARIOS;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
