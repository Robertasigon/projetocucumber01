#language: pt
#encoding: iso-8859-1

Funcionalidade: Criar conta de acesso
como um usu�rio do sistema
eu quero criar uma conta de acesso
para que eu possa acessar a aplica��o

Cen�rio: Cadastro de conta de usu�rio com sucesso
Dado Acessar a p�gina de cadastro de conta de usu�rio
E Preencher o nome "Sergio Mendes"
E Preencher o email "sergio.coti@gmail.com"
E Preencher a senha "@Teste2022"
E Confirmar a senha "@Teste2022"
Quando Confirmar a realiza��o do cadastro
Ent�o Sistema informa que o cadastro foi realizado com sucesso

Cen�rio: Valida��o de campos obrigat�rios
Dado Acessar a p�gina de cadastro de conta de usu�rio
Quando Confirmar a realiza��o do cadastro
Ent�o Sistema informa que todos os campos s�o de preenchimento obrigat�rio