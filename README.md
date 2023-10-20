# UPX2-Toca-do-Lulu

# TRABALHO DE USINA DE PROJETOS EXPERIMENTAIS II (UPX II) - TOCA DO LULU (Em desenvolvimento...)

_Classe: Usuarios_  
| ---------------------------------- |  
(-) email : String
(-) senha : String
(+) Usuarios(String:email, String:senha)
(+) Gets...
(+) Sets...

_Classe: PetsPlanosValores_  
| ---------------------------------- |  
(-) plano : String
(-) valor : double
(+) PetsPlanosValores(String:plano, double:valor)
(+) PetsPlanosValores()
(+) Gets...
(+) Sets...

_Classe: Pets_  
| ---------------------------------- |  
(-) id : int
(-) nome : String
(-) sexo : char
(-) raca : String
(-) cor : String
(-) nascimento : String
(-) tipo_rede_1 : String
(-) rede_social_1 : String
(-) tipo_rede_2 : String
(-) rede_social_2 : String
(-) alergias : String
(-) remedios : String
(-) vacinacao : String
(-) observacoes : String
(-) tipo_plano : String
(-) tipo_valor : double
(+) Pets(todos sem id)
(+) Pets()
(+) Gets...
(+) Sets...
(+) toString():String

_Classe: Tutores_  
| ---------------------------------- |  
(-) id : int
(-) nome : String
(-) tipo_documento : String
(-) documento_identificador : String
(-) nascimento : String
(-) cep : int
(-) logradouro : String
(-) numero : String
(-) bairro : String
(-) uf : String
(-) municipio : String
(-) complemento : String
(-) ddd_1 : int
(-) celular_1 : int
(-) ddd_2 : int
(-) celular_2 : int
(-) email_1 : String
(-) email_2 : String
(-) tipo_rede_1 : String
(-) rede_social_1 : String
(-) tipo_rede_2 : String
(-) rede_social_2 : String
(-) observacoes : String
(+) Tutores(todos sem id)
(+) Tutores()
(+) Gets...
(+) Sets...
(+) toString():String

_Classe: Veterinarios_  
| ---------------------------------- |  
(-) id : int
(-) nome : String
(-) tipo_documento : String
(-) documento_identificador : String
(-) crmv : String
(-) nascimento : String
(-) cep : int
(-) logradouro : String
(-) numero : String
(-) bairro : String
(-) uf : String
(-) municipio : String
(-) complemento : String
(-) ddd_1 : int
(-) celular_1 : int
(-) ddd_2 : int
(-) celular_2 : int
(-) email_1 : String
(-) email_2 : String
(-) valor : double
(-) observacoes : String
(+) Veterinarios(todos sem id)
(+) Veterinarios()
(+) Gets...
(+) Sets...
(+) toString():String

_Classe: Servicos_  
| ---------------------------------- |  
(-) id : int
(-) nome : String
(-) servico : String
(-) valor : double
(-) tipo_documento : String
(-) documento_identificador : String
(-) nascimento : String
(-) cep : int
(-) logradouro : String
(-) numero : String
(-) bairro : String
(-) uf : String
(-) municipio : String
(-) complemento : String
(-) ddd_1 : int
(-) celular_1 : int
(-) ddd_2 : int
(-) celular_2 : int
(-) email_1 : String
(-) email_2 : String
(-) observacoes : String
(+) Servicos(todos sem id)
(+) Servicos()
(+) Gets...
(+) Sets...
(+) toString():String

_Classe: TutoresPets_  
| ---------------------------------- |  
(-) id_tutor : int
(-) id_pet : int
(+) Gets...
(+) Sets...

_Classe: VeterinariosPets_  
| ---------------------------------- |  
(-) id_veterinario : int
(-) id_pet : int
(+) Gets...
(+) Sets...

_Classe: ServicosPets_  
| ---------------------------------- |  
(-) id_servico : int
(-) id_pet : int
(+) Gets...
(+) Sets...

# Observações:

- Os botões "Alterar" devem abrir a janela de criação do pet selecionado com as suas informações em cada um dos seus campos para realizar a alteração desejada. Após realizar a alteração, o objeto atualizado deve aparecer devidamente corrigido na tabela.
- Os botões "Excluir" devem excluir a linha selecionada na tabela correspondente, gerando um aviso de dupla verificação para realizar o feito.

# Menus

    1- Menu Principal (Botões)
      - Pets
      - Tutores
      - Veterinários
      - Serviços
      - Sair

      1.1- Menus Pets, Tutores, Veterinários e Serviços (Botões)
        - Novo
        - Alterar
        - Deletar
        - Voltar

        1.1.1- Menu Novo Pet (Campos e Botões)
          - Nome
          - Sexo
          - Raça
          - Cor
          - Nascimento
          - Tipo de Rede Social (1)
          - Rede Social (1)
          - Tipo de Rede Social (2)
          - Rede Social (2)
          - Alergias
          - Remédios
          - Vacinação
          - Observações
          - Plano
          - Botão Voltar
          - Botão Salvar

        1.1.2- Menu Novo Tutor (Campos e Botões)
          - Nome
          - Tipo de Documento
          - Documento
          - Nascimento
          - CEP
          - Logradouro
          - Número
          - Bairro
          - UF
          - Município
          - Complemento
          - DDD (1)
          - Celular (1)
          - DDD (2)
          - Celular (2)
          - E-mail (1)
          - E-mail (2)
          - Tipo de Rede Social (1)
          - Rede Social (1)
          - Tipo de Rede Social (2)
          - Rede Social (2)
          - Observações
          - Botão Voltar
          - Botão Salvar

        1.1.3- Menu Novo Veterinário (Campos e Botões)
          - Nome
          - Tipo de Documento
          - Documento
          - CRMV
          - Nascimento
          - CEP
          - Logradouro
          - Número
          - Bairro
          - UF
          - Município
          - Complemento
          - DDD (1)
          - Celular (1)
          - DDD (2)
          - Celular (2)
          - E-mail (1)
          - E-mail (2)
          - Valor
          - Observações
          - Botão Voltar
          - Botão Salvar

        1.1.4- Menu Novo Serviço (Campos e Botões)
          - Nome
          - Serviço
          - Valor
          - Tipo de Documento
          - Documento
          - Nascimento
          - CEP
          - Logradouro
          - Número
          - Bairro
          - UF
          - Município
          - Complemento
          - DDD (1)
          - Celular (1)
          - DDD (2)
          - Celular (2)
          - E-mail (1)
          - E-mail (2)
          - Observações
          - Botão Voltar
          - Botão Salvar

# Melhorias futuras

    1- Telas e Database para:
    - Login
    - Register
    - Change Password
    - Logout

    2- Upload de foto nos cadastros. A foto deve aparecer ao selecionar o cadastro e mostrar o cadastro.

    3- Navbar Menu.

---

---

---

(NetBeans IDE - Toca do Lulu - Matéria: UPX II - Segundo Semestre ADS - Professor Fabio Colombini)

Última atualização: 01h26 - 20/10/2023.

---

---

---
