<h1 align="center">
  TODO List
</h1>

<p align="center">
 <img src="https://img.shields.io/static/v1?label=Tipo&message=Desafio&color=8257E5&labelColor=000000" alt="Desafio" />
</p>

API para gerenciar tarefas (CRUD) que faz parte [desse desafio](https://github.com/simplify-liferay/desafio-junior-backend-simplify) para desenvolvedor backend júnior, que se candidatam para a Simplify.

## Tecnologias

[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)](https://spring.io/projects/spring-boot)
[![Spring MVC](https://img.shields.io/badge/Spring%20MVC-6DB33F?style=for-the-badge&logo=spring&logoColor=white)](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
[![Spring Data JPA](https://img.shields.io/badge/Spring%20Data%20JPA-6DB33F?style=for-the-badge&logo=spring&logoColor=white)](https://spring.io/projects/spring-data-jpa)
[![SpringDoc OpenAPI 3](https://img.shields.io/badge/SpringDoc%20OpenAPI%203-1172B8?style=for-the-badge&logo=openapiinitiative&logoColor=white)](https://springdoc.org/v2/#spring-webflux-support)
[![MySQL](https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white)](https://dev.mysql.com/downloads/)
[![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)](https://maven.apache.org)


````
📦 todo-list
├── 📁 src
│   └── 📁 main
│       └── 📁 java
│           └── 📁 com
│               └── 📁 github
│                   └── 📁 josiasdev
│                       └── 📁 desafio_todolist
│                           ├── 📁 controller
│                           │   └── 📄 TodoController.java
│                           ├── 📁 entity
│                           │   ├── 📄 Todo.java
│                           └── 📁 repository
│                           │   ├── 📄 TodoRepository.java
│                           └── 📁 service
│                               └── 📄 TodoService.java
├── 📁 resources
│   └── 📄 application.properties
├── 📄 pom.xml
└── 📄 README.md
````

- controller: expõe os endpoints REST para manipulação de tarefas.
- entity: Representações das entidades JPA.
- repository: interface para persistência com Spring Data JPA.
- service: regras de negócio e operações com tarefas.


🧠 Boas Práticas Utilizadas

- Principios **SOLID, DRY, YAGNI, KISS**
- API REST
- Consultas com Spring Data JPA
- Injeção de Dependências com Spring
- Manipulação de erros estruturada
- Documentação automática com OpenAPI/Swagger

📦 Como Rodar o Projeto

1. Clone o repositório:
```bash
git clone https://github.com/josiasdev/todo-list
cd todo-list
```
2. Compile e gere o JAR:
```bash
./mvnw clean package
```

3. Execute a aplicação:
```bash
java -jar target/todolist-0.0.1-SNAPSHOT.jar
```

A API poderá ser acessada em [localhost:8080](http://localhost:8080).
O Swagger poderá ser visualizado em [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

# 📌 Endpoints da API
Para testar os endpoints, você pode usar o Postman ou a ferramenta HTTPie.

- Criar Tarefa
- Método: POST
- URL: http://localhost:8080/todos
- Corpo da Requisição (JSON):

```bash
{
  "id": 1,
  "nome": "bug",
  "descricao": "tela azul",
  "realizado": 1,
  "prioridade": true
}
```


- Listar Tarefas
- Método: GET
- URL: http://localhost:8080/todos
- Resposta:
```
  {
   "id": 1,
   "nome": "bug",
   "descricao": "tela azul",
   "realizado": 1,
   "prioridade": true
  }
```

- Atualizar Tarefa
- Método: PUT
- URL: http://localhost:8080/todos
- Corpo da Requisição (JSON):
```
 {
   "id": 1,
   "nome": "bug",
   "descricao": "tela azul",
   "realizado": 1,
   "prioridade": true
  }
```

- Remover Tarefa
- Método: DELETE
- URL: http://localhost:8080/todos/{id}
- Exemplo: http://localhost:8080/todos/1
- Resposta:
```bashgi
[ ]
```