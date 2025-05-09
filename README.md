# Forms Test Wefit API
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/limaCodeLab/ams-inventory-api/blob/master/LICENSE) 

# Sobre o serviço 


O serviço Forms-Wefit é uma API RESTful desenvolvida para prenchimento de um formulário de dados de uma pessoa. Ele oferece as seguintes funcionalidades:
- Cadastro de produtos, categorias e fornecedores
- Atualização de quantidades e informações
- Consultas de produtos, categorias e fornecedores
- Remoção de produtos, categorias e fornecedores
- Registro de transações de entrada e saída
- Validação de dados
- Segurança e autorização por usuários
- Auditoria e geração de logs
- Garantia de integridade no controle de estoque

## Regras de negócio 
As regras de negócio do serviço Inventory estão detalhadas na Wiki.

Link: 

## Documentações técnicas 
A respectiva documentação também está disponível na Wiki.

Link: 

SWAGGER API Link : 

## Modelo conceitual
![Modelo Conceitual](EM CONSTRUCAO)

# Tecnologias utilizadas

## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven
- Postgresql


## Testes
- Testes Unitarios: JUnit 5 + Mockito
- Teste Integracao: Spring Boot Test
- Teste API: RestAssured e Postman

## Integração contínua
- GitHub Actions
- Docker

## Documentações
- Swagger API
- Javadoc
- GitHub Wiki
- Lucidchart UML

# Como executar o serviço In-Local

Pré-requisitos: Java 21, PostgreSQL

Variável  de Ambiente: SPRING_PROFILE

Valores: 
- test (Para execução com banco em memória H2 Console)
- dev (Para execução com banco relacional PostgreeSQL)

```bash
# clonar repositório
git clone https://github.com/limaCodeLab/ams-inventory-api.git

# entrar na pasta do projeto back end
cd xxxxxxxxxxx

# executar o projeto
mvn spring-boot:run
```

# Autor

Alan Lima 😀
<p>
  <a href="https://www.linkedin.com/in/alaanlimaa/" target="_blank"><img alt="LinkedIn" src="https://img.shields.io/badge/linkedin-%230077B5.svg?&style=for-the-badge&logo=linkedin&logoColor=white" /></a> 
  <a href="https://www.instagram.com/alaanlimaa/" target="_blank"><img alt="Instagram" src="https://img.shields.io/badge/Instagram-%23E4405F?logo=Instagram&logoColor=white&style=for-the-badge" /></a>
</p>
