package java4.Cadastros;

import ConectionsDAO.JPAUtil;
import ClassesDAO.PetsDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java1.Classes.Pets;
import java1.Classes.PetsPlanosValores;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
import ClassesDAO.PetsPlanosValoresDAO;
import ClassesDAO.TutoresDAO;
import java.util.List;
import java1.Classes.Tutores;
import javax.swing.DefaultComboBoxModel;

public class CadastroPetsJIFF extends javax.swing.JInternalFrame {

    public CadastroPetsJIFF() {
        initComponents();
        restaurarDadosComboBoxPlanos();
        restaurarDadosComboBoxTutores();
    }

    private static CadastroPetsJIFF myInstance;

    public static CadastroPetsJIFF getInstance() {
        if (myInstance == null) {
            myInstance = new CadastroPetsJIFF();
        } return myInstance;
    }
    
    
    
    
    
    
    // Código que puxa os tipos de Planos para a Combo Box
    
    // Utilizar os dois comentários abaixo caso precise utilizar do identificadores ID do banco de dados para puxar algum elemento.
    // 1: Vector<Integer> id_plano = new Vector<Integer>();
    
    public void restaurarDadosComboBoxPlanos(){
        try {
            PetsPlanosValoresDAO objpetsdao = new PetsPlanosValoresDAO();
            ResultSet rs = objpetsdao.listarComboPlanos();
            
            while (rs.next()) {
                // 2: id_plano.addElement(rs.getInt(1));
                comboPET_PLANO.addItem(rs.getString(1));
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Carregar Plano VIEW: " + erro);
        }
    }
    
    public void restaurarDadosComboBoxTutores() {
        try {
            TutoresDAO obj = new TutoresDAO();
            ResultSet rs = obj.listarComboTutores();
            
            while (rs.next()) {
                comboTUTOR.addItem(rs.getString(1));
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Carregar Tutor VIEW: " + erro);
        }
    }
    /*
    public void popularCombo() {

        try {
            List<Tutores> lstTutores = new TutoresDAO().getAll(Tutores.class);
            comboTUTOR.setModel(new DefaultComboBoxModel<Tutores>(
                    lstTutores.toArray(new Tutores[lstTutores.size()])));

        } catch (Exception e) {
        }
    }
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        txtPET_COR = new javax.swing.JTextField();
        txtPET_NASCIMENTO = new javax.swing.JFormattedTextField();
        COR = new javax.swing.JLabel();
        NASCIMENTO = new javax.swing.JLabel();
        txtPET_TIPOREDESOCIAL2 = new javax.swing.JTextField();
        TIPOREDE = new javax.swing.JLabel();
        txtPET_RACA = new javax.swing.JTextField();
        RACA = new javax.swing.JLabel();
        txtPET_NOME = new javax.swing.JTextField();
        NOME = new javax.swing.JLabel();
        SEXO = new javax.swing.JLabel();
        REDE = new javax.swing.JLabel();
        txtPET_REDESOCIAL2 = new javax.swing.JTextField();
        comboPET_SEXO = new javax.swing.JComboBox<>();
        PLANO = new javax.swing.JLabel();
        comboPET_PLANO = new javax.swing.JComboBox<>();
        TIPOREDE1 = new javax.swing.JLabel();
        txtPET_TIPOREDESOCIAL1 = new javax.swing.JTextField();
        REDE1 = new javax.swing.JLabel();
        txtPET_REDESOCIAL1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        ALERGIA = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtPET_ALERGIAS = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPET_VACINACAO = new javax.swing.JTextArea();
        VACINACAO = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPET_REMEDIOS = new javax.swing.JTextArea();
        REMEDIOS = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtPET_OBSERVACOES = new javax.swing.JTextArea();
        OBSERVACOES = new javax.swing.JLabel();
        BOTAO_VOLTAR___ = new javax.swing.JButton();
        BOTAO_SALVAR___ = new javax.swing.JButton();
        TIPOREDE2 = new javax.swing.JLabel();
        comboTUTOR = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(45, 18, 72));
        setClosable(true);
        setIconifiable(true);
        setTitle(" Cadastro de Pets");

        jPanel1.setBackground(new java.awt.Color(45, 18, 72));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), " CADASTRO DE PET ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Gill Sans Ultra Bold", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setToolTipText("");

        jPanel2.setBackground(new java.awt.Color(45, 18, 72));

        txtPET_COR.setBackground(new java.awt.Color(86, 76, 106));
        txtPET_COR.setForeground(new java.awt.Color(255, 255, 255));
        txtPET_COR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        txtPET_NASCIMENTO.setBackground(new java.awt.Color(86, 76, 106));
        txtPET_NASCIMENTO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txtPET_NASCIMENTO.setForeground(new java.awt.Color(255, 255, 255));
        try {
            txtPET_NASCIMENTO.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtPET_NASCIMENTO.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        COR.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        COR.setForeground(new java.awt.Color(255, 255, 255));
        COR.setText("Cor (*)");

        NASCIMENTO.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NASCIMENTO.setForeground(new java.awt.Color(255, 255, 255));
        NASCIMENTO.setText("Nascimento");

        txtPET_TIPOREDESOCIAL2.setBackground(new java.awt.Color(86, 76, 106));
        txtPET_TIPOREDESOCIAL2.setForeground(new java.awt.Color(255, 255, 255));
        txtPET_TIPOREDESOCIAL2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txtPET_TIPOREDESOCIAL2.setPreferredSize(new java.awt.Dimension(3, 20));

        TIPOREDE.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TIPOREDE.setForeground(new java.awt.Color(255, 255, 255));
        TIPOREDE.setText("Tipo de Rede Social");

        txtPET_RACA.setBackground(new java.awt.Color(86, 76, 106));
        txtPET_RACA.setForeground(new java.awt.Color(255, 255, 255));
        txtPET_RACA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txtPET_RACA.setPreferredSize(new java.awt.Dimension(5, 20));

        RACA.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RACA.setForeground(new java.awt.Color(255, 255, 255));
        RACA.setText("Raça (*)");

        txtPET_NOME.setBackground(new java.awt.Color(86, 76, 106));
        txtPET_NOME.setForeground(new java.awt.Color(255, 255, 255));
        txtPET_NOME.setToolTipText("");
        txtPET_NOME.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txtPET_NOME.setPreferredSize(new java.awt.Dimension(5, 20));

        NOME.setBackground(new java.awt.Color(69, 73, 74));
        NOME.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NOME.setForeground(new java.awt.Color(255, 255, 255));
        NOME.setText("Nome (*)");

        SEXO.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SEXO.setForeground(new java.awt.Color(255, 255, 255));
        SEXO.setText("Sexo (*)");

        REDE.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        REDE.setForeground(new java.awt.Color(255, 255, 255));
        REDE.setText("Rede Social");

        txtPET_REDESOCIAL2.setBackground(new java.awt.Color(86, 76, 106));
        txtPET_REDESOCIAL2.setForeground(new java.awt.Color(255, 255, 255));
        txtPET_REDESOCIAL2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txtPET_REDESOCIAL2.setPreferredSize(new java.awt.Dimension(3, 22));

        comboPET_SEXO.setBackground(new java.awt.Color(86, 76, 106));
        comboPET_SEXO.setForeground(new java.awt.Color(255, 255, 255));
        comboPET_SEXO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "M", "F" }));
        comboPET_SEXO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        comboPET_SEXO.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        PLANO.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PLANO.setForeground(new java.awt.Color(255, 255, 255));
        PLANO.setText("Plano (*)");

        comboPET_PLANO.setBackground(new java.awt.Color(86, 76, 106));
        comboPET_PLANO.setForeground(new java.awt.Color(255, 255, 255));
        comboPET_PLANO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        comboPET_PLANO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        TIPOREDE1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TIPOREDE1.setForeground(new java.awt.Color(255, 255, 255));
        TIPOREDE1.setText("Tipo de Rede Social");

        txtPET_TIPOREDESOCIAL1.setBackground(new java.awt.Color(86, 76, 106));
        txtPET_TIPOREDESOCIAL1.setForeground(new java.awt.Color(255, 255, 255));
        txtPET_TIPOREDESOCIAL1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txtPET_TIPOREDESOCIAL1.setPreferredSize(new java.awt.Dimension(3, 20));

        REDE1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        REDE1.setForeground(new java.awt.Color(255, 255, 255));
        REDE1.setText("Rede Social");

        txtPET_REDESOCIAL1.setBackground(new java.awt.Color(86, 76, 106));
        txtPET_REDESOCIAL1.setForeground(new java.awt.Color(255, 255, 255));
        txtPET_REDESOCIAL1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txtPET_REDESOCIAL1.setPreferredSize(new java.awt.Dimension(3, 22));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(NASCIMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPET_COR, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPET_NASCIMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(COR, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(262, 262, 262)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(REDE1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TIPOREDE1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPET_REDESOCIAL1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPET_TIPOREDESOCIAL1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(TIPOREDE, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPET_TIPOREDESOCIAL2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(PLANO, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboPET_PLANO, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(REDE, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPET_REDESOCIAL2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(NOME, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPET_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(RACA, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SEXO, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtPET_RACA, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                .addComponent(comboPET_SEXO, 0, 230, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPET_NOME, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NOME, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SEXO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboPET_SEXO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPET_RACA, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RACA, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPET_COR, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(COR, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPET_NASCIMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NASCIMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtPET_TIPOREDESOCIAL1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPET_REDESOCIAL1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(TIPOREDE1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(REDE1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPET_TIPOREDESOCIAL2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TIPOREDE, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(REDE, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPET_REDESOCIAL2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboPET_PLANO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PLANO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jPanel3.setBackground(new java.awt.Color(45, 18, 72));

        ALERGIA.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ALERGIA.setForeground(new java.awt.Color(255, 255, 255));
        ALERGIA.setText("Alergias");

        txtPET_ALERGIAS.setBackground(new java.awt.Color(86, 76, 106));
        txtPET_ALERGIAS.setColumns(20);
        txtPET_ALERGIAS.setForeground(new java.awt.Color(255, 255, 255));
        txtPET_ALERGIAS.setLineWrap(true);
        txtPET_ALERGIAS.setRows(5);
        txtPET_ALERGIAS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jScrollPane3.setViewportView(txtPET_ALERGIAS);

        txtPET_VACINACAO.setBackground(new java.awt.Color(86, 76, 106));
        txtPET_VACINACAO.setColumns(20);
        txtPET_VACINACAO.setForeground(new java.awt.Color(255, 255, 255));
        txtPET_VACINACAO.setLineWrap(true);
        txtPET_VACINACAO.setRows(5);
        txtPET_VACINACAO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jScrollPane1.setViewportView(txtPET_VACINACAO);

        VACINACAO.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        VACINACAO.setForeground(new java.awt.Color(255, 255, 255));
        VACINACAO.setText("Vacinação");

        txtPET_REMEDIOS.setBackground(new java.awt.Color(86, 76, 106));
        txtPET_REMEDIOS.setColumns(20);
        txtPET_REMEDIOS.setForeground(new java.awt.Color(255, 255, 255));
        txtPET_REMEDIOS.setLineWrap(true);
        txtPET_REMEDIOS.setRows(5);
        txtPET_REMEDIOS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jScrollPane2.setViewportView(txtPET_REMEDIOS);

        REMEDIOS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        REMEDIOS.setForeground(new java.awt.Color(255, 255, 255));
        REMEDIOS.setText("Remedios");

        txtPET_OBSERVACOES.setBackground(new java.awt.Color(86, 76, 106));
        txtPET_OBSERVACOES.setColumns(20);
        txtPET_OBSERVACOES.setForeground(new java.awt.Color(255, 255, 255));
        txtPET_OBSERVACOES.setLineWrap(true);
        txtPET_OBSERVACOES.setRows(5);
        txtPET_OBSERVACOES.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jScrollPane4.setViewportView(txtPET_OBSERVACOES);

        OBSERVACOES.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        OBSERVACOES.setForeground(new java.awt.Color(255, 255, 255));
        OBSERVACOES.setText("Observações");

        BOTAO_VOLTAR___.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BOTAO_VOLTAR___.setForeground(new java.awt.Color(0, 0, 0));
        BOTAO_VOLTAR___.setText("Voltar");
        BOTAO_VOLTAR___.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTAO_VOLTAR___ActionPerformed(evt);
            }
        });

        BOTAO_SALVAR___.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BOTAO_SALVAR___.setForeground(new java.awt.Color(0, 0, 0));
        BOTAO_SALVAR___.setText("Salvar");
        BOTAO_SALVAR___.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTAO_SALVAR___ActionPerformed(evt);
            }
        });

        TIPOREDE2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TIPOREDE2.setForeground(new java.awt.Color(255, 255, 255));
        TIPOREDE2.setText("Tutor (*)");

        comboTUTOR.setBackground(new java.awt.Color(86, 76, 106));
        comboTUTOR.setForeground(new java.awt.Color(255, 255, 255));
        comboTUTOR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        comboTUTOR.setToolTipText("");
        comboTUTOR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(BOTAO_VOLTAR___, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(BOTAO_SALVAR___, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(TIPOREDE2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(comboTUTOR, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(REMEDIOS, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(OBSERVACOES, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(VACINACAO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ALERGIA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addGap(14, 14, 14))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ALERGIA, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VACINACAO, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(REMEDIOS, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OBSERVACOES, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboTUTOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TIPOREDE2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BOTAO_SALVAR___)
                    .addComponent(BOTAO_VOLTAR___))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BOTAO_SALVAR___ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTAO_SALVAR___ActionPerformed
        
        Pets pet = new Pets();
        PetsPlanosValores plano = new PetsPlanosValores();
        
        pet.setNome(txtPET_NOME.getText());
        pet.setSexo(comboPET_SEXO.getSelectedItem().toString().charAt(0));
        pet.setRaca(txtPET_RACA.getText());
        pet.setCor(txtPET_COR.getText());
        // Convertendo a data de DD/MM/YYYY para YYYY-MM-DD
        String dataNascimento = txtPET_NASCIMENTO.getText();
        SimpleDateFormat dateFormatInput = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat dateFormatOutput = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = dateFormatInput.parse(dataNascimento);
            pet.setNascimento(dateFormatOutput.format(date));
        } catch (ParseException erro) {
            JOptionPane.showMessageDialog(null, "Erro na conversão de data: " + erro);
        }
        pet.setTipo_rede_1(txtPET_TIPOREDESOCIAL1.getText());
        pet.setRede_social_1(txtPET_REDESOCIAL1.getText());
        pet.setTipo_rede_2(txtPET_TIPOREDESOCIAL2.getText());
        pet.setRede_social_2(txtPET_REDESOCIAL2.getText());
        pet.setTipo_plano(comboPET_PLANO.getSelectedItem().toString());
        pet.setAlergias(txtPET_ALERGIAS.getText());
        pet.setVacinacao(txtPET_VACINACAO.getText());
        pet.setRemedios(txtPET_REMEDIOS.getText());
        pet.setObservacoes(txtPET_OBSERVACOES.getText());
        // ((Produto)cmb.getSelectedItem()).getId();
        pet.setId_tutores(Integer.parseInt(comboTUTOR.getSelectedItem().toString()));
        
        EntityManager em = JPAUtil.getEntityManager();
        PetsDAO dao = new PetsDAO(em);
        
        em.getTransaction().begin(); // Inicia a transação no banco de dados
        em.persist(pet); // Adiciona as transações que deseja adicionar o banco de dados
        em.getTransaction().commit(); // Envia as transações para o banco de dados
        em.close(); // Fecha a transação para não ficar aberta atoa
        
        JOptionPane.showMessageDialog(this, "Pet salvo com sucesso!");
        this.dispose();
    }//GEN-LAST:event_BOTAO_SALVAR___ActionPerformed

    private void BOTAO_VOLTAR___ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTAO_VOLTAR___ActionPerformed
        this.dispose();
    }//GEN-LAST:event_BOTAO_VOLTAR___ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ALERGIA;
    private javax.swing.JButton BOTAO_SALVAR___;
    private javax.swing.JButton BOTAO_VOLTAR___;
    private javax.swing.JLabel COR;
    private javax.swing.JLabel NASCIMENTO;
    private javax.swing.JLabel NOME;
    private javax.swing.JLabel OBSERVACOES;
    private javax.swing.JLabel PLANO;
    private javax.swing.JLabel RACA;
    private javax.swing.JLabel REDE;
    private javax.swing.JLabel REDE1;
    private javax.swing.JLabel REMEDIOS;
    private javax.swing.JLabel SEXO;
    private javax.swing.JLabel TIPOREDE;
    private javax.swing.JLabel TIPOREDE1;
    private javax.swing.JLabel TIPOREDE2;
    private javax.swing.JLabel VACINACAO;
    private javax.swing.JComboBox<String> comboPET_PLANO;
    private javax.swing.JComboBox<String> comboPET_SEXO;
    private javax.swing.JComboBox<String> comboTUTOR;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea txtPET_ALERGIAS;
    private javax.swing.JTextField txtPET_COR;
    private javax.swing.JFormattedTextField txtPET_NASCIMENTO;
    private javax.swing.JTextField txtPET_NOME;
    private javax.swing.JTextArea txtPET_OBSERVACOES;
    private javax.swing.JTextField txtPET_RACA;
    private javax.swing.JTextField txtPET_REDESOCIAL1;
    private javax.swing.JTextField txtPET_REDESOCIAL2;
    private javax.swing.JTextArea txtPET_REMEDIOS;
    private javax.swing.JTextField txtPET_TIPOREDESOCIAL1;
    private javax.swing.JTextField txtPET_TIPOREDESOCIAL2;
    private javax.swing.JTextArea txtPET_VACINACAO;
    // End of variables declaration//GEN-END:variables
}
