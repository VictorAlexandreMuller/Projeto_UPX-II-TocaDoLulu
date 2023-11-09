package java3.Panels;

import ClassesDAO.PetsDAO;
import static ClassesDAO.PetsDAO.getColunasTablePets;
import java.awt.Color;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java1.Classes.Pets;
import java4.Cadastros.CadastroPetsJIFF;
import java.awt.Font;
import java.util.Arrays;
import java.util.List;
import java4.Cadastros.CadastroPetsJDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableModel;

public class PainelPetsJIFF extends javax.swing.JInternalFrame {
    
    private int idSelecionado;
    public Pets petSelecionado =  null;
    
    public Pets getPetSelecionado() {
        return petSelecionado;
    }
    
    public PainelPetsJIFF() {
        initComponents();
        addPlaceholderStyle(txtSEARCH);
        atualizarTabela();
    }
    
    private static PainelPetsJIFF myInstance;

    public static PainelPetsJIFF getInstance() {
        if (myInstance == null) {
            myInstance = new PainelPetsJIFF();
        } return myInstance;
    }
    
    
    
    
    
    
    
    
    // Atualizar Tabela
    
    public void atualizarTabela() {
        
        List<String> colunasVisiveis = new ArrayList<>
        (Arrays.asList("id", "nome", "sexo", "raca", "cor", "tipo_plano", "id_tutores"));
        
        List<Pets> lstPets = getColunasTablePets();
        
        try {
             // Pode-se alternar: "getAll" ou "getColunasTableTutores"
            TableModel tableModelPets = TableModelCreator.
                    createTableModel(Pets.class, lstPets, colunasVisiveis); // Pode-se alternar: "colunas" ou "null"
            
            TablePets.setModel(tableModelPets);
            
            organizarTabela();
            widthTabela();
            renameTabela();
            
        } catch (Exception e) {
            System.out.println("Houve um erro ao tentar popular a tabela");
        }
    }
    
    public void organizarTabela() {
        TablePets.getTableHeader().getColumnModel().moveColumn(1, 0);
        TablePets.getTableHeader().getColumnModel().moveColumn(3, 1);
        TablePets.getTableHeader().getColumnModel().moveColumn(4, 2);
        TablePets.getTableHeader().getColumnModel().moveColumn(5, 3);
    }
    
    public void widthTabela() {
        TablePets.getColumnModel().getColumn(0).setPreferredWidth(100);
        TablePets.getColumnModel().getColumn(1).setPreferredWidth(400);
        TablePets.getColumnModel().getColumn(2).setPreferredWidth(400);
        TablePets.getColumnModel().getColumn(3).setPreferredWidth(300);
        TablePets.getColumnModel().getColumn(4).setPreferredWidth(300);
        TablePets.getColumnModel().getColumn(5).setPreferredWidth(350);
        TablePets.getColumnModel().getColumn(6).setPreferredWidth(350);
    }
    
    public void renameTabela() {
        TablePets.getColumnModel().getColumn(2).setHeaderValue("Raça");
        TablePets.getColumnModel().getColumn(5).setHeaderValue("Tutor");
        TablePets.getColumnModel().getColumn(6).setHeaderValue("Plano");
        
    }
    
    // -------------------------------
    
    // Cores
    
    public void addPlaceholderStyle(JTextField textField){
        Font font = textField.getFont();
        font = font.deriveFont(Font.ITALIC);
        textField.setFont(font);
    }
    
    public void removePlaceholderStyle(JTextField textField){
        Font font = textField.getFont();
        font = font.deriveFont(Font.PLAIN|Font.BOLD);
        textField.setFont(font);
    }
    
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
    
    public void SearchColorHolderMoved(JTextField textf){
        textf.setBackground(new Color(96,65,134));
    }
    
    public void SearchColorHolderExited(JTextField textf){
        textf.setBackground(new Color(85,65,118));
    }
    
