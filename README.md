# ProjetoFinal_JAVA

📘 README — Sistema Médico em Java (Console)
🏥 Sobre o Projeto

Este é um Sistema Médico baseado em console, desenvolvido em Java, com foco em organização de consultas, prescrições, diagnósticos, mensagens, histórico e gerenciamento de perfil do usuário.

O projeto simula uma plataforma médica simples, permitindo que um paciente faça login, visualize informações e interaja com diversos serviços médicos.

🚀 Funcionalidades Principais
🔐 Autenticação

Login de usuário

Cadastro de novo usuário

🩺 Diagnóstico

Sistema interativo de perguntas e respostas

Sugere possível condição com base nas respostas

📅 Agendamento

Agendar consultas médicas

Exibe mensagem de confirmação

📹 Consulta por Vídeo

Simulação de início de vídeo-consulta

💬 Chat com Médico

Enviar mensagens

Exibir mensagens anteriores

🔔 Notificações

Lembretes automáticos e informações úteis

💊 Prescrição Médica

Listagem das prescrições associadas ao usuário logado

📜 Histórico de Consultas

Exibe consultas anteriores do usuário

👤 Perfil

Mostra informações do usuário logado

📂 Estrutura do Projeto
app/
 ├── Main.java
 ├── controllers/
 │    ├── LoginController.java
 │    ├── CadastroController.java
 │    ├── DiagnosticoController.java
 │    ├── AgendamentoController.java
 │    ├── VideoConsultaController.java
 │    ├── ChatController.java
 │    ├── NotificacaoController.java
 │    ├── PrescricaoController.java
 │    ├── HistoricoController.java
 │    └── PerfilController.java
 ├── database/
 │    └── FakeDB.java
 ├── models/
 │    ├── Usuario.java
 │    ├── Prescricao.java
 │    └── (outros modelos)
 └── utils/
      └── (funções auxiliares)

🛠️ Tecnologias Utilizadas

Java 17+

Programação orientada a objetos (POO)

Simulação de banco de dados com FakeDB

Arrays e estruturas de dados

▶️ Como Executar

Certifique-se de ter o Java JDK instalado.

Compile o projeto:

javac app/Main.java


Execute:

java app.Main

🧪 Exemplos de Uso
Tela inicial:
===== SISTEMA MÉDICO =====
1 - Login
2 - Cadastro
Escolha:

Menu principal após login:
=== MENU ===
1 - Diagnóstico
2 - Agendar Consulta
3 - Consulta por Vídeo
4 - Enviar Mensagem ao Médico
5 - Ver Chat
6 - Notificações
7 - Prescrição Médica
8 - Histórico de Consultas
9 - Perfil
10 - Sair
Escolha:

🔧 Melhorias Futuras

Persistência real com banco de dados

Interface gráfica em JavaFX

Suporte a múltiplos tipos de usuários (médico/paciente)

Exportação de prescrições em PDF

👨‍💻 Autor

Anderson Melo e Eduardo Cabral
Projeto desenvolvido para disciplina de Sistemas para Internet — P2 (2025).
