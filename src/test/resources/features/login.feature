#Author: Mercedes Parente


Feature: Login
Como usuario da aplicacao
Quero enviar os dados 
Para acessar a conta

 
  Scenario: Login com dados validos
    Given que esteja na home
    And clicar no botao login
    And inserir o cpf
    And inserir a senha
    When clicar no botao continuar
    Then serei direcionado para tela home logada
    

  
