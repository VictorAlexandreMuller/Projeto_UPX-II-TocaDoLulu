package java4.Cadastros;

public class Cadastro_Tutores_JIFF extends javax.swing.JInternalFrame {

    public Cadastro_Tutores_JIFF() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        NOME = new javax.swing.JLabel();
        NASCIMENTO = new javax.swing.JLabel();
        REDE = new javax.swing.JLabel();
        TIPOREDE = new javax.swing.JLabel();
        DOCUMENTO = new javax.swing.JLabel();
        TIPODOCUMENTO = new javax.swing.JLabel();
        EMAIL = new javax.swing.JLabel();
        CELULAR = new javax.swing.JLabel();
        ENDERECO = new javax.swing.JLabel();
        BOTAO_VOLTAR___ = new javax.swing.JButton();
        BOTAO_SALVAR___ = new javax.swing.JButton();
        txtTUTOR_DOCUMENTO = new javax.swing.JTextField();
        txtTUTOR_TIPODOCUMENTO = new javax.swing.JTextField();
        txtTUTOR_NOME = new javax.swing.JTextField();
        txtTUTOR_NASCIMENTO = new javax.swing.JFormattedTextField();
        txtTUTOR_CELULAR = new javax.swing.JTextField();
        txtTUTOR_EMAIL = new javax.swing.JTextField();
        txtTUTOR_ENDERECO = new javax.swing.JTextField();
        txtTUTOR_REDESOCIAL = new javax.swing.JTextField();
        txtTUTOR_TIPOREDESOCIAL = new javax.swing.JTextField();

        setBackground(new java.awt.Color(45, 18, 72));
        setClosable(true);
        setIconifiable(true);
        setTitle(" Cadastro de Tutores");

