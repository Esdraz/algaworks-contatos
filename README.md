# 🚀 Projeto AlgaWorks Contatos

> Aplicação web para gerenciamento de contatos, desenvolvida exclusivamente para fins de estudo e aprendizado.

<div align="center">
  <img src="https://img.shields.io/badge/Java-17-blue?style=for-the-badge&logo=java" alt="Java 17">
  <img src="https://img.shields.io/badge/Spring_Boot-3.5.9-green?style=for-the-badge&logo=spring" alt="Spring Boot">
  <img src="https://img.shields.io/badge/Maven-3.2%2B-red?style=for-the-badge&logo=apache-maven" alt="Maven">
  <img src="https://img.shields.io/badge/Thymeleaf-3.1-green?style=for-the-badge&logo=leaf" alt="Thymeleaf">
  <img src="https://img.shields.io/badge/Bootstrap-4.3-purple?style=for-the-badge&logo=bootstrap" alt="Bootstrap">
</div>

---

### 🎯 Objetivo do Projeto

Este projeto foi criado como um exercício prático para aplicar e consolidar conhecimentos em desenvolvimento web com Java e Spring Boot. O foco é demonstrar a construção de uma aplicação CRUD (Create, Read, Update, Delete) completa, desde o backend até o frontend.

**Importante:** Esta é uma aplicação de demonstração e não deve ser utilizada em produção. Os dados são gerenciados em tempo de execução e **são perdidos a cada reinicialização da aplicação**, pois não há um banco de dados persistente configurado.

---

### ✨ Recursos Implementados

*   **Gerenciamento de Contatos (CRUD):**
    *   Listagem de todos os contatos cadastrados.
    *   Criação de novos contatos.
    *   Edição de contatos existentes.
    *   Remoção de contatos com diálogo de confirmação.
*   **Interface Moderna e Responsiva:**
    *   Layout construído com **Bootstrap**, adaptável a diferentes tamanhos de tela.
    *   Ícones da biblioteca **Font Awesome** para uma melhor experiência visual.
*   **Funcionalidades de Formulário:**
    *   Máscara de formatação para o campo de telefone com **jQuery Mask Plugin**.

---

### 🛠️ Tecnologias Utilizadas

A aplicação foi construída utilizando as seguintes tecnologias:

*   **Backend:**
    *   **Java 17**
    *   **Spring Boot:** Framework principal para a criação da aplicação.
    *   **Spring Web:** Para a construção de endpoints web.
    *   **Thymeleaf:** Motor de templates para renderizar as páginas HTML no servidor.

*   **Frontend:**
    *   **HTML5**
    *   **Bootstrap**
    *   **Font Awesome**
    *   **jQuery**
    *   **jQuery Mask Plugin**

*   **Ferramentas de Build:**
    *   **Maven:** Gerenciador de dependências e build do projeto.

---

### 🖼️ Screenshots

#### Página Inicial
![Página Inicial](https://raw.githubusercontent.com/Esdraz/algaworks-contatos/main/src/main/resources/screenshots/home-page.png)

---

#### Lista de Contatos
![Lista de Contatos](https://raw.githubusercontent.com/Esdraz/algaworks-contatos/main/src/main/resources/screenshots/listar-contatos.png)

---

#### Formulário de Cadastro
![Formulário de Contato](https://raw.githubusercontent.com/Esdraz/algaworks-contatos/main/src/main/resources/screenshots/formulario-cadastro.png)

---

### ⚙️ Como Executar

Para executar o projeto localmente, siga os passos abaixo:

1.  **Clone o repositório.**
2.  Navegue até o diretório do projeto.
3.  Execute o comando: `mvn spring-boot:run`
4.  Abra seu navegador e acesse `http://localhost:8080`.
