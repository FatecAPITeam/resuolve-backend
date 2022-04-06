# resuolve-backend

## Descrição
API Rest em Java Spring Boot desenvolvida para a Fatec São José dos Campos

## Configurações ambiente local
Editar o arquivo `src/main/resources/application.properties`.
Banco de dados utilizado: `PostgreSQL`.

````
spring.jpa.hibernate.ddl-auto=validate

spring.datasource.url=jdbc:postgresql://localhost:5432/dbname
spring.datasource.username=postgres
spring.datasource.password=password
````

* A propriedade `spring.jpa.hibernate.ddl-auto=validate` significa que o Spring vai validar se as colunas configuradas na entidade existem no banco de dados. Para fazer com que o próprio Spring Boot crie as tabelas e suas colunas, é preciso alterar para `spring.jpa.hibernate.ddl-auto=update`.

* Na propriedade `spring.datasource.url=jdbc:postgresql://localhost:5432/dbname`, alterar para o nome do banco de dados configurado no postgres. E abaixo o usuário e senha também connfigurado no postgres, por padrão o usuário é `postgres` e a senha vazia.


## Rotas
`/resuolve/usuario`


### POST
* `/cadastrar` - Payload esperado:

```json
{
    "nome": "Nome",
    "email": "email@gmail.com",
    "telefone": "3524568254",
    "senha": "1234"
}

```

### GET
* `/listar` - Payload de retorno:

```json
{
    "id": 1,
    "nome": "Nome",
    "email": "email@gmail.com",
    "telefone": "3524568254"
},
{
    "id": 2,
    "nome": "Nome 2",
    "email": "email2@gmail.com",
    "telefone": "1135789054"
}
```

## Para rodar a aplicação

```bash
$ mvn:spring-boot:run
```
