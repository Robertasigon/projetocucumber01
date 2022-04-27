#language: pt
#encoding: iso-8859-1

Funcionalidade: Criar conta de acesso
como um usuário do sistema
eu quero criar uma conta de acesso
para que eu possa acessar a aplicação

Cenário: Cadastro de conta de usuário com sucesso
Dado Acessar a página de cadastro de conta de usuário
E Preencher o nome "Sergio Mendes"
E Preencher o email "sergio.coti@gmail.com"
E Preencher a senha "@Teste2022"
E Confirmar a senha "@Teste2022"
Quando Confirmar a realização do cadastro
Então Sistema informa que o cadastro foi realizado com sucesso

Cenário: Validação de campos obrigatórios
Dado Acessar a página de cadastro de conta de usuário
Quando Confirmar a realização do cadastro
Então Sistema informa que todos os campos são de preenchimento obrigatório