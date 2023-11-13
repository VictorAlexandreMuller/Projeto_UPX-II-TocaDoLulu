package java4.Cadastros;

import ClassesDAO.ServicosDAO;
import java.awt.Color;
import java.awt.Font;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java1.Classes.Servicos;
import java3.Panels.PainelServicosJIFF;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class CadastroServicosJDialog extends javax.swing.JDialog {

    private Servicos serv;
    PainelServicosJIFF main;
    boolean isEditar = false;
    
    public CadastroServicosJDialog(java.awt.Frame parent, boolean modal, PainelServicosJIFF main) {
        super(parent, modal);
        initComponents();
        
        this.main = main;

        if (main.getServicoSelecionado() != null) {
            isEditar = true;
            this.serv = main.getServicoSelecionado();
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
        titledBorder.setTitle(" ALTERAR CADASTRO DE SERVICO ");
        titledBorder.setTitleColor(Color.RED);
        titledBorder.setTitleFont(customFont);
        titledBorder.setTitleJustification(titledBorder.CENTER);
        titledBorder.setTitlePosition(titledBorder.TOP);
        
        jPanel1.setBorder(titledBorder);
    }
    
    // Formas da janela Cadastro Tutores, se ela virá preenchida ou brand-new
    private void popularForm() {
        
        
        txtSERVICO_NOME.setText(serv.getNome());
        txtSERVICO_SERVICO.setText(serv.getServico());
        txtSERVICO_VALOR.setText(String.valueOf(serv.getValor()));
        
        txtSERVICO_TIPODOCUMENTO.setText(String.valueOf(serv.getTipo_documento()));
        txtSERVICO_DOCUMENTO.setText(String.valueOf(serv.getDocumento_identificador()));
        
        txtSERVICO_NASCIMENTO.setText(String.valueOf(serv.getNascimento()));
        SimpleDateFormat dateFormatInput = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat dateFormatOutput = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date = dateFormatInput.parse(serv.getNascimento());
            txtSERVICO_NASCIMENTO.setText(dateFormatOutput.format(date));
        } catch (ParseException erro) {
            JOptionPane.showMessageDialog(null, "Erro na conversão de data: " + erro);
            return;
        }
        
        txtSERVICO_DDD1.setText(String.valueOf(serv.getDdd_1()));
        txtSERVICO_CELULAR1.setText(String.valueOf(serv.getCelular_1()));
        txtSERVICO_EMAIL1.setText(String.valueOf(serv.getEmail_1()));
        txtSERVICO_DDD2.setText(String.valueOf(serv.getDdd_2()));
        txtSERVICO_CELULAR2.setText(String.valueOf(serv.getCelular_2()));
        txtSERVICO_EMAIL2.setText(String.valueOf(serv.getEmail_2()));
        
        txtSERVICO_CEP.setText(String.valueOf(serv.getCep()));
        txtSERVICO_LOGRADOURO.setText(String.valueOf(serv.getLogradouro()));
        txtSERVICO_NUMERO.setText(String.valueOf(serv.getNumero()));
        txtSERVICO_BAIRRO.setText(String.valueOf(serv.getBairro()));
        comboSERVICO_UF.setSelectedItem(serv.getUf());
        txtSERVICO_MUNICIPIO.setText(String.valueOf(serv.getMunicipio()));
        txtSERVICO_COMPLEMENTO.setText(String.valueOf(serv.getComplemento()));
        txtSERVICO_OBSERVACOES.setText(String.valueOf(serv.getObservacoes()));
    }
    
    private void resetForm() {
        txtSERVICO_NOME.setText("");
        txtSERVICO_SERVICO.setText("");
        txtSERVICO_VALOR.setText("");
        txtSERVICO_TIPODOCUMENTO.setText("");
        txtSERVICO_DOCUMENTO.setText("");
        txtSERVICO_NASCIMENTO.setText("");
        txtSERVICO_DDD1.setText("");
        txtSERVICO_CELULAR1.setText("");
        txtSERVICO_EMAIL1.setText("");
        txtSERVICO_DDD2.setText("");
        txtSERVICO_CELULAR2.setText("");
        txtSERVICO_EMAIL2.setText("");
        txtSERVICO_CEP.setText("");
        txtSERVICO_LOGRADOURO.setText("");
        txtSERVICO_NUMERO.setText("");
        txtSERVICO_BAIRRO.setText("");
        comboSERVICO_UF.setSelectedItem("-");
        txtSERVICO_MUNICIPIO.setText("");
        txtSERVICO_COMPLEMENTO.setText("");
        txtSERVICO_OBSERVACOES.setText("");
    }
    
    // ------------------------------------------------------------------------------------------------------------
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BOTAO_VOLTAR___ = new javax.swing.JButton();
        BOTAO_SALVAR___ = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        CEP = new javax.swing.JLabel();
        txtSERVICO_CEP = new javax.swing.JTextField();
        LOGRADOURO = new javax.swing.JLabel();
        txtSERVICO_LOGRADOURO = new javax.swing.JTextField();
        NUMERO = new javax.swing.JLabel();
        txtSERVICO_NUMERO = new javax.swing.JTextField();
        BAIRRO = new javax.swing.JLabel();
        txtSERVICO_BAIRRO = new javax.swing.JTextField();
        UF = new javax.swing.JLabel();
        MUNICIPIO = new javax.swing.JLabel();
        txtSERVICO_MUNICIPIO = new javax.swing.JTextField();
        COMPLEMENTO = new javax.swing.JLabel();
        txtSERVICO_COMPLEMENTO = new javax.swing.JTextField();
        OBSERVACOES = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSERVICO_OBSERVACOES = new javax.swing.JTextArea();
        comboSERVICO_UF = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        DOCUMENTO = new javax.swing.JLabel();
        txtSERVICO_DOCUMENTO = new javax.swing.JTextField();
        TIPODOCUMENTO = new javax.swing.JLabel();
        txtSERVICO_TIPODOCUMENTO = new javax.swing.JTextField();
        NOME = new javax.swing.JLabel();
        txtSERVICO_NOME = new javax.swing.JTextField();
        SERVICO = new javax.swing.JLabel();
        txtSERVICO_SERVICO = new javax.swing.JTextField();
        NASCIMENTO = new javax.swing.JLabel();
        txtSERVICO_NASCIMENTO = new javax.swing.JFormattedTextField();
        DDD1 = new javax.swing.JLabel();
        txtSERVICO_DDD1 = new javax.swing.JTextField();
        CELULAR1 = new javax.swing.JLabel();
        txtSERVICO_CELULAR1 = new javax.swing.JTextField();
        DDD2 = new javax.swing.JLabel();
        txtSERVICO_DDD2 = new javax.swing.JTextField();
        CELULAR2 = new javax.swing.JLabel();
        txtSERVICO_CELULAR2 = new javax.swing.JTextField();
        EMAIL1 = new javax.swing.JLabel();
        txtSERVICO_EMAIL1 = new javax.swing.JTextField();
        EMAIL2 = new javax.swing.JLabel();
        txtSERVICO_EMAIL2 = new javax.swing.JTextField();
        VALOR = new javax.swing.JLabel();
        txtSERVICO_VALOR = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(45, 18, 72));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), " CADASTRO DE SERVIÇO ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Gill Sans Ultra Bold", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        BOTAO_VOLTAR___.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        BOTAO_VOLTAR___.setForeground(new java.awt.Color(0, 0, 0));
        BOTAO_VOLTAR___.setText("Voltar");
        BOTAO_VOLTAR___.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTAO_VOLTAR___ActionPerformed(evt);
            }
        });

        BOTAO_SALVAR___.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        BOTAO_SALVAR___.setForeground(new java.awt.Color(0, 0, 0));
        BOTAO_SALVAR___.setText("Salvar");
        BOTAO_SALVAR___.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTAO_SALVAR___ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(45, 18, 72));

        CEP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CEP.setForeground(new java.awt.Color(255, 255, 255));
        CEP.setText("CEP (*)");

        txtSERVICO_CEP.setBackground(new java.awt.Color(86, 76, 106));
        txtSERVICO_CEP.setForeground(new java.awt.Color(255, 255, 255));
        txtSERVICO_CEP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        LOGRADOURO.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LOGRADOURO.setForeground(new java.awt.Color(255, 255, 255));
        LOGRADOURO.setText("Logradouro (*)");

        txtSERVICO_LOGRADOURO.setBackground(new java.awt.Color(86, 76, 106));
        txtSERVICO_LOGRADOURO.setForeground(new java.awt.Color(255, 255, 255));
        txtSERVICO_LOGRADOURO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        NUMERO.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NUMERO.setForeground(new java.awt.Color(255, 255, 255));
        NUMERO.setText("Número (*)");

        txtSERVICO_NUMERO.setBackground(new java.awt.Color(86, 76, 106));
        txtSERVICO_NUMERO.setForeground(new java.awt.Color(255, 255, 255));
        txtSERVICO_NUMERO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        BAIRRO.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BAIRRO.setForeground(new java.awt.Color(255, 255, 255));
        BAIRRO.setText("Bairro (*)");

        txtSERVICO_BAIRRO.setBackground(new java.awt.Color(86, 76, 106));
        txtSERVICO_BAIRRO.setForeground(new java.awt.Color(255, 255, 255));
        txtSERVICO_BAIRRO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        UF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        UF.setForeground(new java.awt.Color(255, 255, 255));
        UF.setText("UF (*)");

        MUNICIPIO.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MUNICIPIO.setForeground(new java.awt.Color(255, 255, 255));
        MUNICIPIO.setText("Município (*)");

        txtSERVICO_MUNICIPIO.setBackground(new java.awt.Color(86, 76, 106));
        txtSERVICO_MUNICIPIO.setForeground(new java.awt.Color(255, 255, 255));
        txtSERVICO_MUNICIPIO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        COMPLEMENTO.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        COMPLEMENTO.setForeground(new java.awt.Color(255, 255, 255));
        COMPLEMENTO.setText("Complemento (*)");

        txtSERVICO_COMPLEMENTO.setBackground(new java.awt.Color(86, 76, 106));
        txtSERVICO_COMPLEMENTO.setForeground(new java.awt.Color(255, 255, 255));
        txtSERVICO_COMPLEMENTO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        OBSERVACOES.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        OBSERVACOES.setForeground(new java.awt.Color(255, 255, 255));
        OBSERVACOES.setText("Observações");

        txtSERVICO_OBSERVACOES.setBackground(new java.awt.Color(86, 76, 106));
        txtSERVICO_OBSERVACOES.setColumns(20);
        txtSERVICO_OBSERVACOES.setForeground(new java.awt.Color(255, 255, 255));
        txtSERVICO_OBSERVACOES.setLineWrap(true);
        txtSERVICO_OBSERVACOES.setRows(5);
        txtSERVICO_OBSERVACOES.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jScrollPane1.setViewportView(txtSERVICO_OBSERVACOES);

        comboSERVICO_UF.setBackground(new java.awt.Color(86, 76, 106));
        comboSERVICO_UF.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        comboSERVICO_UF.setForeground(new java.awt.Color(255, 255, 255));
        comboSERVICO_UF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Acre (AC)", "Alagoas (AL)", "Amapá (AP)", "Amazonas (AM)", "Bahia (BA)", "Ceará (CE)", "Distrito Federal (DF)", "Espírito Santo (ES)", "Goiás (GO)", "Maranhão (MA)", "Mato Grosso (MT)", "Mato Grosso do Sul (MS)", "Minas Gerais (MG)", "Pará (PA)", "Paraíba (PB)", "Paraná (PR)", "Pernambuco (PE)", "Piauí (PI)", "Rio de Janeiro (RJ)", "Rio Grande do Norte (RN)", "Rio Grande do Sul (RS)", "Rondônia (RO)", "Roraima (RR)", "Santa Catarina (SC)", "São Paulo (SP)", "Sergipe (SE)", "Tocantins (TO)" }));
        comboSERVICO_UF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(COMPLEMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSERVICO_COMPLEMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(MUNICIPIO, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSERVICO_MUNICIPIO, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(UF, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboSERVICO_UF, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(BAIRRO, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSERVICO_BAIRRO, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(NUMERO, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSERVICO_NUMERO, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(LOGRADOURO, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSERVICO_LOGRADOURO, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(CEP, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSERVICO_CEP, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(txtSERVICO_CEP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CEP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSERVICO_LOGRADOURO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LOGRADOURO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSERVICO_NUMERO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NUMERO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSERVICO_BAIRRO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BAIRRO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboSERVICO_UF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSERVICO_MUNICIPIO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MUNICIPIO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSERVICO_COMPLEMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(COMPLEMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(OBSERVACOES, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(45, 18, 72));

        DOCUMENTO.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        DOCUMENTO.setForeground(new java.awt.Color(255, 255, 255));
        DOCUMENTO.setText("Documento (*)");

        txtSERVICO_DOCUMENTO.setBackground(new java.awt.Color(86, 76, 106));
        txtSERVICO_DOCUMENTO.setForeground(new java.awt.Color(255, 255, 255));
        txtSERVICO_DOCUMENTO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        TIPODOCUMENTO.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        TIPODOCUMENTO.setForeground(new java.awt.Color(255, 255, 255));
        TIPODOCUMENTO.setText("Tipo de Documento (*)");

        txtSERVICO_TIPODOCUMENTO.setBackground(new java.awt.Color(86, 76, 106));
        txtSERVICO_TIPODOCUMENTO.setForeground(new java.awt.Color(255, 255, 255));
        txtSERVICO_TIPODOCUMENTO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        NOME.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        NOME.setForeground(new java.awt.Color(255, 255, 255));
        NOME.setText("Nome (*)");

        txtSERVICO_NOME.setBackground(new java.awt.Color(86, 76, 106));
        txtSERVICO_NOME.setForeground(new java.awt.Color(255, 255, 255));
        txtSERVICO_NOME.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        SERVICO.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        SERVICO.setForeground(new java.awt.Color(255, 255, 255));
        SERVICO.setText("Serviço (*)");

        txtSERVICO_SERVICO.setBackground(new java.awt.Color(86, 76, 106));
        txtSERVICO_SERVICO.setForeground(new java.awt.Color(255, 255, 255));
        txtSERVICO_SERVICO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        NASCIMENTO.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        NASCIMENTO.setForeground(new java.awt.Color(255, 255, 255));
        NASCIMENTO.setText("Nascimento (*)");

        txtSERVICO_NASCIMENTO.setBackground(new java.awt.Color(86, 76, 106));
        txtSERVICO_NASCIMENTO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txtSERVICO_NASCIMENTO.setForeground(new java.awt.Color(255, 255, 255));
        try {
            txtSERVICO_NASCIMENTO.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtSERVICO_NASCIMENTO.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        DDD1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DDD1.setForeground(new java.awt.Color(255, 255, 255));
        DDD1.setText("DDD (*)");

        txtSERVICO_DDD1.setBackground(new java.awt.Color(86, 76, 106));
        txtSERVICO_DDD1.setForeground(new java.awt.Color(255, 255, 255));
        txtSERVICO_DDD1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        CELULAR1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CELULAR1.setForeground(new java.awt.Color(255, 255, 255));
        CELULAR1.setText("Celular (*)");

        txtSERVICO_CELULAR1.setBackground(new java.awt.Color(86, 76, 106));
        txtSERVICO_CELULAR1.setForeground(new java.awt.Color(255, 255, 255));
        txtSERVICO_CELULAR1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        DDD2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DDD2.setForeground(new java.awt.Color(255, 255, 255));
        DDD2.setText("DDD");

        txtSERVICO_DDD2.setBackground(new java.awt.Color(86, 76, 106));
        txtSERVICO_DDD2.setForeground(new java.awt.Color(255, 255, 255));
        txtSERVICO_DDD2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        CELULAR2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CELULAR2.setForeground(new java.awt.Color(255, 255, 255));
        CELULAR2.setText("Celular");

        txtSERVICO_CELULAR2.setBackground(new java.awt.Color(86, 76, 106));
        txtSERVICO_CELULAR2.setForeground(new java.awt.Color(255, 255, 255));
        txtSERVICO_CELULAR2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        EMAIL1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EMAIL1.setForeground(new java.awt.Color(255, 255, 255));
        EMAIL1.setText("E-mail (*)");

        txtSERVICO_EMAIL1.setBackground(new java.awt.Color(86, 76, 106));
        txtSERVICO_EMAIL1.setForeground(new java.awt.Color(255, 255, 255));
        txtSERVICO_EMAIL1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        EMAIL2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EMAIL2.setForeground(new java.awt.Color(255, 255, 255));
        EMAIL2.setText("E-mail");

        txtSERVICO_EMAIL2.setBackground(new java.awt.Color(86, 76, 106));
        txtSERVICO_EMAIL2.setForeground(new java.awt.Color(255, 255, 255));
        txtSERVICO_EMAIL2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        VALOR.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        VALOR.setForeground(new java.awt.Color(255, 255, 255));
        VALOR.setText("Valor (*)");

        txtSERVICO_VALOR.setBackground(new java.awt.Color(86, 76, 106));
        txtSERVICO_VALOR.setForeground(new java.awt.Color(255, 255, 255));
        txtSERVICO_VALOR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(VALOR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSERVICO_VALOR, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(NOME, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(txtSERVICO_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(EMAIL2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(EMAIL1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(DDD1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtSERVICO_DDD1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(DDD2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtSERVICO_DDD2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(CELULAR2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtSERVICO_CELULAR2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(CELULAR1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtSERVICO_CELULAR1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtSERVICO_EMAIL1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtSERVICO_EMAIL2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TIPODOCUMENTO)
                        .addGap(18, 18, 18)
                        .addComponent(txtSERVICO_TIPODOCUMENTO))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(DOCUMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(txtSERVICO_DOCUMENTO))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(SERVICO, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(txtSERVICO_SERVICO, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(NASCIMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(txtSERVICO_NASCIMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NOME, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSERVICO_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SERVICO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSERVICO_SERVICO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VALOR, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSERVICO_VALOR, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TIPODOCUMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSERVICO_TIPODOCUMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DOCUMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSERVICO_DOCUMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NASCIMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSERVICO_NASCIMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSERVICO_CELULAR1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CELULAR1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSERVICO_CELULAR2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CELULAR2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSERVICO_DDD1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DDD1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSERVICO_DDD2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DDD2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(EMAIL1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EMAIL2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtSERVICO_EMAIL1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtSERVICO_EMAIL2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(BOTAO_VOLTAR___, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(BOTAO_SALVAR___, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BOTAO_SALVAR___)
                            .addComponent(BOTAO_VOLTAR___)))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
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
        // SÓ EXCLUIR QUANDO TUDO ESTIVER FUNCIONANDO 
        /*
        Servicos servicos = new Servicos();

        servicos.setNome(txtSERVICO_NOME.getText());
        servicos.setServico(txtSERVICO_SERVICO.getText());
        servicos.setValor(Double.parseDouble(txtSERVICO_VALOR.getText()));
        servicos.setTipo_documento(txtSERVICO_TIPODOCUMENTO.getText());
        servicos.setDocumento_identificador(txtSERVICO_DOCUMENTO.getText());
        String dataNascimento = txtSERVICO_NASCIMENTO.getText();
        SimpleDateFormat dateFormatInput = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat dateFormatOutput = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = dateFormatInput.parse(dataNascimento);
            servicos.setNascimento(dateFormatOutput.format(date));
        } catch (ParseException erro) {
            JOptionPane.showMessageDialog(null, "Erro na conversão de data: " + erro);
        }
        servicos.setDdd_1(Integer.parseInt(txtSERVICO_DDD1.getText()));
        servicos.setCelular_1(Integer.parseInt(txtSERVICO_CELULAR1.getText()));

        if(txtSERVICO_DDD2.getText().isEmpty()){
            servicos.setDdd_2(0);
        } else {
            servicos.setDdd_2(Integer.parseInt(txtSERVICO_DDD2.getText()));
        }

        if(txtSERVICO_CELULAR2.getText().isEmpty()){
            servicos.setCelular_2(0);
        } else {
            servicos.setCelular_2(Integer.parseInt(txtSERVICO_CELULAR2.getText()));
        }

        servicos.setEmail_1(txtSERVICO_EMAIL1.getText());
        servicos.setEmail_2(txtSERVICO_EMAIL2.getText());
        servicos.setCep(Integer.parseInt(txtSERVICO_CEP.getText()));
        servicos.setLogradouro(txtSERVICO_LOGRADOURO.getText());
        servicos.setNumero(txtSERVICO_NUMERO.getText());
        servicos.setBairro(txtSERVICO_BAIRRO.getText());
        servicos.setUf(comboSERVICO_UF.getSelectedItem().toString());
        servicos.setMunicipio(txtSERVICO_MUNICIPIO.getText());
        servicos.setComplemento(txtSERVICO_COMPLEMENTO.getText());
        servicos.setObservacoes(txtSERVICO_OBSERVACOES.getText());

        EntityManager em = JPAUtil.getEntityManager();
        TutoresDAO dao = new TutoresDAO(em);

        em.getTransaction().begin();
        em.persist(servicos);
        em.getTransaction().commit();
        em.close();

        JOptionPane.showMessageDialog(this, "Serviço salvo com sucesso!");
        this.dispose();
        
        */
        
        
        Servicos servicos = new Servicos();
        
        String nome = txtSERVICO_NOME.getText();
        String servico = txtSERVICO_SERVICO.getText();
        double valor = Double.parseDouble(txtSERVICO_VALOR.getText());
        
        String tipo_documento = txtSERVICO_TIPODOCUMENTO.getText();
        String documento_identificador = txtSERVICO_DOCUMENTO.getText();
        int ddd_1 = Integer.parseInt(txtSERVICO_DDD1.getText());
        int celular_1 = Integer.parseInt(txtSERVICO_CELULAR1.getText());
        String email_1 = txtSERVICO_EMAIL1.getText();
        String email_2 = txtSERVICO_EMAIL2.getText();
        
        int cep = Integer.parseInt(txtSERVICO_CEP.getText());
        String logradouro = txtSERVICO_LOGRADOURO.getText();
        String numero = txtSERVICO_NUMERO.getText();
        String bairro = txtSERVICO_BAIRRO.getText();
        String UF = comboSERVICO_UF.getSelectedItem().toString();
        String municipio = txtSERVICO_MUNICIPIO.getText();
        String complemento = txtSERVICO_COMPLEMENTO.getText();
        String observacoes = txtSERVICO_OBSERVACOES.getText();
        
        // captando os ints obrigatorios
        int DDD2_, Celular2_;
        
            if(txtSERVICO_DDD2.getText().isEmpty()){
                DDD2_ = 0;
        } else {
                DDD2_ = Integer.parseInt(txtSERVICO_DDD2.getText());
        }
        
            if(txtSERVICO_CELULAR2.getText().isEmpty()){
                Celular2_ = 0;
        } else {
                Celular2_ = Integer.parseInt(txtSERVICO_CELULAR2.getText());
        }
        int ddd_2 = DDD2_;
        int celular_2 = Celular2_;
        
        // captando a data transformada (necessitou ser transformada novamente no insert jdbc mysql)
        String nascimento = txtSERVICO_NASCIMENTO.getText();
        SimpleDateFormat dateFormatInput = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat dateFormatOutput = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = dateFormatInput.parse(nascimento);
            servicos.setNascimento(dateFormatOutput.format(date));
        } catch (ParseException erro) {
            JOptionPane.showMessageDialog(null, "Erro na conversão de data: " + erro);
            return;
        }
 
        
        if (main.getServicoSelecionado() != null) {
            serv = new Servicos(serv.getId(), nome, servico, valor, tipo_documento, documento_identificador, nascimento, cep, logradouro, numero, bairro,
                    UF, municipio, complemento, ddd_1, celular_1, ddd_2, celular_2, email_1, email_2, observacoes);
            new ServicosDAO().editar(serv);
            dispose();
        } else if (main.getServicoSelecionado() == null) {
            serv = new Servicos(0, nome, servico, valor, tipo_documento, documento_identificador, nascimento, cep, logradouro, numero, bairro,
                    UF, municipio, complemento, ddd_1, celular_1, ddd_2, celular_2, email_1, email_2, observacoes);
            new ServicosDAO().inserir(serv);
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
            java.util.logging.Logger.getLogger(CadastroServicosJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroServicosJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroServicosJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroServicosJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastroServicosJDialog dialog = new CadastroServicosJDialog(new javax.swing.JFrame(), true, null);
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
    private javax.swing.JLabel SERVICO;
    private javax.swing.JLabel TIPODOCUMENTO;
    private javax.swing.JLabel UF;
    private javax.swing.JLabel VALOR;
    private javax.swing.JComboBox<String> comboSERVICO_UF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtSERVICO_BAIRRO;
    private javax.swing.JTextField txtSERVICO_CELULAR1;
    private javax.swing.JTextField txtSERVICO_CELULAR2;
    private javax.swing.JTextField txtSERVICO_CEP;
    private javax.swing.JTextField txtSERVICO_COMPLEMENTO;
    private javax.swing.JTextField txtSERVICO_DDD1;
    private javax.swing.JTextField txtSERVICO_DDD2;
    private javax.swing.JTextField txtSERVICO_DOCUMENTO;
    private javax.swing.JTextField txtSERVICO_EMAIL1;
    private javax.swing.JTextField txtSERVICO_EMAIL2;
    private javax.swing.JTextField txtSERVICO_LOGRADOURO;
    private javax.swing.JTextField txtSERVICO_MUNICIPIO;
    private javax.swing.JFormattedTextField txtSERVICO_NASCIMENTO;
    private javax.swing.JTextField txtSERVICO_NOME;
    private javax.swing.JTextField txtSERVICO_NUMERO;
    private javax.swing.JTextArea txtSERVICO_OBSERVACOES;
    private javax.swing.JTextField txtSERVICO_SERVICO;
    private javax.swing.JTextField txtSERVICO_TIPODOCUMENTO;
    private javax.swing.JTextField txtSERVICO_VALOR;
    // End of variables declaration//GEN-END:variables
}
