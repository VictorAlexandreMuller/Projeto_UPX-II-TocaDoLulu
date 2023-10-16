package java3.Panels;

import java.awt.Color;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java1.Classes.Pets;
import java2.InicialPanel.Swing_Tela_Inicial;
import java4.Cadastros.Cadastro_Pets_JIFF;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.table.TableModel;

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
        Panel_Button_Voltar = new javax.swing.JPanel();
        return_button = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Panel_Button_Novo = new javax.swing.JPanel();
        new_button = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Panel_Button_Editar = new javax.swing.JPanel();
        edit_button = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Panel_Button_Deletar = new javax.swing.JPanel();
        delete_button = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtSEARCH = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(102, 51, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle(" Pets");

        DesktopPaneControl_Pets.setBackground(new java.awt.Color(175, 175, 226));
        DesktopPaneControl_Pets.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "  PETS  ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Gill Sans Ultra Bold", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        TABLE_PETS___.setAutoCreateRowSorter(true);
        TABLE_PETS___.setBackground(new java.awt.Color(85, 65, 118));
        TABLE_PETS___.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TABLE_PETS___.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TABLE_PETS___.setForeground(new java.awt.Color(255, 255, 255));
        TABLE_PETS___.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Raça", "Cor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TABLE_PETS___.setGridColor(new java.awt.Color(175, 175, 226));
        TABLE_PETS___.setIntercellSpacing(new java.awt.Dimension(5, 5));
        TABLE_PETS___.setSelectionBackground(new java.awt.Color(204, 204, 255));
        TABLE_PETS___.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane4.setViewportView(TABLE_PETS___);

        Panel_Button_Voltar.setBackground(new java.awt.Color(85, 65, 118));
        Panel_Button_Voltar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Panel_Button_Voltar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Panel_Button_VoltarMouseMoved(evt);
            }
        });
        Panel_Button_Voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_Button_VoltarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_Button_DeletarMouseExited(evt);
            }
        });

        return_button.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Documents\\Dev\\UPX2-Toca-do-Lulu\\Java\\javaTocaDoLuluMaven\\src\\main\\java\\icons_crud\\return_iconN.png")); // NOI18N
        return_button.setPreferredSize(new java.awt.Dimension(40, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Voltar");

        javax.swing.GroupLayout Panel_Button_VoltarLayout = new javax.swing.GroupLayout(Panel_Button_Voltar);
        Panel_Button_Voltar.setLayout(Panel_Button_VoltarLayout);
        Panel_Button_VoltarLayout.setHorizontalGroup(
            Panel_Button_VoltarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Button_VoltarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(return_button, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        Panel_Button_VoltarLayout.setVerticalGroup(
            Panel_Button_VoltarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(return_button, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        Panel_Button_Novo.setBackground(new java.awt.Color(85, 65, 118));
        Panel_Button_Novo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Panel_Button_Novo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Panel_Button_NovoMouseMoved(evt);
            }
        });
        Panel_Button_Novo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_Button_NovoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_Button_DeletarMouseExited(evt);
            }
        });

        new_button.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Documents\\Dev\\UPX2-Toca-do-Lulu\\Java\\javaTocaDoLuluMaven\\src\\main\\java\\icons_crud\\new_icon40.png")); // NOI18N
        new_button.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Novo");

        javax.swing.GroupLayout Panel_Button_NovoLayout = new javax.swing.GroupLayout(Panel_Button_Novo);
        Panel_Button_Novo.setLayout(Panel_Button_NovoLayout);
        Panel_Button_NovoLayout.setHorizontalGroup(
            Panel_Button_NovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Button_NovoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(new_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        Panel_Button_NovoLayout.setVerticalGroup(
            Panel_Button_NovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Button_NovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(new_button, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Panel_Button_Editar.setBackground(new java.awt.Color(85, 65, 118));
        Panel_Button_Editar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Panel_Button_Editar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Panel_Button_EditarMouseMoved(evt);
            }
        });
        Panel_Button_Editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_Button_DeletarMouseExited(evt);
            }
        });

        edit_button.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Documents\\Dev\\UPX2-Toca-do-Lulu\\Java\\javaTocaDoLuluMaven\\src\\main\\java\\icons_crud\\edit_icon40.png")); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Editar");

        javax.swing.GroupLayout Panel_Button_EditarLayout = new javax.swing.GroupLayout(Panel_Button_Editar);
        Panel_Button_Editar.setLayout(Panel_Button_EditarLayout);
        Panel_Button_EditarLayout.setHorizontalGroup(
            Panel_Button_EditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Button_EditarLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(edit_button)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        Panel_Button_EditarLayout.setVerticalGroup(
            Panel_Button_EditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(edit_button, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Panel_Button_Deletar.setBackground(new java.awt.Color(85, 65, 118));
        Panel_Button_Deletar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Panel_Button_Deletar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Panel_Button_DeletarMouseMoved(evt);
            }
        });
        Panel_Button_Deletar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_Button_DeletarMouseExited(evt);
            }
        });

        delete_button.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Documents\\Dev\\UPX2-Toca-do-Lulu\\Java\\javaTocaDoLuluMaven\\src\\main\\java\\icons_crud\\delete_icon40.png")); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Deletar");

        javax.swing.GroupLayout Panel_Button_DeletarLayout = new javax.swing.GroupLayout(Panel_Button_Deletar);
        Panel_Button_Deletar.setLayout(Panel_Button_DeletarLayout);
        Panel_Button_DeletarLayout.setHorizontalGroup(
            Panel_Button_DeletarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Button_DeletarLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(delete_button)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        Panel_Button_DeletarLayout.setVerticalGroup(
            Panel_Button_DeletarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(delete_button, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jSeparator1.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));

        txtSEARCH.setBackground(new java.awt.Color(85, 65, 118));
        txtSEARCH.setForeground(new java.awt.Color(255, 255, 255));
        txtSEARCH.setToolTipText("");
        txtSEARCH.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtSEARCH.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                txtSEARCHMouseMoved(evt);
            }
        });
        txtSEARCH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtSEARCHMouseExited(evt);
            }
        });
        txtSEARCH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSEARCHKeyReleased(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(175, 175, 226));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        DesktopPaneControl_Pets.setLayer(jScrollPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPaneControl_Pets.setLayer(Panel_Button_Voltar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPaneControl_Pets.setLayer(Panel_Button_Novo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPaneControl_Pets.setLayer(Panel_Button_Editar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPaneControl_Pets.setLayer(Panel_Button_Deletar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPaneControl_Pets.setLayer(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPaneControl_Pets.setLayer(txtSEARCH, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPaneControl_Pets.setLayer(jSeparator2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPaneControl_Pets.setLayer(jPanel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout DesktopPaneControl_PetsLayout = new javax.swing.GroupLayout(DesktopPaneControl_Pets);
        DesktopPaneControl_Pets.setLayout(DesktopPaneControl_PetsLayout);
        DesktopPaneControl_PetsLayout.setHorizontalGroup(
            DesktopPaneControl_PetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopPaneControl_PetsLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(DesktopPaneControl_PetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1)
                    .addGroup(DesktopPaneControl_PetsLayout.createSequentialGroup()
                        .addComponent(Panel_Button_Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Panel_Button_Novo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Panel_Button_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Panel_Button_Deletar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DesktopPaneControl_PetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSEARCH, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
            .addComponent(jScrollPane4)
        );
        DesktopPaneControl_PetsLayout.setVerticalGroup(
            DesktopPaneControl_PetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopPaneControl_PetsLayout.createSequentialGroup()
                .addGroup(DesktopPaneControl_PetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DesktopPaneControl_PetsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(DesktopPaneControl_PetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Panel_Button_Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Panel_Button_Novo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Panel_Button_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Panel_Button_Deletar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(DesktopPaneControl_PetsLayout.createSequentialGroup()
                        .addGroup(DesktopPaneControl_PetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DesktopPaneControl_PetsLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(txtSEARCH, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(DesktopPaneControl_PetsLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPaneControl_Pets, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPaneControl_Pets)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Panel_Button_VoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_Button_VoltarMouseClicked
        this.dispose();
    }//GEN-LAST:event_Panel_Button_VoltarMouseClicked

    private void Panel_Button_NovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_Button_NovoMouseClicked
        Cadastro_Pets_JIFF obj = new Cadastro_Pets_JIFF();
        DesktopPaneControl_Pets.add(obj).setVisible(true);

        // PROFESSOR POO ----------------------
        // NewJDialog x = new  NewJDialog(pai, true);
        // x.setVisible(true);
        // PROFESSOR POO ----------------------
    }//GEN-LAST:event_Panel_Button_NovoMouseClicked
    
    
    
    
    
    

    
    ArrayList <Pets> listaPets = new ArrayList<>();
    
    // Campo de pesquisa Search para a tabela
    private void txtSEARCHKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSEARCHKeyReleased
        ArrayList<Pets> listaFiltrada = listaPets.stream().filter(funcionario -> funcionario.getNome().startsWith(txtSEARCH.getText())).collect(Collectors.toCollection(ArrayList::new));
        
        TableModel tb = TableModelCreator.createTableModel(Pets.class, listaPets, null);
        
        TABLE_PETS___.setModel(tb);
    }//GEN-LAST:event_txtSEARCHKeyReleased

    
    // Cores dos Holders -------------
    void ExitedButtonColor(JPanel panel){
        panel.setBackground(new Color(85,65,118));
    }
    
    void PressedButtonColor(JPanel panel){
        panel.setBackground(new Color(175,175,226));
    }
        
    void MovedReleasedButtonColor(JPanel panel){
        panel.setBackground(new Color(204,204,255));
    }
    // -------------------------------
    
    // Holders -----------------------
    public void SearchColorHolderMoved(JTextField textf){
        textf.setBackground(new Color(96,65,134));
    }
    
    public void SearchColorHolderExited(JTextField textf){
        textf.setBackground(new Color(85,65,118));
    }
    
    private void txtSEARCHMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSEARCHMouseMoved
        SearchColorHolderMoved(txtSEARCH);
    }//GEN-LAST:event_txtSEARCHMouseMoved

    private void txtSEARCHMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSEARCHMouseExited
        SearchColorHolderExited(txtSEARCH);
    }//GEN-LAST:event_txtSEARCHMouseExited

    private void Panel_Button_VoltarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_Button_VoltarMouseMoved
        MovedReleasedButtonColor(Panel_Button_Voltar);
    }//GEN-LAST:event_Panel_Button_VoltarMouseMoved

    private void Panel_Button_NovoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_Button_NovoMouseMoved
        MovedReleasedButtonColor(Panel_Button_Novo);
    }//GEN-LAST:event_Panel_Button_NovoMouseMoved

    private void Panel_Button_EditarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_Button_EditarMouseMoved
        MovedReleasedButtonColor(Panel_Button_Editar);
    }//GEN-LAST:event_Panel_Button_EditarMouseMoved

    private void Panel_Button_DeletarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_Button_DeletarMouseMoved
        MovedReleasedButtonColor(Panel_Button_Deletar);
    }//GEN-LAST:event_Panel_Button_DeletarMouseMoved

    private void Panel_Button_DeletarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_Button_DeletarMouseExited
        ExitedButtonColor(Panel_Button_Deletar);
        ExitedButtonColor(Panel_Button_Voltar);
        ExitedButtonColor(Panel_Button_Novo);
        ExitedButtonColor(Panel_Button_Editar);
    }//GEN-LAST:event_Panel_Button_DeletarMouseExited
    
    
    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DesktopPaneControl_Pets;
    private javax.swing.JPanel Panel_Button_Deletar;
    private javax.swing.JPanel Panel_Button_Editar;
    private javax.swing.JPanel Panel_Button_Novo;
    private javax.swing.JPanel Panel_Button_Voltar;
    private javax.swing.JTable TABLE_PETS___;
    private javax.swing.JLabel delete_button;
    private javax.swing.JLabel edit_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel new_button;
    private javax.swing.JLabel return_button;
    private javax.swing.JTextField txtSEARCH;
    // End of variables declaration//GEN-END:variables
}