    // --------------------------------------------------------------------------------------------------------------
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DesktopPaneControl_Pets = new javax.swing.JDesktopPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablePets = new javax.swing.JTable();
        Panel_Button_Voltar = new javax.swing.JPanel();
        icon_VOLTAR = new javax.swing.JLabel();
        VOLTAR = new javax.swing.JLabel();
        Panel_Button_Novo = new javax.swing.JPanel();
        icon_NOVO = new javax.swing.JLabel();
        NOVO = new javax.swing.JLabel();
        Panel_Button_Editar = new javax.swing.JPanel();
        icon_EDITAR = new javax.swing.JLabel();
        EDITAR = new javax.swing.JLabel();
        Panel_Button_Deletar = new javax.swing.JPanel();
        icon_DELETAR = new javax.swing.JLabel();
        DELETAR = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtSEARCH = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(102, 51, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(" Pets");
        setMinimumSize(new java.awt.Dimension(929, 631));

        DesktopPaneControl_Pets.setBackground(new java.awt.Color(175, 175, 226));
        DesktopPaneControl_Pets.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "  PETS  ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Gill Sans Ultra Bold", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        TablePets.setAutoCreateRowSorter(true);
        TablePets.setBackground(new java.awt.Color(85, 65, 118));
        TablePets.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TablePets.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TablePets.setForeground(new java.awt.Color(255, 255, 255));
        TablePets.setModel(new javax.swing.table.DefaultTableModel(
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
        TablePets.setGridColor(new java.awt.Color(175, 175, 226));
        TablePets.setIntercellSpacing(new java.awt.Dimension(5, 5));
        TablePets.setSelectionBackground(new java.awt.Color(204, 204, 255));
        TablePets.setSelectionForeground(new java.awt.Color(0, 0, 0));
        TablePets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablePetsMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(TablePets);

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

        icon_VOLTAR.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Documents\\Dev\\UPX2-Toca-do-Lulu\\Java\\javaTocaDoLuluMaven\\src\\main\\java\\iconsCrud\\1VoltarIcon40.png")); // NOI18N
        icon_VOLTAR.setPreferredSize(new java.awt.Dimension(40, 40));

        VOLTAR.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        VOLTAR.setForeground(new java.awt.Color(255, 255, 255));
        VOLTAR.setText("Voltar");

        javax.swing.GroupLayout Panel_Button_VoltarLayout = new javax.swing.GroupLayout(Panel_Button_Voltar);
        Panel_Button_Voltar.setLayout(Panel_Button_VoltarLayout);
        Panel_Button_VoltarLayout.setHorizontalGroup(
            Panel_Button_VoltarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Button_VoltarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon_VOLTAR, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(VOLTAR)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        Panel_Button_VoltarLayout.setVerticalGroup(
            Panel_Button_VoltarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VOLTAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(icon_VOLTAR, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        Panel_Button_Novo.setBackground(new java.awt.Color(85, 65, 118));
        Panel_Button_Novo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Panel_Button_Novo.setPreferredSize(new java.awt.Dimension(145, 54));
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

        icon_NOVO.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Documents\\Dev\\UPX2-Toca-do-Lulu\\Java\\javaTocaDoLuluMaven\\src\\main\\java\\iconsCrud\\2NovoIcon40.png")); // NOI18N

        NOVO.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NOVO.setForeground(new java.awt.Color(255, 255, 255));
        NOVO.setText("Novo");

        javax.swing.GroupLayout Panel_Button_NovoLayout = new javax.swing.GroupLayout(Panel_Button_Novo);
        Panel_Button_Novo.setLayout(Panel_Button_NovoLayout);
        Panel_Button_NovoLayout.setHorizontalGroup(
            Panel_Button_NovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Button_NovoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(icon_NOVO, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(NOVO)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        Panel_Button_NovoLayout.setVerticalGroup(
            Panel_Button_NovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Button_NovoLayout.createSequentialGroup()
                .addGroup(Panel_Button_NovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(NOVO, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(icon_NOVO, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Panel_Button_Editar.setBackground(new java.awt.Color(85, 65, 118));
        Panel_Button_Editar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Panel_Button_Editar.setPreferredSize(new java.awt.Dimension(145, 54));
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

        icon_EDITAR.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Documents\\Dev\\UPX2-Toca-do-Lulu\\Java\\javaTocaDoLuluMaven\\src\\main\\java\\iconsCrud\\3AlterarIcon40.png")); // NOI18N

        EDITAR.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        EDITAR.setForeground(new java.awt.Color(255, 255, 255));
        EDITAR.setText("Editar");

        javax.swing.GroupLayout Panel_Button_EditarLayout = new javax.swing.GroupLayout(Panel_Button_Editar);
        Panel_Button_Editar.setLayout(Panel_Button_EditarLayout);
        Panel_Button_EditarLayout.setHorizontalGroup(
            Panel_Button_EditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Button_EditarLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(icon_EDITAR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EDITAR)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        Panel_Button_EditarLayout.setVerticalGroup(
            Panel_Button_EditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon_EDITAR, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
            .addComponent(EDITAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Panel_Button_Deletar.setBackground(new java.awt.Color(85, 65, 118));
        Panel_Button_Deletar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Panel_Button_Deletar.setPreferredSize(new java.awt.Dimension(145, 54));
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

        icon_DELETAR.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Documents\\Dev\\UPX2-Toca-do-Lulu\\Java\\javaTocaDoLuluMaven\\src\\main\\java\\iconsCrud\\4DeletarIcon40.png")); // NOI18N

        DELETAR.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DELETAR.setForeground(new java.awt.Color(255, 255, 255));
        DELETAR.setText("Deletar");

        javax.swing.GroupLayout Panel_Button_DeletarLayout = new javax.swing.GroupLayout(Panel_Button_Deletar);
        Panel_Button_Deletar.setLayout(Panel_Button_DeletarLayout);
        Panel_Button_DeletarLayout.setHorizontalGroup(
            Panel_Button_DeletarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Button_DeletarLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(icon_DELETAR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DELETAR)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        Panel_Button_DeletarLayout.setVerticalGroup(
            Panel_Button_DeletarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon_DELETAR, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
            .addComponent(DELETAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jSeparator1.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));

        txtSEARCH.setBackground(new java.awt.Color(85, 65, 118));
        txtSEARCH.setForeground(new java.awt.Color(255, 255, 255));
        txtSEARCH.setText("  Procurar");
        txtSEARCH.setToolTipText("");
        txtSEARCH.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtSEARCH.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                txtSEARCHMouseMoved(evt);
            }
        });
        txtSEARCH.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSEARCHFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSEARCHFocusLost(evt);
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
        jPanel6.setPreferredSize(new java.awt.Dimension(10, 14));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
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
                        .addGap(12, 12, 12)
                        .addComponent(Panel_Button_Novo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Panel_Button_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Panel_Button_Deletar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(17, 17, 17)
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
        atualizarTabela();
        this.dispose();
    }//GEN-LAST:event_Panel_Button_VoltarMouseClicked

    private void Panel_Button_NovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_Button_NovoMouseClicked
        // SÓ EXCLUIR QUANDO ESTIVER TUDO 100% FUNCIONANDO
        /*
        CadastroPetsJIFF p = CadastroPetsJIFF.getInstance();

        p.pack();

        if(!p.isVisible ()){
            DesktopPaneControl_Pets.add(p);
            p.setVisible(true);
        } else{
            p.moveToFront();
        }  
        */
        // Cadastro_Pets_JIFF obj = new Cadastro_Pets_JIFF();
        // DesktopPaneControl_Pets.add(obj).setVisible(true);
        
        petSelecionado = null;
        
        CadastroPetsJDialog obj = new CadastroPetsJDialog(null, true, this);
        obj.setVisible(true);
    }//GEN-LAST:event_Panel_Button_NovoMouseClicked
    
    // Campo de pesquisa Search para a tabela
    private void txtSEARCHKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSEARCHKeyReleased
        
        // SÓ EXCLUIR QUANDO ESTIVER TUDO FUNCIONANDO
        
        //ArrayList<Pets> listaFiltrada = listaPets.stream().filter(funcionario -> funcionario.getNome().startsWith(txtSEARCH.getText())).collect(Collectors.toCollection(ArrayList::new));
        //TableModel tb = TableModelCreator.createTableModel(Pets.class, listaPets, null);
        //TablePets.setModel(tb);
        
        
        
        
        
        List<String> colunasVisiveis = new ArrayList<>
        (Arrays.asList("id", "nome", "sexo", "raca", "cor", "tipo_plano", "id_tutores"));
        
        List<Pets> listaFiltrada = getColunasTablePets().stream().filter(pet -> 
                pet.getNome().toLowerCase().contains(txtSEARCH.getText())).collect(Collectors.toCollection(ArrayList::new));
        
        TableModel tb = TableModelCreator.createTableModel(
                Pets.class, listaFiltrada, colunasVisiveis);
        
        TablePets.setModel(tb);
        
        organizarTabela();
        widthTabela();
        renameTabela();
        
    }//GEN-LAST:event_txtSEARCHKeyReleased
        
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

    private void txtSEARCHFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSEARCHFocusGained
        if(txtSEARCH.getText().equals("  Procurar")){
            txtSEARCH.setText(null);
            txtSEARCH.requestFocus();
            removePlaceholderStyle(txtSEARCH);
            
        }
    }//GEN-LAST:event_txtSEARCHFocusGained

    private void txtSEARCHFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSEARCHFocusLost
        if(txtSEARCH.getText().length()==0){
            addPlaceholderStyle(txtSEARCH);
            txtSEARCH.setText("  Procurar");
            
        }
    }//GEN-LAST:event_txtSEARCHFocusLost

    private void TablePetsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablePetsMouseClicked
        
        
        petSelecionado = new PetsDAO().getByID(idSelecionado);
                
                if (evt.getClickCount() == 1 && !evt.isConsumed()) {
                    evt.consume();
                    JTable source = (JTable) evt.getSource();
                    int row = source.rowAtPoint(evt.getPoint());
                    int column = TablePets.convertColumnIndexToView(TablePets.getColumn("DDD").getModelIndex());
                    idSelecionado = Integer.parseInt(source.getModel().getValueAt(row, column) + "");

                } else if (evt.getClickCount() == 2 && !evt.isConsumed()) {
                    evt.consume();
                    JTable source = (JTable) evt.getSource();
                    int row = source.getSelectedRow();
                    int column = TablePets.convertColumnIndexToView(TablePets.getColumn("DDD").getModelIndex());
                    String s = source.getModel().getValueAt(row, column) + " - " + petSelecionado.toString();
                    JOptionPane.showMessageDialog(null, s);
                }        
                /*
                    OBS: O getColumn("DDD") puxa o valor correto do ID na tabela.
                    Explicação: O TableModelCreator, criada pelo professor e utilizada em aulas, cria uma tabela genérica.
                                Esta tabela TableModelCreator traz as colunas em ordem alfabética.
                                Dessa forma, foi criado o método "organizarTabela()" que organiza a Table na order que preferir, entretanto isso se aplica apenas ao front-end.
                                
                                Ou seja, antes a TableTutores apresentava as suas colunas na ordem (padrão back-end): 
                                                                                     Celular_1 = index 0
                                                                                     Ddd_1     = index 1
                                                                                     Email_1   = index 2
                                                                                     Id        = index 3
                                                                                     Nome      = index 4
                
                                Após o método "organizarTabela()", APENAS PARA O FRONT-END, as colunas foram alteradas para:
                                                                                     Id
                                                                                     Nome
                                                                                     Email
                                                                                     DDD
                                                                                     Telefone
                
                                Mas os seus valores de Index permaneceram os mesmos de antes.
                                Sendo assim, para puxarmos em getColumn o valor correto de Id, precisamos colocar o nome referente à nova coluna que está no index 3, ou seja, DDD.
                */
                
                
    }//GEN-LAST:event_TablePetsMouseClicked
    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DELETAR;
    private javax.swing.JDesktopPane DesktopPaneControl_Pets;
    private javax.swing.JLabel EDITAR;
    private javax.swing.JLabel NOVO;
    private javax.swing.JPanel Panel_Button_Deletar;
    private javax.swing.JPanel Panel_Button_Editar;
    private javax.swing.JPanel Panel_Button_Novo;
    private javax.swing.JPanel Panel_Button_Voltar;
    private javax.swing.JTable TablePets;
    private javax.swing.JLabel VOLTAR;
    private javax.swing.JLabel icon_DELETAR;
    private javax.swing.JLabel icon_EDITAR;
    private javax.swing.JLabel icon_NOVO;
    private javax.swing.JLabel icon_VOLTAR;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtSEARCH;
    // End of variables declaration//GEN-END:variables
}
