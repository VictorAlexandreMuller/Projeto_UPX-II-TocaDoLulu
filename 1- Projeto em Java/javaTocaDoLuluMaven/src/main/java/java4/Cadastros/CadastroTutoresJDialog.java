package java4.Cadastros;

import ClassesDAO.TutoresDAO;
import java.awt.Color;
import java.awt.Font;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java1.Classes.Tutores;
import java3.Panels.PainelTutoresJIFF;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class CadastroTutoresJDialog extends javax.swing.JDialog {

    private Tutores tutor;
    PainelTutoresJIFF main;
    boolean isEditar = false;
        
    public CadastroTutoresJDialog(java.awt.Frame parent, boolean modal, PainelTutoresJIFF main) {
        super(parent, modal);
        initComponents();
        
        this.main = main;

        if (main.getTutorSelecionado() != null) {
            isEditar = true;
            this.tutor = main.getTutorSelecionado();
            popularForm();
            ChangeTitle();
        }
        
    }

    

    
    
    
    
    // Altera o título do EDITAR CADASTRO
    private void ChangeTitle() {
        
        LineBorder lineBorder = new LineBorder(Color.WHITE);
        Font customFont = new Font("Gill Sans Ultra Bold", Font.BOLD, 24);
        
        TitledBorder titledBorder = BorderFactory.createTitledBorder("tentativa is true");
        titledBorder.setBorder(lineBorder);
        titledBorder.setTitle(" ALTERAR CADASTRO DE TUTOR ");
        titledBorder.setTitleColor(Color.RED);
        titledBorder.setTitleFont(customFont);
        titledBorder.setTitleJustification(titledBorder.CENTER);
        titledBorder.setTitlePosition(titledBorder.TOP);
        
        jPanel1.setBorder(titledBorder);
    }
    
    // Formas da janela Cadastro Tutores, se ela virá preenchida ou brand-new
    private void popularForm() {
        
        
        txtTUTOR_NOME.setText(tutor.getNome());
        txtTUTOR_TIPODOCUMENTO.setText(String.valueOf(tutor.getTipo_documento()));
        txtTUTOR_DOCUMENTO.setText(String.valueOf(tutor.getDocumento_identificador()));
        
        txtTUTOR_NASCIMENTO.setText(String.valueOf(tutor.getNascimento()));
        SimpleDateFormat dateFormatInput = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat dateFormatOutput = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date = dateFormatInput.parse(tutor.getNascimento());
            txtTUTOR_NASCIMENTO.setText(dateFormatOutput.format(date));
        } catch (ParseException erro) {
            JOptionPane.showMessageDialog(null, "Erro na conversão de data: " + erro);
            return;
        }
        
        txtTUTOR_CEP.setText(String.valueOf(tutor.getCep()));
        txtTUTOR_LOGRADOURO.setText(String.valueOf(tutor.getLogradouro()));
        txtTUTOR_NUMERO.setText(String.valueOf(tutor.getNumero()));
        txtTUTOR_BAIRRO.setText(String.valueOf(tutor.getBairro()));
        comboTUTOR_UF.setSelectedItem(tutor.getUf());
        txtTUTOR_MUNICIPIO.setText(String.valueOf(tutor.getMunicipio()));
        txtTUTOR_COMPLEMENTO.setText(String.valueOf(tutor.getComplemento()));
        txtTUTOR_DDD1.setText(String.valueOf(tutor.getDdd_1()));
        txtTUTOR_CELULAR1.setText(String.valueOf(tutor.getCelular_1()));
        txtTUTOR_EMAIL1.setText(String.valueOf(tutor.getEmail_1()));
        txtTUTOR_DDD2.setText(String.valueOf(tutor.getDdd_2()));
        txtTUTOR_CELULAR2.setText(String.valueOf(tutor.getCelular_2()));
        txtTUTOR_EMAIL2.setText(String.valueOf(tutor.getEmail_2()));
        txtTUTOR_TIPOREDESOCIAL1.setText(String.valueOf(tutor.getTipo_rede_1()));
        txtTUTOR_REDESOCIAL1.setText(String.valueOf(tutor.getRede_social_1()));
        txtTUTOR_TIPOREDESOCIAL2.setText(String.valueOf(tutor.getTipo_rede_2()));
        txtTUTOR_REDESOCIAL2.setText(String.valueOf(tutor.getRede_social_2()));
        txtTUTOR_OBSERVACOES.setText(String.valueOf(tutor.getObservacoes()));
    }
    
    private void resetForm() {
        txtTUTOR_NOME.setText("");
        txtTUTOR_TIPODOCUMENTO.setText("");
        txtTUTOR_DOCUMENTO.setText("");
        txtTUTOR_NASCIMENTO.setText("");
        txtTUTOR_CEP.setText("");
        txtTUTOR_LOGRADOURO.setText("");
        txtTUTOR_NUMERO.setText("");
        txtTUTOR_BAIRRO.setText("");
        comboTUTOR_UF.setSelectedItem("-");
        txtTUTOR_MUNICIPIO.setText("");
        txtTUTOR_COMPLEMENTO.setText("");
        txtTUTOR_DDD1.setText("");
        txtTUTOR_CELULAR1.setText("");
        txtTUTOR_EMAIL1.setText("");
        txtTUTOR_DDD2.setText("");
        txtTUTOR_CELULAR2.setText("");
        txtTUTOR_EMAIL2.setText("");
        txtTUTOR_TIPOREDESOCIAL1.setText("");
        txtTUTOR_REDESOCIAL1.setText("");
        txtTUTOR_TIPOREDESOCIAL2.setText("");
        txtTUTOR_REDESOCIAL2.setText("");
        txtTUTOR_OBSERVACOES.setText("");
    }
    
    // ------------------------------------------------------------------------------------------------------------
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        CEP = new javax.swing.JLabel();
        txtTUTOR_CEP = new javax.swing.JTextField();
        LOGRADOURO = new javax.swing.JLabel();
        txtTUTOR_LOGRADOURO = new javax.swing.JTextField();
        NUMERO = new javax.swing.JLabel();
        txtTUTOR_NUMERO = new javax.swing.JTextField();
        BAIRRO = new javax.swing.JLabel();
        txtTUTOR_BAIRRO = new javax.swing.JTextField();
        UF = new javax.swing.JLabel();
        MUNICIPIO = new javax.swing.JLabel();
        txtTUTOR_MUNICIPIO = new javax.swing.JTextField();
        COMPLEMENTO = new javax.swing.JLabel();
        txtTUTOR_COMPLEMENTO = new javax.swing.JTextField();
        OBSERVACOES = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTUTOR_OBSERVACOES = new javax.swing.JTextArea();
        comboTUTOR_UF = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        NOME = new javax.swing.JLabel();
        txtTUTOR_NOME = new javax.swing.JTextField();
        TIPODOCUMENTO = new javax.swing.JLabel();
        txtTUTOR_TIPODOCUMENTO = new javax.swing.JTextField();
        DOCUMENTO = new javax.swing.JLabel();
        txtTUTOR_DOCUMENTO = new javax.swing.JTextField();
        NASCIMENTO = new javax.swing.JLabel();
        txtTUTOR_NASCIMENTO = new javax.swing.JFormattedTextField();
        CELULAR1 = new javax.swing.JLabel();
        txtTUTOR_CELULAR1 = new javax.swing.JTextField();
        REDE = new javax.swing.JLabel();
        txtTUTOR_REDESOCIAL1 = new javax.swing.JTextField();
        TIPOREDE = new javax.swing.JLabel();
        txtTUTOR_TIPOREDESOCIAL1 = new javax.swing.JTextField();
        DDD1 = new javax.swing.JLabel();
        txtTUTOR_DDD1 = new javax.swing.JTextField();
        DDD2 = new javax.swing.JLabel();
        txtTUTOR_DDD2 = new javax.swing.JTextField();
        CELULAR2 = new javax.swing.JLabel();
        txtTUTOR_CELULAR2 = new javax.swing.JTextField();
        REDE1 = new javax.swing.JLabel();
        txtTUTOR_REDESOCIAL2 = new javax.swing.JTextField();
        TIPOREDE1 = new javax.swing.JLabel();
        txtTUTOR_TIPOREDESOCIAL2 = new javax.swing.JTextField();
        EMAIL1 = new javax.swing.JLabel();
        txtTUTOR_EMAIL2 = new javax.swing.JTextField();
        EMAIL2 = new javax.swing.JLabel();
        txtTUTOR_EMAIL1 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        BOTAO_VOLTAR___ = new javax.swing.JButton();
        BOTAO_SALVAR___ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(45, 18, 72));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), " CADASTRO DE TUTOR ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Gill Sans Ultra Bold", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(45, 18, 72));

        CEP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CEP.setForeground(new java.awt.Color(255, 255, 255));
        CEP.setText("CEP (*)");

        txtTUTOR_CEP.setBackground(new java.awt.Color(86, 76, 106));
        txtTUTOR_CEP.setForeground(new java.awt.Color(255, 255, 255));
        txtTUTOR_CEP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        LOGRADOURO.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LOGRADOURO.setForeground(new java.awt.Color(255, 255, 255));
        LOGRADOURO.setText("Logradouro (*)");

        txtTUTOR_LOGRADOURO.setBackground(new java.awt.Color(86, 76, 106));
        txtTUTOR_LOGRADOURO.setForeground(new java.awt.Color(255, 255, 255));
        txtTUTOR_LOGRADOURO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        NUMERO.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NUMERO.setForeground(new java.awt.Color(255, 255, 255));
        NUMERO.setText("Número (*)");

        txtTUTOR_NUMERO.setBackground(new java.awt.Color(86, 76, 106));
        txtTUTOR_NUMERO.setForeground(new java.awt.Color(255, 255, 255));
        txtTUTOR_NUMERO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        BAIRRO.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BAIRRO.setForeground(new java.awt.Color(255, 255, 255));
        BAIRRO.setText("Bairro (*)");

        txtTUTOR_BAIRRO.setBackground(new java.awt.Color(86, 76, 106));
        txtTUTOR_BAIRRO.setForeground(new java.awt.Color(255, 255, 255));
        txtTUTOR_BAIRRO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        UF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        UF.setForeground(new java.awt.Color(255, 255, 255));
        UF.setText("UF (*)");

        MUNICIPIO.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MUNICIPIO.setForeground(new java.awt.Color(255, 255, 255));
        MUNICIPIO.setText("Município (*)");

        txtTUTOR_MUNICIPIO.setBackground(new java.awt.Color(86, 76, 106));
        txtTUTOR_MUNICIPIO.setForeground(new java.awt.Color(255, 255, 255));
        txtTUTOR_MUNICIPIO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        COMPLEMENTO.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        COMPLEMENTO.setForeground(new java.awt.Color(255, 255, 255));
        COMPLEMENTO.setText("Complemento (*)");

        txtTUTOR_COMPLEMENTO.setBackground(new java.awt.Color(86, 76, 106));
        txtTUTOR_COMPLEMENTO.setForeground(new java.awt.Color(255, 255, 255));
        txtTUTOR_COMPLEMENTO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        OBSERVACOES.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        OBSERVACOES.setForeground(new java.awt.Color(255, 255, 255));
        OBSERVACOES.setText("Observações");

        txtTUTOR_OBSERVACOES.setBackground(new java.awt.Color(86, 76, 106));
        txtTUTOR_OBSERVACOES.setColumns(20);
        txtTUTOR_OBSERVACOES.setForeground(new java.awt.Color(255, 255, 255));
        txtTUTOR_OBSERVACOES.setLineWrap(true);
        txtTUTOR_OBSERVACOES.setRows(5);
        txtTUTOR_OBSERVACOES.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jScrollPane1.setViewportView(txtTUTOR_OBSERVACOES);

        comboTUTOR_UF.setBackground(new java.awt.Color(86, 76, 106));
        comboTUTOR_UF.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        comboTUTOR_UF.setForeground(new java.awt.Color(255, 255, 255));
        comboTUTOR_UF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Acre (AC)", "Alagoas (AL)", "Amapá (AP)", "Amazonas (AM)", "Bahia (BA)", "Ceará (CE)", "Distrito Federal (DF)", "Espírito Santo (ES)", "Goiás (GO)", "Maranhão (MA)", "Mato Grosso (MT)", "Mato Grosso do Sul (MS)", "Minas Gerais (MG)", "Pará (PA)", "Paraíba (PB)", "Paraná (PR)", "Pernambuco (PE)", "Piauí (PI)", "Rio de Janeiro (RJ)", "Rio Grande do Norte (RN)", "Rio Grande do Sul (RS)", "Rondônia (RO)", "Roraima (RR)", "Santa Catarina (SC)", "São Paulo (SP)", "Sergipe (SE)", "Tocantins (TO)" }));
        comboTUTOR_UF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(COMPLEMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTUTOR_COMPLEMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(MUNICIPIO, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTUTOR_MUNICIPIO, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(UF, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboTUTOR_UF, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(BAIRRO, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTUTOR_BAIRRO, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(NUMERO, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTUTOR_NUMERO, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(LOGRADOURO, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTUTOR_LOGRADOURO, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(CEP, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTUTOR_CEP, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(OBSERVACOES, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTUTOR_CEP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CEP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTUTOR_LOGRADOURO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LOGRADOURO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTUTOR_NUMERO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NUMERO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTUTOR_BAIRRO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BAIRRO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboTUTOR_UF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTUTOR_MUNICIPIO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MUNICIPIO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTUTOR_COMPLEMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(COMPLEMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(OBSERVACOES, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(45, 18, 72));

        NOME.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NOME.setForeground(new java.awt.Color(255, 255, 255));
        NOME.setText("Nome (*)");

        txtTUTOR_NOME.setBackground(new java.awt.Color(86, 76, 106));
        txtTUTOR_NOME.setForeground(new java.awt.Color(255, 255, 255));
        txtTUTOR_NOME.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        TIPODOCUMENTO.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TIPODOCUMENTO.setForeground(new java.awt.Color(255, 255, 255));
        TIPODOCUMENTO.setText("Tipo de Documento (*)");

        txtTUTOR_TIPODOCUMENTO.setBackground(new java.awt.Color(86, 76, 106));
        txtTUTOR_TIPODOCUMENTO.setForeground(new java.awt.Color(255, 255, 255));
        txtTUTOR_TIPODOCUMENTO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        DOCUMENTO.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DOCUMENTO.setForeground(new java.awt.Color(255, 255, 255));
        DOCUMENTO.setText("Documento (*)");

        txtTUTOR_DOCUMENTO.setBackground(new java.awt.Color(86, 76, 106));
        txtTUTOR_DOCUMENTO.setForeground(new java.awt.Color(255, 255, 255));
        txtTUTOR_DOCUMENTO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        NASCIMENTO.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NASCIMENTO.setForeground(new java.awt.Color(255, 255, 255));
        NASCIMENTO.setText("Nascimento (*)");

        txtTUTOR_NASCIMENTO.setBackground(new java.awt.Color(86, 76, 106));
        txtTUTOR_NASCIMENTO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txtTUTOR_NASCIMENTO.setForeground(new java.awt.Color(255, 255, 255));
        try {
            txtTUTOR_NASCIMENTO.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTUTOR_NASCIMENTO.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        CELULAR1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CELULAR1.setForeground(new java.awt.Color(255, 255, 255));
        CELULAR1.setText("Celular (*)");

        txtTUTOR_CELULAR1.setBackground(new java.awt.Color(86, 76, 106));
        txtTUTOR_CELULAR1.setForeground(new java.awt.Color(255, 255, 255));
        txtTUTOR_CELULAR1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        REDE.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        REDE.setForeground(new java.awt.Color(255, 255, 255));
        REDE.setText("Rede Social");

        txtTUTOR_REDESOCIAL1.setBackground(new java.awt.Color(86, 76, 106));
        txtTUTOR_REDESOCIAL1.setForeground(new java.awt.Color(255, 255, 255));
        txtTUTOR_REDESOCIAL1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        TIPOREDE.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TIPOREDE.setForeground(new java.awt.Color(255, 255, 255));
        TIPOREDE.setText("Tipo de Rede Social");

        txtTUTOR_TIPOREDESOCIAL1.setBackground(new java.awt.Color(86, 76, 106));
        txtTUTOR_TIPOREDESOCIAL1.setForeground(new java.awt.Color(255, 255, 255));
        txtTUTOR_TIPOREDESOCIAL1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        DDD1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DDD1.setForeground(new java.awt.Color(255, 255, 255));
        DDD1.setText("DDD (*)");

        txtTUTOR_DDD1.setBackground(new java.awt.Color(86, 76, 106));
        txtTUTOR_DDD1.setForeground(new java.awt.Color(255, 255, 255));
        txtTUTOR_DDD1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        DDD2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DDD2.setForeground(new java.awt.Color(255, 255, 255));
        DDD2.setText("DDD");

        txtTUTOR_DDD2.setBackground(new java.awt.Color(86, 76, 106));
        txtTUTOR_DDD2.setForeground(new java.awt.Color(255, 255, 255));
        txtTUTOR_DDD2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        CELULAR2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CELULAR2.setForeground(new java.awt.Color(255, 255, 255));
        CELULAR2.setText("Celular");

        txtTUTOR_CELULAR2.setBackground(new java.awt.Color(86, 76, 106));
        txtTUTOR_CELULAR2.setForeground(new java.awt.Color(255, 255, 255));
        txtTUTOR_CELULAR2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        REDE1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        REDE1.setForeground(new java.awt.Color(255, 255, 255));
        REDE1.setText("Rede Social");

        txtTUTOR_REDESOCIAL2.setBackground(new java.awt.Color(86, 76, 106));
        txtTUTOR_REDESOCIAL2.setForeground(new java.awt.Color(255, 255, 255));
        txtTUTOR_REDESOCIAL2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        TIPOREDE1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TIPOREDE1.setForeground(new java.awt.Color(255, 255, 255));
        TIPOREDE1.setText("Tipo de Rede Social");

        txtTUTOR_TIPOREDESOCIAL2.setBackground(new java.awt.Color(86, 76, 106));
        txtTUTOR_TIPOREDESOCIAL2.setForeground(new java.awt.Color(255, 255, 255));
        txtTUTOR_TIPOREDESOCIAL2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        EMAIL1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EMAIL1.setForeground(new java.awt.Color(255, 255, 255));
        EMAIL1.setText("E-mail (*)");

        txtTUTOR_EMAIL2.setBackground(new java.awt.Color(86, 76, 106));
        txtTUTOR_EMAIL2.setForeground(new java.awt.Color(255, 255, 255));
        txtTUTOR_EMAIL2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        EMAIL2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EMAIL2.setForeground(new java.awt.Color(255, 255, 255));
        EMAIL2.setText("E-mail");

        txtTUTOR_EMAIL1.setBackground(new java.awt.Color(86, 76, 106));
        txtTUTOR_EMAIL1.setForeground(new java.awt.Color(255, 255, 255));
        txtTUTOR_EMAIL1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TIPODOCUMENTO, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NOME, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NASCIMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DOCUMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(DDD1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtTUTOR_DDD1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(DDD2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtTUTOR_DDD2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(CELULAR2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTUTOR_CELULAR2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtTUTOR_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTUTOR_NASCIMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTUTOR_TIPODOCUMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTUTOR_DOCUMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(CELULAR1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtTUTOR_CELULAR1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TIPOREDE1, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .addComponent(REDE1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTUTOR_REDESOCIAL2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTUTOR_TIPOREDESOCIAL2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(REDE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TIPOREDE, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTUTOR_TIPOREDESOCIAL1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTUTOR_REDESOCIAL1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EMAIL2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EMAIL1, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTUTOR_EMAIL2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTUTOR_EMAIL1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(txtTUTOR_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTUTOR_TIPODOCUMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(txtTUTOR_DOCUMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(txtTUTOR_NASCIMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTUTOR_CELULAR1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CELULAR1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTUTOR_CELULAR2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CELULAR2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(NOME, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(TIPODOCUMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(DOCUMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTUTOR_DDD1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DDD1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(NASCIMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTUTOR_DDD2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DDD2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTUTOR_EMAIL1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EMAIL1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTUTOR_EMAIL2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EMAIL2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTUTOR_TIPOREDESOCIAL1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TIPOREDE, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTUTOR_REDESOCIAL1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(REDE, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTUTOR_TIPOREDESOCIAL2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TIPOREDE1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTUTOR_REDESOCIAL2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(REDE1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(BOTAO_VOLTAR___, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(BOTAO_SALVAR___, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BOTAO_SALVAR___)
                            .addComponent(BOTAO_VOLTAR___)))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BOTAO_VOLTAR___ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTAO_VOLTAR___ActionPerformed
        this.dispose();
    }//GEN-LAST:event_BOTAO_VOLTAR___ActionPerformed

    private void BOTAO_SALVAR___ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTAO_SALVAR___ActionPerformed

        Tutores tutores = new Tutores();
        
        String nome = txtTUTOR_NOME.getText();
        String tipo_documento = txtTUTOR_TIPODOCUMENTO.getText();
        String documento_identificador = txtTUTOR_DOCUMENTO.getText();
        int cep = Integer.parseInt(txtTUTOR_CEP.getText());
        String logradouro = txtTUTOR_LOGRADOURO.getText();
        String numero = txtTUTOR_NUMERO.getText();
        String bairro = txtTUTOR_BAIRRO.getText();
        String UF = comboTUTOR_UF.getSelectedItem().toString();
        String municipio = txtTUTOR_MUNICIPIO.getText();
        String complemento = txtTUTOR_COMPLEMENTO.getText();
        int ddd_1 = Integer.parseInt(txtTUTOR_DDD1.getText());
        int celular_1 = Integer.parseInt(txtTUTOR_CELULAR1.getText());
        String email_1 = txtTUTOR_EMAIL1.getText();
        String email_2 = txtTUTOR_EMAIL2.getText();
        String tipo_rede_1 = txtTUTOR_TIPOREDESOCIAL1.getText();
        String rede_social_1 = txtTUTOR_REDESOCIAL1.getText();
        String tipo_rede_2 = txtTUTOR_TIPOREDESOCIAL2.getText();
        String rede_social_2 = txtTUTOR_REDESOCIAL2.getText();
        String observacoes = txtTUTOR_OBSERVACOES.getText();
        
        // captando os ints obrigatorios
        int DDD2_, Celular2_;
        
            if(txtTUTOR_DDD2.getText().isEmpty()){
                DDD2_ = 0;
        } else {
                DDD2_ = Integer.parseInt(txtTUTOR_DDD2.getText());
        }
        
            if(txtTUTOR_CELULAR2.getText().isEmpty()){
                Celular2_ = 0;
        } else {
                Celular2_ = Integer.parseInt(txtTUTOR_CELULAR2.getText());
        }
        int ddd_2 = DDD2_;
        int celular_2 = Celular2_;
        
        // captando a data transformada (necessitou ser transformada novamente no insert jdbc mysql)
        String nascimento = txtTUTOR_NASCIMENTO.getText();
        SimpleDateFormat dateFormatInput = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat dateFormatOutput = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = dateFormatInput.parse(nascimento);
            tutores.setNascimento(dateFormatOutput.format(date));
        } catch (ParseException erro) {
            JOptionPane.showMessageDialog(null, "Erro na conversão de data: " + erro);
            return;
        }

        
        
        
        
        if (main.getTutorSelecionado() != null) {
            tutor = new Tutores(tutor.getId(), nome, tipo_documento, documento_identificador, nascimento, cep, logradouro, numero, bairro,
                    UF, municipio, complemento, ddd_1, celular_1, ddd_2, celular_2, email_1, email_2, tipo_rede_1, rede_social_1, tipo_rede_2, rede_social_2, observacoes);
            new TutoresDAO().editar(tutor);
            dispose();
        } else if (main.getTutorSelecionado() == null) {
            tutor = new Tutores(0, nome, tipo_documento, documento_identificador, nascimento, cep, logradouro, numero, bairro,
                    UF, municipio, complemento, ddd_1, celular_1, ddd_2, celular_2, email_1, email_2, tipo_rede_1, rede_social_1, tipo_rede_2, rede_social_2, observacoes);
            new TutoresDAO().inserir(tutor);
            resetForm();
        } else {
            
        }
        
    }//GEN-LAST:event_BOTAO_SALVAR___ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        main.atualizarTabela();
        
    }//GEN-LAST:event_formWindowClosed
    
    
    
    
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
            java.util.logging.Logger.getLogger(CadastroTutoresJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroTutoresJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroTutoresJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroTutoresJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastroTutoresJDialog dialog = new CadastroTutoresJDialog(new javax.swing.JFrame(), true, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BAIRRO;
    private javax.swing.JButton BOTAO_SALVAR___;
    private javax.swing.JButton BOTAO_VOLTAR___;
    private javax.swing.JLabel CELULAR1;
    private javax.swing.JLabel CELULAR2;
    private javax.swing.JLabel CEP;
    private javax.swing.JLabel COMPLEMENTO;
    private javax.swing.JLabel DDD1;
    private javax.swing.JLabel DDD2;
    private javax.swing.JLabel DOCUMENTO;
    private javax.swing.JLabel EMAIL1;
    private javax.swing.JLabel EMAIL2;
    private javax.swing.JLabel LOGRADOURO;
    private javax.swing.JLabel MUNICIPIO;
    private javax.swing.JLabel NASCIMENTO;
    private javax.swing.JLabel NOME;
    private javax.swing.JLabel NUMERO;
    private javax.swing.JLabel OBSERVACOES;
    private javax.swing.JLabel REDE;
    private javax.swing.JLabel REDE1;
    private javax.swing.JLabel TIPODOCUMENTO;
    private javax.swing.JLabel TIPOREDE;
    private javax.swing.JLabel TIPOREDE1;
    private javax.swing.JLabel UF;
    private javax.swing.JComboBox<String> comboTUTOR_UF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtTUTOR_BAIRRO;
    private javax.swing.JTextField txtTUTOR_CELULAR1;
    private javax.swing.JTextField txtTUTOR_CELULAR2;
    private javax.swing.JTextField txtTUTOR_CEP;
    private javax.swing.JTextField txtTUTOR_COMPLEMENTO;
    private javax.swing.JTextField txtTUTOR_DDD1;
    private javax.swing.JTextField txtTUTOR_DDD2;
    private javax.swing.JTextField txtTUTOR_DOCUMENTO;
    private javax.swing.JTextField txtTUTOR_EMAIL1;
    private javax.swing.JTextField txtTUTOR_EMAIL2;
    private javax.swing.JTextField txtTUTOR_LOGRADOURO;
    private javax.swing.JTextField txtTUTOR_MUNICIPIO;
    private javax.swing.JFormattedTextField txtTUTOR_NASCIMENTO;
    private javax.swing.JTextField txtTUTOR_NOME;
    private javax.swing.JTextField txtTUTOR_NUMERO;
    private javax.swing.JTextArea txtTUTOR_OBSERVACOES;
    private javax.swing.JTextField txtTUTOR_REDESOCIAL1;
    private javax.swing.JTextField txtTUTOR_REDESOCIAL2;
    private javax.swing.JTextField txtTUTOR_TIPODOCUMENTO;
    private javax.swing.JTextField txtTUTOR_TIPOREDESOCIAL1;
    private javax.swing.JTextField txtTUTOR_TIPOREDESOCIAL2;
    // End of variables declaration//GEN-END:variables
}