        jPanel1.setBackground(new java.awt.Color(45, 18, 72));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), " Cadastro de Tutor ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Gill Sans Ultra Bold", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        NOME.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NOME.setForeground(new java.awt.Color(255, 255, 255));
        NOME.setText("Nome");

        NASCIMENTO.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NASCIMENTO.setForeground(new java.awt.Color(255, 255, 255));
        NASCIMENTO.setText("Nascimento");

        REDE.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        REDE.setForeground(new java.awt.Color(255, 255, 255));
        REDE.setText("Rede Social");

        TIPOREDE.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TIPOREDE.setForeground(new java.awt.Color(255, 255, 255));
        TIPOREDE.setText("Tipo de Rede Social");

        DOCUMENTO.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DOCUMENTO.setForeground(new java.awt.Color(255, 255, 255));
        DOCUMENTO.setText("Documento");

        TIPODOCUMENTO.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TIPODOCUMENTO.setForeground(new java.awt.Color(255, 255, 255));
        TIPODOCUMENTO.setText("Tipo de Documento");

        EMAIL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EMAIL.setForeground(new java.awt.Color(255, 255, 255));
        EMAIL.setText("E-mail");

        CELULAR.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CELULAR.setForeground(new java.awt.Color(255, 255, 255));
        CELULAR.setText("Celular");

        ENDERECO.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ENDERECO.setForeground(new java.awt.Color(255, 255, 255));
        ENDERECO.setText("Endereço");

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

        txtTUTOR_DOCUMENTO.setBackground(new java.awt.Color(86, 76, 106));
        txtTUTOR_DOCUMENTO.setForeground(new java.awt.Color(255, 255, 255));
        txtTUTOR_DOCUMENTO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        txtTUTOR_TIPODOCUMENTO.setBackground(new java.awt.Color(86, 76, 106));
        txtTUTOR_TIPODOCUMENTO.setForeground(new java.awt.Color(255, 255, 255));
        txtTUTOR_TIPODOCUMENTO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        txtTUTOR_NOME.setBackground(new java.awt.Color(86, 76, 106));
        txtTUTOR_NOME.setForeground(new java.awt.Color(255, 255, 255));
        txtTUTOR_NOME.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        txtTUTOR_NASCIMENTO.setBackground(new java.awt.Color(86, 76, 106));
        txtTUTOR_NASCIMENTO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txtTUTOR_NASCIMENTO.setForeground(new java.awt.Color(255, 255, 255));
        try {
            txtTUTOR_NASCIMENTO.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTUTOR_NASCIMENTO.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtTUTOR_CELULAR.setBackground(new java.awt.Color(86, 76, 106));
        txtTUTOR_CELULAR.setForeground(new java.awt.Color(255, 255, 255));
        txtTUTOR_CELULAR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        txtTUTOR_EMAIL.setBackground(new java.awt.Color(86, 76, 106));
        txtTUTOR_EMAIL.setForeground(new java.awt.Color(255, 255, 255));
        txtTUTOR_EMAIL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        txtTUTOR_ENDERECO.setBackground(new java.awt.Color(86, 76, 106));
        txtTUTOR_ENDERECO.setForeground(new java.awt.Color(255, 255, 255));
        txtTUTOR_ENDERECO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        txtTUTOR_REDESOCIAL.setBackground(new java.awt.Color(86, 76, 106));
        txtTUTOR_REDESOCIAL.setForeground(new java.awt.Color(255, 255, 255));
        txtTUTOR_REDESOCIAL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        txtTUTOR_TIPOREDESOCIAL.setBackground(new java.awt.Color(86, 76, 106));
        txtTUTOR_TIPOREDESOCIAL.setForeground(new java.awt.Color(255, 255, 255));
        txtTUTOR_TIPOREDESOCIAL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DOCUMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TIPODOCUMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NOME, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NASCIMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CELULAR, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ENDERECO, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(REDE, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TIPOREDE, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTUTOR_TIPOREDESOCIAL, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTUTOR_REDESOCIAL, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTUTOR_ENDERECO, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTUTOR_EMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTUTOR_CELULAR, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTUTOR_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTUTOR_TIPODOCUMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTUTOR_DOCUMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTUTOR_NASCIMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(BOTAO_VOLTAR___, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(BOTAO_SALVAR___, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtTUTOR_DOCUMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTUTOR_TIPODOCUMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(txtTUTOR_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTUTOR_NASCIMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTUTOR_CELULAR, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTUTOR_EMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTUTOR_ENDERECO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTUTOR_REDESOCIAL, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTUTOR_TIPOREDESOCIAL, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(DOCUMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TIPODOCUMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(NOME, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(NASCIMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CELULAR, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(EMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ENDERECO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46))
                            .addComponent(REDE, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(TIPOREDE, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BOTAO_VOLTAR___)
                    .addComponent(BOTAO_SALVAR___))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BOTAO_VOLTAR___ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTAO_VOLTAR___ActionPerformed
        this.dispose();
    }//GEN-LAST:event_BOTAO_VOLTAR___ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOTAO_SALVAR___;
    private javax.swing.JButton BOTAO_VOLTAR___;
    private javax.swing.JLabel CELULAR;
    private javax.swing.JLabel DOCUMENTO;
    private javax.swing.JLabel EMAIL;
    private javax.swing.JLabel ENDERECO;
    private javax.swing.JLabel NASCIMENTO;
    private javax.swing.JLabel NOME;
    private javax.swing.JLabel REDE;
    private javax.swing.JLabel TIPODOCUMENTO;
    private javax.swing.JLabel TIPOREDE;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtTUTOR_CELULAR;
    private javax.swing.JTextField txtTUTOR_DOCUMENTO;
    private javax.swing.JTextField txtTUTOR_EMAIL;
    private javax.swing.JTextField txtTUTOR_ENDERECO;
    private javax.swing.JFormattedTextField txtTUTOR_NASCIMENTO;
    private javax.swing.JTextField txtTUTOR_NOME;
    private javax.swing.JTextField txtTUTOR_REDESOCIAL;
    private javax.swing.JTextField txtTUTOR_TIPODOCUMENTO;
    private javax.swing.JTextField txtTUTOR_TIPOREDESOCIAL;
    // End of variables declaration//GEN-END:variables
}
