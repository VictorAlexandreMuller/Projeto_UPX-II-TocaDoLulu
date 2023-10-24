package java2.InicialPanel;

import java.awt.Color;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.MenuItem;
import java3.Panels.Painel_Pets_JIFF;
import java3.Panels.Painel_Tutores_JIFF;
import java3.Panels.Painel_Veterinarios_JIFF;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JDesktopPane;
import javax.swing.JMenu;
import javax.swing.JPanel;
import java1.Login.jDialog_Login;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class Swing_Tela_Inicial extends javax.swing.JFrame {

    
    // Construtor da classe Swing_Tela_Inicial.
    public Swing_Tela_Inicial() {
        
        // Acesso de Login
        jDialog_Login login = new jDialog_Login(null,true);
        login.setVisible(true);
        if(login.getAutenticado()){
            initComponents();
            
        }
        
    }
    
    // VERIFICAR
    public void ImagemIcon(){
        ImageIcon img = new ImageIcon(getClass().getResource("src/main/java/icons_init/pets_icon40.png"));
        icon_PETS.setIcon(img);
        ImagemIcon();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ImageIcon icon = new ImageIcon("src/main/java/Imagens/3.jpg");
        Image image = icon.getImage();
        DesktopPaneControl = new javax.swing.JDesktopPane()
        {public void paintComponent(Graphics g){
            g.drawImage(image,0,0,getWidth(),getHeight(),this);
        }}
        ;
        jPanel2 = new javax.swing.JPanel();
        panel_button_pets = new javax.swing.JPanel();
        PETS = new javax.swing.JLabel();
        icon_PETS = new javax.swing.JLabel();
        panel_button_tutores = new javax.swing.JPanel();
        TUTORES = new javax.swing.JLabel();
        icon_TUTORES = new javax.swing.JLabel();
        panel_button_veterinarios = new javax.swing.JPanel();
        VETERINARIOS = new javax.swing.JLabel();
        icon_VETERINARIOS = new javax.swing.JLabel();
        panel_button_servicos = new javax.swing.JPanel();
        SERVICOS = new javax.swing.JLabel();
        icon_SERVICOS = new javax.swing.JLabel();
        panel_button_sair = new javax.swing.JPanel();
        icon_LOGOUT = new javax.swing.JLabel();
        LOGOUT = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MENU_HEADDER_BUTTON = new javax.swing.JMenu();
        MENU_ITEM_PETS = new javax.swing.JMenuItem();
        MENU_ITEM_TUTORES = new javax.swing.JMenuItem();
        MENU_ITEM_VETERINARIOS = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        MENU_ITEM_SAIR = new javax.swing.JMenuItem();
        MENU_HEADDER_OPCOES = new javax.swing.JMenu();
        MENU_ITEM_PRECOS = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1281, 721));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setSize(new java.awt.Dimension(1280, 720));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        DesktopPaneControl.setBackground(new java.awt.Color(175, 175, 226));
        DesktopPaneControl.setPreferredSize(new java.awt.Dimension(900, 450));

        javax.swing.GroupLayout DesktopPaneControlLayout = new javax.swing.GroupLayout(DesktopPaneControl);
        DesktopPaneControl.setLayout(DesktopPaneControlLayout);
        DesktopPaneControlLayout.setHorizontalGroup(
            DesktopPaneControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1072, Short.MAX_VALUE)
        );
        DesktopPaneControlLayout.setVerticalGroup(
            DesktopPaneControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 697, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(54, 33, 89));

        panel_button_pets.setBackground(new java.awt.Color(85, 65, 118));
        panel_button_pets.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panel_button_petsMouseMoved(evt);
            }
        });
        panel_button_pets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_button_petsMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_button_veterinariosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel_button_petsMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panel_button_petsMouseReleased(evt);
            }
        });

        PETS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PETS.setForeground(new java.awt.Color(255, 255, 255));
        PETS.setText("PETS");

        icon_PETS.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Documents\\Dev\\UPX2-Toca-do-Lulu\\Java\\javaTocaDoLuluMaven\\src\\main\\java\\iconsInit\\1pets_icon40.png")); // NOI18N

        javax.swing.GroupLayout panel_button_petsLayout = new javax.swing.GroupLayout(panel_button_pets);
        panel_button_pets.setLayout(panel_button_petsLayout);
        panel_button_petsLayout.setHorizontalGroup(
            panel_button_petsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_button_petsLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(icon_PETS, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PETS)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_button_petsLayout.setVerticalGroup(
            panel_button_petsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PETS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(icon_PETS, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panel_button_tutores.setBackground(new java.awt.Color(85, 65, 118));
        panel_button_tutores.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panel_button_tutoresMouseMoved(evt);
            }
        });
        panel_button_tutores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_button_tutoresMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_button_veterinariosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel_button_tutoresMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panel_button_tutoresMouseReleased(evt);
            }
        });

        TUTORES.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TUTORES.setForeground(new java.awt.Color(255, 255, 255));
        TUTORES.setText("TUTORES");

        icon_TUTORES.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Documents\\Dev\\UPX2-Toca-do-Lulu\\Java\\javaTocaDoLuluMaven\\src\\main\\java\\iconsInit\\2tutores_icon40.png")); // NOI18N

        javax.swing.GroupLayout panel_button_tutoresLayout = new javax.swing.GroupLayout(panel_button_tutores);
        panel_button_tutores.setLayout(panel_button_tutoresLayout);
        panel_button_tutoresLayout.setHorizontalGroup(
            panel_button_tutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_button_tutoresLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(icon_TUTORES, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TUTORES)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        panel_button_tutoresLayout.setVerticalGroup(
            panel_button_tutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TUTORES, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(icon_TUTORES, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panel_button_veterinarios.setBackground(new java.awt.Color(85, 65, 118));
        panel_button_veterinarios.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panel_button_veterinariosMouseMoved(evt);
            }
        });
        panel_button_veterinarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_button_veterinariosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_button_veterinariosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel_button_veterinariosMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panel_button_veterinariosMouseReleased(evt);
            }
        });

        VETERINARIOS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        VETERINARIOS.setForeground(new java.awt.Color(255, 255, 255));
        VETERINARIOS.setText("VETERINÁRIOS");

        icon_VETERINARIOS.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Documents\\Dev\\UPX2-Toca-do-Lulu\\Java\\javaTocaDoLuluMaven\\src\\main\\java\\iconsInit\\3veterinarios_icon40.png")); // NOI18N

        javax.swing.GroupLayout panel_button_veterinariosLayout = new javax.swing.GroupLayout(panel_button_veterinarios);
        panel_button_veterinarios.setLayout(panel_button_veterinariosLayout);
        panel_button_veterinariosLayout.setHorizontalGroup(
            panel_button_veterinariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_button_veterinariosLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(icon_VETERINARIOS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(VETERINARIOS)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_button_veterinariosLayout.setVerticalGroup(
            panel_button_veterinariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon_VETERINARIOS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(VETERINARIOS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panel_button_servicos.setBackground(new java.awt.Color(85, 65, 118));
        panel_button_servicos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panel_button_servicosMouseMoved(evt);
            }
        });
        panel_button_servicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_button_servicosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_button_veterinariosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel_button_servicosMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panel_button_servicosMouseReleased(evt);
            }
        });

        SERVICOS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SERVICOS.setForeground(new java.awt.Color(255, 255, 255));
        SERVICOS.setText("SERVIÇOS");

        icon_SERVICOS.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Documents\\Dev\\UPX2-Toca-do-Lulu\\Java\\javaTocaDoLuluMaven\\src\\main\\java\\iconsInit\\4servicos_icon40.png")); // NOI18N

        javax.swing.GroupLayout panel_button_servicosLayout = new javax.swing.GroupLayout(panel_button_servicos);
        panel_button_servicos.setLayout(panel_button_servicosLayout);
        panel_button_servicosLayout.setHorizontalGroup(
            panel_button_servicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_button_servicosLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(icon_SERVICOS)
                .addGap(18, 18, 18)
                .addComponent(SERVICOS)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_button_servicosLayout.setVerticalGroup(
            panel_button_servicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon_SERVICOS, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(SERVICOS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panel_button_sair.setBackground(new java.awt.Color(85, 65, 118));
        panel_button_sair.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panel_button_sairMouseMoved(evt);
            }
        });
        panel_button_sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_button_sairMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_button_veterinariosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel_button_sairMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panel_button_sairMouseReleased(evt);
            }
        });

        icon_LOGOUT.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Documents\\Dev\\UPX2-Toca-do-Lulu\\Java\\javaTocaDoLuluMaven\\src\\main\\java\\iconsInit\\5logout_icon40.png")); // NOI18N

        LOGOUT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LOGOUT.setForeground(new java.awt.Color(255, 255, 255));
        LOGOUT.setText("LOGOUT");

        javax.swing.GroupLayout panel_button_sairLayout = new javax.swing.GroupLayout(panel_button_sair);
        panel_button_sair.setLayout(panel_button_sairLayout);
        panel_button_sairLayout.setHorizontalGroup(
            panel_button_sairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_button_sairLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(icon_LOGOUT)
                .addGap(18, 18, 18)
                .addComponent(LOGOUT)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_button_sairLayout.setVerticalGroup(
            panel_button_sairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon_LOGOUT, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
            .addComponent(LOGOUT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_button_pets, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_button_tutores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_button_veterinarios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_button_servicos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_button_sair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(panel_button_pets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_button_tutores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_button_veterinarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_button_servicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_button_sair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(DesktopPaneControl, javax.swing.GroupLayout.DEFAULT_SIZE, 1072, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPaneControl, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(64, 43, 100));
        jMenuBar1.setBorder(null);
        jMenuBar1.setForeground(new java.awt.Color(64, 43, 100));
        jMenuBar1.setBorderPainted(false);
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        MENU_HEADDER_BUTTON.setBackground(new java.awt.Color(64, 43, 100));
        MENU_HEADDER_BUTTON.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        MENU_HEADDER_BUTTON.setForeground(new java.awt.Color(255, 255, 255));
        MENU_HEADDER_BUTTON.setText("Menu");
        MENU_HEADDER_BUTTON.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MENU_HEADDER_BUTTON.setIconTextGap(13);
        MENU_HEADDER_BUTTON.setPreferredSize(new java.awt.Dimension(60, 21));
        MENU_HEADDER_BUTTON.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                MENU_HEADDER_BUTTONMouseMoved(evt);
            }
        });
        MENU_HEADDER_BUTTON.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MENU_HEADDER_BUTTONMouseExited(evt);
            }
        });

        MENU_ITEM_PETS.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MENU_ITEM_PETS.setBackground(new java.awt.Color(64, 43, 100));
        MENU_ITEM_PETS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MENU_ITEM_PETS.setForeground(new java.awt.Color(255, 255, 255));
        MENU_ITEM_PETS.setText("Pets");
        MENU_ITEM_PETS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENU_ITEM_PETSActionPerformed(evt);
            }
        });
        MENU_HEADDER_BUTTON.add(MENU_ITEM_PETS);

        MENU_ITEM_TUTORES.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MENU_ITEM_TUTORES.setBackground(new java.awt.Color(64, 43, 100));
        MENU_ITEM_TUTORES.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MENU_ITEM_TUTORES.setForeground(new java.awt.Color(255, 255, 255));
        MENU_ITEM_TUTORES.setText("Tutores");
        MENU_ITEM_TUTORES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENU_ITEM_TUTORESActionPerformed(evt);
            }
        });
        MENU_HEADDER_BUTTON.add(MENU_ITEM_TUTORES);

        MENU_ITEM_VETERINARIOS.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MENU_ITEM_VETERINARIOS.setBackground(new java.awt.Color(64, 43, 100));
        MENU_ITEM_VETERINARIOS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MENU_ITEM_VETERINARIOS.setForeground(new java.awt.Color(255, 255, 255));
        MENU_ITEM_VETERINARIOS.setText("Veterinários");
        MENU_ITEM_VETERINARIOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENU_ITEM_VETERINARIOSActionPerformed(evt);
            }
        });
        MENU_HEADDER_BUTTON.add(MENU_ITEM_VETERINARIOS);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setBackground(new java.awt.Color(64, 43, 100));
        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setText("Serviços");
        MENU_HEADDER_BUTTON.add(jMenuItem1);

        jSeparator1.setPreferredSize(new java.awt.Dimension(0, 2));
        MENU_HEADDER_BUTTON.add(jSeparator1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setBackground(new java.awt.Color(64, 43, 100));
        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem2.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem2.setText("Logout");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        MENU_HEADDER_BUTTON.add(jMenuItem2);

        MENU_ITEM_SAIR.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MENU_ITEM_SAIR.setBackground(new java.awt.Color(64, 43, 100));
        MENU_ITEM_SAIR.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MENU_ITEM_SAIR.setForeground(new java.awt.Color(255, 255, 255));
        MENU_ITEM_SAIR.setText("Sair");
        MENU_ITEM_SAIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENU_ITEM_SAIRActionPerformed(evt);
            }
        });
        MENU_HEADDER_BUTTON.add(MENU_ITEM_SAIR);

        jMenuBar1.add(MENU_HEADDER_BUTTON);

        MENU_HEADDER_OPCOES.setBackground(new java.awt.Color(64, 43, 100));
        MENU_HEADDER_OPCOES.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        MENU_HEADDER_OPCOES.setForeground(new java.awt.Color(255, 255, 255));
        MENU_HEADDER_OPCOES.setText("Opções");
        MENU_HEADDER_OPCOES.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MENU_HEADDER_OPCOES.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MENU_HEADDER_OPCOES.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MENU_HEADDER_OPCOES.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MENU_HEADDER_OPCOES.setIconTextGap(8);
        MENU_HEADDER_OPCOES.setInheritsPopupMenu(true);
        MENU_HEADDER_OPCOES.setMinimumSize(new java.awt.Dimension(60, 21));
        MENU_HEADDER_OPCOES.setPreferredSize(new java.awt.Dimension(60, 21));
        MENU_HEADDER_OPCOES.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        MENU_HEADDER_OPCOES.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        MENU_HEADDER_OPCOES.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                MENU_HEADDER_OPCOESMouseMoved(evt);
            }
        });
        MENU_HEADDER_OPCOES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MENU_HEADDER_BUTTONMouseExited(evt);
            }
        });

        MENU_ITEM_PRECOS.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MENU_ITEM_PRECOS.setBackground(new java.awt.Color(64, 43, 100));
        MENU_ITEM_PRECOS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MENU_ITEM_PRECOS.setForeground(new java.awt.Color(255, 255, 255));
        MENU_ITEM_PRECOS.setText("Preços");
        MENU_HEADDER_OPCOES.add(MENU_ITEM_PRECOS);

        jMenuItem3.setBackground(new java.awt.Color(64, 43, 100));
        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem3.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem3.setText("About");
        MENU_HEADDER_OPCOES.add(jMenuItem3);

        jMenuBar1.add(MENU_HEADDER_OPCOES);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    // Colors Settings - for - Moved, Pressed, Exiters and Releaseds below --------------------------
    
    void MovedReleasedColor(JPanel panel){
        panel.setBackground(new Color(204,204,255));
    }
    
    void ExitedColor(JPanel panel){
        panel.setBackground(new Color(85,65,118));
    }
    
    void PressedColor(JPanel panel){
        panel.setBackground(new Color(175,175,226));
    }
    
    // -------------------------------------------------------------
    
    void MovedMENUColor(JMenu menu){
        menu.setBackground(new Color(204,204,255));
    }
    
    void ExitedMENUColor(JMenu menu){
        menu.setBackground(new Color(64,43,100));
    }
    
    // -------------------------------------------------------------
    
    // NavBar
    
    private void MENU_ITEM_SAIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENU_ITEM_SAIRActionPerformed
        System.exit(0);
    }//GEN-LAST:event_MENU_ITEM_SAIRActionPerformed

    private void MENU_ITEM_PETSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENU_ITEM_PETSActionPerformed
        Painel_Pets_JIFF obj = new Painel_Pets_JIFF();
        DesktopPaneControl.add(obj).setVisible(true);
    }//GEN-LAST:event_MENU_ITEM_PETSActionPerformed

    private void MENU_ITEM_TUTORESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENU_ITEM_TUTORESActionPerformed
        Painel_Tutores_JIFF obj = new Painel_Tutores_JIFF();
        DesktopPaneControl.add(obj).setVisible(true);
    }//GEN-LAST:event_MENU_ITEM_TUTORESActionPerformed

    private void MENU_ITEM_VETERINARIOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENU_ITEM_VETERINARIOSActionPerformed
        Painel_Veterinarios_JIFF obj = new Painel_Veterinarios_JIFF();
        DesktopPaneControl.add(obj).setVisible(true);
    }//GEN-LAST:event_MENU_ITEM_VETERINARIOSActionPerformed
        
    // Moved, Pressed
    
    private void panel_button_sairMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_button_sairMousePressed
        PressedColor(panel_button_sair);
    }//GEN-LAST:event_panel_button_sairMousePressed

    private void panel_button_petsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_button_petsMousePressed
        PressedColor(panel_button_pets);
    }//GEN-LAST:event_panel_button_petsMousePressed

    private void panel_button_tutoresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_button_tutoresMousePressed
        PressedColor(panel_button_tutores);
    }//GEN-LAST:event_panel_button_tutoresMousePressed

    private void panel_button_veterinariosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_button_veterinariosMousePressed
        PressedColor(panel_button_veterinarios);
    }//GEN-LAST:event_panel_button_veterinariosMousePressed
   
    private void panel_button_petsMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_button_petsMouseMoved
        MovedReleasedColor(panel_button_pets);
    }//GEN-LAST:event_panel_button_petsMouseMoved
    
    private void panel_button_sairMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_button_sairMouseMoved
        MovedReleasedColor(panel_button_sair);
    }//GEN-LAST:event_panel_button_sairMouseMoved

    private void panel_button_servicosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_button_servicosMousePressed
        PressedColor(panel_button_servicos);
    }//GEN-LAST:event_panel_button_servicosMousePressed

    private void panel_button_tutoresMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_button_tutoresMouseMoved
        MovedReleasedColor(panel_button_tutores);
    }//GEN-LAST:event_panel_button_tutoresMouseMoved

    private void panel_button_veterinariosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_button_veterinariosMouseMoved
        MovedReleasedColor(panel_button_veterinarios);
    }//GEN-LAST:event_panel_button_veterinariosMouseMoved

    private void panel_button_servicosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_button_servicosMouseMoved
        MovedReleasedColor(panel_button_servicos);
    }//GEN-LAST:event_panel_button_servicosMouseMoved

    // Clickeds Systems
    
    private void panel_button_petsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_button_petsMouseClicked
        Painel_Pets_JIFF t = Painel_Pets_JIFF.getInstance();

        t.pack();

        if(!t.isVisible ()){
            DesktopPaneControl.add(t);
            t.setVisible(true);
        } else{
            t.moveToFront();
        }    
    }//GEN-LAST:event_panel_button_petsMouseClicked

    private void panel_button_tutoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_button_tutoresMouseClicked
        Painel_Tutores_JIFF obj = new Painel_Tutores_JIFF();
        DesktopPaneControl.add(obj).setVisible(true);
    }//GEN-LAST:event_panel_button_tutoresMouseClicked

    private void panel_button_veterinariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_button_veterinariosMouseClicked
        Painel_Veterinarios_JIFF obj = new Painel_Veterinarios_JIFF();
        DesktopPaneControl.add(obj).setVisible(true);
    }//GEN-LAST:event_panel_button_veterinariosMouseClicked

    private void panel_button_servicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_button_servicosMouseClicked
        
    }//GEN-LAST:event_panel_button_servicosMouseClicked

    private void panel_button_sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_button_sairMouseClicked
        this.dispose();
        jDialog_Login obj = new jDialog_Login(this, rootPaneCheckingEnabled);
        obj.setVisible(true);
    }//GEN-LAST:event_panel_button_sairMouseClicked

    // Releaseds and Exits Color Buttons
    
    private void panel_button_servicosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_button_servicosMouseReleased
        MovedReleasedColor(panel_button_servicos);
    }//GEN-LAST:event_panel_button_servicosMouseReleased

    private void panel_button_veterinariosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_button_veterinariosMouseReleased
        MovedReleasedColor(panel_button_veterinarios);
    }//GEN-LAST:event_panel_button_veterinariosMouseReleased

    private void panel_button_tutoresMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_button_tutoresMouseReleased
        MovedReleasedColor(panel_button_tutores);
    }//GEN-LAST:event_panel_button_tutoresMouseReleased

    private void panel_button_petsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_button_petsMouseReleased
        MovedReleasedColor(panel_button_pets);
    }//GEN-LAST:event_panel_button_petsMouseReleased

    private void panel_button_sairMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_button_sairMouseReleased
        MovedReleasedColor(panel_button_sair);
    }//GEN-LAST:event_panel_button_sairMouseReleased

    private void MENU_HEADDER_BUTTONMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MENU_HEADDER_BUTTONMouseMoved
        MENU_HEADDER_BUTTON.setOpaque(true);
        MovedMENUColor(MENU_HEADDER_BUTTON);
    }//GEN-LAST:event_MENU_HEADDER_BUTTONMouseMoved

    private void MENU_HEADDER_OPCOESMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MENU_HEADDER_OPCOESMouseMoved
        MENU_HEADDER_OPCOES.setOpaque(true);
        MovedMENUColor(MENU_HEADDER_OPCOES);
    }//GEN-LAST:event_MENU_HEADDER_OPCOESMouseMoved

    private void MENU_HEADDER_BUTTONMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MENU_HEADDER_BUTTONMouseExited
        MENU_HEADDER_BUTTON.setOpaque(true);
        ExitedMENUColor(MENU_HEADDER_BUTTON);
        ExitedMENUColor(MENU_HEADDER_OPCOES);
    }//GEN-LAST:event_MENU_HEADDER_BUTTONMouseExited

    private void panel_button_veterinariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_button_veterinariosMouseExited
        ExitedColor(panel_button_servicos);
        ExitedColor(panel_button_veterinarios);
        ExitedColor(panel_button_tutores);
        ExitedColor(panel_button_sair);
        ExitedColor(panel_button_pets);
    }//GEN-LAST:event_panel_button_veterinariosMouseExited

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.dispose();
        jDialog_Login obj = new jDialog_Login(this, rootPaneCheckingEnabled);
        obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed
    
    // -> Borda True e false para MouseMoved e MouseExited
    // MENU_HEADDER_BUTTON.setBorderPainted(true);
    // Border whiteline = BorderFactory.createLineBorder(Color.white);
    // MENU_HEADDER_BUTTON.setBorder(whiteline);
        
    // MENU_HEADDER_BUTTON.setBorderPainted(false);
    
    
    
    
    
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    // Look And Feel can be changed by Metal, Nimbus, CDE/Motif, Windows and Windows Classic --------
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
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
    private javax.swing.JDesktopPane DesktopPaneControl;
    private javax.swing.JLabel LOGOUT;
    private javax.swing.JMenu MENU_HEADDER_BUTTON;
    private javax.swing.JMenu MENU_HEADDER_OPCOES;
    private javax.swing.JMenuItem MENU_ITEM_PETS;
    private javax.swing.JMenuItem MENU_ITEM_PRECOS;
    private javax.swing.JMenuItem MENU_ITEM_SAIR;
    private javax.swing.JMenuItem MENU_ITEM_TUTORES;
    private javax.swing.JMenuItem MENU_ITEM_VETERINARIOS;
    private javax.swing.JLabel PETS;
    private javax.swing.JLabel SERVICOS;
    private javax.swing.JLabel TUTORES;
    private javax.swing.JLabel VETERINARIOS;
    private javax.swing.JLabel icon_LOGOUT;
    private javax.swing.JLabel icon_PETS;
    private javax.swing.JLabel icon_SERVICOS;
    private javax.swing.JLabel icon_TUTORES;
    private javax.swing.JLabel icon_VETERINARIOS;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPanel panel_button_pets;
    private javax.swing.JPanel panel_button_sair;
    private javax.swing.JPanel panel_button_servicos;
    private javax.swing.JPanel panel_button_tutores;
    private javax.swing.JPanel panel_button_veterinarios;
    // End of variables declaration//GEN-END:variables
}
