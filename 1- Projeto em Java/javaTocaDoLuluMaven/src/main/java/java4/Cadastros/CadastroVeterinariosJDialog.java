package java4.Cadastros;

import ClassesDAO.VeterinariosDAO;
import java.awt.Color;
import java.awt.Font;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java1.Classes.Veterinarios;
import java3.Panels.PainelVeterinariosJIFF;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class CadastroVeterinariosJDialog extends javax.swing.JDialog {

    private Veterinarios veterinario;
    PainelVeterinariosJIFF main;
    boolean isEditar = false;
    
    public CadastroVeterinariosJDialog(java.awt.Frame parent, boolean modal, PainelVeterinariosJIFF main) {
        super(parent, modal);
        initComponents();
        
        this.main = main;

        if (main.getVeterinarioSelecionado() != null) {
            isEditar = true;
            this.veterinario = main.getVeterinarioSelecionado();
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
        titledBorder.setTitle(" ALTERAR CADASTRO DE VETERINARIO ");
        titledBorder.setTitleColor(Color.RED);
        titledBorder.setTitleFont(customFont);
        titledBorder.setTitleJustification(titledBorder.CENTER);
        titledBorder.setTitlePosition(titledBorder.TOP);
        
        jPanel1.setBorder(titledBorder);
    }
    
    // Formas da janela Cadastro Tutores, se ela virá preenchida ou brand-new
    private void popularForm() {
        
        
        txtVETERINARIO_NOME.setText(veterinario.getNome());
        txtVETERINARIO_TIPODOCUMENTO.setText(String.valueOf(veterinario.getTipo_documento()));
        txtVETERINARIO_DOCUMENTO.setText(String.valueOf(veterinario.getDocumento_identificador()));
        txtVETERINARIO_CRMV.setText(String.valueOf(veterinario.getCrmv()));
        
        txtVETERINARIO_NASCIMENTO.setText(String.valueOf(veterinario.getNascimento()));
        SimpleDateFormat dateFormatInput = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat dateFormatOutput = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date = dateFormatInput.parse(veterinario.getNascimento());
            txtVETERINARIO_NASCIMENTO.setText(dateFormatOutput.format(date));
        } catch (ParseException erro) {
            JOptionPane.showMessageDialog(null, "Erro na conversão de data: " + erro);
            return;
        }
        
        txtVETERINARIO_DDD1.setText(String.valueOf(veterinario.getDdd_1()));
        txtVETERINARIO_CELULAR1.setText(String.valueOf(veterinario.getCelular_1()));
        txtVETERINARIO_EMAIL1.setText(String.valueOf(veterinario.getEmail_1()));
        txtVETERINARIO_DDD2.setText(String.valueOf(veterinario.getDdd_2()));
        txtVETERINARIO_CELULAR2.setText(String.valueOf(veterinario.getCelular_2()));
        txtVETERINARIO_EMAIL2.setText(String.valueOf(veterinario.getEmail_2()));
        txtVETERINARIO_VALOR.setText(String.valueOf(veterinario.getValor()));
        
        txtVETERINARIO_CEP.setText(String.valueOf(veterinario.getCep()));
        txtVETERINARIO_LOGRADOURO.setText(String.valueOf(veterinario.getLogradouro()));
        txtVETERINARIO_NUMERO.setText(String.valueOf(veterinario.getNumero()));
        txtVETERINARIO_BAIRRO.setText(String.valueOf(veterinario.getBairro()));
        comboVETERINARIO_UF.setSelectedItem(veterinario.getUf());
        txtVETERINARIO_MUNICIPIO.setText(String.valueOf(veterinario.getMunicipio()));
        txtVETERINARIO_COMPLEMENTO.setText(String.valueOf(veterinario.getComplemento()));
        txtVETERINARIO_OBSERVACOES.setText(String.valueOf(veterinario.getObservacoes()));
    }
    
    private void resetForm() {
        txtVETERINARIO_NOME.setText("");
        txtVETERINARIO_TIPODOCUMENTO.setText("");
        txtVETERINARIO_DOCUMENTO.setText("");
        txtVETERINARIO_CRMV.setText("");
        txtVETERINARIO_NASCIMENTO.setText("");
        txtVETERINARIO_DDD1.setText("");
        txtVETERINARIO_CELULAR1.setText("");
        txtVETERINARIO_EMAIL1.setText("");
        txtVETERINARIO_DDD2.setText("");
        txtVETERINARIO_CELULAR2.setText("");
        txtVETERINARIO_EMAIL2.setText("");
        txtVETERINARIO_VALOR.setText("");
        
        txtVETERINARIO_CEP.setText("");
        txtVETERINARIO_LOGRADOURO.setText("");
        txtVETERINARIO_NUMERO.setText("");
        txtVETERINARIO_BAIRRO.setText("");
        comboVETERINARIO_UF.setSelectedItem("-");
        txtVETERINARIO_MUNICIPIO.setText("");
        txtVETERINARIO_COMPLEMENTO.setText("");
        txtVETERINARIO_OBSERVACOES.setText("");
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
        txtVETERINARIO_CEP = new javax.swing.JTextField();
        LOGRADOURO = new javax.swing.JLabel();
        txtVETERINARIO_LOGRADOURO = new javax.swing.JTextField();
        NUMERO = new javax.swing.JLabel();
        txtVETERINARIO_NUMERO = new javax.swing.JTextField();
        BAIRRO = new javax.swing.JLabel();
        txtVETERINARIO_BAIRRO = new javax.swing.JTextField();
        UF = new javax.swing.JLabel();
        MUNICIPIO = new javax.swing.JLabel();
        txtVETERINARIO_MUNICIPIO = new javax.swing.JTextField();
        COMPLEMENTO = new javax.swing.JLabel();
        txtVETERINARIO_COMPLEMENTO = new javax.swing.JTextField();
        OBSERVACOES = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtVETERINARIO_OBSERVACOES = new javax.swing.JTextArea();
        comboVETERINARIO_UF = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        DOCUMENTO = new javax.swing.JLabel();
        txtVETERINARIO_DOCUMENTO = new javax.swing.JTextField();
        TIPODOCUMENTO = new javax.swing.JLabel();
        txtVETERINARIO_TIPODOCUMENTO = new javax.swing.JTextField();
        NOME = new javax.swing.JLabel();
        txtVETERINARIO_NOME = new javax.swing.JTextField();
        CRMV = new javax.swing.JLabel();
        txtVETERINARIO_CRMV = new javax.swing.JTextField();
        NASCIMENTO = new javax.swing.JLabel();
        txtVETERINARIO_NASCIMENTO = new javax.swing.JFormattedTextField();
        DDD1 = new javax.swing.JLabel();
        txtVETERINARIO_DDD1 = new javax.swing.JTextField();
        CELULAR1 = new javax.swing.JLabel();
        txtVETERINARIO_CELULAR1 = new javax.swing.JTextField();
        DDD2 = new javax.swing.JLabel();
        txtVETERINARIO_DDD2 = new javax.swing.JTextField();
        CELULAR2 = new javax.swing.JLabel();
        txtVETERINARIO_CELULAR2 = new javax.swing.JTextField();
        EMAIL1 = new javax.swing.JLabel();
        txtVETERINARIO_EMAIL1 = new javax.swing.JTextField();
        EMAIL2 = new javax.swing.JLabel();
        txtVETERINARIO_EMAIL2 = new javax.swing.JTextField();
        VALOR = new javax.swing.JLabel();
        txtVETERINARIO_VALOR = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(45, 18, 72));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), " CADASTRO DE VETERINÁRIO ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Gill Sans Ultra Bold", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
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

        txtVETERINARIO_CEP.setBackground(new java.awt.Color(86, 76, 106));
        txtVETERINARIO_CEP.setForeground(new java.awt.Color(255, 255, 255));
        txtVETERINARIO_CEP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        LOGRADOURO.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LOGRADOURO.setForeground(new java.awt.Color(255, 255, 255));
        LOGRADOURO.setText("Logradouro (*)");

        txtVETERINARIO_LOGRADOURO.setBackground(new java.awt.Color(86, 76, 106));
        txtVETERINARIO_LOGRADOURO.setForeground(new java.awt.Color(255, 255, 255));
        txtVETERINARIO_LOGRADOURO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        NUMERO.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NUMERO.setForeground(new java.awt.Color(255, 255, 255));
        NUMERO.setText("Número (*)");

        txtVETERINARIO_NUMERO.setBackground(new java.awt.Color(86, 76, 106));
        txtVETERINARIO_NUMERO.setForeground(new java.awt.Color(255, 255, 255));
        txtVETERINARIO_NUMERO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        BAIRRO.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BAIRRO.setForeground(new java.awt.Color(255, 255, 255));
        BAIRRO.setText("Bairro (*)");

        txtVETERINARIO_BAIRRO.setBackground(new java.awt.Color(86, 76, 106));
        txtVETERINARIO_BAIRRO.setForeground(new java.awt.Color(255, 255, 255));
        txtVETERINARIO_BAIRRO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        UF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        UF.setForeground(new java.awt.Color(255, 255, 255));
        UF.setText("UF (*)");

        MUNICIPIO.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MUNICIPIO.setForeground(new java.awt.Color(255, 255, 255));
        MUNICIPIO.setText("Município (*)");

        txtVETERINARIO_MUNICIPIO.setBackground(new java.awt.Color(86, 76, 106));
        txtVETERINARIO_MUNICIPIO.setForeground(new java.awt.Color(255, 255, 255));
        txtVETERINARIO_MUNICIPIO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        COMPLEMENTO.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        COMPLEMENTO.setForeground(new java.awt.Color(255, 255, 255));
        COMPLEMENTO.setText("Complemento (*)");

        txtVETERINARIO_COMPLEMENTO.setBackground(new java.awt.Color(86, 76, 106));
        txtVETERINARIO_COMPLEMENTO.setForeground(new java.awt.Color(255, 255, 255));
        txtVETERINARIO_COMPLEMENTO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        OBSERVACOES.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        OBSERVACOES.setForeground(new java.awt.Color(255, 255, 255));
        OBSERVACOES.setText("Observações");

        txtVETERINARIO_OBSERVACOES.setBackground(new java.awt.Color(86, 76, 106));
        txtVETERINARIO_OBSERVACOES.setColumns(20);
        txtVETERINARIO_OBSERVACOES.setForeground(new java.awt.Color(255, 255, 255));
        txtVETERINARIO_OBSERVACOES.setLineWrap(true);
        txtVETERINARIO_OBSERVACOES.setRows(5);
        txtVETERINARIO_OBSERVACOES.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jScrollPane1.setViewportView(txtVETERINARIO_OBSERVACOES);

        comboVETERINARIO_UF.setBackground(new java.awt.Color(86, 76, 106));
        comboVETERINARIO_UF.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        comboVETERINARIO_UF.setForeground(new java.awt.Color(255, 255, 255));
        comboVETERINARIO_UF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Acre (AC)", "Alagoas (AL)", "Amapá (AP)", "Amazonas (AM)", "Bahia (BA)", "Ceará (CE)", "Distrito Federal (DF)", "Espírito Santo (ES)", "Goiás (GO)", "Maranhão (MA)", "Mato Grosso (MT)", "Mato Grosso do Sul (MS)", "Minas Gerais (MG)", "Pará (PA)", "Paraíba (PB)", "Paraná (PR)", "Pernambuco (PE)", "Piauí (PI)", "Rio de Janeiro (RJ)", "Rio Grande do Norte (RN)", "Rio Grande do Sul (RS)", "Rondônia (RO)", "Roraima (RR)", "Santa Catarina (SC)", "São Paulo (SP)", "Sergipe (SE)", "Tocantins (TO)" }));
        comboVETERINARIO_UF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

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
                        .addComponent(txtVETERINARIO_COMPLEMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(MUNICIPIO, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVETERINARIO_MUNICIPIO, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(UF, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboVETERINARIO_UF, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(BAIRRO, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVETERINARIO_BAIRRO, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(NUMERO, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVETERINARIO_NUMERO, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(LOGRADOURO, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVETERINARIO_LOGRADOURO, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(CEP, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVETERINARIO_CEP, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(txtVETERINARIO_CEP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CEP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtVETERINARIO_LOGRADOURO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LOGRADOURO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtVETERINARIO_NUMERO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NUMERO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtVETERINARIO_BAIRRO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BAIRRO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboVETERINARIO_UF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtVETERINARIO_MUNICIPIO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MUNICIPIO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtVETERINARIO_COMPLEMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        txtVETERINARIO_DOCUMENTO.setBackground(new java.awt.Color(86, 76, 106));
        txtVETERINARIO_DOCUMENTO.setForeground(new java.awt.Color(255, 255, 255));
        txtVETERINARIO_DOCUMENTO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        TIPODOCUMENTO.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        TIPODOCUMENTO.setForeground(new java.awt.Color(255, 255, 255));
        TIPODOCUMENTO.setText("Tipo de Documento (*)");

        txtVETERINARIO_TIPODOCUMENTO.setBackground(new java.awt.Color(86, 76, 106));
        txtVETERINARIO_TIPODOCUMENTO.setForeground(new java.awt.Color(255, 255, 255));
        txtVETERINARIO_TIPODOCUMENTO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        NOME.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        NOME.setForeground(new java.awt.Color(255, 255, 255));
        NOME.setText("Nome (*)");

        txtVETERINARIO_NOME.setBackground(new java.awt.Color(86, 76, 106));
        txtVETERINARIO_NOME.setForeground(new java.awt.Color(255, 255, 255));
        txtVETERINARIO_NOME.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        CRMV.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        CRMV.setForeground(new java.awt.Color(255, 255, 255));
        CRMV.setText("CRMV (*)");

        txtVETERINARIO_CRMV.setBackground(new java.awt.Color(86, 76, 106));
        txtVETERINARIO_CRMV.setForeground(new java.awt.Color(255, 255, 255));
        txtVETERINARIO_CRMV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        NASCIMENTO.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        NASCIMENTO.setForeground(new java.awt.Color(255, 255, 255));
        NASCIMENTO.setText("Nascimento (*)");

        txtVETERINARIO_NASCIMENTO.setBackground(new java.awt.Color(86, 76, 106));
        txtVETERINARIO_NASCIMENTO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txtVETERINARIO_NASCIMENTO.setForeground(new java.awt.Color(255, 255, 255));
        try {
            txtVETERINARIO_NASCIMENTO.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtVETERINARIO_NASCIMENTO.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        DDD1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DDD1.setForeground(new java.awt.Color(255, 255, 255));
        DDD1.setText("DDD (*)");

        txtVETERINARIO_DDD1.setBackground(new java.awt.Color(86, 76, 106));
        txtVETERINARIO_DDD1.setForeground(new java.awt.Color(255, 255, 255));
        txtVETERINARIO_DDD1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        CELULAR1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CELULAR1.setForeground(new java.awt.Color(255, 255, 255));
        CELULAR1.setText("Celular (*)");

        txtVETERINARIO_CELULAR1.setBackground(new java.awt.Color(86, 76, 106));
        txtVETERINARIO_CELULAR1.setForeground(new java.awt.Color(255, 255, 255));
        txtVETERINARIO_CELULAR1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        DDD2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DDD2.setForeground(new java.awt.Color(255, 255, 255));
        DDD2.setText("DDD");

        txtVETERINARIO_DDD2.setBackground(new java.awt.Color(86, 76, 106));
        txtVETERINARIO_DDD2.setForeground(new java.awt.Color(255, 255, 255));
        txtVETERINARIO_DDD2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        CELULAR2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CELULAR2.setForeground(new java.awt.Color(255, 255, 255));
        CELULAR2.setText("Celular");

        txtVETERINARIO_CELULAR2.setBackground(new java.awt.Color(86, 76, 106));
        txtVETERINARIO_CELULAR2.setForeground(new java.awt.Color(255, 255, 255));
        txtVETERINARIO_CELULAR2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        EMAIL1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EMAIL1.setForeground(new java.awt.Color(255, 255, 255));
        EMAIL1.setText("E-mail (*)");

        txtVETERINARIO_EMAIL1.setBackground(new java.awt.Color(86, 76, 106));
        txtVETERINARIO_EMAIL1.setForeground(new java.awt.Color(255, 255, 255));
        txtVETERINARIO_EMAIL1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        EMAIL2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EMAIL2.setForeground(new java.awt.Color(255, 255, 255));
        EMAIL2.setText("E-mail");

        txtVETERINARIO_EMAIL2.setBackground(new java.awt.Color(86, 76, 106));
        txtVETERINARIO_EMAIL2.setForeground(new java.awt.Color(255, 255, 255));
        txtVETERINARIO_EMAIL2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        VALOR.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        VALOR.setForeground(new java.awt.Color(255, 255, 255));
        VALOR.setText("Valor (*)");

        txtVETERINARIO_VALOR.setBackground(new java.awt.Color(86, 76, 106));
        txtVETERINARIO_VALOR.setForeground(new java.awt.Color(255, 255, 255));
        txtVETERINARIO_VALOR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(VALOR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVETERINARIO_VALOR, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DOCUMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NASCIMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NOME, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CRMV, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TIPODOCUMENTO))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtVETERINARIO_DOCUMENTO)
                            .addComponent(txtVETERINARIO_TIPODOCUMENTO)
                            .addComponent(txtVETERINARIO_NOME)
                            .addComponent(txtVETERINARIO_NASCIMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVETERINARIO_CRMV, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(EMAIL2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EMAIL1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(DDD1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtVETERINARIO_DDD1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(DDD2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtVETERINARIO_DDD2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(CELULAR2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtVETERINARIO_CELULAR2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(CELULAR1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtVETERINARIO_CELULAR1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtVETERINARIO_EMAIL1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtVETERINARIO_EMAIL2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(NOME, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TIPODOCUMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DOCUMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CRMV, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(NASCIMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtVETERINARIO_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtVETERINARIO_TIPODOCUMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtVETERINARIO_DOCUMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtVETERINARIO_CRMV, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtVETERINARIO_NASCIMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtVETERINARIO_CELULAR1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CELULAR1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtVETERINARIO_CELULAR2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CELULAR2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtVETERINARIO_DDD1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DDD1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtVETERINARIO_DDD2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DDD2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(EMAIL1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EMAIL2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtVETERINARIO_EMAIL1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtVETERINARIO_EMAIL2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VALOR, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVETERINARIO_VALOR, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BOTAO_SALVAR___)
                            .addComponent(BOTAO_VOLTAR___)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
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
        Veterinarios veterinarios = new Veterinarios();

        veterinarios.setNome(txtVETERINARIO_NOME.getText());
        veterinarios.setTipo_documento(txtVETERINARIO_TIPODOCUMENTO.getText());
        veterinarios.setDocumento_identificador(txtVETERINARIO_DOCUMENTO.getText());
        veterinarios.setCrmv(txtVETERINARIO_CRMV.getText());
        String dataNascimento = txtVETERINARIO_NASCIMENTO.getText();
        SimpleDateFormat dateFormatInput = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat dateFormatOutput = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = dateFormatInput.parse(dataNascimento);
            veterinarios.setNascimento(dateFormatOutput.format(date));
        } catch (ParseException erro) {
            JOptionPane.showMessageDialog(null, "Erro na conversão de data: " + erro);
        }
        veterinarios.setDdd_1(Integer.parseInt(txtVETERINARIO_DDD1.getText()));
        veterinarios.setCelular_1(Integer.parseInt(txtVETERINARIO_CELULAR1.getText()));

        if(txtVETERINARIO_DDD2.getText().isEmpty()){
            veterinarios.setDdd_2(0);
        } else {
            veterinarios.setDdd_2(Integer.parseInt(txtVETERINARIO_DDD2.getText()));
        }

        if(txtVETERINARIO_CELULAR2.getText().isEmpty()){
            veterinarios.setCelular_2(0);
        } else {
            veterinarios.setCelular_2(Integer.parseInt(txtVETERINARIO_CELULAR2.getText()));
        }

        veterinarios.setEmail_1(txtVETERINARIO_EMAIL1.getText());
        veterinarios.setEmail_2(txtVETERINARIO_EMAIL2.getText());
        veterinarios.setValor(Double.parseDouble(txtVETERINARIO_VALOR.getText()));

        veterinarios.setCep(Integer.parseInt(txtVETERINARIO_CEP.getText()));
        veterinarios.setLogradouro(txtVETERINARIO_LOGRADOURO.getText());
        veterinarios.setNumero(txtVETERINARIO_NUMERO.getText());
        veterinarios.setBairro(txtVETERINARIO_BAIRRO.getText());
        veterinarios.setUf(comboVETERINARIO_UF.getSelectedItem().toString());
        veterinarios.setMunicipio(txtVETERINARIO_MUNICIPIO.getText());
        veterinarios.setComplemento(txtVETERINARIO_COMPLEMENTO.getText());
        veterinarios.setObservacoes(txtVETERINARIO_OBSERVACOES.getText());

        EntityManager em = JPAUtil.getEntityManager();
        VeterinariosDAO dao = new VeterinariosDAO(em);

        em.getTransaction().begin();
        em.persist(veterinarios);
        em.getTransaction().commit();
        em.close();

        JOptionPane.showMessageDialog(this, "Veterinário salvo com sucesso!");
        this.dispose();
        */
        
        
        
        
        Veterinarios veterinarios = new Veterinarios();
        
        String nome = txtVETERINARIO_NOME.getText();
        String tipo_documento = txtVETERINARIO_TIPODOCUMENTO.getText();
        String documento_identificador = txtVETERINARIO_DOCUMENTO.getText();
        String crmv = txtVETERINARIO_CRMV.getText();
        
        int ddd_1 = Integer.parseInt(txtVETERINARIO_DDD1.getText());
        int celular_1 = Integer.parseInt(txtVETERINARIO_CELULAR1.getText());
        String email_1 = txtVETERINARIO_EMAIL1.getText();
        String email_2 = txtVETERINARIO_EMAIL2.getText();
        double valor = Double.parseDouble(txtVETERINARIO_VALOR.getText());
        
        int cep = Integer.parseInt(txtVETERINARIO_CEP.getText());
        String logradouro = txtVETERINARIO_LOGRADOURO.getText();
        String numero = txtVETERINARIO_NUMERO.getText();
        String bairro = txtVETERINARIO_BAIRRO.getText();
        String UF = comboVETERINARIO_UF.getSelectedItem().toString();
        String municipio = txtVETERINARIO_MUNICIPIO.getText();
        String complemento = txtVETERINARIO_COMPLEMENTO.getText();
        String observacoes = txtVETERINARIO_OBSERVACOES.getText();

        // captando os ints obrigatorios
        int DDD2_, Celular2_;
        
            if(txtVETERINARIO_DDD2.getText().isEmpty()){
                DDD2_ = 0;
        } else {
                DDD2_ = Integer.parseInt(txtVETERINARIO_DDD2.getText());
        }
        
            if(txtVETERINARIO_CELULAR2.getText().isEmpty()){
                Celular2_ = 0;
        } else {
                Celular2_ = Integer.parseInt(txtVETERINARIO_CELULAR2.getText());
        }
        int ddd_2 = DDD2_;
        int celular_2 = Celular2_;
        
        // captando a data transformada (necessitou ser transformada novamente no insert jdbc mysql)
        String nascimento = txtVETERINARIO_NASCIMENTO.getText();
        SimpleDateFormat dateFormatInput = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat dateFormatOutput = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = dateFormatInput.parse(nascimento);
            veterinarios.setNascimento(dateFormatOutput.format(date));
        } catch (ParseException erro) {
            JOptionPane.showMessageDialog(null, "Erro na conversão de data: " + erro);
            return;
        }

        
        
        
        
        if (main.getVeterinarioSelecionado() != null) {
            veterinario = new Veterinarios(veterinario.getId(), nome, tipo_documento, documento_identificador, crmv, nascimento, cep, logradouro, numero, bairro,
                    UF, municipio, complemento, ddd_1, celular_1, ddd_2, celular_2, email_1, email_2, valor, observacoes);
            new VeterinariosDAO().editar(veterinario);
            dispose();
        } else if (main.getVeterinarioSelecionado() == null) {
            veterinario = new Veterinarios(0, nome, tipo_documento, documento_identificador, crmv, nascimento, cep, logradouro, numero, bairro,
                    UF, municipio, complemento, ddd_1, celular_1, ddd_2, celular_2, email_1, email_2, valor, observacoes);
            new VeterinariosDAO().inserir(veterinario);
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
            java.util.logging.Logger.getLogger(CadastroVeterinariosJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroVeterinariosJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroVeterinariosJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroVeterinariosJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastroVeterinariosJDialog dialog = new CadastroVeterinariosJDialog(new javax.swing.JFrame(), true, null);
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
    private javax.swing.JLabel CRMV;
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
    private javax.swing.JLabel TIPODOCUMENTO;
    private javax.swing.JLabel UF;
    private javax.swing.JLabel VALOR;
    private javax.swing.JComboBox<String> comboVETERINARIO_UF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtVETERINARIO_BAIRRO;
    private javax.swing.JTextField txtVETERINARIO_CELULAR1;
    private javax.swing.JTextField txtVETERINARIO_CELULAR2;
    private javax.swing.JTextField txtVETERINARIO_CEP;
    private javax.swing.JTextField txtVETERINARIO_COMPLEMENTO;
    private javax.swing.JTextField txtVETERINARIO_CRMV;
    private javax.swing.JTextField txtVETERINARIO_DDD1;
    private javax.swing.JTextField txtVETERINARIO_DDD2;
    private javax.swing.JTextField txtVETERINARIO_DOCUMENTO;
    private javax.swing.JTextField txtVETERINARIO_EMAIL1;
    private javax.swing.JTextField txtVETERINARIO_EMAIL2;
    private javax.swing.JTextField txtVETERINARIO_LOGRADOURO;
    private javax.swing.JTextField txtVETERINARIO_MUNICIPIO;
    private javax.swing.JFormattedTextField txtVETERINARIO_NASCIMENTO;
    private javax.swing.JTextField txtVETERINARIO_NOME;
    private javax.swing.JTextField txtVETERINARIO_NUMERO;
    private javax.swing.JTextArea txtVETERINARIO_OBSERVACOES;
    private javax.swing.JTextField txtVETERINARIO_TIPODOCUMENTO;
    private javax.swing.JTextField txtVETERINARIO_VALOR;
    // End of variables declaration//GEN-END:variables
}
